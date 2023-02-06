/* Name: Salah Mohamed
   Date: 23/02/01
   ID: 3044504
   Course: CMPT 305 Milestone 1
   Program: Property Assessment class
 */

import java.lang.String;

/*This implements a class design PropertyAssessment that represents 
  a single property assessment and implements the Comparable 
  interface by assessed value */
public class PropertyAssessment implements Comparable<PropertyAssessment> {
    private String accountNumber;
    private String suite;
    private String houseNumber;
    private String streetName;
    private String garage;
    private String neighbourhoodID;
    private String neighbourhood;
    private String ward;
    private String assessed;
    private String latitude;
    private String longitude;
    private String pointLocation;
    private String assessmentClassper1;
    private String assessmentClassper2;
    private String assessmentClassper3;
    private String assessmentClass1;
    private String assessmentClass2;
    private String assessmentClass3;

    /*Build and instance of the class PropertyAssessment so we dont
      add the parameters initially*/
    public PropertyAssessment(){
    }

    /*Constructor is used to initialize the object */
    public PropertyAssessment(String accountNumber, String suite, String houseNumber, String streetName, 
    String garage, String neighbourhoodID, String neighbourhood, String ward, String assessed, String latitude, String longitude,
    String pointLocation, String assessmentClassper1, String assessmentClassper2, String assessmentClassper3, String assessmentClass1,
    String assessmentClass2, String assessmentClass3){
        this.suite = suite;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.accountNumber = accountNumber;
        this.garage = garage;
        this.neighbourhoodID = neighbourhoodID;
        this.neighbourhood = neighbourhood;
        this.assessed = assessed;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ward = ward;
        this.assessmentClassper1 = assessmentClassper1;
        this.assessmentClassper2 = assessmentClassper2;
        this.assessmentClassper3 = assessmentClassper3;
        this.assessmentClass1 = assessmentClass1;
        this.assessmentClass2 = assessmentClass2;
        this.assessmentClass3 = assessmentClass3;
    }

