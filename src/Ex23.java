//Person ==========================
class  Person {
    private final String name;  //Person 클래스의 멤버 변수
    public Person(String val){
        name = val;
    }
    public String get() { // Person클래스의 static 메소드  에러코드:public static String get();
        return  name;

         }
         public  void print() {
             System.out.println(name); //name 출력
         }
}

//Person ==========================
public class Ex23 {
    public static void main(String[] args) {
    Person obj = new Person("Kim");
    obj.print();
    }
}
