package cond;

public class If5 {
    public static void main(String[] args) {
        /* 온라인 쇼핑몰의 할인 시스템 개발
        할인 조건 아이템 가격이 10000 원 이상일때 1000원 할인
        나이가 10살 이상일때 1000원 할인
         */
        int Discount = 0;
        int item = 10000;
        int age = 20;
        if (item >= 10000) {
            Discount = Discount + 1000;
            System.out.println("10000원 이상 구매 1000원 할인 ");


        }
        if (age <= 10) {
           Discount = Discount + 1000;
            System.out.println("어린이 1000원 할인 ");

        }
        System.out.println("총 할인 금액 :" + Discount +"원");
    }
}
