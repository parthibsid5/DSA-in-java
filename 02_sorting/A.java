class A{
    public static void main(String args[]){
        int matrix[][]={{5,6,8,1},{2,5,89,9},{1,2,3,5},{3,6,98,7}};


        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        System.out.print(bottom+" "+right);

    }
}