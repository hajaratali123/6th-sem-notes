#include <glut.h>
#include <math.h>
float x, y, r = 0.5, t, t1 = 360, i = 0;

void display() {
	glClear(GL_COLOR_BUFFER_BIT);
	for (t = 0; t < 360; t += 0.5) {
		x = i + r * cos(t);
		y = r * sin(t);
		glBegin(GL_POINTS);
		glVertex2f(x, y);
		glEnd();
	}
	glBegin(GL_LINES);
	glVertex2f(r * cos(t1) + i, r * sin(t1));
	glVertex2f(r * -cos(t1) + i, r * -sin(t1));
	glVertex2f(r * -sin(t1) + i, r * cos(t1));
	glVertex2f(r * sin(t1) + i, r * -cos(t1));
	glEnd();
	glutSwapBuffers();
}

void idle() {
	if (i < 1) {
		i += 0.001;
	}
	else {
		i = -1;
	}
	t1 -= 0.001;
	glutPostRedisplay();
}

void mouse(int b, int s, int x, int y) {
	if (b == GLUT_LEFT_BUTTON && s == GLUT_DOWN)
		glutIdleFunc(idle);
	if (b == GLUT_RIGHT_BUTTON && s == GLUT_DOWN)
		glutIdleFunc(NULL);
	if (b == GLUT_MIDDLE_BUTTON && s == GLUT_DOWN)
		exit(0);
}

void main() {
	glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB);
	glutInitWindowSize(900, 900);
	glutCreateWindow("Wheel Rotation");
	glutDisplayFunc(display);
	glutMouseFunc(mouse);
	glPointSize(3);
	glClearColor(1, 1, 1, 1);
	glColor3f(1, 0, 0);
	glutMainLoop();
}