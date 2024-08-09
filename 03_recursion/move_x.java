/*
 * move all 'x' to the end of the string
  "axrvxervxxd"    ---->      "arvervdxxxx"
 */

/* 
 *  ***** Both approaches can be improved by using StringBuilder because strings are immutable and any concatenations 
 *  lead to the creation of new strings, so using StringBuilder use append! 
 */

/* TC= O(n+count)
     =>O(n+n)    max val of count is 'n'.
     =>O(n)
 */

//  APPROACH 1  ****

public class move_x {
    /*
    public static String moved_String1(int i, String new1, String new2, String str, char move) {
        if (i > str.length() - 1) {
            return (new1 + new2);
        }
        char currChar = str.charAt(i);
        if (move == currChar) {
            new2 += currChar;
            return moved_String1(i + 1, new1, new2, str, move);
        }
        new1 = new1 + currChar;
        return moved_String1(i + 1, new1, new2, str, move);

    }
    */


    // APPROACH 2  ****
    public static String moved_String2(String str, int i, int count,
    String newStr, char x){
        if(i == str.length()){
            for(int j = 0; j < count; j++){
                newStr += x;
            }
            return newStr;
        }
        char currChar = str.charAt(i);
        if(currChar == x){
            count++;
        }else{
            newStr += currChar;
        }

        return moved_String2(str, i+1, count, newStr, x);
    }

    public static void main(String args[]) {

        // String newStr = moved_String1(0, "", "", "arkrvrbrslardrjrberr", 'r');
        // System.out.println(newStr);

        String newString = moved_String2("arkrvrbrslardrjrberr", 0, 0, "", 'r');
        System.out.println(newString);
    }
}
