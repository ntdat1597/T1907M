#include <stdio.h>

int main(){
	int n,uoc,uoc_m;
	uoc=0;
	printf("Nhap gia tri n");
	scanf("%d",&n);
	for(int i=2;i<=n;++i){
		if(uoc==1){
		printf("%d la so nguyen to\n",n);
	}else{
		printf("%d khong la so nguyen to\n",n);
	}
	for(int m=2;m<n;m++){
	uoc_m=0;
	for(int i=2;i<=m;i++){
		if(m%i==0){
			uoc_m++;
		}
	}if(uoc_m==1){
		printf("%d la so nguyen to\n",m);
	}}
}
	return 0;
}
