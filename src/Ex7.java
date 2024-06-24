public class Ex7 {
    public static void main(String[] args) {
        int i , j ;
        for (j=0 , i=0; i<=5; i++) {  //j와 i에 0 을 할당하고 (시작값) i가 5보다 작거나 같을떄까지 +1증가 하면서 반복
            j+=i;    //+= 연산자 는 j=j+i 로 표현
            System.out.print(i);
            if(i==5) { //i가 5일때는 + 대신 = 를 출력
                System.out.print("=");
                System.out.print(j);
            }else {
                System.out.print("+");
            }
        }
    }
}

