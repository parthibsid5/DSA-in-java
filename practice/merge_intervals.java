import java.util.ArrayList;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList <int[]> array=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(array.size()==0 || intervals[i][0]>array.get(array.size()-1)[1]){
                array.add(new int[]{intervals[i][0],intervals[i][1]});
            }
            if(intervals[i][0]<=array.get(array.size()-1)[1]){
                array.get(array.size()-1)[1]=Math.max(intervals[i][1],array.get(array.size()-1)[1]);
            }
        }
        int array2d[][]=new int[array.size()][];
        array2d=convertTo2D(array);
        return array2d;
    }

    public static int[][] convertTo2D(ArrayList <int[]> array){
        int arr[][]=new int[array.size()][2];
        for(int i=0;i<array.size();i++){
            arr[i]=array.get(i);
        }
        return arr;
    }
}