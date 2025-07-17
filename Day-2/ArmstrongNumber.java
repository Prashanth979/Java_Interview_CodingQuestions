//A positive integer is called an Armstrong number (also known as a narcissistic number) if the sum of its own digits each raised to the power of the 
//number of digits is equal to the number itself.
//Ex: 153 --> 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int original=153;
        int number = original;
        int sum = 0;
        
        // Count number of digits
        int digits = String.valueOf(number).length();
    
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if(original == sum ){
            System.out.println("Given number "+original+" is Armstrong Number");
        }else{
            System.out.println("Given number "+original+" is not Armstrong Number");
        }
        
       
    }
}
