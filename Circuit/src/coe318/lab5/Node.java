package coe318.lab5;

/**
 *
 * @author syedabbas
 */
public class Node {
    
    //instance variables
    private int nodeID;
    private static int nodeNumber = 0;
    
    //constructor
    public Node(){
        this.nodeID = nodeNumber;
        nodeNumber++;
    }
    
    //toString() method
@Override
    public String toString(){
        return ("" + nodeID);
    }
}
