package practice08;

public class Teacher extends Person {

    protected Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String introduce = super.introduce();
        introduce += " I am a Teacher. ";
        if (klass != null) {
            introduce += "I teach Class " + klass.getNumber() + ".";
        } else {
            introduce += "I teach No Class.";
        }
        return introduce;
    }

    public String introduceWith(Student student) {
        String introduce = super.introduce() + " I am a Teacher. ";
        if (student.getKlass().getNumber() == klass.getNumber()) {
            introduce += "I teach " + student.getName() + ".";
        } else {
            introduce += "I don't teach Jerry.";
        }
        return introduce;
    }
}