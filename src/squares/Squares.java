/*
 * Quentin Magoon
 * Squares.java
 * Organizes numbers using arrays
 */

package squares;

import java.util.ArrayList;

/**
 *
 * @author qumag7758
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating Array list
        ArrayList<Integer> indexSquares = new ArrayList();
        
        //Creating values for ArrayList
            for(int i = 0; i< 10; i++) {
                indexSquares.add(i, i *i);
            }
        //displays/organizing values
            for(int i = 0; i < 10; i++) {
                System.out.println("Number" + i + " Square" +indexSquares.get(i));
            }
    } 
    
}
