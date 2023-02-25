/* Name: Salah Mohamed
   Date: 06/02/23
   ID: 3044504
   Course: CMPT 305 Milestone 1
   Program: Program for client #1 to calculate the statistics of 
   the property assessments, and a specific neighbourhood statistics
 */

import java.text.NumberFormat;
import java.util.*;

//Reading the file to calculate the required statistics
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

        //Find the statistic of a specific account number
        System.out.print("\nFind a property assessment by account number: ");
        String accountNumber = scanner.nextLine();  // Read user input

        int flagAccountNumber = 0;
        int flagNeighbourhood = 0;

        for (int i=0; i<data.size(); i++){
            if (((data.get(i)).getAccountNumber()).compareTo(accountNumber) == 0){
                System.out.println("Account number = " + data.get(i).getAccountNumber());
                System.out.println("Address = " + data.get(i).getAddress());
                    
                int intassessed = Integer.parseInt(data.get(i).getAssessed());
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                String assessedMoney = formatter.format(intassessed);
    
                System.out.println("Assessed value = " + assessedMoney);
                System.out.println("Assessment class = "+ data.get(i).getAssessmentClass());
                System.out.println("Neighbourhood = " + data.get(i).getNeighbourhood() + ")");
                System.out.println("Location = "+ data.get(i).getLocation());
                flagAccountNumber += 1;
            }
        }
        //If account number doesn't exist
        if (flagAccountNumber == 0){
            System.out.println("Error: invalid account number...");
            System.out.println("Sorry, account number not found");
        }

        //Find the statistics of a specific neighbourhood
        System.out.print("\nNeighbourhood: ");
        String neighbourhoodName = scanner.nextLine();

        //Put all the neighbourhoods in an array list
        List<PropertyAssessment> neighbourhoodList = new ArrayList<>();

        for (int j=0; j<data.size(); j++){
            if (data.get(j).getNeighbourhoodName().compareTo(neighbourhoodName.toUpperCase()) == 0){
                neighbourhoodList.add(data.get(j));
                flagNeighbourhood += 1;
            }
        }
        //If neighbourhood doesn't exist
        if (flagNeighbourhood == 0){
            System.out.println("Data not found");
        }
        else{
            System.out.println("Statistics (neighbourhood = "+ neighbourhoodName + ")");
            PropertyAssessments.PropertyAssessmentsStatistic(neighbourhoodList, neighbourhoodList.size());
        }
        scanner.close();
    }
        
}
