class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        Arrays.sort(hFences);
        Arrays.sort(vFences);

        Set<Long> arr = new HashSet<>();
        // Set<Long> ans = new HashSet<>();
        for(int i=0;i<hFences.length;i++){
            arr.add(hFences[i]-1+0l);
            for(int j=i+1;j<hFences.length;j++){
                arr.add(hFences[j]-hFences[i]+0l);
            }
            arr.add(m-hFences[i]+0l);
        }
        arr.add(m-1+0l);
       long max=-1;
        for(int i=0;i<vFences.length;i++){
            if(arr.contains(vFences[i]-1+0l)) max=Math.max(max,vFences[i]-1+0l);
            for(int j=i+1;j<vFences.length;j++){
              
            if(arr.contains(vFences[j]-vFences[i]+0l)) max=Math.max(max,vFences[j]-vFences[i]+0l);
                // arrr.add(vFences[j]-vFences[i]+0l);
            }
              
            if(arr.contains(n-vFences[i]+0l)) max=Math.max(max,n-vFences[i]+0l);
            // arrr.add(n-vFences[i]+0l);
        }
            if(arr.contains(n-1+0l)) max=Math.max(max,n-1+0l);
       
       
        long mod=(long)Math.pow(10,9)+7;
       
        if(max==-1)return -1;
        return (int)((max*max)%mod);

    }
}
