import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2_1 {
    public static final int MAX = 5;
    public static void main(String[] args){
        System.out.println("Welcome to the Application!");
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
    
        getInput(nums, inp);  
        inp.close();
    
        sort(nums);
        display(nums);
    }

    public static void getInput(List<Integer> nums, Scanner inp) {
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        while(nums.size() < MAX) {
            String s = inp.nextLine();
            if(!checkTypeAndRange(s)) {
                continue;
            }
            nums.add(Integer.parseInt(s));
        }
    }

    public static boolean checkTypeAndRange(String s) {
        int num;
        try {
            num = Integer.parseInt(s); 
        } catch (NumberFormatException e) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        if(num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");  
            return false;
        }
        return true;
    }

    public static void sort(List<Integer> nums) {
        Collections.sort(nums);  
    }

    public static void display(List<Integer> nums) {
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}