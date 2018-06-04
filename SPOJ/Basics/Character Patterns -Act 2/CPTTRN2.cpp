#include <iostream> 
#include <cstdio> 
using namespace std;
int main(){
	
	    int t;
	    scanf("%d",&t);
	    while(t--)
	    {
	        int l,c;
	        scanf("%d\t%d",&l,&c);
	        int le=c-1;
	        
	       for(int i=0;i<l;i++)
	       {
	           for(int j=0;j<c;j++)
	           {
	            if((i==0) ||(i==(l-1))||(j==0)||(j==le))
	            printf("*");
	            else printf(".");
	            
	           }
	           printf("\n");
	       }
	       printf("\n");  
	    }
	    return 0;
	    
	
}
