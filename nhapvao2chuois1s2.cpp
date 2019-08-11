#include<stdio.h>
#include<string.h>
int main(){
	char s1[20];
	printf("Nhap vao chuoi s1: \n");
	scanf("%s",s1);

	char s2[20]="aptech";

	int chr= 'aptech';

	if(strchr(s1, chr)!=NULL){
		printf("Chuoi s1 chua chuoi s2!");
	}else{
		printf("Chuoi s1 khong chua chuoi s2");
	}




	return 0;
	}
//Nhap vao 2 chuoi s1, s2 kiem tra xem s1 co chua s2 hay ko.
