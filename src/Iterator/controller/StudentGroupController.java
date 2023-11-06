package Iterator.controller;

import Iterator.service.StudentGroupService;
import Iterator.view.StudentGroupView;
import Iterator.data.Student;

import java.util.List;

public class StudentGroupController implements UserController<Student> {
    StudentGroupService studentGroupService = new StudentGroupService();
    StudentGroupView studentGroupView = new StudentGroupView();

    public void createStudentGroup(List<Student> studentList){
        studentGroupService.createGroup(studentList);
    }

    public List<Student> sortedStudentGroupBySrBall(){
        return studentGroupService.getSortedStudentGroupBySRBall();
    }

    public List<Student> sortedStudentGroupByFIO(){
        return studentGroupService.getSortedStudentGroupByFIO();
    }
    public void print(){
        studentGroupView.printStudentGroup(studentGroupService.getListStudent());
    }

    public void print(List<Student> list){
        studentGroupView.printStudentGroup(list);
    }

    @Override
    public Student create(String firstName, String secondName, String lastName) {
        return studentGroupService.createStudent(firstName, secondName, lastName);
    }
}
