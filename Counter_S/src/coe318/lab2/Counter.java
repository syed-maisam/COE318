/**
 *
 * @author Your Name: Syed Maisam Abbas
 */
package coe318.lab2;
public class Counter {
    //Instance variables here
    int maximum, digit; 
    Counter neighbour;
    
    public Counter(int modulus, Counter left) {
        maximum = modulus; 
        this.neighbour = left;
        digit = 0;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return maximum;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return this.neighbour;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        digit = getDigit();
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     * if it reaches its maximum (modulus) value, it is reset to zero.
     * If there is a left neighbour and if the Counter has rolled over, its left neighbour should be incremented as well
     */
    public void increment() {
    digit++;
    if (digit == maximum){
       digit = 0;
    if (this.neighbour != null){
        this.neighbour.digit++;
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     *  If there is a left neighbour, the count is the sum of the 
     *digit and the modulus times the count of the left neighbour. 
     * 
     * If there is no left neighbour, the count is the same as the digit.
     * 
     * @return the count
     */
    public int getCount() {
        if (this.neighbour != null){
            return (digit + maximum * neighbour.digit);
        }
        else {
            return digit;
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
