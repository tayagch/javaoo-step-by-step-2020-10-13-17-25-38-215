package practice10;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> linkedList = new LinkedList<>();
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String classes = "";
        for (int index = 0; index < linkedList.size();index++){
            classes += linkedList.get(index).getNumber();
            if(!((linkedList.size() - index) == 1)){
                classes += ", ";
            }
        }
        return linkedList.size() != 0 ? super.introduce()+ " " + "I am a Teacher. I teach Class "+ classes +"." : super.introduce()+ " " + "I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(linkedList.contains(student.getKlass())){
            return String.format("My name is Tom. I am 21 years old. I am a Teacher. I teach %s.",student.getName());
        }else{
            return String.format("My name is Tom. I am 21 years old. I am a Teacher. I don't teach %s.",student.getName());
        }

    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        return linkedList.contains(student.getKlass());
    }
}
