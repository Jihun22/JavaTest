package variable.operator.ex;

public class OperationEx3 {
    public static void main(String[] args) {
        /*
        int 형 변수 score 를 선언
        score 가 80 점 이상 100점 이하면 true 아니면 false 선언
         */

        int score= 80;

      boolean b= score >=80 && score <=100;
        System.out.println("score = " + b);

    }
}
