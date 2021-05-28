import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class oneHR {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		int p;
double t;
String w;

        /* Read and save an integer, double, and String to your variables.*/
p = scan.nextInt();
t = scan.nextDouble();
w = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
System.out.println(i+p);
System.out.println(d+t);
System.out.println(s+" " + w);

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
 scan.close();
    }
}