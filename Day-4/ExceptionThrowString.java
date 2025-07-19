//Convert small letters capital and capital small letters in string. And throw exceptions if any other character appears as “Invalid String”	
//"Ex: HelLo O/p: hELlO
//Hel43 --> Invalid
//Hel@32---> Invalid"


public class ExceptionThrowString {
    public static void main(String[] args) {
        String s="heLLo1";
        String result="";
        try{
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch>='A' && ch<='Z'){
                    result=result+(char)(ch+32);
                }else if(ch>='a' && ch<='z'){
                    result=result+(char)(ch-32);
                }else{
                    throw new Exception("Invalid Character "+ch);
                }
            }
            System.out.println(result);
        }catch(Exception e){
            System.out.println("Invalid String");
            System.out.println(e.getMessage());
        }
      
    }
}
