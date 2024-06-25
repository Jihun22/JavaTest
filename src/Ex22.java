//스레드 예제
//Car 클래스
class Car4 implements  Runnable { //Thread 클래스 Runnabel 인터페이스를 구현 받은 객체

    int a ;
    public void run() {
        System.out.println("message");
    }
}
public class Ex22 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car4()); //Runnable 의 구현체가 들어가야함
                t1.start();
    }
}
/*
thread 를 생성했고 start() 메소드를 호출해야 Runnable 의 run() 메소드가 새롭게 생긴 thread에서 동기화 한다.

 */
