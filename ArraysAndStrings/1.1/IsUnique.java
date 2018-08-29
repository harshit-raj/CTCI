import java.util.HashSet;
import java.util.Set;
/**
 * Implement an algoritm to determine if a string has all unique charecters.
 * Q1.1 page 90 CTCI
 */
class IsUnique{
    public boolean check(String str){
        Set<Character> strChars= new HashSet<Character>();
        for(int i = 0; i< str.length();i++){
            if(strChars.contains(str.charAt(i))){
                return false;
            }
            strChars.add(str.charAt(i));
        }
        return true;
    }

    public static void main(String[] args){
        IsUnique isUnique = new IsUnique();
        String a = "A";
        String b = "ABC";
        String c = "ABA";
        String d = "AAB";
        
        System.out.println(isUnique.check(a));
        System.out.println(isUnique.check(b));
        System.out.println(isUnique.check(c));
        System.out.println(isUnique.check(d));
    }
}