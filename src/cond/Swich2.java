package cond;

public class Swich2 {
    public static void main(String[] args) {
        int grade = 2;

        int ch;
        switch (grade){
            case 1:
                ch=1000;
                break;
                case 2:
                    ch =2000;
                    break;
                    case 3:
                        ch=3000;
                        break;
            default:
                ch=500;
        }
        System.out.println("발급받은 쿠폰" + ch);
    }
}
