#include <iostream>
#include<cstdio>
#include<cstdlib>
using namespace std;

int main() {

    int t;
    scanf("%d",&t);
    while(t--)
    {
        int r,c,s;
        scanf("%d\t%d\t%d",&r,&c,&s);
        int nr=r*s*2;
        int nc=c*s*2;
        int temp=s*2;
        int val1=s-1;
        int val2=s;
        //rows
        for(int i=0;i<nr;++i)
        {

            for(int j=0;j<nc;++j)
            {
                if (val1 == (i+j) % temp)
				{
                    printf("/");
				}
				else if (val2 == ((abs(i-j) )% temp))
				{
				    printf("\\");

				}
				else
				{
                    printf(".");
				}
            }

            printf("\n");
        }

    }
	return 0;
}
