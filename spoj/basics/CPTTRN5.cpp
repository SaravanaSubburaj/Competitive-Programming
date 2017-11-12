#include<iostream>
#include<cstdio>
int main(){
    int t;
    scanf("%d",&t);
     while(t--)
     {
         int r,c,hw;
         scanf("%d\t%d\t%d",&r,&c,&hw);
         int d=(2*hw)+2;
         for(int i=0;i<((r+1)+(r*hw));++i) 
         {
             for(int j=0;j<((c+1)+(c*hw));++j) 
             {
                 if((i%(hw+1)==0)||(j%(hw+1)==0)) printf("*");
                 
		 	 	else 
				 {
					  	  if(i==j)
					  	  	printf("\\");
					  	  else if((i+j)%2==0)    
							{
								if((i+j)%d==0) printf("/"); 
								else if((j-i)%d==0) 
								printf("\\");
							else printf(".");
							}							
							else printf(".");	  				  					  
				  } 
             }
             printf("\n");
         }
         printf("\n");
     }
    return 0;
}
