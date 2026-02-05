class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result[i]=nums[(nums[i]+i)%n];
            }
            else if(nums[i]<0){
                int x=i-(Math.abs(nums[i])%n);
                if(x<0){
                    x=n+x;
                }
                result[i]=nums[x];
            }
        }
        return result;
    }
}
