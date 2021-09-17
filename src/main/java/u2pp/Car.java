package u2pp;

/**
 * This class represents a car‘s gas intake and consumption
 * 
 * @author Jason de Moura
 */
 
public class Car {
    private double gas; //The amount of gas in the tank
    private double mpg; //The fuel efficiency of the car in miles per gallon
    private String make; //The make of the car
    private String model; //The model of the car
    
    /**
     * YOUR COMMENT HERE
     * takes input information and sets it to class attributes
     * sets gas to 0
     * @param anEfficiency - the efficiency of the Car
     * @param aMake - the make of the Car
     * @param aModel - the model of the Car
     */ 
    public Car(double anEfficiency, String aMake, String aModel) {
       //YOUR CODE HERE 	
       make = aMake;
       model = aModel;
       mpg = anEfficiency;
       gas = 0;
    }
    
    /**
     * YOUR COMMENT HERE
     * takes input double and adds that to gas attribute
     * @param amount - the amount of gas to add to the tank
     */
    public void addGas (double amount) {
        //YOUR CODE HERE
        gas+= amount;
    }
    
    /**
     * YOUR COMMENT HERE
     * subtracts input double divided by mpg attribute from gas attribute
     * @param distance - the distance that the car has driven
     */
    public void drive (double distance) {
        //YOUR CODE HERE
        double miles = distance/mpg;
        gas-= miles;
    }
    
    /**
     * @return The amount of gas currently in the tank
     */
    public double getGasInTank() {
        //YOUR CODE HERE
        return gas;
    }
    
    /**
     * @return The make and model of the car
     */
     public String getMakeAndModel() {
       return make + " " + model;
     }
    
    /**
     * @return The efficiency of the car. Used for testing purposes
     */
    public double getMpg() {
        return mpg;
    }

}