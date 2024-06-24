public class Ex3 {
    static int [] mkarr() {
        int [] tmpArr = new int[4]; //크기가 4인 정수형 배열 tmpArr선언

        for (int i = 0; i< tmpArr.length; i++){  //0부터 크기가 4인 정수형 배열의 길이가 4미만 까지 반복

            tmpArr[i] = i;                      //0번째 배열 0 ,1,1,2,2,3,3 넣음
        }
        return tmpArr; //0,1,2,3 배열 반환
    }

    public static void main(String[] args) {
        int [] arr; //배열 객체를 선언 할당은 mkarr에서
        arr = mkarr(); // 위 {0,1,2,3} 배열 할당
        for (int i = 0 ; i< arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
