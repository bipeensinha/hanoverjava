import java.util.Arrays; 
import java.util.List; 
  
public class GFG { 
    public static void main(String[] args) 
    { 
        List<Integer> numbers 
            = Arrays.asList(11, 22,  44, 
                            55, 66, 77, 88, 
                            99, 100); 
  
        // Internal iterator 
        numbers.forEach(number 
                        -> System.out.print( 
                            number + " ")); 
                            System.out.print("Developed By Bipeen");
    } 
} 