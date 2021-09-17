package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * YOUR COMMENTS HERE
 * Creates car with input information from user for all car attributes.
 * runs addGas and userDistance using input information
 */

class Main {
  public static void main(String[] args) {
    
    //YOUR CODE HERE
    Scanner carScanner = new Scanner(System.in);
    System.out.print("Enter a fuel efficiency: ");
    double userEfficiency = Double.parseDouble(carScanner.nextLine());
    System.out.print("Enter a make: ");
    String userMake = carScanner.nextLine();
    System.out.print("Enter a model: ");
    String userModel = carScanner.nextLine();
    Car userCar = new Car(userEfficiency, userMake, userModel);
    System.out.print("Enter amount of gas to add: ");
    double userGas = Double.parseDouble(carScanner.nextLine());
    userCar.addGas(userGas);
    System.out.print("Enter distance to drive: ");
    double userDistance = Double.parseDouble (carScanner.nextLine());
    userCar.drive(userDistance);
    System.out.print("Your " + userCar.getMakeAndModel() + " currently has " + userCar.getGasInTank() + " gallons of gas left in the tank");
    carScanner.close();
  }
  
  /**
   * YOUR COMMENT HERE
   * takes both strings and concotenates the substrings of them based on users input paramaters
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return concotenation of both substrings
   */
  public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
    //YOUR CODE HERE
    String word1SubString = word1.substring(start1, end1+1);
    String word2SubString = word2.substring(start2, end2+1);
    return "" + word1SubString + word2SubString;
  }
}