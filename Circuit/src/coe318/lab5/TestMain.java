package coe318.lab5;

/**
 *
 * @author syedabbas
 */
public class TestMain {
    
    public static void main(String[] args){
        
        Circuit cir = Circuit.getInstance();
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        System.out.println("Node number 1: " + A.toString());
        System.out.println("Node number 2: " + B.toString());
        System.out.println("Node number 3: " + C.toString() + "\n");
        
        Resistor r1 = new Resistor(10000, A, B);
        Resistor r2 = new Resistor(20000, B, C);
        System.out.println("Resistor 1 properties: " + r1.toString());
        System.out.println("Resistor 2 properties: " + r2.toString());
        
        System.out.println("\nCircuit:");
        System.out.println(cir.toString());
    }
}
