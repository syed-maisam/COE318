package coe318.lab5;

import java.util.ArrayList;

/**
 *
 * @author syedabbas
 */
public class Circuit {
    
    //instance variables 
    ArrayList<Resistor> resistors;
    private static Circuit instance = null; 
    
    //obtain the cicuit code using: Circuit cir = Circuit.getInstance();
    public static Circuit getInstance() {
        if (instance == null) { 
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit() { //Yes, the constructor is PRIVATE!
            this.resistors = new ArrayList<Resistor>();
        } 
        
   //method used to add a resistor to the circuit 
    public void add(Resistor r){
        this.resistors.add(r);
    }
    
@Override
    public String toString(){
        String circuit = new String();
        
        for (int i = 0; i < resistors.size(); i++){
        circuit += resistors.get(i).toString() + "\n";
         }
        return circuit;
    }
}
