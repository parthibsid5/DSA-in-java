public class test {
    public static void main(String args[]){
        String s[]={"hello"};
        System.out.println(s[0].charAt(0));

        System.out.println("flow".startsWith("flower"));
        System.out.println("flower".startsWith("flow"));
        System.out.println("flower".startsWith("Flow"));
        System.out.println("eivu".startsWith("flow"));

        String strs[]={"flower","dog","flow","flight"};
        test t=new test();
        // System.out.println(t.largestprefix(strs));
        int intervals[][]={{1,3},{2,8},{8,10},{15,18}};
        int a[][]=merge(intervals);
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(a[i][j]+" ");
              System.out.println();
        }
    }
    public String largestprefix(String strs[]){
        
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static  int[][] merge(int[][] intervals) {
        int a[][]=new int[intervals.length][2];
        int s,e,idx=0;
        for(int i=0;i<intervals.length-1;i++){
            e=intervals[i][1];
            s=intervals[i+1][0];
            System.out.println(e);
            System.out.println(s);
            if(e>=s){
                a[idx][0]=intervals[i][0];
                a[idx][1]=intervals[i+1][1];
                i+=1;
                idx++;
            }
            else{
            a[idx][0]=intervals[i][0];
            a[idx][1]=intervals[i][1];
            a[idx+1][0]=intervals[i+1][0];
            a[idx+1][1]=intervals[i+1][1];
            i+=1;
            idx++;
            }
        }
        return a;
    }
}