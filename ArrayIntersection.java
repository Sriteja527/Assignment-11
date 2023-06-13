import java.util.*;

public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ArrayIntersection arrayIntersection = new ArrayIntersection();
        
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        
        int[] intersection = arrayIntersection.intersection(nums1, nums2);
        
        System.out.println(Arrays.toString(intersection));
    }
}
