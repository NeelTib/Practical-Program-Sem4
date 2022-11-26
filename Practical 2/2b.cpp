// Write a program in C++ to display a Hut.
#include <iostream.h>
#include <conio.h>
#include <graphics.h>
void main()
{

    // Declaring the variables and Initliazing the graph
    int gdriver = DETECT, gmode;
    initgraph(&gdriver, &gmode, "");

    // Main Square
    line(100, 100, 100, 200);
    line(100, 100, 200, 100);
    line(100, 200, 200, 200);
    line(200, 100, 200, 200);

    // Top traingle
    line(100, 100, 150, 10);
    line(200, 100, 150, 10);

    // Side part
    line(150, 10, 350, 10);
    line(350, 10, 350, 200);
    line(200, 200, 350, 200);
    line(200, 100, 350, 100);

    // Door
    line(130, 200, 130, 140);
    line(160, 200, 160, 140);
    line(130, 140, 160, 140);
    line(145, 200, 145, 140);

    // Side window
    line(250, 120, 300, 120);
    line(250, 120, 250, 160);
    line(250, 160, 300, 160);
    line(300, 120, 300, 160);

    // Bars in window
    line(265, 120, 265, 160);
    line(285, 120, 285, 160);

    // Top of the roof
    line(180, 10, 180, 65);
    line(210, 10, 210, 100);
    line(240, 10, 240, 100);
    line(270, 10, 270, 100);
    line(300, 10, 300, 100);
    line(330, 10, 330, 100);
    line(180, 65, 350, 65);
    line(162, 30, 350, 30);

    outtextxy(180, 210, "Home Sweet Home");

    getch();
    closegraph();
}