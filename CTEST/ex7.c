#include <stdio.h>

int isPrime( int number ) {  // 숫자 소수인지 아닌지 
    int i; 
    for (i=2; i<number; i++) {  
        if (number % i ==0) return 0;  //2부터 주어신 숫자 -1 까지 각 숫자로 나눔  연산결과 0이면약수 아니면 1을 반환 (소수)
    }
    return 1;
}

int main(void) {
    int number = 13195, max_div =0 , i;  //0으로 할당 
    for (i=2; i<number; i++) // 2부터 number 반복 
    if (isPrime(i) == 1 && number % i == 0) max_div = i; // 소수 1 인지 0인지 확인 
    printf("%d", max_div);
    return 0;
}