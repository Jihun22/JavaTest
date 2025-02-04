package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        /*
        평점에 따른 영화 추천
        어바웃 타임 평점 9
        토이스토리 8
        고질라 7
        변수: double rating 사용 If문 사용

         */

        double rating = 7;

        if (rating <=9){
            System.out.println("어바웃 타임 추천");
        }
         if (rating <=8){
            System.out.println("토이스토리 추천");
        }
        if (rating <=7){
            System.out.println("고질라 추천");
        }


    }
}
