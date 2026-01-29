class CharNum {
    char ch;
    long num;

    CharNum(char ch, long num) {
        this.ch = ch;
        this.num = num;
    }
}

class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        ArrayList<CharNum> arr [] = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = new ArrayList<>();
        }
        for(int i=0;i<original.length;i++){
            arr[original[i]-'a'].add(new CharNum(changed[i],cost[i]));
        }
        long D [][]=new long[26][26];
        for(int i=0;i<26;i++){
            PriorityQueue<CharNum> pq = new PriorityQueue<>(
                (a, b) -> Long.compare(a.num, b.num)   // sort by number (ascending)
             );
             for(CharNum edge : arr[i])pq.add(edge);
             long temp [] =new long[26];
             Arrays.fill(temp,Long.MAX_VALUE);
             temp[i]=0;
             while(!pq.isEmpty()){
                CharNum x = pq.poll();
                if(x.num<temp[x.ch-'a']){
                    temp[x.ch-'a']=x.num;
                   
                     for(CharNum edge : arr[x.ch-'a']){
                        if(temp[edge.ch-'a']>edge.num+x.num)
                        pq.add(new CharNum(edge.ch,edge.num+x.num));
                    
                   }
                }
             }
             D[i]=temp;    
        }


        long count=0;
        for(int i=0;i<source.length();i++){
            if(source.charAt(i)!=target.charAt(i)){
                if(D[source.charAt(i)-'a'][target.charAt(i)-'a']==Long.MAX_VALUE){
                    return -1;
                }
                count+=D[source.charAt(i)-'a'][target.charAt(i)-'a'];
            }
        }
        return count;
    }
}
