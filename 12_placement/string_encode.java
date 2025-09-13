import java.util.*;
public class string_encode {

    static char[] vowels={'a','e','i','o','u'};
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string:");
            String s=sc.nextLine();
            StringBuilder sb=new StringBuilder("");


            for(char ch:s.toCharArray()){
                if(isVowel(ch)){
                    sb.append((char)(ch+1));
                }
                else if(Character.isLetter(ch) && !isVowel(ch)){
                    char v=comvertToVowel(ch);
                    sb.append(v);
                }
                else if(Character.isWhitespace(ch)){
                    sb.append(ch);
                }
                else if(Character.isDigit(ch)){
                    sb.append(ch);
                }
                else{
                    continue; //just ignore the digits
                }
            }
            System.out.println(sb);

        }
        public static char comvertToVowel(char ch){
            int dist=Integer.MAX_VALUE;
            char nearest='a';
            for(char v:vowels){
                if(dist>Math.abs(ch-v)){
                    dist=Math.abs(ch-v);
                    nearest=v;
                }
            }
            return nearest;
        }
        public static boolean isVowel(char ch){
            for(char v: vowels){
                if(ch==v){
                    return true;
                }
            }
            return false;
        }
    }






//     public class TransformString {
//     private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

//     // Check if character is vowel
//     private static boolean isVowel(char c) {
//         for (char v : VOWELS) {
//             if (c == v) return true;
//         }
//         return false;
//     }

//     // Map vowel to next consonant
//     private static char vowelToConsonant(char c) {
//         char next = (char) (c + 1);
//         while (isVowel(next)) {
//             next++;
//         }
//         return next <= 'z' ? next : 'z'; // clamp if overflow
//     }

//     // Map consonant to nearest vowel
//     private static char consonantToVowel(char c) {
//         char nearest = 'a';
//         int minDist = Integer.MAX_VALUE;
//         for (char v : VOWELS) {
//             int dist = Math.abs(c - v);
//             if (dist < minDist) {
//                 minDist = dist;
//                 nearest = v;
//             }
//         }
//         return nearest;
//     }

//     public static String transform(String input) {
//         StringBuilder sb = new StringBuilder();

//         for (char c : input.toCharArray()) {
//             if (Character.isLowerCase(c)) {
//                 if (isVowel(c)) {
//                     sb.append(vowelToConsonant(c));
//                 } else {
//                     sb.append(consonantToVowel(c));
//                 }
//             } else if (Character.isDigit(c)) {
//                 sb.append('#'); // Example handling for digits
//             } else if (Character.isWhitespace(c)) {
//                 sb.append('_'); // Example handling for spaces
//             } else {
//                 sb.append('@'); // Example handling for special chars
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String input = "hello world 123!";
//         String output = transform(input);
//         System.out.println("Input:  " + input);
//         System.out.println("Output: " + output);
//     }
// }
