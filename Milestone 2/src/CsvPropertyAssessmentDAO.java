import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;

public class CsvPropertyAssessmentDAO implements PropertyAssessmentDAO {

    //Convert numbers to dollar currency
    static NumberFormat formatter = NumberFormat.getCurrencyInstance();

    // Store the property assessments in a list
    private List<PropertyAssessment> propertyAssessments;

    // Constructor to read data from CSV and populate propertyAssessments list
    public CsvPropertyAssessmentDAO(String csvFileName) {
        propertyAssessments = readData(csvFileName);
    }

    //Reading data from a csv file and plugging the columns
    //in their respective variables
    private List<PropertyAssessment> readData(String csvFileName) {
        try{
            List<PropertyAssessment> data = new ArrayList<>();
            Scanner read = new Scanner(new File(csvFileName));

            read.nextLine();
            read.useDelimiter(",|\n");

            while (read.hasNext()){
                String accountNumber = read.next();
                String suite = read.next();
                String houseNumber = read.next();
                String streetName = read.next();
                String garage = read.next();
                String neighbourhoodID = read.next();
                String neighbourhood = read.next();
                String ward = read.next();
                String assessed = read.next();
                String latitude = read.next();
                String longitude = read.next();
                String pointLocation = read.next();
                String assessmentClassper1 = read.next();
                String assessmentClassper2 = read.next();
                String assessmentClassper3 = read.next();
                String assessmentClass1 = read.next();
                String assessmentClass2 = read.next();
                String assessmentClass3 = read.next();

                //Adding the variables into an arrayList
                data.add(new PropertyAssessment(accountNumber, suite, houseNumber, streetName, garage,
                        neighbourhoodID, neighbourhood, ward, assessed, latitude, longitude, pointLocation,
                        assessmentClassper1, assessmentClassper2, assessmentClassper3, assessmentClass1,
                        assessmentClass2, assessmentClass3));
            }

            read.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("Error: Can't open file " + csvFileName);
        }
        return null;
    }

    // Get a property assessment by account number
    public PropertyAssessment getByAccountNumber(int accountNumber) {
        for (PropertyAssessment assessment : propertyAssessments) {
            if (Integer.parseInt(assessment.getAccountNumber()) == accountNumber) {
                return assessment;
            }
        }
        return null;
    }

    // Get all property assessments by neighbourhood
    public List<PropertyAssessment> getByNeighbourhood(String neighbourhood) {
        List<PropertyAssessment> assessments = new ArrayList<>();
        for (PropertyAssessment assessment : propertyAssessments) {
            if (assessment.getNeighbourhood().equalsIgnoreCase(neighbourhood)) {
                assessments.add(assessment);
            }
        }
        return assessments;
    }