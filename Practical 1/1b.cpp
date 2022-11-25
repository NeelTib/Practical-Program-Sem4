// Write a program to divide the entire screen into four equal quadrants.

#include <iostream.h>
#include <conio.h>
#include <graphics.h>
void main()
{
    int gdriver = DETECT, gmode;
    int xmax, ymax, midx, midy;
    initgraph(&gdriver, &gmode, "");

    xmax = getmaxx();
    ymax = getymaxy();
    midx = xmax / 2;
    midy = ymax / 2;

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

    getch();
    closegraph();
}