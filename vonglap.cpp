#include <stdio.h>

int main(){

   int i, j, mat[4][4], hang, cot;
   float tong = 0;
   float trungBinhCong = 0;

   printf("\nNhap so hang cua ma tran: ");
   scanf("%d", &hang);

   printf("\nNhap so cot cua ma tran: ");
   scanf("%d", &cot);

  
   printf("\nNhap ma tran: \n");
   for (i = 0; i < hang; i++) {
      for (j = 0; j < cot; j++) {
         printf("\nNhap phan tu a[%d][%d] : ", i, j);
         scanf("%d", &mat[i][j]);
      }
   }
   
   for (i = 0; i < hang; i++) {
   		printf("\n");
      for (j = 0; j < cot; j++) {
	  	printf("%3d ",mat[i][j]);
	  }
	}
   
   for (i = 0; i < hang; i++) {
      for (j = 0; j < cot; j++) {
         if (i == j)
            tong += mat[i][j];
                                
      }
   }
   printf("\nTong duong cheo la:  %0.1f",tong);
   trungBinhCong = tong/hang;
   printf("\n Trung binh cong cua duong cheo ma tran 44 la : %f",trungBinhCong);


   return (0);
	
	
	
		
	
}
