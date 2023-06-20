package coe318.lab6;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author syedabbas
 */

//This class is the main class; it stores all the commands and inputs
public class UserMain {
    private static Scanner user = new Scanner(System.in);
    static private ArrayList <Component> circuit;
    
    //The end command; Prints "All Done" and exits the program
    public static void end() {
        System.out.println("All Done");
        System.exit(0);
    } 

//The spice command; Prints out all the current inputs 
     public static void spice() {
        for(int i = 0; i < circuit.size(); i++) {
            System.out.println(circuit.get(i));
    }
}
   
//Analyzes the users inputs and accesses the necessary classes and/or methods
public static void main(String[] args) {
    String input;
    int ComponentNum = 0;
    circuit = new ArrayList <Component> ();
    System.out.println("Your Circuit: \n");
    
    while(true){
        int num = 0;
        input = user.nextLine(); //scans the users inputs
        int spice = 0;
        
//conditional statements to check for the spice or end commands
        if(input.equalsIgnoreCase("end")){
            end();
        } 
        
            else if (input.equalsIgnoreCase("spice")) { 
                spice = 1;
                spice();
        }
        
//reads and categorizes the entered inputs based on the spaces
        String[] read = input.split("\\s"); 
        
//operates the spice command
//the arrow operator "->" converts the input into a string (@Override)
        if (spice == 0){
            switch (read[0].charAt(0)){
                case 'r', 'R' -> {
                    Resistor temp = new Resistor (Double.parseDouble(read[3]),Integer.parseInt(read[1]),Integer.parseInt(read[2]));
                    circuit.add(temp);
                    ComponentNum++;
                }
                case 'v', 'V' -> {
                    VoltageSource temp = new VoltageSource (Double.parseDouble(read[3]),Integer.parseInt(read[1]),Integer.parseInt(read[2]));
                    circuit.add(temp);
                    ComponentNum++;
                }
                 default -> throw new IllegalArgumentException("Invalid Input");
            }
        }
          if (circuit.get(circuit.size()-1).getNode1() > ComponentNum){
                throw new IllegalArgumentException("Invalid Input: The order of nodes must be declared logically");
    } 
}
}
}