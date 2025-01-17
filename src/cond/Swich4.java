package cond;

public class Swich4 {

    public static void main(String[] args) {
        int grade = 2;
   //업데이트된 스위치문 ->
        int ch = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰"+ ch);
    }}
