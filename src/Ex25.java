//A class
class  A2{
    int a;
    int b;
}

public class Ex25 {
    static void func1 (A2 m) {
        m.a *=10;
    }
    static void func2 (A2 m){
        m.a += m.b;
    }
    public static void main(String[] A2rgs) {
        A2 m = new A2();

        m.a = 100;
        func1(m);
        m.b = m.a;
        func2(m);

        System.out.printf("%d",m.a);

    }
}
