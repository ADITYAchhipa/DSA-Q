class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int max=1;
        int start=0;
        int end=1;
        // int count=2;
        // System.out.println(nums[0]+" "+nums[nums.length-1]);
        while(start<=end&&end<nums.length){
            if((k*(nums[start]+0l))>=(nums[end]+0l)){
                end++;
                max=Math.max(max,end-start);
            }
            else{
                start++;
            }

            
        }
        return nums.length-max;
    }
}
