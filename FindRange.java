public class FindRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        int leftIndex = findIndex(nums, target, true);
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return result;
        }
        
        int rightIndex = findIndex(nums, target, false) - 1;
        
        result[0] = leftIndex;
        result[1] = rightIndex;
        
        return result;
    }
    
    private int findIndex(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] > target || (left && nums[mid] == target)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
    
    public static void main(String[] args) {
        FindRange findRange = new FindRange();
        
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int[] range = findRange.searchRange(nums, target);
        
        System.out.println("Starting position: " + range[0]);
        System.out.println("Ending position: " + range[1]);
    }
}
