#include <stdio.h>

int main ()
{
	
	int n,t;
	printf("nhap so");
	scanf("%d",&n);
	int m=n;
	while(n>0){
		t= t*10+n%10;
		n=n/10;
	}
			
	if(t == m )
	printf("%d la so thuan nghich",m);
	else
	printf("% khong phai la so thuan nghich",m);
}
