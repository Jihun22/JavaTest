package variable.operator;

public class OperattionEx1 {
    public static void main(String[] args) {
        /*
         num1 , num2 , num3 이라는 이름 세개의 int 변수 선언 하고 각각 10,20,30 으로 초기화
         세 변수의 합을 계산하고 그 결과를 sum 이라는 이름의 int 변수에 저장
         세 변수의 평균을 계산하고 그 결과를 average 라는 int 변수에  저장 평균 계산시 소수점 이하의 결과를 버림
         sum 과 average 변수의 값을 출력
         */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;

        System.out.println("sum = " + sum);

        int average = sum /3;
        System.out.println("average = " + average);
    }
}
