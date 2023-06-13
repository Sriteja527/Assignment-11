public class RepeatedNumber {
    public int findRepeatedNumber(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        // Find the intersection point of slow and fast pointers
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Find the entrance to the cycle
        int pointer1 = nums[0];
        int pointer2 = slow;
        while (pointer1 != pointer2) {
            pointer1 = nums[pointer1];
            pointer2 = nums[pointer2];
        }
        
        return pointer1;
    }
    
    public static void main(String[] args) {
        RepeatedNumber repeatedNumber = new RepeatedNumber();
        
        int[] nums = {1, 3, 4, 2, 2};
        int repeated = repeatedNumber.findRepeatedNumber(nums);
        
        System.out.println("Repeated number: " + repeated);
    }
}
