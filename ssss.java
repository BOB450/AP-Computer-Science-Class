public class ssss {
    public static void main(String[] args) {
        boolean two = true;
        int num = 25;
        if (two == false) {
            if (num % 5 == 0 || num % 7 == 0) {
                // return true;
                System.out.println("True");
            } else {
                // return false;
                System.out.println("False");
            }
        } else {
            if (num % 5 == 0 || num % 7 == 0 || num % 2 == 0) {
                // return true;
                System.out.println("True");
            } else {
                // return false;
                System.out.println("False");
            }
        }
    }
}
