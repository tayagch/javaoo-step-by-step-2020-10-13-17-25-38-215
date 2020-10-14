package practice08;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return klass != null ? super.introduce()+ " " + "I am a Teacher. I teach Class 2." : super.introduce()+ " " + "I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(klass.getNumber() == student.getKlass().getNumber()){
            return String.format("My name is Tom. I am 21 years old. I am a Teacher. I teach %s.",student.getName());
        }else{
            return String.format("My name is Tom. I am 21 years old. I am a Teacher. I don't teach %s.",student.getName());
        }

    }
}
