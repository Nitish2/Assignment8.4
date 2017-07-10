package CommandLine;

/**
 *  Take input from command line and convert the input into Integer value 
 *  and print the value. 
 * @author Hp
 *
 */
public class Subtraction {  // Creating class

	public static void main(String[] args) { // Main method 
		
        int sub = 0; //Assigning integer value
    
        for (int i = 0; i < args.length; i++) {  // Loop will run till the number of times specified in command line.
        	
            sub = sub - Integer.parseInt(args[i]);   /** // Applying the parse 
                                                       integer method for converting the argument 
                                                          into the String.
                                                **/
        }
        System.out.println("The subraction of the arguments passed is " + sub);
    }

}
