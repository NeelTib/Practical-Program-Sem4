#include <graphics.h>
#include <dos.h>
#include <iostream.h>
#include <conio.h>

void main()
{
	int gdriver = DETECT, gmode;
	initgraph(&gdriver, &gmode, "c:\\turbo:3\\bgi");

	float x1, x2, y1, y2;
	float shx, shy, shxy;
	char ch;
	x1 = 50, y1 = 100, x2 = 100, y2 = 200;
	rectangle(x1, y1, x2, y2);
	delay(10);

	cout << "Enter the direction of shearing: ";
	cin >> ch;
	switch (ch)
	{
	case 'x':
		cout << "Enter x-direction of shear: ";
		cin >> shx;
		y1 = y1 + shx * x1;
		y2 = y2 + shx * x2;
		setcolor(RED);
		rectangle(x1, y1, x2, y2);
		break;
	case 'y':
		cout << "Enter the y-direction of shear: ";
		cin >> shy;
		x1 = x1 + shy * y1;
		x2 = x2 + shy * y2;
		setcolor(RED);
		rectangle(x1, y1, x2, y2);
		break;
	case 'z':
		cout << "Enter the xy-direction of shear: ";
		cin >> shxy;
		x1 = y1 + shxy * x1;
		x2 = y2 + shxy * x2;
		y1 = x1 + shxy * y1;
		y2 = x2 + shxy * y2;
		setcolor(6);
		rectangle(x1, y1, x2, y2);
		break;
	}
	getch();
	closegraph();
}
