package practice08;

import java.util.Optional;

public class Student extends Person{
    private Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return Optional.ofNullable(getKlass().getLeader())
                .map(leader -> super.introduce() + String.format(" I am a Student. I am Leader of %s.", klass.getDisplayName()))
                .orElse(super.introduce() + String.format(" I am a Student. I am at %s.", klass.getDisplayName()));

    }
}
