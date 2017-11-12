#include <iostream>
#include<cstdio>
using namespace std;
int main() {
    int t;
    scanf("%d",&t);
    while(t--)
    {
    int r,c,h,w;
    scanf("%d\t%d\t%d\t%d",&r,&c,&h,&w);
    int nr=r+h+(r*h);
    int nc=c+w+(w*c);
    int nextVert=w;
    int nextHorz=h;
    for(int i=0;i<nr;++i)
    {
        for(int j=0;j<nc;++j)
        {
        if(j==nextVert)
        {
                
       if((j==nextVert)&&(i==nextHorz))
        {
             nextVert+=w+1;
            printf("+");
        }
        else{
            nextVert+=w+1;
            printf("|");
            
        }
        }
        
        else if(i==nextHorz) 
        {
            printf("-");
        }
    
          else 
          printf(".");
     
        }
        printf("\n");
        nextVert=w;
        if(i==nextHorz) nextHorz+=h+1;
    }
    
     printf("\n");
    } 
	return 0;
} 