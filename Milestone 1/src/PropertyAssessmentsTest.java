/* Name: Salah Mohamed
   Date: 23/02/01
   ID: 3044504
   Course: CMPT 305 Milestone 1
   Program: Property Assessments class test using Junit
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.util.*;
import java.io.FileNotFoundException;
import org.junit.*;

//Reading the filename and read the data
public class PropertyAssessmentsTest {
    String csvFileName = "C:\\Users\\salah\\Downloads\\Property_Assessment_Data_2022.csv";
    List<PropertyAssessment> data = PropertyAssessments.readData(csvFileName);

    //This is the size difference between the array list data and the data in the csv file
    int sizeDiff = 416045 - data.size() + 1;

    //Testing for file exception message
    @Test
    public void fileExceptionTest() throws FileNotFoundException{
        String wrongFileName = "wrongfile";

        Throwable thrown = assertThrows(FileNotFoundException.class,
         () -> PropertyAssessments.readData(wrongFileName));
         assertEquals("Cant open file "+ wrongFileName, thrown.getMessage());
    }

    //Testing using csv data for the property assessment data
    @Test
    public void testAccountNumber(){
        /*Testing random row number 226296 in csv file */
        String expected = "10002222";
        String actual = data.get(226296-sizeDiff).getAccountNumber();
        assertEquals("Testing random account number in csv File...", expected, actual);
    }
    @Test
    public void testAddress(){
        /*Testing random row number 226296 in csv file */
        String expected = " 7807 12 AVENUE SW";
        String actual = data.get(226296-sizeDiff).getAddress();

        assertEquals("Testing random address in csv File...", expected, actual);
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
        String expected = "RIVER VALLEY OLESKIW (sipiwiyiniwak Ward)";
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
    public void testLocation(){
        /*Testing random row number 152195 in csv file */
        String expected = "(53.4727333875803, -113.513545195179)";
        String actual = data.get(152195-sizeDiff).getLocation();

        assertEquals("Testing random location in csv File...", expected, actual);
    }

    @Test
    public void testGarage(){
        /*Testing random row number 7 in csv file */
        String expected = "N";
        String actual = data.get(7-sizeDiff).getGarage();

        assertEquals("Testing random garage in csv File...", expected, actual);
    }

    @Test
    public void testAssessmentClass(){
        /*Testing random row number 41522 in csv file */
        String expected = "[RESIDENTIAL 100%,  %,  %]";
        String actual = data.get(41522-sizeDiff).getAssessmentClass();

        assertEquals("Testing random assessmentClass in csv File...", expected, actual);
    }

    //Testing the property assessment statistics by plugging in
    //csv data
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

}
