package Iterator;

import Iterator.controller.StudentGroupController;
import Iterator.controller.TeacherController;
import Iterator.data.Student;
import Iterator.data.StudentGroup;
import Iterator.data.StudentGroupIterator;
import Iterator.data.Teacher;
import Iterator.service.TeacherService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        StudentGroupController controller = new StudentGroupController();
//        Student student3 = controller.create("1", "1", "1");
//        Student student2 = controller.create("2", "2", "2");
//        Student student1 = controller.create("3", "3", "3");
//        System.out.println(student1.compareTo(student2));
//        List<Student> studentList = List.of(new Student[]{student1,student2,student3});
//        controller.createStudentGroup(studentList);
//        controller.print();
//        controller.print(controller.sortedStudentGroupByFIO());
//        StudentGroup studentGroup = new StudentGroup(studentList);

        TeacherController teacherController = new TeacherController();
        teacherController.create("1","1","1");
        teacherController.create("2","2","2");
        teacherController.create("3","3","3");
        TeacherService teacherService = new TeacherService();
        //System.out.println(teacherService.getTeacherList());


//        List<Teacher> teacherList = teacherController.getAllTeachers();
//
//        teacherController.editTeacher(1,"4","4","4");
//        teacherController.displayTeachers(teacherList);

    }
}
