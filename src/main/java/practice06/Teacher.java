package practice06;

public class Teacher extends Person {

    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String introduce = super.introduce();
        introduce += " I am a Teacher. ";
        if(klass != null){
            introduce += "I teach Class " + klass + ".";
        } else {
            introduce += "I teach No Class.";
        }
        return introduce;
    }
}