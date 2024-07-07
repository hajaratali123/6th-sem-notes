// 3D Transformation

#include<glut.h>
#include<stdio.h>
float vertices[] = { -1,-1,-1,1,-1,-1,1,1,-1,-1,1,-1,-1,-1,1,1,-1,1,1,1,1,-1,1,1 };
float colors[] = { 0,0,0,0,0,1,0,1,0,0,1,1,1,0,0,1,0,1,1,1,0,1,1,1 };
unsigned char cubeIndices[] = { 0,3,6,1,2,3,7,6,0,4,7,3,1,2,6,5,4,5,6,7,0,1,5,4 };
char T = 'c';

void cube()
{
	glScalef(0.125, 0.125, 0.125);
	glRotatef(45, 1, 1, 1);
	glDrawElements(GL_QUADS, 24, GL_UNSIGNED_BYTE, cubeIndices);
}

void Display()
{
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glColor3f(0, 0, 0);
	glLoadIdentity();
	glBegin(GL_LINES);
	glVertex3f(-1.9, 0, 0);
	glVertex3f(1.9, 0, 0);
	glVertex3f(0, -1.9, 0);
	glVertex3f(0, 1.9, 0);
	glEnd();
	if (T == 'c')
	{
		printf("\n*****\nOriginal\n");
		glLoadIdentity();
		cube();
	}
	if (T == 't')
	{
		printf("\n*****\nTranslation \n");
		glLoadIdentity();
		glTranslatef(-0.5, -0.2, 0.0);
		cube();
	}
	if (T == 'x')
	{
		printf("\n*****\nRotation about x-axis \n");
		glLoadIdentity();
		glRotated(45, 1, 0, 0);
		cube();
	}
	if (T == 'y')
	{
		printf("\n*****\nRotation about y-axis\n");
		glLoadIdentity();
		glRotated(45, 0, 1, 0);
		cube();
	}
	if (T == 'z')
	{
		printf("\n*****\nRotation about z-axis \n");
		glLoadIdentity();
		glRotated(45, 0, 0, 1);
		cube();
	}
	if (T == 's')
	{
		printf("\n*****\nScaling\n");
		glLoadIdentity();
		glScalef(0.5, 0.5, 0.5);
		cube();
	}
	glFlush();
}

void keys(unsigned char K, int x, int y)
{
	if (K == 'x' || K == 'y' || K == 'z' || K == 't' || K == 's')
		T = K;
	else
		T = 'c';
	Display();
}

void myreshape(int w, int h)
{
	glViewport(0, 0, w, h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	if (w <= h)
		glOrtho(-2.0, 2.0, -2.0 * (float)h / (float)w, 2.0 * (float)h / (float)w, -10.0, 10.0);
	else
		glOrtho(-2.0 * (float)w / (float)h, 2.0 * (float)w / (float)h, -2.0, 2.0, -10.0, 10.0);
	glMatrixMode(GL_MODELVIEW);

}

void main()
{
	printf("Press:\n't'-->Translation\n'x'-->Rotation about x-axis\n'y'-->Rotation about y axis\n'z'-->Rotation about z axis\n's'-->Scaling\n'c'-->Original Position\n");
	glutInitWindowSize(500, 500);
	glutInitWindowPosition(300, 50);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB | GLUT_DEPTH);
	glutCreateWindow("3D Transformation");
	glutReshapeFunc(myreshape);
	glutDisplayFunc(Display);
	glutKeyboardFunc(keys);
	glEnable(GL_DEPTH_TEST);
	glColor3f(0, 0, 0);
	glPointSize(2.0);
	glEnableClientState(GL_COLOR_ARRAY);
	glEnableClientState(GL_VERTEX_ARRAY);
	glVertexPointer(3, GL_FLOAT, 0, vertices);
	glColorPointer(3, GL_FLOAT, 0, colors);
	glClearColor(1, 1, 1, 1);
	glutMainLoop();
}