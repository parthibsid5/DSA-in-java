import java.util.*;

public class rev_recursion {
    int res;

    public int fact(int n) {
        if (n == 0) {
            // System.out.println(res);
            return 1;
        }
        return fact(n - 1) * n;
    }

    // int f=0,s=1,sum=0;
    int fiboo(int n) {
        // if(n==0){
        // return sum;
        // }
        // sum+=f+s;
        // f=s;s=sum;
        // return fiboo(n-1);

        if (n == 0 || n == 1) {
            return n;
        }
        return fiboo(n - 1) + fiboo(n - 2);
    }

    public static boolean sortArray(int arr[], int n) {
        if (n == 1 || n == 0) {
            return true;
        }
        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }
        return sortArray(arr, n - 1);

    }

    public static int recursive_binary_search(int arr[], int s, int e, int target) {
        if (e >= s) {
            int mid = s + (e - s) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                return recursive_binary_search(arr, mid + 1, e, target);
            } else {
                return recursive_binary_search(arr, s, mid - 1, target);
            }
        }
        return -1;
    }

    // Tc=O(2^n * n)
    public static void find_subsets(int arr[], int idx, ArrayList<Integer> current, List<List<Integer>> result) {
        if (idx == arr.length - 1) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[idx]);
        find_subsets(arr, idx + 1, current, result);

        current.remove(current.size() - 1);
        find_subsets(arr, idx + 1, current, result);
    }

    // Tc=O(nlogn + 2^n * n) ~ O(2^n * n)
    public static void find_unique_subsets(int arr[], int idx, ArrayList<Integer> current, List<List<Integer>> result) {
        if (idx == arr.length - 1) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[idx]);
        find_unique_subsets(arr, idx + 1, current, result);

        current.remove(current.size() - 1);
        idx += 1;
        while (idx < arr.length && arr[idx] == arr[idx - 1])
            idx++;
        find_unique_subsets(arr, idx, current, result);
    }

    // TC=O(n! * n);
    // SC=O(n!);
    public static void all_permutations(int arr[], int idx, List<List<Integer>> result) {
        if (idx == arr.length) {
            // Convert int[] to List<Integer>
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(idx, i, arr);
            all_permutations(arr, idx + 1, result);
            swap(idx, i, arr); // backtrack
        }
    }

    public static void swap(int x, int y, int nums[]) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void string_permutations(String str, int idx, List<List<String>> result) {

    }

    public static void main(String args[]) {
        rev_recursion r1 = new rev_recursion();
        // System.out.println(r1.fact(5));
        // System.out.println(r1.fiboo(5));
        // int arr[] = { 1, 2, 3, 6, 9, 18, 23 };
        // int n = arr.length;
        // boolean res = sortArray(arr, n);
        // System.out.println(res);
        // int bin_result = recursive_binary_search(arr, 0, n - 1, 18);
        // System.out.println(bin_result);

        // int subset_arr[] = { 1, 2, 3, 4, 2 };
        // Arrays.sort(subset_arr);// make the array sorted!
        // ArrayList<Integer> current = new ArrayList<>();
        // List<List<Integer>> result = new ArrayList<>();

        int n = 4;
        String board[][] = { { ".", ".", ".", "." }, { ".", ".", ".", "." }, { ".", ".", ".", "." },
                { ".", ".", ".", "." } };
        List<List<String>> board_result = new ArrayList<>();
        n_queens(board, board_result, 0, n);
        System.out.println(board_result);
    }

    public static void n_queens(String board[][], List<List<String>> board_result, int i, int n) {
        if (i == n) {
            List<String> boardState = new ArrayList<>();
            for (String[] row : board) {
                boardState.add(String.join("", row));
            }
            board_result.add(boardState);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(board, i, j, n)) {
                board[i][j] = "Q";
                n_queens(board, board_result, i + 1, n);
                board[i][j] = ".";
            }
        }
    }

    public static boolean isSafe(String[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col].equals("Q")) {
                return false;
            }
        }
        for (int i = row + 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }

        return true;
    }

    // public static void sudokuSolver(char matrix[][],int row, int col){

    // char dig=' ';
    // sudokoHelper(matrix,0,0,dig);
    // }
    // public static void sudokoHelper(char matrix[][],int row,int col,char dig){
    // int nextrow,nextcol;
    // nextrow=row;
    // nextcol=col+1;
    // if(nextcol==9){
    // nextrow=row+1;
    // }
    // if(matrix[row][col] != ' '){
    // for(char d=0;d<=8;d++){
    // if(sudokoSafe(matrix,row,col,dig)){
    // sudokoHelper(matrix, nextrow, nextcol, dig);
    // }
    // }
    // }
    // }
    // public static boolean sudokoSafe(char matrix[][], int row, int col,char dig){

    // return true;
    // }


    public ArrayList<String> ratMaze(int [][]maze){
        String currpath="";
        ArrayList<String> result=new ArrayList<>();
        int n=maze.length;
        int visit[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                visit[i][j]=-1;
            }

        }
        helperRat(maze,0,0,currpath,result,visit);
        return result;
    }
    public static void helperRat(int maze[][],int row,int col,String currpath, ArrayList<String> result, int visit[][]){
        int n=maze[0].length;
        if(row<0 || col<0 || row>=n|| col>=n || maze[row][col]==0 ||visit[row][row]==-1){
            return ;
        }
        if(row==-1 && col==n-1){
            result.add(currpath);
        }
        visit[row][col]=-1; //visited
        helperRat(maze, row+1, col, currpath+"D", result,visit);
        helperRat(maze, row-1, col, currpath+"U", result,visit);
        helperRat(maze, row, col+1, currpath+"R", result,visit);
        helperRat(maze, row, col-1, currpath+"L", result,visit);
        visit[row][col]=1; //unvisited
    }
}
