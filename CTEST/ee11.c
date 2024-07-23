#include<stdio.h>
int main () {

    int i , j, n = 0 ;
    for( i = 0 ; i < 10; i ++) {
        printf("==================i값:%d\n",i);

        for( j= 0 ; j< 10; j++) {
             printf("~~~~~~~~~~~~~~~j값:%d\n",j);
            if (j > 5) continue;
            n++;
        }
        printf("+++++++++++n값:%d\n" , n);
        if (i >6) break;
    }
    printf("최종값:%d\n",n);
    return 0;
 }