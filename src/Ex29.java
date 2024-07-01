class Static { // 클래스 이름이 Static 인것 기능이 있는건 아님
    public int a = 20; //Class 의 멤버 변수
    static int b = 0; //Class 의 Static 변수. 인스턴스가 공유하는 변수
}

public class Ex29 {
    public static void main(String[] args) {

        int a; //a 라는 변수
        a = 10;  //a에 10 할당
        Static.b =a; //Static Class의 static 변수 b에 a(10) 할당

        Static st = new Static();

        System.out.println(Static.b++); //b= 10 후위 연산
        System.out.println(st.b); // 후위로 값 11
        System.out.println(a); // a 값 10 가져옴
        System.out.println(st.a); //static 값 20 가져옴

    }
}
