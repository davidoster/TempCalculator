/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempcalculator;

import models.Human;
import models.HumanTemperature;
import models.Temperature;



/**
 *
 * @author mac
 */
public class TempCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HumanTemperature humantemp = new HumanTemperature(new Human("George"), 
                                                          new Temperature(new float[]{36.6f, 36.7f, 36.8f}));
        // Your average temp George is: 36.7
        System.out.println("Your average temp "     + humantemp.getHuman().getName() + 
                                            " is: " + humantemp.getTemperature().getAverage());
        
    }
    
}
