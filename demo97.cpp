#include <stdio.h>
#include <conio.h>
 
int main()
{
    int N;
    int i, j, sum;
    do
    {
        printf("\n Nhap vao so N = ");
        scanf("%d", &N);
    }
    while(N <= 0);
    for(i = 2; i <= N; i++)
    {
        sum = 1;
        for(j = 2; j <= i/2; j++)
        {
            if(i%j == 0)
                sum += j;
        }
        if(sum == i)
            printf("\n %d", i);
    }
    getch();
}
