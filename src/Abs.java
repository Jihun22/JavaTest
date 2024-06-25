abstract  class  Car {
    abstract  void drive(); //추상 메서드 : 어떻게 주행할지 정의 안함

    public void startEngine() {
        System.out.println("엔진이 켜짐");  //일반 메서드 : 모든 차가 공통적 사용
    }
}

class  Sedan extends Car {
   public void drive() {
        System.out.println("도로를 주행 "); // '주행'에 대한 구제척 구현
    }
}

class Truck extends Car{
    public void drive() {
        System.out.println("짐을 실고 달림!"); //트럭에 맞게 '주행'을 다르게 구현함

    }
}


public class Abs { //추상 클래스 예제
    public static void main(String[] args) {
        Truck tru = new Truck();
        Sedan sed = new Sedan();

        tru.drive();
        sed.drive();



    }
}
