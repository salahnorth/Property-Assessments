import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.*;
import java.io.FileNotFoundException;
import org.junit.*;

public class PropertyAssessmentsTest {
    //String csvFileName = "C:\\Property_Assessment_Data_2022.csv";
    String csvFileName = "C:\\Users\\salah\\Downloads\\CMPT 305\\CMPT 305 lab2\\Property Assessments\\src\\Property_Assessment_Data_2022.csv";

    List<PropertyAssessment> data = PropertyAssessments.readData(csvFileName);
    int sizeDiff = 416045 - data.size() + 1;

    @Before
    public void setUpPropertyAssessments(){
        PropertyAssessment propertyAssessmentTest = new PropertyAssessment();
        PropertyAssessments propertyAssessmentsTest = new PropertyAssessments();
    }
    @Test
    public void fileExceptionTest(){
        String wrongFileName = "wrongfile";
        assertThrows(FileNotFoundException.class, () -> PropertyAssessments.readData(wrongFileName));
    }
    @Test
    public void testAccountNumber(){
        /*Testing random row number 226296 in csv file */
        String expected = "10002222";
        String actual = data.get(226296-sizeDiff).getAccountNumber();
        assertEquals("Testing random account number in csv File...", expected, actual);
    }
    @Test
    public void testSuite(){
        /*Testing random row number 226296 in csv file */
        String expected = "";
        String actual = data.get(226296-sizeDiff).getSuite();

        assertEquals("Testing random suite in csv File...", expected, actual);
    }

    @Test
    public void testHouseNumber(){
        /*Testing random row number 112661 in csv file */
        String expected = "9918";
        String actual = data.get(112661-sizeDiff).getHouseNumber();

        assertEquals("Testing random houseNumber in csv File...", expected, actual);
    }

    @Test
    public void testStreetName(){
        /*Testing random row number 112460 in csv file */
        String expected = "78 STREET NW";
        String actual = data.get(112460-sizeDiff).getStreetName();

        assertEquals("Testing random streetName in csv File...", expected, actual);
    }

    @Test
    public void testNeighbourhoodID(){
        /*Testing random row number 12861 in csv file */
        String expected = "6214";
        String actual = data.get(12861-sizeDiff).getNeighbourhoodID();

        assertEquals("Testing random neighbourhoodID in csv File...", expected, actual);
    }

    @Test
    public void testNeighbourhood(){
        /*Testing random row number 15 in csv file */
        String expected = "RIVER VALLEY OLESKIW";
        String actual = data.get(15-sizeDiff).getNeighbourhood();

        assertEquals("Testing random neighbourhood in csv File...", expected, actual);
    }

    @Test
    public void testAssessed(){
        /*Testing random row number 119585 in csv file */
        String expected = "191500";
        String actual = data.get(119585-sizeDiff).getAssessed();

        assertEquals("Testing random assessed in csv File...", expected, actual);
    }

    @Test
    public void testLatitude(){
        /*Testing random row number 152195 in csv file */
        String expected = "53.4727333875803";
        String actual = data.get(152195-sizeDiff).getLatitude();

        assertEquals("Testing random latitude in csv File...", expected, actual);
    }

    @Test
    public void testLongitude(){
        /*Testing random row number 388371 in csv file */
        String expected = "-113.499854724125";
        String actual = data.get(388371-sizeDiff).getLongitude();

        assertEquals("Testing random longitude in csv File...", expected, actual);
    }

    @Test
    public void testGarage(){
        /*Testing random row number 7 in csv file */
        String expected = "N";
        String actual = data.get(7-sizeDiff).getGarage();

        assertEquals("Testing random garage in csv File...", expected, actual);
    }

    @Test
    public void testWard(){
        /*Testing random row number 472 in csv file */
        String expected = "Nakota Isga Ward";
        String actual = data.get(472-sizeDiff).getWard();

        assertEquals("Testing random ward in csv File...", expected, actual);
    }

    @Test
    public void testPointLocation(){
        /*Testing random row number 2023 in csv file */
        String expected = "POINT (-113.40114218153772 53.4810702671179)";
        String actual = data.get(2023-sizeDiff).getPointLocation();

        assertEquals("Testing random pointLocation in csv File...", expected, actual);
    }

