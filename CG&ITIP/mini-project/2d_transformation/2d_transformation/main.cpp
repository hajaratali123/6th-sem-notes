//Develop a program to demonstrate 2D transformation on basic objects
#include<glut.h>
#include<stdio.h>
char T;
void display()
{
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(0, 0, 0);
	glLoadIdentity();
	glBegin(GL_LINES);
	glVertex2f(-499, 0);
	glVertex2f(499, 0);
	glVertex2f(0, -499);
	glVertex2f(0, 499);
	glEnd();
	glColor3f(0, 0, 1);
	glLoadIdentity(); // Reset current matrix to identity.
	glRecti(0, 0, 100, 150); // Display blue rectangle.
	if (T == 't')
	{
		printf("\n * *************\nTranslation\n");
		glLoadIdentity(); // Reset current matrix to identity.
		glColor3f(1, 0, 0);
		glTranslatef(-200.0, -50.0, 0.0); // Set translation parameters.
		glRecti(0, 0, 100, 150); // Display red, translated rectangle.
	}
	if (T == 'r')
	{
		printf("\n * *************\nRotation about z-axis\n");
		glLoadIdentity(); // Reset current matrix to identity.
		glColor3f(0, 1, 0);
		glRotatef(45, 0.0, 0.0, 1.0); // Set 90-deg. rotation about z axis.
		glRecti(0, 0, 100, 150); // Display red, rotated rectangle.
	}
	if (T == 's')
	{
		printf("\n * *************\nScaling\n");
		glLoadIdentity(); // Reset current matrix to identity.
		glColor3f(0, 1, 1);
		glScalef(0.5, 0.5, 0); // Set scale-reflection parameters.
		glRecti(0, 0, 100, 150); // Display red, transformed rectangle.
	}
	glFlush();
}

void keys(unsigned char k, int x, int y)
{
	T = k;
	display();
}
// Init Function
void Init()
{
	glClearColor(1, 1, 1, 1);// White Background
	glColor3f(0, 0, 0);//Black writing Color
	glPointSize(2.0);//pointsize=2
	glViewport(0, 0, 500, 500);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(-500, 500, -500, 500);// min max of x and y is -500 and 500
	glMatrixMode(GL_MODELVIEW);
}
void main()
{
	printf("Press:\n't'--> Translate\n'r'-->Rotation about z-axis\n's'-->scaling\n");
	glutInitWindowSize(500, 500);
	glutInitWindowPosition(300, 50);
	glutCreateWindow("2D Transformation");
	Init();
	glutDisplayFunc(display);
	glutKeyboardFunc(keys);
	glutMainLoop();
}
