//부모 클래스
class Parent3 {
    public void show(){
        System.out.println("Parent");
    } //Perent3 부모 클래스의 show()가 자식 클래스 Show로 오버라이드 됨

}
//자식클래스
class Child4 extends Parent3{
    public void show(){
        System.out.println("Child");
    }
}



public class Ex15 {
    public static void main(String[] args) {
        Parent3 pa = new Child4();
        pa.show();
    }
}
