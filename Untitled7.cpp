#include <stdio.h>
#include <conio.h>
#include <math.h>

int main() {
	float a, b, c, delta, x1, x2;

	printf("phuong trinh bac 2 co dang ax^2 + bx + c = 0. Nhap a :");
	scanf("%f", &a);

	printf("Nhap b :");
	scanf("%f", &b);

	printf("Nhap c :");
	scanf("%f", &c);

	if (a == 0 && b == 0 && c == 0) {
		printf("PT vô so nghiem");
	} else if (a == 0 && b == 0 && c != 0) {
		printf("PT vô nghiem");
	} else if (a == 0 && b != 0 && c == 0) {
		x1 = -b / c;
		printf("1 nghiem là : %f ", x1);
	} else {
		delta = b * b - 4 * a * c;
		printf("Gia tri cua delta la : %f" , delta);

		if (delta < 0)
			printf("Phuong trinh vo nghiem");
		if (delta == 0) {
			x1 = -b / (2 * a);
			printf("Phuong trinh da nghiem kep:%f", x1);
		}
		if (delta > 0) {
			x1 = (-b + sqrt(delta)) / (2 * a);
			x2 = (-b - sqrt(delta)) / (2 * a);
			printf("Phuong trinh co 2 nghiem phan biet");
			printf("%f", x1);
			printf("%f", x2);
		}
	}
	return 0;
}


