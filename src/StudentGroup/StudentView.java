package StudentGroup;

import java.util.List;

public class StudentView{
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}