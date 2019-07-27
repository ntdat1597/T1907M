#include <stdio.h>
#include <math.h>
int main(){
	int a,b,c;
	printf("nhap so a:\n");
	scanf("%d",&a);
	printf("nhap so b:\n");
	scanf("%d",&b);
	printf("nhap so c:\n");
	scanf("%d",&c);
	
	//if(! (a=c <= c || a=c <= || b+c <= a )){
	// }
	
	if(a+b>c && a+c>b && b+c>a){
		int C = a + b +c ;
		double P =  (double)C/2;
		double S;
		
		S = sqrt(P*(P-a)*(P-b)*(P-c));
		printf("day la 3 canh 1 tam giac\n");
		printf("dien tich %lf\n",S);
		printf("chu vi%d\n",C);
	}else{
		printf("khong phai la 3 canh tam giac\n");
	}
	}

