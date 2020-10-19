package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader;
    private List<Student> members;

    public Klass(int klass) {
        this.klass = klass;
        this.members = new ArrayList<>();
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

    public void assignLeader(Student leader) {
        if(members.contains(leader)){
            this.leader = leader;
        }else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student member) {
        members.add(member);
    }
}
