import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class findK {

    final private int k;
    final private int[] nums;

    // Constructor to initialize k and nums array
    public findK(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }

    public String consistsK(){
        Set<Integer> numSet = new HashSet<>();
        String s;
        for (int num : nums){
            if (numSet.contains(k - num)){
               s = "The Value is: " + num + " + " + (k - num) + " = " + k; // as it means num + (k - num) == k
               return s;
            }
            numSet.add(num);
        }

       return "No numbers add up";
    }

    public void displayResult() {
        System.out.println("You entered: " + Arrays.toString(nums));
        System.out.println("k = " + k);
        System.out.println(consistsK());
    }


    public static findK getUserInput (Scanner scanner){
        System.out.println("Enter a list of numbers separated by spaces:");
        String[] parts = scanner.nextLine().split(" ");
        int numbers[] = new int[parts.length]; 

        for(int i = 0; i < parts.length; i++){
            numbers[i] = Integer.parseInt(parts[i]);
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        scanner.nextLine();

        return new findK(k, numbers);
    }
    
}
