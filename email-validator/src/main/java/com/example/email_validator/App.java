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
    	int emaillength; 
    	
    	Scanner in = new Scanner (System.in);
    	System.out.println("What is the email address to be checked: ");
        emailaddress = in.nextLine();
        emaillength = emailaddress.length();
        
        //System.out.print(emaillength);

        if (validate(emailaddress) == true) //&& secondValidation(emailaddress,emaillength) == true)
        {
        	System.out.println("This email address contains an @ and a period");
        }
        else 
        	System.out.println("This email is missing either @ or a period or both");
        
 
        if (secondValidation(emailaddress, emaillength) == true)
        {
        	System.out.println("Your email is of an acceptable length");
        }
        else 
        	System.out.println("Your email is not of an acceptable length or is empty");

    }





	//validate method to check for @ and period. 
    public static boolean validate(String emailaddress)
    {
    	boolean atSymbol = false;
    	boolean period = false;
    		
    	if (emailaddress.contains("@") && emailaddress.contains("."))
    	{
          	atSymbol = true;
          	period = true;
          	return true;
    	}	
    	  else
    		  return false;
    }//end validate method
    
    
    public static boolean secondValidation(String emailaddress, int emaillength) {
    	boolean lengthcheck = false; 
    	boolean fieldEmpty = true; //automatically assume it's empty 

    	if (emaillength > 8)
    	{
    	lengthcheck = true;
    	//System.out.println("Email Length is ok");
    	}
    		else
    			System.out.println("Your email is too short");
    	
    	if (emaillength == 0)
    	{
    		System.out.println("Please enter a username");
    		fieldEmpty = true;
    	} 
    	
    	
    	//return statement that checks the boolean values
    	if (fieldEmpty == true && lengthcheck == false)
    	{
    		return false;
    	}
    	else 
    		return true; 
	}
}

