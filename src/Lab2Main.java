import java.text.NumberFormat;
import java.util.*;

public class Lab2Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("CSV filename: ");

        String fileName = scanner.nextLine();  // Read user input
        List<PropertyAssessment> data = PropertyAssessments.readData(fileName);

        if (data == null){
            scanner.close();
            return;
        }
        System.out.println("Descriptive statistics of all property assessments");

        PropertyAssessments.PropertyAssessmentsStatistic(data, data.size());

        System.out.print("\nFind a property assessment by account number: ");
        String accountNumber = scanner.nextLine();  // Read user input

        int flagAccountNumber = 0;
        int flagNeighbourhood = 0;

        for (int i=0; i<data.size(); i++){
            if (((data.get(i)).getAccountNumber()).compareTo(accountNumber) == 0){
                System.out.println("Account number = " + data.get(i).getAccountNumber());
                System.out.println("Address = " + data.get(i).getHouseNumber() + " "+ data.get(i).getStreetName());
                    
                int intassessed = Integer.parseInt(data.get(i).getAssessed());
    
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                String assessedMoney = formatter.format(intassessed);
    
                System.out.println("Assessed value = " + assessedMoney);
    
                System.out.println("Assessment class = [" + data.get(i).getAssessmentClass1() + " " +
                data.get(i).getAssessmentClassper1() + "%, " + data.get(i).getAssessmentClass2() + " " +
                data.get(i).getAssessmentClassper2() + "%, " +data.get(i).getAssessmentClass3() + " " +
                data.get(i).getAssessmentClassper3() + "%]");
    
                System.out.println("Neighbourhood = " + data.get(i).getNeighbourhood() + " (" + 
                data.get(i).getWard() + ")");
    
                System.out.println("Location = ("+ data.get(i).getLatitude() + ", " +
                data.get(i).getLongitude() + ")");
                flagAccountNumber += 1;
            }
        }
        if (flagAccountNumber == 0){
            System.out.println("Error: invalid account number...");
            System.out.println("Sorry, account number not found");
        }

        System.out.print("\nNeighbourhood: ");
        String neighbourhood = scanner.nextLine();

        List<PropertyAssessment> neighbourhoodList = new ArrayList<>();

        for (int j=0; j<data.size(); j++){
            if (data.get(j).getNeighbourhood().compareTo(neighbourhood.toUpperCase()) == 0){
                neighbourhoodList.add(data.get(j));
                flagNeighbourhood += 1;
            }
        }
        if (flagNeighbourhood == 0){
            System.out.println("Data not found");
        }
        else{
            System.out.println("Statistics (neighbourhood = "+ neighbourhood + ")");
            PropertyAssessments.PropertyAssessmentsStatistic(neighbourhoodList, neighbourhoodList.size());
        }
        scanner.close();
    }
        
}
