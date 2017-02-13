
import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
    //spec for when year is divisible by four
    @Test
    public void isLeapYear_forNumberDivisibleByFour_true(){
      LeapYear leapYear = new LeapYear();
      assertEquals(true, leapYear.isLeapYear(2012));
    }
    //spec for when an year is not divisible by four
    @Test
    public void isLeapYear_forNumberNotDivisibleByFour_false(){
      LeapYear leapYear = new LeapYear();
      assertEquals(false, leapYear.isLeapYear(1999));
    }
    //false if divisible by 100
    //@Test
    //public void isLeapYear_forMultiplesOfOneHundred_false(){
      //LeapYear leapYear = new LeapYear();
      //assertEquals(false, leapYear.isLeapYear(1900));
    //}
    @Test
    public void isLeapYear_forMultiplesOfFourHundred_true(){
      LeapYear leapYear = new LeapYear();
      assertEquals(true, leapYear.isLeapYear(2000));
    }
}
