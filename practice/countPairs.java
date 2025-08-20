// coutn pairs from 2 sorted arrays- (x,y)  such that, x>y
class countPairs {
    public static void main(String args[]){
        int A[]={2,3,5,6};
        int B[]={2,2,4,4,8};
        int n=A.length;
        int a=0,b=0,ctr=0;
        while(a<n){
            if(A[a]>B[b]){
                ctr+=n-a;
                a+=1;
            }
            else {b+=1;}
        }
        System.out.println(ctr);
    }
}
