// Write a program to divide the entire screen into four equal quadrants and draw circle, rectangle, ellipse & half ellipse in each quadrant also give them appropriate label.

#include <iostream.h>
#include <conio.h>
#include <graphics.h>
void main()
{

    // Declaring the variables and Initliazing the graph
    int gdriver = DETECT, gmode;
    int xmax, ymax, midx, midy;
    initgraph(&gdriver, &gmode, "");

    // Getting the maximum value of x and y
    xmax = getmaxx();
    ymax = getymaxy();

    // Getting the mid point of x and y
    midx = xmax / 2;
    midy = ymax / 2;

    // Putting the pixels on the canvas
    putpixel(xmax, ymax, 8);
    putpixel(midx, midy, 8);

    // Drawing the box
    line(0, 0, 0, xmax, 0);
    line(0, 0, 0, ymax);
    line(0, ymax, xmax, ymax);
    line(xmax, 0, xmax, ymax);

    // Dividing the screen into four quadrants
    line(midx, 0, midx, ymax);
    line(0, midy, xmax, midy);

    // Circle
    circle(150, 150, 50);
    outtextxy(120, 190, "Circle");

    // Ellipse
    ellipse(500, 350, 0, 360, 100, 50);
    outtextxy(440, 200, "Ellipse");

    // Half ellipse
    ellipse(150, 350, 90, 270, 100, 50);
    outtextxy(100, 420, "Half Ellipse");

    // Rectangle
    line(400, 300, 600, 300);
    line(400, 400, 600, 400);
    line(400, 300, 400, 400);
    line(600, 300, 600, 400);
    outtextxy(450, 420, "Rectangle");

    getch();
    closegraph();
}