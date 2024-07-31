#include <stdio.h>

int main() {

    char * a = "qwer";   // 포인터 a에 qwer 값 할당 
    char * b = "qwtety";  // 포인터 b에 qwtety 값 할당 

    for(int i = 0; a[i] != '\0' ; i++){  //문자열 a 를 처음부터 끝까지 (널 문자가 나타날 때까지) 확인 하는 반복문  i는 문자열 a의 각 문자를 순서대로 가르키는 인덱스다
        for (int j = 0 ; b[j] != '\0'; j++) {  //내부 반복문은 문자열 b를 처음부터 끝까지 확인 
             if(a[i]==b[j]) printf("%c",a[i]);  //j는 문자열 b의 각 문자를 순서대로 가르키는 인덴ㄱ스 
        }
    }
}