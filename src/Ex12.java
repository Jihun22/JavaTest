class Parent {  // 부모클래스
    int x = 1000;

    Parent() {
        this(3000);
    }
    Parent(int x) {
        this.x = x;  //x에 3000 할당
    }

}


class  Child extends Parent { //자식클래스
    int x = 4000;
    Child() {
        this(5000);
    }
    Child(int x){
        this.x = x;  //x 에 5000 할당
    }
    int getX(){
        return x;
    }

}

public class Ex12 {
    public static void main(String[] args) {
    Child obj = new Child();
        System.out.println(obj.getX());

    }
}
