  

        // Displaying a number in Words
package loop_challeges3;
import java.util.*;

public class Loop_Challeges3 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
       
        
         String str="";
        for(int i=a; i>0; i=i/10)
        {
              int j=i%10;
             
             str=str+j;
        }
        
        for(int i=(str.length())-1; i>=0; i--)
        {
         
             switch(str.charAt(i))
             {
                 case '0': System.out.print("Zero ");
                 break;
                 case '1': System.out.print("One ");
                 break;
                 case '2': System.out.print("Two ");
                 break;
                 case '3': System.out.print("Three ");
                 break;
                 case '4': System.out.print("Four ");
                 break;
                 case '5': System.out.print("Five ");
                 break;
                 case '6': System.out.print("Six ");
                 break;
                 case '7': System.out.print("Seven ");
                 break;
                 case '8': System.out.print("Eight ");
                 break;
                 case '9': System.out.print("Nine ");
                 break;
                 default: System.out.println("Invalid");
             }
        }
        
        
        
        
        
        
        
    }
    
}
