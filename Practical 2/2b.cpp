#include <iostream.h>
#include <conio.h>
#include <graphics.h>
void main()
{

    // Declaring the variables and Initliazing the graph
    int gdriver = DETECT, gmode;
    initgraph(&gdriver, &gmode, "");

    line(100, 100, 100, 200);
    line(100, 100, 200, 100);
    line(100, 200, 200, 200);
    line(200, 100, 200, 200);
    line(100, 100, 150, 200);
    line(200, 100, 150, 200);
    
    getch();
    closegraph();
}