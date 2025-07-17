//Program to Find the Index of the First Occurrence in a String	Ex: A = “Hello” B = “HelloWorldHello” o/p: 0


public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        String s="Hello World Hello";
        String find="Hello";
        int count=0;
        String strArray[]=s.split(" ");
        for(int i=0;i<strArray.length;i++){
          if(strArray[i].equals(find)){
            System.out.println("Index of First Occurence of given String is "+i);
            count++;
            break;
          }
        }
        if(count==0){
            System.out.println("String not found");
        }

    }
}
