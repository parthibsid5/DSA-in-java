import java.util.*;

public class n_queen {
     public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        List<List<String>> allboards=new ArrayList<>();
        printPositions(board, allboards,0);
     }

     public static void printPositions(char board[][],List<List<String>> allboards,int col){
        if(col==board.length){
            saveBoard(board,allboards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row, col,board)){
                board[row][col]='Q';
                printPositions(board, allboards, col+1);
                board[row][col]='*';
            }
        }
     }
     public static boolean isSafe(int row,int col, char [][]board){
         int n=board.length;
        // horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
            // vertical
            for(int i=0;i<board.length;i++){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            // left upper
            for(int r=row,c=col;r>=0&&c>=0;r--,c--){
                if(board[r][c]=='Q'){
                    return false;
                }
            }
            // right down
            for(int r=row,c=col;r<n&&c<n;r++,c++){
                if(board[r][c]=='Q'){
                    return false;
                }
            }
            // upper right
            for(int i=row,j=col;i>=0&&j<n;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            // down left
            for(int i=row,j=col;i<n&&j>=0;i++,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
        }

     public static void saveBoard(char board[][],List<List<String> >allboards){
            List<String> newboard=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String row="";
                for(int j=0;j<board.length;j++){
                    if(board[i][j]=='Q'){
                        row+="Q";
                    }
                    else{
                        row+="*";
                    }
                }
                newboard.add(row);
            }
            allboards.add(newboard);

     }
    }
