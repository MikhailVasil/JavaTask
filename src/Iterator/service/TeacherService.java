package Iterator.service;

import Iterator.data.Teacher;
import Iterator.data.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private final List<Teacher> teacherList = new ArrayList<>();

    public void createTeacher(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teacherList.add(teacher);
    }


    public void editTeacher(int index, String firstName, String secondName, String lastName) {
        if (index >= 0 && index < teacherList.size()) {
            Teacher teacher = teacherList.get(index);
            teacher.setFirstName(firstName);
            teacher.setSecondName(secondName);
            teacher.setLastName(lastName);
        }
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Teacher> getSortedListTeacherByFIO() {
        List<Teacher> sortedTeachers = new ArrayList<>(teacherList);
        sortedTeachers.sort(new UserComparator());
        return sortedTeachers;
    }
}