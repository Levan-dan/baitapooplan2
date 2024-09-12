import java.io.Serializable;

public class Student extends Person implements Serializable {
    private double markAvg;

    public Student(int personID, String personName, String dateOfBirth, double markAvg) {
        super(personID, personName, dateOfBirth);
        this.markAvg = markAvg;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    @Override
    public String toString() {
        return "Sinh vien : " + getPersonID() + "; " + getPersonName() + "; " + getDateOfBirth() + "; " + " co diem trung binh la : " + markAvg;
    }
}
