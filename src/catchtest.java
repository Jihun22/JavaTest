public class catchtest {
    public static void main(String[] args) {
        int ar[] = {10, 20, 30, 40, 50};
        int sum = 0, a = 100, b = 0;
        try {
            for (int i = 0; i <= ar.length; i++)
                sum += ar[i];
            System.out.println("A");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
    }
}
