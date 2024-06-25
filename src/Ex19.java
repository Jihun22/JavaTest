public class Ex19 {
    public static void main(String[] args) {

        int i = 3 ; // 정수형 변수 i를 선언 하고 3을 할당함
        int k = 1; // 정수형 변수 k 를 선언 1을 할당함

        switch (i) {
            case 1: k +=1;  //i가 3 case 1 통과함
            case 2: k ++ ; //i가 3 ,case 2 통과함
            case 3: k =0;  // i가 case 3이기에 k에 0 할당함
            case 4: k +=3; //break; 가 없기 때문에 빠져나가지 못하고 case 4,5 수행함
            case 5: k -=10;
            default: k --;

        }
        System.out.print(k);
    }
}

/*switch 구조
switch (변수) {
    case 값1 :
    //변수가 값 1과 같을 때
    break;
    case 값2:
    //변수가 값 2와 같을때
    break;
    ....
    default;
    //어떤 case에도 해당하지 않을때
    break; */
