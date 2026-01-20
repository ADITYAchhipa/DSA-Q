class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[]=new int[nums.size()];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.size();i++){
            int x=nums.get(i);
            for(int j=1;j<x;j++){
                if((j|(j+1))==x){
                    arr[i]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
// 00010
// 00011
// 00101
// 00110
// 01011
// 01101
// 10001
// 10011
