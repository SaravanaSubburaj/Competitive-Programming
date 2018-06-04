#include<iostream>
#include<cstdio>
int main(){
    int t;
    scanf("%d",&t);
     while(t--)
     {
         int r,c,h,w;
         scanf("%d\t%d\t%d\t%d",&r,&c,&h,&w);
         for(int i=0;i<((r+1)+(r*h));++i) //nr=(r+1)+(r*h)
         {
             for(int j=0;j<((c+1)+(c*w));++j) //nc=(c+1)+(c*w)
             {
                 if((i%(h+1)==0)||(j%(w+1)==0)) printf("*");
                 else printf(".");
             }
             printf("\n");
         }
         printf("\n");
     }
    return 0;
}

