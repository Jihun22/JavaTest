#include <stdio.h>

int main() {
    int i, j , k =0;

    for ( i = 0; i <=10; i++){
        printf("===========i값:%d \n",i);
        for(j = 0; j <10 ; ++j) {
            printf("~~~~~~~~~~j값%d \n",j);
            if(j >=5) break;
            k = k+1;
            printf("K값:%d\n",k);
        }
        if(i<6) continue;
    }  
     printf("최종K값:%d\n",k);
    return 0;
    }
    