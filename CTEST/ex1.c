#include <stdio.h>

int r1 () {
    return 4;
}

int r10 (){
    return (30+r1());
}
int r100() {
    return(200+r10());
}

int main() {
    printf("%d\n" , r100());
    return 0;
}

// return 4에서 30 +4 = 34  200+34 = 234 