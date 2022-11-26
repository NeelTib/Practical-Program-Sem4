// Write a program in C++ to divide the entire screen into four equal quadrants.

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
    ymax = getmaxy();

    // Getting the mid point of x and y
    midx = xmax / 2;
    midy = ymax / 2;

    // Putting the pixels on the canvas
    putpixel(xmax, ymax, 8);
    putpixel(midx, midy, 8);

    // Drawing the box
    line(0, 0, xmax, 0);
    line(0, 0, 0, ymax);
    line(0, ymax, xmax, ymax);
    line(xmax, 0, xmax, ymax);

    // Dividing the screen into four quadrants
    line(midx, 0, midx, ymax);
    line(0, midy, xmax, midy);

    getch();
    closegraph();
}