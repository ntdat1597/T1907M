#include<stdio.h>
int main(){
	int a[10];
	for(int i=0;i<10;i++)
	{
		printf("Nhap a[%d] 10 lan: \n ",i);
		scanf("%d",&a[i]);
	}
	
	printf("Ket qua la: \n");
	
	for(int i=9;i>=0;i--)
	{
		printf("%2d",a[i]);
	} 

	return 0;
}
