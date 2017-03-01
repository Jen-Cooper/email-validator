package com.example.email_validator;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String emailaddress = "";
    	
    	Scanner in = new Scanner (System.in);
    	System.out.println("What is the email address to be checked: ");
        emailaddress = in.nextLine();

        if (validate(emailaddress) == true)
        {
        	System.out.println("This email address is valid");
        }
        else 
        	System.out.println("This email is not valid");

 
    }


    
    //validate method to check for @ and period. 
    public static boolean validate(String emailaddress)
    {
    	boolean atSymbol = false;
    	boolean period = false;
    	
    	  if (emailaddress.contains("@"))
          {
          	atSymbol = true;
          	
          	if (emailaddress.contains("."))
            {
            	period = true;
            }
          	return true;
          }
    	  else
    		  return false;
    }
}
