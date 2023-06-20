package coe318.lab6;

/**
 *
 * @author syedabbas
 */
public class Resistor extends Component{
    

    //instance variables 
    private int resistorID;
    private static int resistorNumber = 1;
    
    //constructor
    public Resistor(double resistance, int node1, int node2){
        
        //detection of illegal parameters and IllegalArgumentException
        if (resistance < 0){
            throw new IllegalArgumentException("I can't be a negative value");
        }
        
        else if (resistance == 0){
            throw new IllegalArgumentException("Resistance can't be zero");
        }
        
        else if (node1 < 0){
            throw new IllegalArgumentException("Connection can't be negative");
        }
        
        else if (node2 < 0){
            throw new IllegalArgumentException("Connection can't be negative");
        }
        
        this.magnitude = resistance;
        this.a = node1;
        this.b = node2;
        this.resistorID = resistorNumber;
        resistorNumber++;
    }
    
@Override
    public String toString(){
        return ("R" + resistorID + ", " + a + ", " + b + ", " + magnitude + " ohms");
    }
}
