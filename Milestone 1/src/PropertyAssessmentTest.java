/* Name: Salah Mohamed
   Date: 23/02/01
   ID: 3044504
   Course: CMPT 305 Milestone 1
   Program: Property Assessment class test using Junit
 */

import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.*;

//Creating property assessment objects for testing
public class PropertyAssessmentTest {
    static PropertyAssessment propertyAssessment = new PropertyAssessment();
    static PropertyAssessment propertyAssessmentTestEQ = new PropertyAssessment();
    static PropertyAssessment propertyAssessmentTestDiff = new PropertyAssessment();

    //Setting up the PropertyAssessment class informations for equal
    //and different assessed values
    @BeforeClass
    public static void setUpPropertyAssessments(){
        propertyAssessment.setAccountNumber("1103530");
        propertyAssessment.setSuite("1000");
        propertyAssessment.setHouseNumber("8716");
        propertyAssessment.setStreetName("169 STREET NW");
        propertyAssessment.setNeighbourhoodID("6700");
        propertyAssessment.setNeighbourhoodName("OLIVER");
        propertyAssessment.setAssessed("86000");
        propertyAssessment.setLatitude("53.561");
        propertyAssessment.setLongitude("-113.47");
        propertyAssessment.setGarage("Y");
        propertyAssessment.setWard("tastawiyiniwak Ward");
        propertyAssessment.setPointLocation("POINT (-113.47 53.561)");
        propertyAssessment.setAssessmentClassper1("53");
        propertyAssessment.setAssessmentClassper2("35");
        propertyAssessment.setAssessmentClassper3("12");
        propertyAssessment.setAssessmentClass1("RESIDENTIAL");
        propertyAssessment.setAssessmentClass2("COMMERCIAL");
        propertyAssessment.setAssessmentClass3("FARMLAND");

        propertyAssessmentTestEQ.setAccountNumber("1103530");
        propertyAssessmentTestEQ.setSuite("1000");
        propertyAssessmentTestEQ.setHouseNumber("8716");
        propertyAssessmentTestEQ.setStreetName("169 STREET NW");
        propertyAssessmentTestEQ.setNeighbourhoodID("6700");
        propertyAssessmentTestEQ.setNeighbourhoodName("OLIVER");
        propertyAssessmentTestEQ.setAssessed("86000");
        propertyAssessmentTestEQ.setLatitude("53.561");
        propertyAssessmentTestEQ.setLongitude("-113.47");
        propertyAssessmentTestEQ.setGarage("Y");
        propertyAssessmentTestEQ.setWard("tastawiyiniwak Ward");
        propertyAssessmentTestEQ.setPointLocation("POINT (-113.47 53.561)");
        propertyAssessmentTestEQ.setAssessmentClassper1("53");
        propertyAssessmentTestEQ.setAssessmentClassper2("35");
        propertyAssessmentTestEQ.setAssessmentClassper3("12");
        propertyAssessmentTestEQ.setAssessmentClass1("RESIDENTIAL");
        propertyAssessmentTestEQ.setAssessmentClass2("COMMERCIAL");
        propertyAssessmentTestEQ.setAssessmentClass3("FARMLAND");

        propertyAssessmentTestDiff.setAccountNumber("1103530");
        propertyAssessmentTestDiff.setSuite("1000");
        propertyAssessmentTestDiff.setHouseNumber("8715");
        propertyAssessmentTestDiff.setStreetName("169 STREET NW");
        propertyAssessmentTestDiff.setNeighbourhoodID("6700");
        propertyAssessmentTestDiff.setNeighbourhoodName("OLIVER");
        propertyAssessmentTestDiff.setAssessed("86100");
        propertyAssessmentTestDiff.setLatitude("53.561");
        propertyAssessmentTestDiff.setLongitude("-113.47");
        propertyAssessmentTestDiff.setGarage("Y");
        propertyAssessmentTestDiff.setWard("tastawiyiniwak Ward");
        propertyAssessmentTestDiff.setPointLocation("POINT (-113.47 53.561)");
        propertyAssessmentTestDiff.setAssessmentClassper1("53");
        propertyAssessmentTestDiff.setAssessmentClassper2("35");
        propertyAssessmentTestDiff.setAssessmentClassper3("12");
        propertyAssessmentTestDiff.setAssessmentClass1("RESIDENTIAL");
        propertyAssessmentTestDiff.setAssessmentClass2("COMMERCIAL");
        propertyAssessmentTestDiff.setAssessmentClass3("FARMLAND");

    }
    //Testing all the get functions
    @Test
    public void testGetAccountNumber(){
        String expected = "1103530";
        String actual = propertyAssessment.getAccountNumber();

        assertEquals("Testing get accountNumber...", expected, actual);
    }

