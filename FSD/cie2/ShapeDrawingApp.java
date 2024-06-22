import java.util.HashMap;
import java.util.Map;

// Singleton Pattern: DrawingManager ensures only one instance
class DrawingManager {
    private static DrawingManager instance;
    private DrawingManager() {}

    public static DrawingManager getInstance() {
        if (instance == null) {
            instance = new DrawingManager();
        }
        return instance;
    }

    public void drawShape(Shape shape) {
        shape.draw();
    }
}

// Abstract Factory Pattern: ShapeFactory interface and concrete factories
interface ShapeFactory {
    Shape createShape(String type);
}

class SimpleShapeFactory implements ShapeFactory {
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

// Factory Method Pattern: Shape interface and concrete shapes
interface Shape extends Cloneable {
    void draw();
    Shape clone();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public Shape clone() {
        return new Circle();
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public Shape clone() {
        return new Rectangle();
    }
}

// Prototype Pattern: ShapeCache to clone shapes
class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        shapeMap.put("1", circle);

        Rectangle rectangle = new Rectangle();
        shapeMap.put("2", rectangle);
    }
}

// Builder Pattern: ComplexShape class with a builder
class ComplexShape implements Shape {
    private String partA;
    private String partB;

    private ComplexShape(Builder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
    }

    public void draw() {
        System.out.println("Drawing a Complex Shape with " + partA + " and " + partB);
    }

    public Shape clone() {
        return new ComplexShape.Builder().partA(this.partA).partB(this.partB).build();
    }

    public static class Builder {
        private String partA;
        private String partB;

        public Builder partA(String partA) {
            this.partA = partA;
            return this;
        }

        public Builder partB(String partB) {
            this.partB = partB;
            return this;
        }

        public ComplexShape build() {
            return new ComplexShape(this);
        }
    }
}

// Object Pool Pattern: ShapePool to reuse shapes
class ShapePool {
    private Map<String, Shape> availableShapes = new HashMap<>();
    private Map<String, Shape> inUseShapes = new HashMap<>();

    public Shape acquireShape(String shapeId) {
        if (availableShapes.containsKey(shapeId)) {
            Shape shape = availableShapes.remove(shapeId);
            inUseShapes.put(shapeId, shape);
            return shape;
        }
        return null;
    }

    public void releaseShape(String shapeId) {
        if (inUseShapes.containsKey(shapeId)) {
            Shape shape = inUseShapes.remove(shapeId);
            availableShapes.put(shapeId, shape);
        }
    }

    public void loadShapes() {
        availableShapes.put("1", new Circle());
        availableShapes.put("2", new Rectangle());
    }
}

// Main class to demonstrate the patterns
public class ShapeDrawingApp {
    public static void main(String[] args) {
        // Singleton Pattern
        DrawingManager drawingManager = DrawingManager.getInstance();

        // Abstract Factory Pattern
        ShapeFactory shapeFactory = new SimpleShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        Shape rectangle = shapeFactory.createShape("rectangle");

        drawingManager.drawShape(circle);
        drawingManager.drawShape(rectangle);

        // Prototype Pattern
        ShapeCache.loadCache();
        Shape clonedCircle = ShapeCache.getShape("1");
        Shape clonedRectangle = ShapeCache.getShape("2");

        drawingManager.drawShape(clonedCircle);
        drawingManager.drawShape(clonedRectangle);

        // Builder Pattern
        ComplexShape complexShape = new ComplexShape.Builder()
                .partA("Part A")
                .partB("Part B")
                .build();

        drawingManager.drawShape(complexShape);

        // Object Pool Pattern
        ShapePool shapePool = new ShapePool();
        shapePool.loadShapes();

        Shape pooledCircle = shapePool.acquireShape("1");
        drawingManager.drawShape(pooledCircle);

        shapePool.releaseShape("1");
    }
}
