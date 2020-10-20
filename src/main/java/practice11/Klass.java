package practice11;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader;
    private List<Student> members = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

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

    public void addObservers(Observer observer){
        observers.add(observer);
    }

    public void assignLeader(Student leader) {
        if(members.contains(leader)){
            this.leader = leader;
            // this will iterate the observers list and notify all the observers
            observers.forEach(observer -> observer.notifyAssignLeader(leader,this));
        }else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student member) {
        members.add(member);
        // this will iterate the observers list and notify all the observers
        observers.forEach(observer -> observer.notifyNewStudent(member,this));
    }
}