    /*Set methods to access the value of the private variable */
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setSuite(String suite){
        this.suite = suite;
    }
    public void setHouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    public void setNeighbourhoodID(String neighbourhoodID){
        this.neighbourhoodID = neighbourhoodID;
    }
    public void setNeighbourhood(String neighbourhood){
        this.neighbourhood = neighbourhood;
    }
    public void setAssessed(String assessed){
        this.assessed = assessed;
    }
    public void setLatitude(String latitude){
        this.latitude = latitude;
    }
    public void setLongitude(String longitude){
        this.longitude = longitude;
    }
    public void setGarage(String garage){
        this.garage = garage;
    }
    public void setWard(String ward){
        this.ward = ward;
    }
    public void setPointLocation(String pointLocation){
        this.pointLocation = pointLocation;
    }
    public void setAssessmentClassper1(String assessmentClassper1){
        this.assessmentClassper1 = assessmentClassper1;
    }
    public void setAssessmentClassper2(String assessmentClassper2){
        this.assessmentClassper2 = assessmentClassper2;
    }
    public void setAssessmentClassper3(String assessmentClassper3){
        this.assessmentClassper3 = assessmentClassper3;
    }
    public void setAssessmentClass1(String assessmentClass1){
        this.assessmentClass1 = assessmentClass1;
    }
    public void setAssessmentClass2(String assessmentClass2){
        this.assessmentClass2 = assessmentClass2;
    }
    public void setAssessmentClass3(String assessmentClass3){
        this.assessmentClass3 = assessmentClass3;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getSuite(){
        return this.suite;
    } 
    public String getHouseNumber(){
        return this.houseNumber;
    }
    public String getStreetName(){
        return this.streetName;
    }
    public String getNeighbourhoodID(){
        return this.neighbourhoodID;
    }
    public String getNeighbourhood(){
        return this.neighbourhood;
    }
    public String getAssessed(){
        return this.assessed;
    }
    public String getLatitude(){
        return this.latitude;
    }
    public String getLongitude(){
        return this.longitude;
    }
    public String getGarage(){
        return this.garage;
    }
    public String getWard(){
        return this.ward;
    }
    public String getPointLocation(){
        return this.pointLocation;
    }
    public String getAssessmentClassper1(){
        return this.assessmentClassper1;
    }
    public String getAssessmentClassper2(){
        return this.assessmentClassper2;
    }
    public String getAssessmentClassper3(){
        return this.assessmentClassper3;
    }
    public String getAssessmentClass1(){
        return this.assessmentClass1;
    }
    public String getAssessmentClass2(){
        return this.assessmentClass2;
    }
    public String getAssessmentClass3(){
        return this.assessmentClass3;
    }

    /*Override toString, equals, hashCode, and compareTo methods */
    @Override
    public String toString() {
        return "PropertyAssessment [suite=" + suite + ", houseNumber=" + houseNumber + ", streetName=" + streetName
                + ", accountNumber=" + accountNumber + ", garage=" + garage + ", neighbourhoodID=" + neighbourhoodID
                + ", neighbourhood=" + neighbourhood + ", assessed=" + assessed + ", latitude=" + latitude
                + ", longitude=" + longitude + ", ward=" + ward + ", assessmentClassper1=" + assessmentClassper1
                + ", assessmentClassper2=" + assessmentClassper2 + ", assessmentClassper3=" + assessmentClassper3
                + ", assessmentClass1=" + assessmentClass1 + ", assessmentClass2=" + assessmentClass2
                + ", assessmentClass3=" + assessmentClass3 + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((suite == null) ? 0 : suite.hashCode());
        result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
        result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
        result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
        result = prime * result + ((garage == null) ? 0 : garage.hashCode());
        result = prime * result + ((neighbourhoodID == null) ? 0 : neighbourhoodID.hashCode());
        result = prime * result + ((neighbourhood == null) ? 0 : neighbourhood.hashCode());
        result = prime * result + ((assessed == null) ? 0 : assessed.hashCode());
        result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
        result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
        result = prime * result + ((ward == null) ? 0 : ward.hashCode());
        result = prime * result + ((assessmentClassper1 == null) ? 0 : assessmentClassper1.hashCode());
        result = prime * result + ((assessmentClassper2 == null) ? 0 : assessmentClassper2.hashCode());
        result = prime * result + ((assessmentClassper3 == null) ? 0 : assessmentClassper3.hashCode());
        result = prime * result + ((assessmentClass1 == null) ? 0 : assessmentClass1.hashCode());
        result = prime * result + ((assessmentClass2 == null) ? 0 : assessmentClass2.hashCode());
        result = prime * result + ((assessmentClass3 == null) ? 0 : assessmentClass3.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PropertyAssessment other = (PropertyAssessment) obj;
        if (suite == null) {
            if (other.suite != null)
                return false;
        } else if (!suite.equals(other.suite))
            return false;
        if (houseNumber == null) {
            if (other.houseNumber != null)
                return false;
        } else if (!houseNumber.equals(other.houseNumber))
            return false;
        if (streetName == null) {
            if (other.streetName != null)
                return false;
        } else if (!streetName.equals(other.streetName))
            return false;
        if (accountNumber == null) {
            if (other.accountNumber != null)
                return false;
        } else if (!accountNumber.equals(other.accountNumber))
            return false;
        if (garage == null) {
            if (other.garage != null)
                return false;
        } else if (!garage.equals(other.garage))
            return false;
        if (neighbourhoodID == null) {
            if (other.neighbourhoodID != null)
                return false;
        } else if (!neighbourhoodID.equals(other.neighbourhoodID))
            return false;
        if (neighbourhood == null) {
            if (other.neighbourhood != null)
                return false;
        } else if (!neighbourhood.equals(other.neighbourhood))
            return false;
        if (assessed == null) {
            if (other.assessed != null)
                return false;
        } else if (!assessed.equals(other.assessed))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!latitude.equals(other.latitude))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!longitude.equals(other.longitude))
            return false;
        if (ward == null) {
            if (other.ward != null)
                return false;
        } else if (!ward.equals(other.ward))
            return false;
        if (assessmentClassper1 == null) {
            if (other.assessmentClassper1 != null)
                return false;
        } else if (!assessmentClassper1.equals(other.assessmentClassper1))
            return false;
        if (assessmentClassper2 == null) {
            if (other.assessmentClassper2 != null)
                return false;
        } else if (!assessmentClassper2.equals(other.assessmentClassper2))
            return false;
        if (assessmentClassper3 == null) {
            if (other.assessmentClassper3 != null)
                return false;
        } else if (!assessmentClassper3.equals(other.assessmentClassper3))
            return false;
        if (assessmentClass1 == null) {
            if (other.assessmentClass1 != null)
                return false;
        } else if (!assessmentClass1.equals(other.assessmentClass1))
            return false;
        if (assessmentClass2 == null) {
            if (other.assessmentClass2 != null)
                return false;
        } else if (!assessmentClass2.equals(other.assessmentClass2))
            return false;
        if (assessmentClass3 == null) {
            if (other.assessmentClass3 != null)
                return false;
        } else if (!assessmentClass3.equals(other.assessmentClass3))
            return false;
        return true;
    }
    @Override
    public int compareTo(PropertyAssessment assessment) {
         if (assessment == null){
            throw new NullPointerException("Assessment can't be null");
        }
        if (Integer.parseInt(this.assessed) == Integer.parseInt(assessment.assessed)){
            return 0;
        }
        else if (Integer.parseInt(this.assessed) - Integer.parseInt(assessment.assessed) > 0){
            return 1;
        }
        else{
            return -1;
        }
    }
}
