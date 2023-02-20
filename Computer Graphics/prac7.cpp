#include <graphics.h>
#include <iostream.h>
#include <stdio.h>
#include <conio.h>

void main()
{
   int gdriver = DETECT, gmode, errorcode;
   initgraph(&gdriver, &gmode, "");
   int choice;
   cout<<"\n1.Translation\n2.Scaling";
   cout<<"\nInput your choice: ";
   cin>>choice;

   switch(choice){
   case 1:
      int tx=50,ty=50;

      cout<<"\nBefore Translation\n";
      line(100,100,200,100);
      line(100,100,100,200);
      line(200,100,200,200);
      line(100,200,200,200);

      line(150,150,250,150);
      line(150,150,150,200);
      line(150,150,150,250);
      line(250,150,250,250);
      line(150,250,250,250);

      line(150,150,150,250);
      line(250,150,250,250);
      line(150,250,250,250);

      line(100,100,150,150);
      line(100,200,150,250);
      line(200,100,250,150);
      line(200,200,250,250);

      cout<<"\nAfter Translation\n";

      setcolor(3);
      line(100+tx,100+ty,200+tx,100+ty);
      line(100+tx,100+ty,100+tx,200+ty);
      line(200+tx,100+ty,200+tx,200+ty);
      line(100+tx,200+ty,200+tx,200+ty);

      line(150+tx,150+ty,250+tx,150+ty);
      line(150+tx,150+ty,150+tx,200+ty);
      line(150+tx,150+ty,150+tx,250+ty);
      line(250+tx,150+ty,250+tx,250+ty);
      line(150+tx,250+ty,250+tx,250+ty);

      line(150+tx,150+ty,150+tx,250+ty);
      line(250+tx,150+ty,250+tx,250+ty);
      line(150+tx,250+ty,250+tx,250+ty);

      line(100+tx,100+ty,150+tx,150+ty);
      line(100+tx,200+ty,150+tx,250+ty);
      line(200+tx,100+ty,250+tx,150+ty);
      line(200+tx,200+ty,250+tx,250+ty);

      break;

   case 2:
      float sx=1.5,sy=1.5;
      cout<<"\nBefore Scaling\n";
      line(100,100,200,100);
      line(100,100,100,200);
      line(200,100,200,200);
      line(100,200,200,200);

      line(150,150,250,150);
      line(150,150,150,200);
      line(150,150,150,250);
      line(250,150,250,250);
      line(150,250,250,250);

      line(150,150,150,250);
      line(250,150,250,250);
      line(150,250,250,250);

      line(100,100,150,150);
      line(100,200,150,250);
      line(200,100,250,150);
      line(200,200,250,250);

      setcolor(3);
      cout<<"\nAfter Scaling\n";
      line(100*sx,100*sy,200*sx,100*sy);
      line(100*sx,100*sy,100*sx,200*sy);
      line(200*sx,100*sy,200*sx,200*sy);
      line(100*sx,200*sy,200*sx,200*sy);

      line(150*sx,150*sy,250*sx,150*sy);
      line(150*sx,150*sy,150*sx,200*sy);
      line(150*sx,150*sy,150*sx,250*sy);
      line(250*sx,150*sy,250*sx,250*sy);
      line(150*sx,250*sy,250*sx,250*sy);

      line(150*sx,150*sy,150*sx,250*sy);
      line(250*sx,150*sy,250*sx,250*sy);
      line(150*sx,250*sy,250*sx,250*sy);

      line(100*sx,100*sy,150*sx,150*sy);
      line(100*sx,200*sy,150*sx,250*sy);
      line(200*sx,100*sy,250*sx,150*sy);
      line(200*sx,200*sy,250*sx,250*sy);

   }
   getch();
   closegraph();
}
