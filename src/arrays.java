//class Solution {
//    public int solution(int[] nums, int val) {
//        int i = 0;
//        for (int j = 0; j < nums.length; j++) {
//            if (nums[j] != val) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i++;
//            }
//        }
//        return i;
//    }
//}
//
//
//
//public class arrays {
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 0, 4, 0, 6};
//        int val = 0;
//        int x = solution(nums, val);
//        System.out.println(x);
//        System.out.println(x);
//    }
//}