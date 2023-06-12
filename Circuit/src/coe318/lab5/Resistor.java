package coe318.lab5;

/**
 *
 * @author syedabbas
 */
public class Resistor {
    
    //instance variables 
    public double resistance;
    public Node node1, node2;
    public int resistorID;
    private static int resistorNumber = 1;
    
    //constructor
    public Resistor(double resistance, Node node1, Node node2){
        
        if (resistance < 0){
            throw new IllegalArgumentException("I can't be a negative value");
        }
        
        if (node1 == null || node2 == null){
            throw new IllegalArgumentException("Connection can't be null");
        }
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resistorID = resistorNumber;
        resistorNumber++;
        Circuit.getInstance().add(this);
    }
    
    public Node [] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }

@Override
    public String toString(){
        return ("R" + resistorID + ", " + node1 + ", " + node2 + ", " + resistance + " ohms");
    }
}
