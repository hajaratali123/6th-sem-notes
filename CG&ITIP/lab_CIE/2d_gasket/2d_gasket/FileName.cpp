#include<glut.h>
#include<stdio.h>

float v[3][2] = { {0,1},{-1,-1},{1,-1} };
int n;
void Triangle(float* a, float* b, float* c) {
	glBegin(GL_TRIANGLES);
	glVertex2fv(a);
	glVertex2fv(b);
	glVertex2fv(c);
	glEnd();
};

void devide_triangle(float* a, float* b, float* c, int m) {
	float v1[2], v2[2], v3[2];
	int j;
	if (m > 0) {
		for (j = 0; j < 2; ++j) {
			v1[j] = (a[j] + b[j]) / 2;
			v2[j] = (a[j] + c[j]) / 2;
			v3[j] = (b[j] + c[j]) / 2;
		}

		devide_triangle(a, v1, v2, m - 1);
		devide_triangle(v1, b, v3, m - 1);
		devide_triangle(v2, v3, c, m - 1);
	}
	else
		Triangle(a, b, c);

}
void display() {
	glClear(GL_COLOR_BUFFER_BIT);
	devide_triangle(v[0], v[1], v[2], n);
	glFlush();
};
void myinit() {
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(-2.0, 2.0, -2.0, 2.0);
	glMatrixMode(GL_MODELVIEW);
	glClearColor(1, 1, 1, 0);
	glColor3f(1, 0, 0);
}

int main() {

	printf("Enter the number od sub divisions:\n");
	scanf_s("%d", &n);
	glutInitWindowSize(500, 500);
	glutCreateWindow("2D gaskte");
	glutDisplayFunc(display);
	myinit();
	glutMainLoop();
	return 0;
}