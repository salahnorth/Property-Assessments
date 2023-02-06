import java.util.*;

public class Lab3Main {
    public static void main(String[] args){
        int flagAssessmentClass = 0;

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("CSV filename: ");

        String fileName = scanner.nextLine();  // Read user input

        List<PropertyAssessment> data = PropertyAssessments.readData(fileName);

        System.out.print("Assessment class: ");
        String assessmentClass = scanner.nextLine();

        List<PropertyAssessment> assessmentClassList = new ArrayList<>();
        for (int i=0; i<data.size(); i++){
            if ((data.get(i).getAssessmentClass1().compareTo(assessmentClass.toUpperCase()) == 0) ||
            (data.get(i).getAssessmentClass2().compareTo(assessmentClass.toUpperCase()) == 0) ||
            (data.get(i).getAssessmentClass3().compareTo(assessmentClass.toUpperCase()) == 0)){
                assessmentClassList.add(data.get(i));
                flagAssessmentClass += 1;
            }
        }
        if (flagAssessmentClass == 0){
            System.out.println("Data not found");
        }
        else{
            PropertyAssessments.PropertyAssessmentsStatistic(assessmentClassList, assessmentClassList.size());
        }
        scanner.close();
    }
}