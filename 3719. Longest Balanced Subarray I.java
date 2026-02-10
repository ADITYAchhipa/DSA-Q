class Solution {
    public int longestBalanced(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int  counto=0;
            int  counte=0;
            Set<Integer> arr = new HashSet<>();
            for(int j=i;j<nums.length;j++){
                
                if(arr.contains(nums[j])){
                    if(counto==counte&&counto!=0)max=Math.max(max,j-i+1);
                    continue;
                }
               
                arr.add(nums[j]);
                if(nums[j]%2==0)counte++;
                else counto++;

                if(counto==counte&&counto!=0)max=Math.max(max,j-i+1);

            }
        }
            return max;
    }
}
