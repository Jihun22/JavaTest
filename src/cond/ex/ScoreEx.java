package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        /*
        학점 계산하기  90점 이상 :A
         80~ 90 미만 :B
         70~ 80미만 : C
         60~ 70 :D
         60미만 F
         int score 로 변수 지정
         */

        int score = 85;

        if (score>=90){
            System.out.println("A");
        }
        else if (score>=80){
            System.out.println("B");
        }
        else if (score>=70){
            System.out.println("C");

        }
        else if (score>=60){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

    }
}
