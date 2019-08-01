#include <stdio.h>


int F(int n)
{
    if(n==0)
	{
		return 0;
	} 
    if(n==1)
	{
    	return 1;	
    } 
    return F(n-1)+F(n-2);
}
int main()
{
    int n;
    printf("Nhap vao so nguyen can tinh:");
    scanf("%d",&n);
    for(n=1;n<=n;n++)
        printf("%d  ",F(n));
    return 0;
}
