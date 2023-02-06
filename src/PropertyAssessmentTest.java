import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.*;

public class PropertyAssessmentTest {
    static PropertyAssessment propertyAssessment = new PropertyAssessment();
    static PropertyAssessment propertyAssessmentTestEQ = new PropertyAssessment();
    static PropertyAssessment propertyAssessmentTestDiff = new PropertyAssessment();

    @BeforeClass
    public static void setUpPropertyAssessments(){
        propertyAssessment.setAccountNumber("1103530");
        propertyAssessment.setSuite("1000");
        propertyAssessment.setHouseNumber("8716");
        propertyAssessment.setStreetName("169 STREET NW");
        propertyAssessment.setNeighbourhoodID("6700");
        propertyAssessment.setNeighbourhood("OLIVER");
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
        propertyAssessmentTestEQ.setNeighbourhood("OLIVER");
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
        propertyAssessmentTestDiff.setNeighbourhood("OLIVER");
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
    @Test
    public void testGetAccountNumber(){
        String expected = "1103530";
        String actual = propertyAssessment.getAccountNumber();

        assertEquals("Testing get accountNumber...", expected, actual);
    }

    @Test
    public void testGetSuite(){
        String expected = "1000";
        String actual = propertyAssessment.getSuite();

        assertEquals("Testing get suite...", expected, actual);
    }

    @Test
    public void testGetHouseNumber(){
        String expected = "8716";
        String actual = propertyAssessment.getHouseNumber();

        assertEquals("Testing get houseNumber...", expected, actual);
    }

    @Test
    public void testGetStreetName(){
        String expected = "169 STREET NW";
        String actual = propertyAssessment.getStreetName();

        assertEquals("Testing get streetName...", expected, actual);
    }

    @Test
    public void testGetNeighbourhoodID(){
        String expected = "6700";
        String actual = propertyAssessment.getNeighbourhoodID();

        assertEquals("Testing get neighbourhoodID...", expected, actual);
    }

    @Test
    public void testGetNeighbourhood(){
        String expected = "OLIVER";
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
    public void testGetLatitude(){
        String expected = "53.561";
        String actual = propertyAssessment.getLatitude();

        assertEquals("Testing get latitude...", expected, actual);
    }

    @Test
    public void testGetLongitude(){
        String expected = "-113.47";
        String actual = propertyAssessment.getLongitude();

        assertEquals("Testing get longitude...", expected, actual);
    }

    @Test
    public void testGetGarage(){
        String expected = "Y";
        String actual = propertyAssessment.getGarage();

        assertEquals("Testing get garage...", expected, actual);
    }

    @Test
    public void testGetWard(){
        String expected = "tastawiyiniwak Ward";
        String actual = propertyAssessment.getWard();

        assertEquals("Testing get ward...", expected, actual);
    }

    @Test
    public void testGetPointLocation(){
        String expected = "POINT (-113.47 53.561)";
        String actual = propertyAssessment.getPointLocation();

        assertEquals("Testing get pointLocation...", expected, actual);
    }

    @Test
    public void testGetAssessmentClassper1(){
        String expected = "53";
        String actual = propertyAssessment.getAssessmentClassper1();

        assertEquals("Testing get assessmentClassper1...", expected, actual);
    }

    @Test
    public void testGetAssessmentClassper2(){
        String expected = "35";
        String actual = propertyAssessment.getAssessmentClassper2();

        assertEquals("Testing get assessmentClassper2...", expected, actual);
    }

    @Test
    public void testGetAssessmentClassper3(){
        String expected = "12";
        String actual = propertyAssessment.getAssessmentClassper3();

        assertEquals("Testing get assessmentClassper3...", expected, actual);
    }

    @Test
    public void testGetAssessmentClass1(){
        String expected = "RESIDENTIAL";
        String actual = propertyAssessment.getAssessmentClass1();

        assertEquals("Testing get assessmentClass1...", expected, actual);
    }

    @Test
    public void testGetAssessmentClass2(){
        String expected = "COMMERCIAL";
        String actual = propertyAssessment.getAssessmentClass2();

        assertEquals("Testing get assessmentClass2...", expected, actual);
    }

    @Test
    public void testGetAssessmentClass3(){
        String expected = "FARMLAND";
        String actual = propertyAssessment.getAssessmentClass3();

        assertEquals("Testing get assessmentClass3...", expected, actual);
    }
    @Test
    public void testToString(){
        String expected = "PropertyAssessment [suite=" + "1000" + ", houseNumber=" + "8716" + ", streetName=" + "169 STREET NW"
        + ", accountNumber=" + "1103530" + ", garage=" + "Y" + ", neighbourhoodID=" + "6700"
        + ", neighbourhood=" + "OLIVER" + ", assessed=" + "86000" + ", latitude=" + "53.561"
        + ", longitude=" + "-113.47" + ", ward=" + "tastawiyiniwak Ward" + ", assessmentClassper1=" + "53"
        + ", assessmentClassper2=" + "35" + ", assessmentClassper3=" + "12"
        + ", assessmentClass1=" + "RESIDENTIAL" + ", assessmentClass2=" + "COMMERCIAL"
        + ", assessmentClass3=" + "FARMLAND" + "]";

        String actual = propertyAssessment.toString();

        assertEquals("Testing toString method...", expected, actual);
    }
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
