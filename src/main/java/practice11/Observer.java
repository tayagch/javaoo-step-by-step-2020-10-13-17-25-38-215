package practice11;

public interface Observer {

    void notifyNewStudent(Student student, Klass klass);
    void notifyAssignLeader(Student student, Klass klass);

}
