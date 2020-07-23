package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

    protected Klass klass;

    protected LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        String introduce = super.introduce() + " I am a Teacher. ";
        if (classes.size() > 0) {
            introduce += "I teach Class " + formatClassesOutput(classes) + ".";
        } else {
            introduce += "I teach No Class.";
        }
        return introduce;
    }

    public String introduceWith(Student student) {
        String introduce = super.introduce() + " I am a Teacher. ";
        if (isTeaching(student)) {
            introduce += "I teach " + student.getName() + ".";
        } else {
            introduce += "I don't teach Jerry.";
        }
        return introduce;
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    private String formatClassesOutput(LinkedList<Klass> classes) {
        String classesString = "";
        for (Klass klass : classes) {
            classesString += klass.getNumber() + ", ";
        }
        return classesString.substring(0, classesString.length() - 2);
    }
}