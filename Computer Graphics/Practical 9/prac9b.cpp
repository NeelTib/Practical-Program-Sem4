// Write a C++ program to draw animation of Smiley face.
#include <iostream.h>
#include <dos.h>
#include <conio.h>
#include <stdio.h>
#include <graphics.h>
void main()
{
    int gdriver = DETECT, gmode;
    initgraph(&gdriver, &gmode, "");

    setcolor(YELLOW);
    circle(300, 100, 40);
    setfillstyle(SOLID_FILL, YELLOW);
    floodfill(300, 100, YELLOW);
    setcolor(BLACK);
    setfillstyle(SOLID_FILL, BLACK);

    fillellipse(310, 85, 2, 6);
    fillellipse(290, 85, 2, 6);

    for (int i = 1; i < 12; i++)
    {
        ellipse(300, 100, 205, 335, 20, i - 1);
        ellipse(300, 100, 205, 335, 20, i);
        ellipse(300, 100, 205, 335, 20, i + 1);
        delay(100);
    }

    getch();
    closegraph();
}
