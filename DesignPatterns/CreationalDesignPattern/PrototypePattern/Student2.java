public class Student2 implements Clone{
    int age;
    private int rollNumber;
    String name;

    Student2(int age, int rollNumber, String name){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public Student2 clone(){
        return new Student2(age, rollNumber, name);
    }
}