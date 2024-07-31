#include<stdio.h>

int mp (int base , int exp) { //두개의 정수 인자 base와 exp를 받음 
    int res = 1;  //res 라는 변수를 1로 할당 받고 
    for(int i=0; i < exp ; i++) {
        res *= base;   //for 반복문 사용해 base 를 res번 만큼 곱함 res= res*base
    }
    return res;  //거듭제곱 밧인 res를 반환함 
}
int main() {
    int res;
    res = mp (2,10);   //2의 10제곱 계산
    printf("%d",res);  //2를 10번 곱함 
    return 0;
}