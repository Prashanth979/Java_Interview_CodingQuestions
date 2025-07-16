//A pangram is a sentence that contains every letter of the alphabet at least once. 

import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        String s ="The quick brown fox jumps over the lazy dog";
        s=s.replace(" ", "");
        s=s.toLowerCase();
        boolean result=false;
        
        //result=isPangram(s);
        result=PangramCheck(s);

        if(result){
            System.out.println("Given string is Pangram");
        }else{
            System.out.println("Given string is not pangram");
        }
    }

    public static boolean isPangram(String s){
        if(s.length()<26)
            return false;

        boolean visited[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                visited[ch-'a']=true;
            }
        }

        for(int i=0;i<26;i++){
            if(visited[i]==false)
                return false;
        }
        return true;    
    }

    //Efficient Solution using HashSet

    public static boolean PangramCheck(String s){
        Set<Character> alphabetSet = new HashSet<>();
        //Adding all characters of alphabet to HashSet
        for(int i='a';i<='z';i++){
            alphabetSet.add((char)i);
        }
        //Remove every character & check if set becomes empty or not
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            alphabetSet.remove(ch);
            if(alphabetSet.isEmpty())
                return true;
        }
    return false;
    }
}
