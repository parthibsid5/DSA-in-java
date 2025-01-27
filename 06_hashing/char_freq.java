import java.util.*;
class char_freq {
    public static void main(String args[]){
        char_freq cf=new char_freq();
        int result=cf.solution("aabaaaacaabc", 2);
        System.out.println(result);
    }


    public static int solution(String s,int k){
        HashMap<Character,Integer> chmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            // if(chmap.containsKey(str.charAt(i))){
            //     chmap.put(str.charAt(i),chmap.get(str.charAt(i))+1);
            // }
            // else{
            //     chmap.put(str.charAt(i),1);
            // }
            chmap.put(s.charAt(i),chmap.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> e :chmap.entrySet()){
            if(!(e.getValue()>=2)){
                return -1;
            }
        }
        int a=chmap.get('a');
        int b=chmap.get('b');
        int c=chmap.get('c');

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        int i=0,j=0,windowsize=0;
        while(j<s.length()){
            if(s.charAt(j)=='a'){
                a--;
            }
            if(s.charAt(j)=='b'){
                b--;
            }
            if(s.charAt(j)=='c'){
                c--;
            }

            while(i<=j && (a<k || b<k || c<k)){
                if(s.charAt(i)=='a'){
                    a++;
                }
                if(s.charAt(i)=='b'){
                    b++;
                }
                if(s.charAt(i)=='c'){
                    c++;
                }
                i++;
            }
            windowsize=Math.max(windowsize, j-i+1);
            j++;
        }
        return s.length()-windowsize;
    }
}
