package practice11;


import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person implements AssignLeaderListener,JoinListener{
    private Klass klass;
    private LinkedList<Klass> linkedList = new LinkedList<>();

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
        linkedList.forEach(klass1 -> klass1.addTeacherListener(this));
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String classes = linkedList.stream().map(klass1 -> String.valueOf(klass1.getNumber())).collect(Collectors.joining(", "));
        return !linkedList.isEmpty() ? super.introduce()+ " " + "I am a Teacher. I teach Class "+ classes +"." : super.introduce()+ " " + "I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(linkedList.contains(student.getKlass())){
            return super.introduce() + String.format(" I am a Teacher. I teach %s.",student.getName());
        }else{
            return super.introduce() + String.format(" I am a Teacher. I don't teach %s.",student.getName());
        }
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        return linkedList.contains(student.getKlass());
    }

    @Override
    public void notifyAssignLeader(Student student, Klass klass) {
        System.out.print(String.format("I am Tom. I know %s become Leader of %s.\n",student.getName(),klass.getDisplayName()));
    }

    @Override
    public void notifyJoin(Student student, Klass klass) {
        System.out.print(String.format("I am Tom. I know %s has joined %s.\n",student.getName(),klass.getDisplayName()));
    }
}
