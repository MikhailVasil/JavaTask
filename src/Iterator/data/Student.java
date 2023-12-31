package Iterator.data;

public class Student extends User
        implements Comparable<Student> {

    private int studentId;
    private int srBall;

    public Student(String firstName,
                   String secondName,
                   String lastName,
                   int studentid,
                   int srBall) {
        super(firstName, secondName, lastName);
        this.studentId = studentid;
        this.srBall = srBall;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getSrBall() {
        return srBall;
    }

    public void setSrBall(int srBall) {
        this.srBall = srBall;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", studentId=" + studentId +
                ", srBall=" + srBall +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.srBall==o.getSrBall())
            return 0;
        else if(this.srBall>o.getSrBall())
            return 1;
        return -1;
    }
}
