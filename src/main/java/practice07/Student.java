package practice07;

public class Student extends Person {

    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
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
        introduce += " I am a Student. I am at Class " + klass.getNumber() + ".";
        return introduce;
    }
}
