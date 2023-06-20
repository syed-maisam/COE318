package coe318.lab6;

/**
 *
 * @author syedabbas
 */
public class VoltageSource extends Component{
    
    //instance variables 
    private int sourceID;
    private static int SourceNumber = 1;
    
    //constructor
    public VoltageSource(double voltage, int node1, int node2){
        
        //detection of illegal parameters and IllegalArgumentException
        if (voltage == 0){
            throw new IllegalArgumentException("Voltage can't be zero");
        }
        
        else if (node1 < 0){
            throw new IllegalArgumentException("Connection can't be negative");
        }
        
        else if (node2 < 0){
            throw new IllegalArgumentException("Connection can't be negative");
        }
        
        this.magnitude = voltage;
        this.a = node1;
        this.b = node2;
        this.sourceID = SourceNumber;
        SourceNumber++;
    }
    
@Override
    public String toString(){
        return ("V" + sourceID + ", " + a + ", " + b + ", DC, " + magnitude + " Volts");
    }
}
