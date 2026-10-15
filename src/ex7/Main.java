package ex7;

public class Main {
    public static void main(String[] args) {
        // constructor 1: no arguments
        UITStudent s1 = new UITStudent();
        // constructor 2: student ID and full name
        UITStudent s2 = new UITStudent("23520001", "Tran Van An");
        // constructor 3: full information
        UITStudent s3 = new UITStudent("23520002", "Le Thi Binh",
                "Software Engineering", 9.2);
        UITStudent s4 = new UITStudent("23520003", "Pham Minh Chau",
                "Computer Science", 8.1);
        UITStudent s5 = new UITStudent("23520004", "Hoang Duc Dung",
                "Information Systems", 7.4);
        UITStudent s6 = new UITStudent("23520005", "Vo Thanh Em",
                "Data Science", 5.6);
        UITStudent s7 = new UITStudent("23520006", "Ngo Gia Huy",
                "Computer Engineering", 4.3);
        UITStudent s8 = new UITStudent("23520007", "Do Bao Khanh",
                "Network Security", 11.5);             // invalid GPA -> 0

        System.out.println("ID       | Full name          | Major                  "
                + "| GPA       | Result | Classification");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        s5.displayInfo();
        s6.displayInfo();
        s7.displayInfo();
        s8.displayInfo();

        System.out.println("s3 passed? " + s3.isPassed()
                + ", classification: " + s3.academicClassification());
        System.out.println("s7 passed? " + s7.isPassed()
                + ", classification: " + s7.academicClassification());
    }
}
