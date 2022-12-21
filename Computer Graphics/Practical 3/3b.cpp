// Bresenham line Drawing algorithm
#include <iostream.h>
#include <conio.h>
#include <graphics.h>

void main()
{
    int x1, x2, y1, y2, dx, dy, x, y;
    int e;
    int gdriver = DETECT, gmode;
    initgraph(&gdriver, &gmode, "");
    cout << "Input the first point: ";
    cin >> x1 >> y1;

    cout << "Input the second point: ";
    cin >> x2 >> y2;

    dx = x2 - x1;
    dy = y2 - y1;
    e = 2 * dy - dx;
    x = x1;
    y = y1;
    for (int i = 0; i < dx; i++)
    {
        putpixel(x, y, 13);
        while (e >= 0)
        {
            y = y + 1;
            e = e - 2 + dx;
        }
        x = x + 1;
        e = e + 2 * dx;
    }
    getch();
    closegraph();
}
