package ex7;

import java.util.Locale;

/**
 * Exercise 7: a simplified UIT student with three overloaded constructors.
 */
public class UITStudent {

    private String studentId;
    private String fullName;
    private String major;
    private double gpa;                        // 10-point scale

    // 1) No arguments: placeholder values.
    public UITStudent() {
        this("N/A", "Unknown");
    }

    // 2) Student ID and full name only: major not chosen yet, GPA 0.
    public UITStudent(String studentId, String fullName) {
        this(studentId, fullName, "Undeclared", 0.0);
    }

    // 3) Full information. This is the only constructor that assigns the fields,
    //    the other two call it with this(...). GPA outside [0, 10] is set to 0.
    public UITStudent(String studentId, String fullName, String major, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
        this.gpa = (gpa >= 0 && gpa <= 10) ? gpa : 0.0;
    }

    // A student passes when GPA >= 5.0.
    public boolean isPassed() {
        return gpa >= 5.0;
    }

    // Classification on the 10-point scale used at UIT.
    public String academicClassification() {
        if (gpa >= 9.0) {
            return "Excellent";
        } else if (gpa >= 8.0) {
            return "Very Good";
        } else if (gpa >= 7.0) {
            return "Good";
        } else if (gpa >= 5.0) {
            return "Average";
        } else if (gpa >= 4.0) {
            return "Weak";
        } else {
            return "Poor";
        }
    }

    public void displayInfo() {
        System.out.println(String.format(Locale.US, "%-8s | %-18s | %-22s | GPA %5.2f | %-6s | %s",
                studentId, fullName, major, gpa, isPassed() ? "Passed" : "Failed", academicClassification()));
    }
}
