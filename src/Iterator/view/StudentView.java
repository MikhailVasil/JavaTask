package Iterator.view;

import Iterator.data.Student;
import Iterator.view.UserView;

import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnconsole(List<Student> list) {
        for (Student student : list){
            System.out.println(student);
        }
    }
}