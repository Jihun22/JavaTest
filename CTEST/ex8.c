#include <stdio.h>

int main (void) {
    int n [5];
    int i;

    for (i = 0 ; i< 5; i++) {
        printf("숫자입력:");
        scanf("%d", &n[i]);
    }
    for (i = 0 ; i< 5; i++) {
        printf("%d", n[(i+1)%5]);
    }
    return 0;
}