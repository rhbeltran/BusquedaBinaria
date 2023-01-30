package exceptions;

public class AgeRangeException extends Exception{
    
    public AgeRangeException (int enteredAge) {
            super("Edad no válida: "+enteredAge);
            
    }


}