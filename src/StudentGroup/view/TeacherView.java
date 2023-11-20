package StudentGroup.view;

import StudentGroup.data.Teacher;

import java.util.List;

public class TeacherView{
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}