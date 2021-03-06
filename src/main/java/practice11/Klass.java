package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    protected int number;

    protected Student leader;

    private List<Student> students;

    private List<JoinClassListener> joinClassListeners;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList();
        this.joinClassListeners = new ArrayList();
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
        for(Student stu: students){
            if(stu.getId() == student.getId()){
                isStudentInClass = true;
                break;
            }
        }
        if(isStudentInClass){
            leader = student;
            for(JoinClassListener joinClassListener: joinClassListeners) {
                joinClassListener.updateLeader(leader);
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }


    public void appendMember(Student student) {
        students.add(student);
        for(JoinClassListener joinClassListener: joinClassListeners) {
            joinClassListener.updateStudent(student);
        }
    }

    public boolean isIn(Student student) {
        for(Student stu: students) {
            if(stu.getKlass().getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }

    public void registerJoinClassListener(JoinClassListener joinClassListener) {
        joinClassListeners.add(joinClassListener);
    }

}
