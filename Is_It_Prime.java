import java.util.Scanner;

class HelloWorld {
    public static boolean isprime;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number that you wish to test: ");

        String num = myObj.nextLine();
        int innum = Integer.parseInt(num);
        System.out.println(innum);

        if (innum == 1) {
            System.out.println("The number " + innum + " is NOT prime.");
            return;
        }
        for (int i = 2; i <= innum / 2; ++i) {

            if (innum % i == 0) {
                isprime = true;
                break;

            }

        }
        if (!isprime) {
            System.out.println("The number " + innum + " is prime.");
        } else {
            System.out.println("The number " + innum + " is NOT prime.");
        }

    }
}