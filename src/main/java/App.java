import java.util.*;
//import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter an year and i will do a trick  on it and tell you if it is leap or not");
    int intYear = myScanner.nextInt();

    //create an instance of the LeapYear class, call our isLeapYear() method, and print its results for the user
    LeapYear leapYear = new LeapYear();
     boolean leapYearResult =leapYear.isLeapYear(intYear);
    System.out.println("Is that year a leap year?" + " " + leapYearResult);
  }




}
