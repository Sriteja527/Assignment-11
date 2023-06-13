public class MissingNumber {
    public int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        
        for (int num : nums) {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
    
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        
        int[] nums = {3, 0, 1};
        int missing = missingNumber.findMissingNumber(nums);
        
        System.out.println("Missing number: " + missing);
    }
}
