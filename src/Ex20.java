public class Ex20 {
    public static void main(String[] args) {
        System.out.print(Ex20.check(1));
    }

    //빈공간 답 쓰라는 문제  :static
    static String check (int num) {
        return (num >=0) ? "positive" : "negative";
    }
}
