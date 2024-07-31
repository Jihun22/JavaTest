#include <stdio.h>

int main () {

    int ary[3]; // 배열 크기 3 
    int s = 0; // 0으로 할당 
    *(ary +0) = 1;  //  ary[0] 에 1 할당 
    ary [1] = * (ary + 0 ) + 2; // ary[1] 에 첫번째 요소 1에  +2 한 3 할당 
    ary [2] = *ary +3;  //ary[2]에 첫번째 요 소의 값 3을 더한 4 할당 
    for(int i = 0; i < 3; i++) {

        s = s + ary[i]; //ary 모든 요소를 순회하면서 그값을 변수 s에 더함 
    }

    printf("%d",s); // 1+3+4 = 8 
}