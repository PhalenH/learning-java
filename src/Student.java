public class Student {
    String firstName;
    String lastName;
    int graduation;
    double gpa;
    String major;

    public Student(String firstName, String lastName, int graduation,
                   double gpa, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduation = graduation;
        this.gpa = gpa;
        this.major = major;
    }
    public void fifthYear(){
       this.graduation = this.graduation + 1;
    }

    // function increment students graduation year by 1
}
