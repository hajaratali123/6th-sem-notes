#include<glut.h>
#include<stdio.h>
char T;

void display() {
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f( 0, 0, 0);
	glLoadIdentity();
	glBegin(GL_LINES);
	glVertex2f(-499, 0);
	glVertex2f(499, 0);
	glVertex2f(0,-499);
	glVertex2f(0, 499);
	glEnd();
	glColor3f(0, 0, 1);
	glLoadIdentity();
	glRecti(0, 0, 100, 1500);
	if (T == 'c') {
		printf("****\n original image \n *****");
			glLoadIdentity();
	}
	if (T == 't') {
		printf("\n **** Translation \n ****");
		glLoadIdentity();
		glColor3f(1, 0, 0);
		glTranslatef(200.0,200.0,0.0);
		glRecti(0,0,100,150);
	}
	if (T == 'r') {
		printf("\n **** Rotation \n ****");
		glLoadIdentity();
		glColor3f(1, 0, 0);
		glRotatef(45, 0, 0, 1.0);
		glRecti(0, 0, 100, 150);
	}
	if (T == 's') {
		printf("\n **** Scaling \n ****");
		glLoadIdentity();
		glColor3f(1, 0, 0);
		glScalef(0.5,0.5,0);
		glRecti(0, 0, 100, 150);
	}
	glFlush();
		
}

void keys(unsigned char k, int x, int y) {
	T = k;
	display();
}

void init() {

	glClearColor(1, 1, 1, 1);
	glColor3f(0, 0, 0);
	glPointSize(2.0);
	glViewport(0, 0, 500, 500);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(-500, 500, -500, 500);
	glMatrixMode(GL_MODELVIEW);
}

void main() {

	printf("\n 't'--> Tnasformation \n 'r'--> Rotation Abourt  's--> Scaling '\n  ");
	glutInitWindowSize(500, 500);
	glutInitWindowPosition(300, 500);
	glutCreateWindow("3D transformation");
	init();
	glutDisplayFunc(display);
	
	glutKeyboardFunc(keys);
	glutMainLoop();


}