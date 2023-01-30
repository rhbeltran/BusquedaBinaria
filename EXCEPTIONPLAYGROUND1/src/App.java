import java.util.Scanner;

import exceptions.AgeRangeException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, bienvenido a nuestro bar, ingresa");
        Scanner sc=new Scanner(System.in);
        String ageStr = sc.nextLine();
        try {
            int age = Integer.parseInt(ageStr);
            if (age >=18){
                System.out.println("Entra por favor");
            }else{
                throw new AgeRangeException(age);
            }

            

        }catch (NumberFormatException e){
            System.out.println("\nBobazo!!! \"" +ageStr+ "\" no es número\n");
        }catch (AgeRangeException e){
            System.out.println(e.getMessage());
        }

    }
}
