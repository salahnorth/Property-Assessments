/* Name: Salah Mohamed
   Date: 23/02/01
   ID: 3044504
   Course: CMPT 305 Milestone 1
   Program: Property Assessments class
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;


/*This implements a class design PropertyAssessments that manages
 a collection of property assessment objects and their statistics */
public class PropertyAssessments {
    //Convert numbers to dollar currency
    static NumberFormat formatter = NumberFormat.getCurrencyInstance();

    //Reading data from a csv file and plugging the columns
    //in their respective variables
    public static List<PropertyAssessment> readData(String csvFileName) {
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
            System.out.println("Error: Cant open file " + csvFileName);
        }
        return null;
    }

    //Returning the size of the data
    public static int getCount(List<PropertyAssessment> data){
        return data.size();
    }

    //Returning the minimum assessed value in the data
    public static int getMin(List<PropertyAssessment> data){
        int minAssessed = Integer.parseInt(Collections.min(data).getAssessed());
        return minAssessed;
    }

    //Returning the minimum assessed value in the data
    public static int getMax(List<PropertyAssessment> data){
        int maxAssessed = Integer.parseInt(Collections.max(data).getAssessed());
        return maxAssessed;
    }

    //Returning the range assessed value in the data
    public static int getRange(List<PropertyAssessment> data, int minAssessedInt, int maxAssessedInt){
        int range = maxAssessedInt - minAssessedInt;
        return range;
    }

    //Returning the median assessed value in the data
    public static int getMedian(List<PropertyAssessment> data) {
        Collections.sort(data);
        int middle = data.size() / 2;
        middle = middle > 0 && middle % 2 == 0 ? middle - 1 : middle;
        int intassessed = Integer.parseInt(data.get(middle).getAssessed());
        return intassessed;
    }

    //Returning the mean assessed value in the data
    public static long getMean(List<PropertyAssessment> data, int count){
        Collections.sort(data);
        long sum = 0;
        for (int i=0; i<data.size(); i++){
            int intAssessedValue = Integer.parseInt(data.get(i).getAssessed());
            sum += intAssessedValue;
        }
        long average = sum / count;
        return average;
    }

    //Calculating the statistics of the data in dollar currency
    public static List<PropertyAssessment> PropertyAssessmentsStatistic(List<PropertyAssessment> data, int count){

        int minAssessed = getMin(data);
        int maxAssessed = getMax(data);
        int range = maxAssessed - minAssessed;
        int median = getMedian(data);
        long mean = getMean(data, data.size());

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String minAssessedMoney = formatter.format(minAssessed);
        String maxAssessedMoney = formatter.format(maxAssessed);
        String rangeAssessedMoney = formatter.format(range);
        String medianAssessedMoney = formatter.format(median);
        String meanAssessedMoney = formatter.format(mean);

        System.out.println("n = " + data.size());
        System.out.println("min = " + minAssessedMoney);
        System.out.println("max = " + maxAssessedMoney);
        System.out.println("range = " + rangeAssessedMoney);
        System.out.println("mean = " + meanAssessedMoney);
        System.out.println("median = " + medianAssessedMoney);

        return data;
    }
}