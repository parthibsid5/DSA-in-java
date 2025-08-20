class removeDuplicates {
    public static void main(String args[]) {
        int nums[]={0,1,1,1,2,2,3,3,4};
        removeDuplicate(nums);
    }


    public static void removeDuplicate(int[] nums) {
        int l = 0;
        for (int r = 1; r < nums.length; r++) {
            if (nums[l] != nums[r]) {
                l++;
                nums[l] = nums[r];
            }
        }
        for(int e=0;e<=l;e++){
            System.out.println(nums[e]);
        }
    }
}