    @Test
    public void testGetAddress(){
        String expected = "1000 8716 169 STREET NW";
        String actual = propertyAssessment.getAddress();

        assertEquals("Testing get address...", expected, actual);
    }

    @Test
    public void testGetNeighbourhoodID(){
        String expected = "6700";
        String actual = propertyAssessment.getNeighbourhoodID();

        assertEquals("Testing get neighbourhoodID...", expected, actual);
    }

    @Test
    public void testGetNeighbourhood(){
        String expected = "OLIVER (tastawiyiniwak Ward)";
        String actual = propertyAssessment.getNeighbourhood();

        assertEquals("Testing get neighbourhood...", expected, actual);
    }

    @Test
    public void testGetAssessed(){
        String expected = "86000";
        String actual = propertyAssessment.getAssessed();

        assertEquals("Testing get assessed...", expected, actual);
    }

    @Test
    public void testGetLocation(){
        String expected = "(53.561, -113.47)";
        String actual = propertyAssessment.getLocation();

        assertEquals("Testing get location...", expected, actual);
    }

    @Test
    public void testGetGarage(){
        String expected = "Y";
        String actual = propertyAssessment.getGarage();

        assertEquals("Testing get garage...", expected, actual);
    }

    @Test
    public void testGetAssessmentClass(){
        String expected = "[RESIDENTIAL 53%, COMMERCIAL 35%, FARMLAND 12%]";
        String actual = propertyAssessment.getAssessmentClass();

        assertEquals("Testing get assessmentClass...", expected, actual);
    }

    //Testing toString method
    @Test
    public void testToString(){
        String expected = "PropertyAssessment [suite=" + "1000" + ", houseNumber=" + "8716" + ", streetName=" + "169 STREET NW"
        + ", accountNumber=" + "1103530" + ", garage=" + "Y" + ", neighbourhoodID=" + "6700"
        + ", neighbourhoodName=" + "OLIVER" + ", assessed=" + "86000" + ", latitude=" + "53.561"
        + ", longitude=" + "-113.47" + ", ward=" + "tastawiyiniwak Ward" + ", assessmentClassper1=" + "53"
        + ", assessmentClassper2=" + "35" + ", assessmentClassper3=" + "12"
        + ", assessmentClass1=" + "RESIDENTIAL" + ", assessmentClass2=" + "COMMERCIAL"
        + ", assessmentClass3=" + "FARMLAND" + "]";

        String actual = propertyAssessment.toString();

        assertEquals("Testing toString method...", expected, actual);
    }

    //Testing the equal and different assessed values in the
    //PropertyAssessment class
    @Test
    public void testEqualsIfEqual(){

        boolean expected = true;
        boolean actual = propertyAssessment.equals(propertyAssessmentTestEQ);

        assertEquals("Testing equals method for equals...", expected, actual);
    }
    @Test
    public void testEqualIfDifferent(){

        boolean expected = false;
        boolean actual = propertyAssessment.equals(propertyAssessmentTestDiff);

        assertEquals("Testing equals method for difference...", expected, actual);
    }
    @Test
    public void testCompareToforEquals(){
        int expected = 0;
        int actual = propertyAssessment.compareTo(propertyAssessmentTestEQ);

        assertEquals("Testing compareTo method for equals...", expected, actual);
    }
    @Test
    public void testCompareToforGreater(){
        int expected = 1;
        int actual = propertyAssessmentTestDiff.compareTo(propertyAssessment);

        assertEquals("Testing compareTo method for greater...", expected, actual);
    }
    @Test
    public void testCompareToforLess(){
        int expected = -1;
        int actual = propertyAssessment.compareTo(propertyAssessmentTestDiff);

        assertEquals("Testing compareTo method for greater...", expected, actual);
    }

    //Testing the hash function
    @Test
    public void testHash(){
        Set<PropertyAssessment> propertyAssessmentsHash = new HashSet<>();
        PropertyAssessment propertyAssessmentTest = propertyAssessment;

        propertyAssessmentsHash.add(propertyAssessment);
        propertyAssessmentsHash.add(propertyAssessmentTest);

        int expected = 1;
        int actual = propertyAssessmentsHash.size();

        assertEquals("Testing HashCode method...", expected, actual);

    }
}
