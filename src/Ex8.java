public class Ex8 {
    public static void main(String[] args) {
        int i= 0;   // i가 0으로 선언 , 할당됨
        int sum = 0;   //sum도 0으로 선언, 할당됨
        while (i<10) {  //i가 10미만일떄까지 반복 0,1,2,3,4,5,6,7,8,9 까지 반복
            i++;   //i의 값을 바로 +1 증가 시킴 .
            if(i%2 ==1)  //i를 2로 나눈 나머지가 1일때 (홀수)
                continue; //continue 함   조건문에 걸리지 않은경우 (짝수) sum변수에 i를 더함
            sum += i;
        }
        System.out.println(sum);  //2+4+6+8+10 = 30
    }
}
