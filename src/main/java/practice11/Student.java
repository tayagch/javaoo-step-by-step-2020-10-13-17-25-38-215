package practice11;


public class Student extends Person{
    private Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(getKlass().getLeader() != null){
            return super.introduce() + " " +String.format("I am a Student. I am Leader of Class %s.",klass.getNumber());
        }else{
            return super.introduce() + " " +String.format("I am a Student. I am at Class %s.",klass.getNumber());
        }

    }
//
//    @Override
//    public void notifyNewStudent(Student student, Klass klass) {
//
//    }
//
//    @Override
//    public void notifyAssignLeader(Student student, Klass klass) {
//
//    }
}
