// Bresenham line Drawing algorithm
#include <iostream.h>
#include <conio.h>
#include <graphics.h>
#include <math.h>

void main()
{
    int x1, x2, y1, y2, dx, dy, x, y, length;
    int xinc, yinc;
    int e;
    int gdriver = DETECT, gmode;
    initgraph(&gdriver, &gmode, "");
    cout << "Input the first point: ";
    cin >> x1 >> y1;

    cout << "Input the second point: ";
    cin >> x2 >> y2;

    if (abs(dx) >= abs(dy))
    {
        length = abs(dx);
    }
    else
    {
        length = abs(dy);
    }
    xinc = dx / length;
    yinc = dy / length;
    x = x1;
    y = y1;
    for (int i = 0; i < length; i++)
    {
        x = x + xinc;
        y = y + yinc;
        putpixel(floor(x), floor(y), 6);
    }

    getch();
    closegraph();
}
