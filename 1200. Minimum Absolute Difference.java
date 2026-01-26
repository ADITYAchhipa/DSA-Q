class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ar = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<=min){
                if(arr[i+1]-arr[i]<min){
                ar.clear();
                }
                min=arr[i+1]-arr[i];
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ar.add(temp);

            
            }
        }
        return ar;
    }
}
