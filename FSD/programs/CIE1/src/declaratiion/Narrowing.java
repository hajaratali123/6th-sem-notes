package declaratiion;

public class Narrowing {
    public static void main(String[] args) {
        float f = 10.5f;
        System.out.println("The float value is:"+f);
        int a = (int) f;
        System.out.println("The int value is:"+a);
        byte b= (byte) a;
        System.out.println("The byte value is:"+b);
    }

}
