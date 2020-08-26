/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mac
 */
public class Temperature {
    float temps[] = new float[3];
    
    public Temperature() {
        System.out.println("ssdfsdf");
    }
    
    public Temperature(float temps[]) {
        this.temps = temps;
    }
    
    
    public void setTemps(float[] temps) {
        this.temps = temps;
    }
    
    public float[] getTemps() {
        return(this.temps);
    }
    
    public float getAverage() {
        float temp = 0.0f;
        temp = calcAverage(temps);
        
//        // 1st way
//        temp = (temps[0] + temps[1] + temps[2]) / 3;
//        
//        // 2nd way 
//        for(int i = 0; i < 3; i++) {
//            temp += temps[i]; // temp = temp + temps[0]
//        }
//        temp = temp / 3;
        return(temp);
    }
    
    private float calcAverage(float[] temps) {
        float temp = 0.0f;
        for(int i = 0; i < temps.length; i++) {
            temp += temps[i]; // temp = temp + temps[0]
        }
        temp = temp / temps.length;
        return(temp);
    }
    
}
