import java.io.Serializable;

public class Person implements Serializable {
    private int personID;
    private String personName;
    private String dateOfBirth;

    public Person(){

    }
    public Person(int personID, String personName, String dateOfBirth){
        this.personID = personID;
        this.personName = personName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPersonID(){
        return personID;
    }
    public String getPersonName(){
        return personName;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setPersonID(int personID){
        this.personID = personID;
    }
    public void setPersonName(String personName){
        this.personName = personName;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return personID + "; " + personName + "; " + dateOfBirth;
    }
}
