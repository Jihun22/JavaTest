package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        /*
        달러가 0 미만이면 잘못된 금액
        달러가 0일때 환전할 금액 없음
        달러가 0초과일때 환전 금액은 (게산된 원화)
        금액 int dollar 로 지정
         */

        int dollar = 10;

        if (dollar <0) {
            System.out.println("잘몬된 금액");
        }
        else if (dollar == 0) {
            System.out.println("환전할 금액 없음 ");
        }
        else {
            int won = dollar * 1300;
            System.out.println("환전금액은" + won +"입니다");

        }

    }

}
