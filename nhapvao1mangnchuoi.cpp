#include<stdio.h>
#include<string.h>

int main(){
	char s1[20];

	printf("Nhap chuoi s1: \n");
	scanf("%s",s1);

	int n= strlen(s1);

	int temp;

	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(s1[i]>s1[j]){
				temp=s1[i];
				s1[i]=s1[j];
				s1[j]=temp;
			}
		}
	}

	printf("Chuoi sau khi sap xep %s", s1);

	return 0;
}
