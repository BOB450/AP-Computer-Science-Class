import java.util.Scanner;

public class Coding_Bat_tem {

    public static void main(String[] args) {
        int[] myList = { 1, 4, 8, 4, 6, 6, 6 };
        boolean x = codingbat(myList);
        if (x == true) {
            System.out.println("true");
        }
    }

    static boolean codingbat(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        if (nums[0] == 6 || nums[len - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

}
