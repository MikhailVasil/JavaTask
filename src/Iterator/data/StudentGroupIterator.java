package Iterator.data;

import Iterator.data.Student;
import Iterator.data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int count;
    private List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < studentList.size();
    }

    @Override
    public Student next() {
        if(!hasNext())
            return null;
//        if (studentList.get(count).getSecondName().equals("2")) {
//            count++;
//            return next();
        return studentList.get(count++);
    }

    @Override
    public void remove() {
        studentList.remove(count);
    }
}
