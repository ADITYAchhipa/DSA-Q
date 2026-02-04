class Solution {
    public long maxSumTrionic(int[] nums) {
       
        int i=1;
        long count=0;
        long max=Long.MIN_VALUE;
        while(i<nums.length){
            while(i<nums.length&&nums[i-1]==nums[i])i++;
             boolean f1=false;
             boolean f2=false;
             boolean f3=false;
            long sum1=0;
            long prev=0;
            while(i<nums.length&&nums[i]>nums[i-1]){
                
                sum1=Math.max(nums[i]+nums[i-1]+prev,nums[i]+nums[i-1]);
              
                f1=true;
                // System.out.println(nums[i]+" "+nums[i-1]+" "+prev+" = "+sum1);
                // System.out.println(nums[i]+" "+nums[i-1]+" = "+sum1);
                prev=Math.max(nums[i-1],prev+nums[i-1]);
                i++;
            }
            // System.out.println(sum1);
            long sum2=0;
            while(i<nums.length&&nums[i]<nums[i-1]){
                f2=true;
                sum2+=nums[i];
                i++;
                }
            // System.out.println(sum2);
                if(!(f1&&f2)){
                    continue;
                }
                long sum3=0;
                long max3=Long.MIN_VALUE;
                int temp=i;
           while(temp<nums.length&&nums[temp]>nums[temp-1]){
            sum3+=nums[temp];
            temp++;
            f3=true;
            max3=Math.max(max3,sum3);
            }
            // System.out.println(sum3);

            if(f3){
            max=Math.max(max,max3+sum2+sum1);
            // System.out.println("final"+" "+(max3+sum2+sum1));
            }
        }
        

        return max;
    }
}
