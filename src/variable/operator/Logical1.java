package variable.operator;

public class Logical1 {
    public static void main(String[] args) {
        //And: 두 피연산자가 모두 참이여야 true 반환한다 둘중 하나라도 거짓이면 false 반환
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        //OR: 두 피연산자 중 하나라도 참이면 true 반환 둘다 거짓이면 false 반환
        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);


        //NOT : 피연산자의 논리적 부정을 반환한다 . 왜냐하면 둘 중 하낭니 b 가 거짓이기 때문
        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);


        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;

        System.out.println( a&& b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

    }
}
