class Solution {
    public List<String> readBinaryWatch(int turnedon) {
        List<String> arr = new ArrayList<>();
        for(int i=0;i<12;i++){
            int count=0;
            int temp=i;
            while(temp>0){
                count+=temp&1;
                temp=temp>>1;
            }
            for(int j=0;j<60;j++){
                int countM=0;
                int temp1=j;
                while(temp1>0){
                    countM+=temp1&1;
                    temp1=temp1>>1;
                }
                if(count+countM==turnedon){
                    // System.out.println((i+":0"+j)+" "+count+" "+countM);
                    if(j<10)
                    arr.add((i+":0"+j));
                    else{
                        arr.add((i+":"+j));
                    }

                }
            }
        }
        return arr;

    }
}
