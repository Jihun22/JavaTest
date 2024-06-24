public class Ex4 {
    public static void main(String[] args) {

    Cond obj = new Cond(3); //Cond 객체 생성 생성자에 3 넘겨줌
    obj.a =5;   //a 값을 5로 덮어씀
    int b = obj.func(); // Func() 실행됨 56이 반환됨
    System.out.print(obj.a + b);  // obj.a +b 는 5 +56  = 61
}
}

class Cond {
    int a;
    public Cond (int a) {
        this.a = a;  // 매개변수 a를 받아서 Cond 멤버변수 a 에 할당 , 3이 할당되다가 5로 할당이 바뀜
    }
    public int func(){
        int b = 1;  //b의 시작값 1 임
        for (int i = 1; i < a ; i++) { //1부터 a 미만 까지 +1 증가하며 반복함 a=5 ,1
            b+= a *i;
        }
        return a+ b ;
    }
}
