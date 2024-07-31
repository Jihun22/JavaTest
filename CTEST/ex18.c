#include <stdio.h>

int main () {
    char *p = "KOREA"; //P 라는 포인터 변수 "KOREA"  문자열  p는 문자열 첫글자인 K주소다.
    printf ("%s \n" , p);
    printf ("%s \n", p+3); // p주소에서 3만큼 더하고 출력
    printf( "%c \n", *p); // p가 가르키는 위치 문자 K출력
    printf ("%c \n", *(p+3)); // p에서 3 더한 위치 문자 E출력
    printf ("%c ", *p+2); //  P가 가르키는 문자 'K'에서  ASCII 값 2 더한 ㄴ값  75+2 = 77 "A"값이 65다.
}