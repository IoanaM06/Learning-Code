import java.util.Scanner;

public class SearchBinary {
    int userNum;
    public SearchBinary() {
        var scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        userNum = scanner.nextInt();
    }
    public int arrayIndex() {
        int[] nums = {9, 2, 5, 1, 8};
        for (int i = 0; i < 5; i++) if (userNum == nums[i]) return i;
        return -1;
    }
    public String displayMessage() {
        int index = arrayIndex();
        if (index != -1) return userNum + " is at array index " + index + ".";
        else return userNum + " is not in the array.";
    }
}
