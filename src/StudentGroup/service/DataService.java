package StudentGroup.service;

import StudentGroup.data.Student;
import StudentGroup.data.Teacher;
import StudentGroup.data.Type;
import StudentGroup.data.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> userList =new ArrayList<>();
    public void create(Type type, String firstName, String secondName, String lastName){
        Integer id = getFreeId(type);
        if (type == Type.STUDENT) {
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }
    public User getUserById(Type type, Integer id){
        boolean isTeacher = type == Type.TEACHER;
        for (User user:userList) {
            if (isTeacher && user instanceof Teacher && ((Teacher)user).getTeacherId() == id){
                return user;
            }
            if (!isTeacher && user instanceof Student && ((Student)user).getStudentId() == id){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userList;
    }
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        for (User user:userList) {
            if (user instanceof Student){
                students.add((Student) user);
            }
        }
        return students;
    }
    public List<Teacher> getAllTeachers(){
        List<Teacher> teachers = new ArrayList<>();
        for (User user:userList) {
            if (user instanceof Teacher){
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }
//    private Integer getFreeId(Type type){
//        Integer maxId = 0;
//        Integer currentId = 0;
//        boolean isTeacher = type == Type.TEACHER;
//        for (User user: userList) {
//            if (isTeacher && user instanceof Teacher) {
//                currentId = ((Teacher) user).getTeacherId();
//            }
//            if (!isTeacher && user instanceof Student) {
//                currentId = ((Student) user).getStudentId();
//            }
//            if (maxId < currentId) {
//                maxId = currentId;
//            }
//        }
//        return maxId + 1;
private int getFreeId(Type type) {
        boolean itsStudent = type == Type.STUDENT;
        for (User user : userList) {
            //User user1 = user;
            if (user instanceof Student && itsStudent) {
                return ((Student) user).getStudentId() + 1;
            } else if (user instanceof Teacher && !itsStudent) {
                return ((Teacher) user).getTeacherId();
            }
        }
        return 0;
    }
}