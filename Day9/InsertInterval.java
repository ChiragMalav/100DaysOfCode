class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);
        
        intervals = list.toArray(new int[list.size()][]);
        Arrays.sort(intervals,(a,b) ->a[0]-b[0]);
        
        ArrayList<int[]> ans = new ArrayList<>();
        
        for(int i=0;i<intervals.length;i++){
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1)[1]){
                ans.add(new int[]{intervals[i][0],intervals[i][1]});
            }
            else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
            }
        }
        return ans;
    }
}
