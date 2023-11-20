package StudentGroup;

import StudentGroup.controller.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1", "1", "1");
        controller.createStudent("2", "2", "2");
        controller.createStudent("3", "3", "3");
        controller.createTeacher("22","22","22");
        List<Integer> studentIdList = new ArrayList<>(Arrays.asList(0,1));
        controller.createStudentGroup(0,studentIdList );
        controller.printStudentGroup();
    }
}
