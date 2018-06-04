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
	        
	        for(int i=0;i<l;i++){
	            
	           for(int j=0;j<c;j++)
	            {
	                if(((i%2==0)&&(j%2==0)) ||((i%2!=0)&&(j%2!=0)))
	                    printf("*");
	                    else printf(".");
	                
	            }
	            printf("\n");
	        }
	        
	    }
	    return 0;
	    
	
}
