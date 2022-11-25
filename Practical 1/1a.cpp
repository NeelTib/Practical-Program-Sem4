// Write a pgm in C++ to display 10 distinct objects which should not overlap each other.

#include <graphics.h>
#include <iostream.h>
#include <conio.h>

void main()
{
    int gdriver = DETECT, gmode;
    int x1, y1, x2, y2;

    initgraph(&gdriver, &gmode, "");

    // Line
    line(50, 0, 50, 40);

    // Square
    line(0, 0, 0, 40);
    line(0, 0, 40, 0);
    line(0, 40, 40, 40);
    line(40, 0, 40, 40);

    // Rectangle
    line(60, 0, 140, 0);
    line(60, 0, 60, 40);
    line(60, 40, 140, 40);
    line(140, 0, 140, 40);

    // Circle
    circle(170, 20, 20);

    // Ellipse
    ellipse(220, 20, 0, 360, 20, 15);

    // Isosceles triangle
    line(250, 0, 300, 0);
    line(300, 0, 275, 50);
    line(250, 0, 275, 50);

    // Right angled triangle
    line(320, 0, 400, 0);
    line(320, 0, 400, 50);
    line(400, 0, 400, 50);

    // Parallelogram
    line(440, 0, 540, 0);
    line(440, 0, 420, 50);
    line(420, 50, 520, 50);
    line(540, 0, 520, 50);

    // Hexagon
    line(0, 100, 30, 140);
    line(30, 140, 80, 140);
    line(80, 140, 110, 100);
    line(110, 100, 80, 60);
    line(80, 60, 30, 60);
    line(30, 60, 0, 100);

    // Pentagon
    line(150, 150, 150, 100);
    line(150, 150, 200, 150);
    line(200, 150, 150, 100);
    line(150, 150, 150, 200);
    line(150, 200, 200, 200);
    line(200, 200, 200, 150);

    getch();
    closegraph();
}