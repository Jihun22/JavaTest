public class Ex9 {
    public static void main(String[] args) {
        A b = new B();
        b.paint();
        b.draw();
    }
}

class  A {    //부모클래스
    public void paint() {
        System.out.print("A");
        draw();
    }
    public void draw(){
        System.out.print("B");
        draw();
    }

}

class  B  extends  A{  //자식클래스
    public void paint() {
        super.draw();
        System.out.print("C");
        this.draw();
    }
    public void draw() {
        System.out.print("D");
    }
}