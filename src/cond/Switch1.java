package cond;

public class Switch1 {
    public static void main(String[] args) {
        /*
        당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
        이 프로그램은 int greade 라는 변수를 사용하여 , 회원등급 (grade) 에 따라 다음의 쿠폰을 발급해야 한다 .
        1등급 쿠폰 1000
        2등급 쿠폰 2000
        3등급 쿠폰 3000
        위의 등급이 아닐경우 쿠폰 500

        각 쿠폰이 할당된 후에는 "발급받은 쿠폰" + 쿠폰값이 출력되어야 한다
        ex 발급받은 쿠폰 2000
         */
        int greade =2;
        int ch;

        if (greade == 1) {
            ch=1000;

        }else if (greade == 2) {
            ch=2000;
        }
        else if (greade == 3) {
            ch=3000;
        }
        else{
            ch=500;
        }
        System.out.println("발급받은 쿠폰" +ch);

    }
}
