/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circle.area;

/**
 * Nicolas Lei,
 * September 17
 * To display the Circle area
 */
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15.0;
        double pi = 3.14;
        double area = 0.0;
        
        // Algorithm for area of circle
        area = pi * radius * radius;
        System.out.println("The area ..." + area + " cm squared");
    }
    
}
