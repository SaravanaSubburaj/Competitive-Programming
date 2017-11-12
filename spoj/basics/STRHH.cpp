#include<iostream>
#include<cstring>
#include<cstdio>
using namespace std;
int main()
{
   int tc;

    scanf("%d\n",&tc);
    while(tc--)
    {
       char seq[204];
        scanf("%s",&seq);
       int hsl= strlen(seq);
        for(int i=0;i<hsl/2;i++)
       {
            if(i%2==0)
                printf("%c",seq[i]);

       }
       printf("\n");
    }

    return 0;
}