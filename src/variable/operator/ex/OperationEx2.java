package variable.operator.ex;

public class OperationEx2 {
    public static void main(String[] args) {
        // 다음 double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램 작성
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1+ val2+val3;
        System.out.println("sum = " + sum);
        double ave = sum/3;
        System.out.println("ave = " + ave);


    }
}
