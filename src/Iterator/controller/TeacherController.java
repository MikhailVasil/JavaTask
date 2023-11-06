package Iterator.controller;

import Iterator.data.Teacher;
import Iterator.service.TeacherService;
import Iterator.view.TeacherView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    public TeacherService teacherService = new TeacherService();
    public TeacherView teacherView = new TeacherView();


    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teacherService.createTeacher(firstName, secondName, lastName);
        return teacher;
    }

    public void editTeacher(int teacherIndex, String newFirstName, String newSecondName, String newLastName) {
        teacherService.editTeacher(teacherIndex, newFirstName, newSecondName, newLastName);
    }

    public List<Teacher> getAllTeachers() {
        return teacherService.getTeacherList();
    }

    public void displayTeachers(List<Teacher> teacherList) {
        teacherView.sendOnconsole(teacherList);
    }
}