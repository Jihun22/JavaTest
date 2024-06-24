public class Ex11 {
    public static void main(String[] args) {
        Ex11 a1 = new Ex11(); //Ex11 타입의 객체 a1 생성
        Ex11s a2 = new Ex11s();    //Ex11s 타입의 객체 a2 생성
        System.out.println(a1.sun(3,2) + a2.sun(3,2)); //Ex11 sun은 3+2 = 5 , Ex11s sun은 3-2+5 =6
    }
    int sun( int x, int y) { //Ex11 클래스에 메서드 정의 , 두정수 합을 반환함
        return x + y;
    }
}

class Ex11s extends Ex11{
    int sun (int x, int y ) {  //sun 메서드를 재정의(오버라이드)함
        return x - y + super.sun(x,y);
    }

}
