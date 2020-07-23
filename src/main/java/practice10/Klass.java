package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    protected int number;

    protected Student leader;

    private List<Student> students;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList();
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        boolean isStudentInClass = false;
        for (Student stu : students) {
            if (stu.getId() == student.getId()) {
                isStudentInClass = true;
                break;
            }
        }
        if (isStudentInClass) {
            leader = student;
        } else {
            System.out.println("It is not one of us.");
        }


    }

    public void appendMember(Student student) {
        students.add(student);
    }

    public boolean isIn(Student student) {
        for (Student stu : students) {
            if (stu.getKlass().getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }
}
