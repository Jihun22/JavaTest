class Connection {
    private static Connection _inst = null; // _inst 라는 정적 변수를 사용해서 인스턴스를 저장하고 있음.
    private  int count = 0;

    //싱글톤 패턴
    static  public Connection get() { //get () 메서드를 호출하면 _inst가 null 인지 확인
        // null이면 새로운 Connection  인스턴스를 생성하고 _inst 에 할당
        // 이미 _inst에 인스턴스가 있으면 그 인스턴스 를 그대로 반환함
        // 싱글톤 패턴 ==================================
        if (_inst == null) {
            _inst = new Connection();
            return _inst;
        }
        return  _inst;
        // 싱글톤 패턴 ==================================
     }

     public void count() {
        count ++;   //호출시 , count 멤버 변수의 값을 +1씩 증가 시킴
     }
     public  int getCount() {  // 호출 시 count 를 반환함
        return count;
     }
}

public class Ex18 {
    public static void main(String[] args) {
        Connection conn1 = Connection.get();  // 최초에 null일 경우에만 생성하고 그 이후에는 생성된 객체를 반환함
        conn1.count();
        Connection conn2 = Connection.get();
        conn2.count();
        Connection conn3 =  Connection.get();
        conn3.count();
        // Connection  객체 안의 멤버 변수 count도 동일한 변수이고 count()메소드를 호출 하더라도 같은 변수 값이 +1 증가함

        System.out.println(conn1.getCount());
    }
}
