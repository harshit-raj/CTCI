import java.util.Arrays;
/**
 * Given two strings write a method to decide if one is permutation of another
 * Q1.2 Page 90
 */
class CheckPermutation{
    public boolean check(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] s1CharArray = s1.toCharArray();
        Arrays.sort(s1CharArray);
        char[] s2CharArray = s2.toCharArray();
        Arrays.sort(s2CharArray);
        String s3 = new String(s1CharArray);
        String s4 = new String(s2CharArray);
        if(s3.equals(s4)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        CheckPermutation cp = new CheckPermutation();
        System.out.println(cp.check("Hello","elloH"));
        System.out.println(cp.check("s1", "s2"));
        System.out.println(cp.check("abc", "aabc"));
    }
}
