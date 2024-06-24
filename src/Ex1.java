public class Ex1 {
    public static void main(String[] args) {
        //equals 유형
        String str1 = "Programming";
        String str2 = "Programming"; // 4행 5행 둘은 하나의 객체가 생성되고 자바에서 같은 객체를 할당해줌

        String str3 = new String("Programming"); // 같은값이더라도 별도의 공간에 객체를 생성해서 할당함

        System.out.println(str1 ==str2);  //str1 와 str2 객체 주소 동일
        System.out.println( str1== str3); // str1와  str3의 객체 주소가 다르다 new를 통해 새롭게 생성했기 때문
        System.out.println(str1.equals(str3)); //str1와 str3의 값을 비교 둘의문자열은 동일
        System.out.print(str2.equals(str3)); //str2와 str3의 값을 비교 둘의 문자열은 동일
    }
}
