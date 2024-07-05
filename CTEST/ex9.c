#include <stdio.h>

int main () {

    int input = 101110;  //2진수 101110 을 10진수로 변환 
    int di = 1;    //2진수의 각 자리수를 10진수로 변환할때 사용할 배수 di 정의
    int sum = 0;       // 2진수 가장 오른쪽 자리부터 시작 , 2의 거듭제곱 나타내는 값  변환된 10진수 값 누적될 변수 sum 을 0할당

    while (1) {  //while 무한루프 

        if (input ==0) { //input 0 되면  반복문 빠져나옴 
            break;
        }else {

            sum = sum + (input %(10)) * di; // input의 가장 오른쪽 자리수 값 
            di = di * 2;
            input = input / 10;
        }
    }

    printf("%d",sum);

    return 0;
}

