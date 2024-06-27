public class Ex26 {
    public static void main(String[] args) {
        int []a = new int[8]; //8크기으 ㅣ빈 배열 생성
        int i = 0; int n = 10 ;
        while (n>0){ //정답: 1. n >0 , n>=1 , n<8 , i<=7
            a[i++] = n%2;  //정답 :n%2
            n/=2;  // i가 0부터 +1 씩 증가하며 값을 채우고 while문 조건식에 8번만 반복하게 조건

        }
        for (i=7; i>=0; i--) {
            System.out.print(a[i]);
        }
    }
}
