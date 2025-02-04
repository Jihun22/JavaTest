package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        /* 거리가 1km 이하면 도보
         10km 이하 :자전거
         100Km 이하 자동차
         100km 초과 비행기

         거리 변수 int distance

         */
        int distance = 101;
// 내가낸 답
//        if (distance>100){
//            System.out.println("비행기");
//        }
//        else if (distance>=100){
//            System.out.println("자동차");
//        }
//        else if (distance>=10){
//            System.out.println("자전거");
//        }
//        else if (distance>=1){
//            System.out.println("도보");
//        }

        //김영한 답
        if (distance <= 1) {
            System.out.println("도보");
        }
        else if (distance <= 10){
            System.out.println("자전거");
        }
        else if (distance <=100){
            System.out.println("자동차");
        }
        else {
            System.out.println("비행기");
        }

    }
}
