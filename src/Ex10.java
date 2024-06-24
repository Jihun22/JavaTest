class A1{  //A1 부모 클래스
    private int a;
    public A1(int a){
        this.a = a;  //a의 멤버 변수를 10을 할당함 .
    }
    public void display() {
        System.out.println("a=" +a);
    }

}

class B1 extends  A1{  //B1 자식클래스
    public B1 (int a) {
        super(a);   //super()는 부모클래스의 생성자를 호출하는 키워드
        super.display();  // 부모의 6행 display 호출
    }

}


public class Ex10 {
    public static void main(String[] args) {
        B1 obj = new B1(10);  //B의 생성자에 10을 넣어 B객체를 생성함.
    }
}
