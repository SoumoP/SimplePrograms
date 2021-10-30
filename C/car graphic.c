Write a Program to make a moving colored car using inbuilt functions.

#include<graphics.h>  
#include<conio.h>  
int main()  
{  
    intgd=DETECT,gm, i, maxx, cy;  
    initgraph(&gd, &gm, "C:\\TC\\BGI");  
    setbkcolor(WHITE);  
    setcolor(RED);  
    maxx = getmaxx();  
    cy = getmaxy()/2;  
    for(i=0;i<maxx-140;i++)  
        {  
        cleardevice();  
        line(0+i,cy-20, 0+i, cy+15);  
        line(0+i, cy-20, 25+i, cy-20);  
        line(25+i, cy-20, 40+i, cy-70);  
        line(40+i, cy-70, 100+i, cy-70);  
        line(100+i, cy-70, 115+i, cy-20);  
        line(115+i, cy-20, 140+i, cy-20);  
        line(0+i, cy+15, 18+i, cy+15);  
        circle(28+i, cy+15, 10);  
        line(38+i, cy+15, 102+i, cy+15);  
        circle(112+i, cy+15,10);  
        line(122+i, cy+15 ,140+i,cy+15);  
        line(140+i, cy+15, 140+i, cy-20);  
        rectangle(50+i, cy-62, 90+i, cy-30);  
        setfillstyle(1,BLUE);  
        floodfill(5+i, cy-15, RED);  
        setfillstyle(1, LIGHTBLUE);  
        floodfill(52+i, cy-60, RED);  
        delay(10);  
         }  
    getch();  
    closegraph();  
    return 0;  
}  