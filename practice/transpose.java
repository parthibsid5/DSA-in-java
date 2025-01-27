class transpose {
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        // transpose matrix
        for(int i=1;i<matrix.length;i++){
            int c=i-1;
            while(c>=0){
                int temp=matrix[i][c];
                matrix[i][c]=matrix[c][i];    
                matrix[c][i]=temp;    
                c-=1;
            }
        }

        // Horizontal reflection
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
}
