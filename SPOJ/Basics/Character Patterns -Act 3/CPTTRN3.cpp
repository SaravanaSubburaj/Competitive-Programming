#include <iostream> 
#include <cstdio> 
using namespace std;

int main(){
	
	    int t;
	    scanf("%d",&t);
	    while(t--)
	    {
	        int r,c;
	        scanf("%d\t%d",&r,&c);
	        for(int i=0;i<=(r*3);++i)
	        {
	            for(int j=0;j<=(c*3);++j)
	            {
	                if(((i%3)==0)||((j%3)==0))
	                printf("*");
	                else  printf(".");
	            }
	            printf("\n");
	        }
	    }
	    printf("\n");
	    
	    return 0;
}
