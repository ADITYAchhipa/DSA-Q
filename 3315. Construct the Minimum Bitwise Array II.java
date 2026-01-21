class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int x=nums.get(i);
                int temp=2;
                int prev=1;
                
                while((temp&x)>=1){
                    prev=temp;
                    temp=temp<<1;
                }
                arr[i]=prev==x?-1:(x^prev);  
        }
        return arr;
    }
}


//    1111100111
//    0000000100
//    1111100011