    @Test
    public void testAssessmentClassper1(){
        /*Testing random row number 41522 in csv file */
        String expected = "100";
        String actual = data.get(41522-sizeDiff).getAssessmentClassper1();

        assertEquals("Testing random assessmentClassper1 in csv File...", expected, actual);
    }

    @Test
    public void testAssessmentClassper2(){
        /*Testing random row number 416043(max) in csv file */
        String expected = "";
        String actual = data.get(416043-sizeDiff).getAssessmentClassper2();

        assertEquals("Testing random assessmentClassper2 in csv File...", expected, actual);
    }

    @Test
    public void testAssessmentClassper3(){
        /*Testing random row number 2 in csv file */
        String expected = "";
        String actual = data.get(2-sizeDiff).getAssessmentClassper3();

        assertEquals("Testing random assessmentClassper3 in csv File...", expected, actual);
    }

    @Test
    public void testAssessmentClass1(){
        /*Testing random row number 507 in csv file */
        String expected = "COMMERCIAL";
        String actual = data.get(507-sizeDiff).getAssessmentClass1();

        assertEquals("Testing ranom assessmentClass1 in csv File...", expected, actual);
    }

    @Test
    public void testAssessmentClass2(){
        /*Testing random row number 352846 in csv file */
        String expected = "";
        String actual = data.get(352846-sizeDiff).getAssessmentClass2();

        assertEquals("Testing random assessmentClass2 in csv File...", expected, actual);
    }

    @Test
    public void testAssessmentClass3(){
        /*Testing random row number 379388 in csv file */
        String expected = "FARMLAND";
        String actual = data.get(379388-sizeDiff).getAssessmentClass3();

        assertEquals("Testing random assessmentClass3 in csv File...", expected, actual);
    }
    @Test
    public void testStatistics(){
        /*Testing the median of the first 10 rows of the csv File... */
        int testSize = 10;
        int middle = testSize / 2;
        middle = middle > 0 && middle % 2 == 0 ? middle - 1 : middle;

        List<Integer> assessedValuesTest = new ArrayList<>();
        assessedValuesTest.add(86000);
        assessedValuesTest.add(257000);
        assessedValuesTest.add(62112000);
        assessedValuesTest.add(842000);
        assessedValuesTest.add(292000);
        assessedValuesTest.add(140000);
        assessedValuesTest.add(299000);
        assessedValuesTest.add(434000);
        assessedValuesTest.add(140500);
        assessedValuesTest.add(97000);

        Collections.sort(assessedValuesTest);

        int expectedMin = Collections.min(assessedValuesTest);
        int expectedMax = Collections.max(assessedValuesTest);

        int expectedRange = expectedMax - expectedMin;

        int expectedMedian = assessedValuesTest.get(middle);

        List<PropertyAssessment> dataTest = new ArrayList<>();

        for (int i=0; i<10; i++){
            dataTest.add(data.get(i));
        }

        int actualMedianInt = PropertyAssessments.getMedian(dataTest);
        int actualMinInt = PropertyAssessments.getMin(dataTest);
        int actualMaxInt = PropertyAssessments.getMax(dataTest);

        int actualRangeInt = PropertyAssessments.getRange(dataTest, actualMinInt, actualMaxInt);

        
        assertEquals(expectedMin, actualMinInt);
        assertEquals(expectedMax, actualMaxInt);
        assertEquals(expectedRange, actualRangeInt);
        assertEquals(expectedMedian, actualMedianInt);  
    }












    /*
    String csvFileName = "/Property_Assessment_Data_2022.csv";
    try{
        List<PropertyAssessment> data = PropertyAssessments.readData(csvFileName);
    } catch (FileNotFoundException e) {
        System.out.println("Error: Cant open file " + csvFileName);
    }

    @BeforeClass
    public static void setUpPropertyAssessmentAndAssessments(){
        PropertyAssessment propertyAssessmentTest = new PropertyAssessment();
        PropertyAssessments propertyAssessmentsTest = new PropertyAssessments();
    }

    //private PropertyAssessment propertyAssessmentTest;

    @Test
    /*@ParameterizedTest
    @CsvFileSource(resources = "/Property_Assessment_Data_2022.csv", numLinesToSkip = 1)

    public void testWithCsvFileAccountNumber() {
    
    String expected = "1014836";
    String actual = data.get(14).getAccountNumber();
    assertEquals("Testing the account number for csv File row 14...", expected, actual);
    }*/
}
