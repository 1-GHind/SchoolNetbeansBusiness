/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validationroutines;

import java.util.regex.*;
import java.util.Objects;

/**
 *
 * @author 1-GHind
 */
public class ValidationRoutines {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
          
    }
    public static void  isNull(String inNull)
    {
        //Checks if input is null
        if (Objects.isNull(inNull));
        {
            System.out.println("false");
        }    
    }
    public static Boolean validatePostcode(String postcode)
    {
        //Checks if input matches given constraints
        Pattern postcodePattern = Pattern.compile("^[A-Z]{1,2}[0-9]{1,2}[0-9A-Z]? [0-9][A-Z]{2}$");
        Matcher matcher =postcodePattern.matcher(postcode);
        boolean match = matcher.matches();
        return match;
            
    }
}
