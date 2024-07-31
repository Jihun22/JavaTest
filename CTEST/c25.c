#include<stdio.h>

int main () {

    int a [4] = {0,2,4,8};    // A 배열 0,2,4,8 할당
    int b [3] = {};  //B 배열 크기 3 요소 0 할당 
    int i = 1;
    int sum = 0;
    int *p1;

    for (i; i < 4 ; i++) {  // i= 1부터 3까지 
        p1 = a + i;    //a배열의 i번째 요소 
        b[i-1] = *p1 - a[i-1];    //b 배열 i-1번째 요소에 a배열의 i 번째 요소에서 i-1 번쨰 요소를 뺀 값
        sum = sum +b[i-1] + a[i];
    }

    printf("%d", sum);

    return 0; 
}