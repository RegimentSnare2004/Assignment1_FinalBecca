public class Problem5 {
    public static void main(String[] args) {
        int[] nums = {9, 10, 1, 4, 5, 10, 11};
        int val = 10;
        System.out.println("Output: " + removeElement(nums, val));

    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return k;
    }

}