/*연산 예제
가지고 있는 돈이 총 4620
1000원 , 500원 ,100원 10원 지페 및 동전을 이용하여 보기의 조건에 맞춰
최소한의 코드를 통해 괄호 안을 작성하시오.
 */

/*
아래 주어진 항목을 갖고 괄호안의 코드 작성
변수 : m
연산자 : /,%
괄호: [,],(,)
정수 : 1000,500,10
 */

public class Ex24 {
    public static void main(String[] args) {

       int m = 4620;
      int  a= m /1000;
      int b=(m%1000)/ 500;
      int  c=(m%500)/100;
       int  d=(m%100)/10;

        System.out.println(a); //천원짜리 4장 출력
        System.out.println(b) ; //오백원짜리 1개 출력
        System.out.println(c); // 백원짜리 1개출력
        System.out.println(d); //십원짜리 2개 출력

    }
}
