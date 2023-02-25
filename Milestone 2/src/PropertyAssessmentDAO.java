import java.util.*;

// Interface for Property Assessment DAO
public interface PropertyAssessmentDAO {
    PropertyAssessment getByAccountNumber(int accountNumber);
    List<PropertyAssessment> getByNeighbourhood(String neighbourhood);
    //List<PropertyAssessment> getByAssessmentClass(String assessmentClass);
}
