import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * Given a string, write a function to check if it is a permutation of a plaindrome.
 * A plaindrome is a word or phrase that is the same forward and backward.
 * A permutation is a rearrangment of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * Q1.4 page 91
 */
class PalindromePermutaion{
    public boolean isPalindromePermutation(String str){
        if(str.length() <2){
            return true;
        }
        boolean isOdd = true;
        if(str.length() % 2 == 0){
            isOdd = false;
        }
        Set charSet = new HashSet<Character>();
        for(int i = 0; i< str.length();i++){
            if(charSet.contains(str.charAt(i))){
                charSet.remove(str.charAt(i));
            }
            else{
                charSet.add(str.charAt(i));
            }
        }
        int l = charSet.size();
        if(isOdd){
            l--;

        }
        if(l == 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        PalindromePermutaion p = new PalindromePermutaion();
        System.out.println(p.isPalindromePermutation("Hello"));
        System.out.println(p.isPalindromePermutation("ABCDABCD"));
        System.out.println(p.isPalindromePermutation("XYXYXY"));
        System.out.println(p.isPalindromePermutation("A"));
        System.out.println(p.isPalindromePermutation(""));

    }
}