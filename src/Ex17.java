//부모클래스 
abstract class Vehicle2 {
    private String name;

    abstract public String getName(String val);

    public String getName() {
        return "Vehicle name:" + name;
    }

    public void setName(String val) {
        name = val;
    }
}
    // 자식 클래스
    class Car3 extends Vehicle2 {
        public Car3(String val) {
            setName(val);
        }


        public String getName(String val) {
            return "Car3 name :" + val;
        }

        public String getName(byte val[]) {
            return "Car3 name : " + val;
        }
    }


    public class Ex17 {
        public static void main(String[] args) {
            Vehicle2 obj = new Car3("Spark");
            System.out.println(obj.getName());
        }
    }

