public class Ex5 {
    public static void main(String[] args) {
        int a = 0; //정수형 변수 a 를 선언하고 0을 할당함

        for (int i = 1 ; i <999; i++) { //1 부터 998까지 (999미만) +1 씩 증가하면서 반복
            if (i % 3 == 0 && i % 2 == 0) //%= 나머지
                a = i;
        }
        System.out.print(a);
    }
}
