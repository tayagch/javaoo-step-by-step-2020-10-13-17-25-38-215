package practice11;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader;
    private List<Student> members = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return String.format("Class %s",klass);
    }

    public Student getLeader() {
        return leader;
    }

    public void addTeacherListener(Teacher teacher){
        teachers.add(teacher);
    }

    public void assignLeader(Student leader) {
        if(members.contains(leader)){
            this.leader = leader;
            teachers.forEach(listener -> listener.notifyAssignLeader(leader,this));
        }else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student member) {
        members.add(member);
        teachers.forEach(listeners -> listeners.notifyJoin(member, this));
    }


}
