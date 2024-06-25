//추상클래스 문제
//부모
abstract  class Vehicle {
    protected String name;  //추상클래스 상속으로만 생성 가능
    abstract public String getName(String val); //getName 메도스 구현을 자식에게 넘김

    public  String getName() {
        return "Vehicle name:" + name; //추상클래스인데 메소드 구현함
    }
}

//자식
class  Car2 extends Vehicle {
    private String name;
    public Car2(String val) {
        name = super.name = val; //Car의 name 변수와 부모 name 변수를 동시에 val  매개변수로 할당
    }

    public String getName(String val) {
        return "Car name :" + val;  //Vehicle의 추상 메소드를 오버라이드함
    }

    public String getName(byte val[]) {
        return "Car name:" + val;  //Car의 메소드

    }

}


public class Ex16 {
    public static void main(String[] args) {

        Vehicle obj = new Car2("Spark");  //Vehicle클래스에서 car객체 생성후 할당
        System.out.println(obj.getName()); //Vehicle의 getName() 메소드 호출됨
    }                                       //자식인 Car객체에 getName() 메소드가 없기떄문
}
