import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class UserStrings {

  
   public static void main(String[] args) throws FileNotFoundException {
       Scanner scan = new Scanner(System.in);
       PrintStream ps = new PrintStream(new File("userStrings.txt"));
       while(true){
           String s = scan.nextLine();
           if(s.equalsIgnoreCase("DONE")){
               ps.flush();
               ps.close();
               break;
           }
           ps.println(s);
       }
      
   }

}

