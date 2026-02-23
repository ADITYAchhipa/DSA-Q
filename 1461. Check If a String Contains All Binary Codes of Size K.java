class Solution {
    public boolean hasAllCodes(String s, int k) {
       Set<String> arr = new HashSet<>();
       int start=0;
       for(int end=k;end<=s.length();end++){
           
            arr.add(s.substring(start,end));
            start++;
       }
    //    System.out.println(arr);
       return arr.size()==Math.pow(2,k);
    }
}
