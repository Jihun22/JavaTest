package variable.operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; //(2*2) +(3*3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 같다

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        //코드를 더 명확하고 단순하게 가로 넣어서 () 하는거 추천
        // 연산자 우선순위가 애매하거나 조금이라도 복잡하면 언제나 괄호를 고려하자!

    }
}
