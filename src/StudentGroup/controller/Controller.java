package StudentGroup.controller;

import StudentGroup.data.Student;
import StudentGroup.data.Teacher;
import StudentGroup.data.Type;
import StudentGroup.service.DataService;
import StudentGroup.service.StudentGroupService;
import StudentGroup.view.StudentGroupView;
import StudentGroup.view.StudentView;
import StudentGroup.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudentGroupView studentGroupView = new StudentGroupView();
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(Type.STUDENT,firstName,secondName,lastName);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(Type.TEACHER,firstName,secondName,lastName);
    }
    public void getAllStudents(){
        studentView.sendOnConsole(dataService.getAllStudents());
    }
    public void getAllTeachers(){
        teacherView.sendOnConsole(dataService.getAllTeachers());
    }
    public void createStudentGroup(Integer teacherId, List<Integer> studentIdList){
        Teacher teacher = (Teacher) dataService.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id:studentIdList) {
            studentList.add((Student) dataService.getUserById(Type.STUDENT, id));
        }
        studentGroupService.createStudentGroup(teacher,studentList);
    }
    public void printStudentGroup(){
        studentGroupView.sendOnConsole(studentGroupService.getStudentGroup());
    }
}