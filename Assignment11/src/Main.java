import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        testSingleException(); //Assignment 1
        System.out.println(); //Spacing
        testMultipleExceptions(); //Assignment 2
    }

    static void testSingleException(){
        try {
            int x = 7 / 0; //Gives runtime exemption
        } catch (ArithmeticException e){
            System.err.println(e); //Catch specific exception
        } catch (Exception e){
            System.err.println(e); //Catch general exception
        }
    }

    static void testMultipleExceptions(){
        //A
        try{
            String value = JOptionPane.showInputDialog(null,"Enter Value:");

            int divisor = Integer.parseInt(value);

            System.out.println(3/divisor);

        } catch (NumberFormatException nfe){
            System.err.println("!!! Exception caught by this program: Enter numeric value");
        } catch (ArithmeticException exc){
            System.err.println("!!! Exception caught by this program: Divisor was 0");
        }
        System.out.println("=== After exception ===");


        //B
        ListOfNumbers list = new ListOfNumbers();
        list.writeList();

    }
}
