#include<glut.h>
#include<stdio.h>
char T = 'c';
float vertices[] = { -1,-1,-1,1,-1,-1,1,1,-1, -1,1,-1, -1,-1, 1, 1,-1,1, 1,1,1, -1,1,1 };
float colors[] = { 0,0,0,0,0,1,0,1,0,0,1,1,1,0,0,1,0,1,1,1,0,1,1,1 };
unsigned char cubeIndices[] = { 0,3,2,1,2,3,7,6,0,4,7,3,1,2,6,5,4,5,6,7,0,1,5,4 };
void cube()
{
	glScalef(0.25, 0.25, 0.25);
	glRotatef(45, 1, 1, 1);
	glDrawElements(GL_QUADS, 24, GL_UNSIGNED_BYTE, cubeIndices); // Display cube
}

void display()
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
		printf("\n * *************\nOriginal Position\n");
		glLoadIdentity(); // Reset current matrix to identity.
		cube();
	}
	if (T == 't')
	{
		printf("\n * *************\nTranslation\n");
		glLoadIdentity(); // Reset current matrix to identity.
		glTranslatef(-0.5, -0.2, 0.0); // Set translation parameters.
		cube();
	}
	if (T == 'x')
	{
		printf("\n * *************\nRotation about x-axis\n");
		glLoadIdentity(); // Reset current matrix to identity.
		glRotatef(45, 1, 0, 0); // Set 90-deg. rotation about z axis.
		cube();
	}
	if (T == 'y')
	{
		printf("\n * *************\nRotation about y-axis\n");
		glLoadIdentity(); // Reset current matrix to identity.
		glRotatef(45, 0, 1, 0); // Set 90-deg. rotation about z axis.
		cube();
	}
	if (T == 'z')
	{
		printf("\n * *************\nRotation about z-axis\n");
		glLoadIdentity(); // Reset current matrix to identity.
		glRotatef(45, 0, 0, 1); // Set 90-deg. rotation about z axis.
		cube();
	}
	if (T == 's')
	{
		printf("\n * *************\nScaling\n");
		glLoadIdentity(); // Reset current matrix to identity.
		glScalef(0.5, 0.5, 0.5); // Set scale-reflection parameters.
		cube();
	}
	glFlush();
}
void keys(unsigned char k, int x, int y)
{

	if (k == 'x' || k == 'y' || k == 'z' || k == 't' || k == 's')
		T = k;
	else
		T = 'c';
	display();
}


void myReshape(int w, int h)
{
	glViewport(0, 0, w, h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	if (w <= h)
		glOrtho(-2, 2, -2 * (float)h / (float)w, 2 * (float)h / (float)w, -2, 2);
	else
		glOrtho(-2 * (float)w / (float)h, 2 * (float)w / (float)h, -2, 2, -2, 2);
	glMatrixMode(GL_MODELVIEW);
}

void main()
{
	printf("Press:\n't'--> Translate\n'x'-->Rotation about x-axis\n'y'-->Rotation about y-axis\n'z'-->Rotation about z-axis\n's'-->scaling\n'c'-->original position");
	glutInitWindowSize(500, 500);
	glutInitWindowPosition(300, 50);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB | GLUT_DEPTH);
	glutCreateWindow("3D");
	glutDisplayFunc(display);
	glutKeyboardFunc(keys);
	glEnable(GL_DEPTH_TEST);
	glEnableClientState(GL_COLOR_ARRAY);
	glEnableClientState(GL_VERTEX_ARRAY);
	glVertexPointer(3, GL_FLOAT, 0, vertices);
	glColorPointer(3, GL_FLOAT, 0, colors);
	glClearColor(1, 1, 1, 1);// White Background
	glColor3f(0, 0, 0);//Black writing Color
	glPointSize(2.0);//pointsize=2
	glutMainLoop();
}
