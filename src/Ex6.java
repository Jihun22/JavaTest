public class Ex6 {
    public static void main(String[] args) {
        int result [] = new int[5];  //5인 배열 크기 생성

        int arr [] = {77,32,10,99,50}; // arr의 5크기 배열 생성 초기값 저장

        for (int i = 0; i< 5; i++){
            result[i] = 1 ;

            for (int j = 0 ; j < 5; j++) {  //j가 0부터 4 까지 +1 씩 증가 반복
                if(arr[i] < arr[j]){
                    result [i] ++;
                }
            }
        }
        for (int k = 0; k < 5; k++){
            System.out.print(result[k]);
        }
    }
}
