#include <stdio.h>

void sum2So(int a, int b){
    int tong = 0;
    tong = a + b;
    printf("Tong 2 so %d va %d la %d: ",a,b,tong);
}

void hieu2So(int a, int b){
    int hieu = 0;
    hieu = a - b;
    printf("Hieu 2 so %d va %d la %d: ",a,b,hieu);
}

void tich2So(int a, int b){
    int tich = 0;
    tich = a * b;
    printf("Tich 2 so %d va %d la %d: ",a,b,tich);
}

void thuong2So(int a, int b){
    int thuong = 0;
    thuong = a/b;
    printf("Thuong 2 so %d va %d la %d: ",a,b,thuong);
}

void showMenu(){
    printf("1. Tong 2 So\n");  
    printf("2. Hieu 2 So\n");  
    printf("3. Tich 2 So\n");  
    printf("4. Thuong 2 So\n");  
}

int main()
{
    int menu;
    int a,b;
    
    printf("Nhap a:"); 
    
    scanf("%d",&a);
    
    printf("Nhap b :"); 
    
    scanf("%d",&b);
    
   
        
        printf("Chon menu tu 1-> 4 de chon phuong thuc tinh 2 so:\n");
        showMenu();
        scanf("%d",&menu);
        switch(menu){
            case 1 : 
                sum2So(a,b);
                break;
            case 2 : 
                hieu2So(a,b);
                break;
            case 3 : 
                tich2So(a,b);
                break;
            case 4 : 
                thuong2So(a,b);
                break;
       }
    
    
    return 0;
}


