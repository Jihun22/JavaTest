#include <stdio.h>

int test (int n) {  // 정주 n을 받아서 완전수인지 아닌지 판별 , 완전수: 자기 자신을 제외한 약수의 합이 자기 자신과 같은수 

int i , sum = 0;

for (i = 1; i <= n /2 ; i ++) { //for 루프를 사용해서 1부터 n/2 까지의 수 i에 대해 반복
    if (n % i ==0)       //n을 i로 나눈 나머지가 0이면 (i가 n의 약수이면) sum에 i를 더함
    sum += i;
}
if (n==sum)  // 루프가 끝나고 나서 n과 sum이 같으면 1(true)을 반환하고 그렇지 않으면 0(false)을 반환함
return 1;
return 0;
}

int main() {
    int i , sum =0;

    for (i = 2 ; i <= 100; i++) { //for 루프를 사용해서 2부터 100까지 수 i에 대해 반복 
        if (test(i))             // 각 i에 대해 test(i)를 호출해서 , i가 완전수 인지 확인 
        sum += i;               //만약 test(i)가 참 (즉,1)을 반환하면 , sum에 i를 더함 
    }                           // 루프가 끝나고 나서 printf 함수를 사용해서 sum 출력
    printf("%d", sum);   //2 - 100 사이의 완전수는 6(1+2+3)과 28(1+2+4+7+14) 두개다
    return 0;

}