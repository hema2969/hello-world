import java.util.ArrayList;
import java.util.Scanner;

public class Find_String {
	
		int max_number = 0;
		String string_value = "";
       // String str = new String(); 
        int word_size;
     
        String p = "The cow jumped over the moon";
        //Scanner sc = new Scanner();
       // System.out.println("Enter the String");  
       // str = sc.nextLine();
        
        String [] s = p.toString().split(" "); 

        
        public String String_Present(String p)
        {
        	String s1 = p;
        	return s1;
        }
        
        
        public  int Max_Length(String p)
        {
        //int max_number = 0;
        max_number = s[0].length();
        for (int j = 1; j<= s.length-1; j++)
        {
           	if ( s[j].length() >= max_number)
         	  {
              max_number = s[j].length();
             // first_number = max_length; 
                string_value = s[j];
             }
        }
       return max_number;
        }
        
       // System.out.println(arry);
       
       public String Word_with_max_length( String p)
       {
       //int max_number = 0; 
       max_number = s[0].length();
       for (int j = 1; j<= s.length-1; j++)
       {
          	if ( s[j].length() >= max_number)
        	  {
             max_number = s[j].length();
            // first_number = max_length; 
               string_value = s[j];
            }
       }
         return string_value;
       }
       
		//sc.close();
     
	}     
