package coe318.lab6;

/**
 *
 * @author syedabbas
 */

//the purpose of this class is to allow the Resistor and VoltageSource classes to be used as subclasses
//The arraylist in the UserMain class will be of type component
public class Component {
    protected double magnitude;
    protected int a, b; 
    
    public int getNode1(){
        return this.a;
    }
}
