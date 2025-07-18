//Java program to find and print the first unique (non-repeating) character from a given string:
//Ex: I/P: programming   O/P: p

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s="programming";
        char result = uniqueChar(s);
        if(result!=0){
            System.out.println("First unique char in the string is "+result);
        }else{
            System.out.println("No unique char in the given string");
        }
    }

    //Brute Force Approach
    static char uniqueChar(String s){
        for(int i=0;i<s.length();i++){
            //char ch=s.charAt(i);
            boolean isUnique = true;
            //Checking if this character is repeated or not
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(j)==s.charAt(i)){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
                return s.charAt(i);
        }
        return 0;
    }
}
