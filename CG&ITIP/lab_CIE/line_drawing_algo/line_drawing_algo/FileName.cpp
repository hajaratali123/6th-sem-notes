// Bresenham's Line

#include <stdio.h>
#include <math.h>
#include <glut.h>

int X1, Y1, X2, Y2;

void draw_pixel(int x, int y) {
    glBegin(GL_POINTS);
    glVertex2i(x, y);
    glEnd();
}

void LineBres() {
    glClear(GL_COLOR_BUFFER_BIT);

    int dx = abs(X2 - X1), dy = abs(Y2 - Y1);
    int p = 2 * dy - dx;
    int twoDy = 2 * dy, twoDyDx = 2 * (dy - dx);
    int x, y;

    if (X1 > X2) {
        x = X2;
        y = Y2;
        X2 = X1;
    }
    else {
        x = X1;
        y = Y1;
        X2 = X2;
    }

    draw_pixel(x, y);

    while (x < X2) {
        x++;
        if (p < 0)
            p += twoDy;
        else {
            y++;
            p += twoDy;
        }
        draw_pixel(x, y);
    }

    glFlush();
}

void Init() {
    glClearColor(1, 1, 1, 1);
    glColor3f(0, 1, 0);
    glPointSize(2.0);
    glViewport(0, 0, 500, 500);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0, 500, 0, 500);
    glMatrixMode(GL_MODELVIEW);
}

int main() {
    printf("Enter two points for drawing line Bresenham:\n");
    printf("\nEnter point1 (x1 y1): ");
    scanf_s("%d %d", &X1, &Y1);
    printf("\nEnter point2 (x2 y2): ");
    scanf_s("%d %d", &X2, &Y2);

    glutInitWindowSize(300, 400);
    glutInitWindowPosition(0, 0);
    glutCreateWindow("Line Bresenham");

    Init();

    glutDisplayFunc(LineBres);
    glutMainLoop();

    return 0;
}