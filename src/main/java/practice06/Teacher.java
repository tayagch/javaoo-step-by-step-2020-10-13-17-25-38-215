package practice06;

import java.util.Optional;

public class Teacher extends Person{

    private int klass;

    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return klass != 0 ? super.introduce()+ " " + "I am a Teacher. I teach Class 2." : super.introduce()+ " " + "I am a Teacher. I teach No Class.";
    }
}
