//Clone should be a part of class and not the client.
//Clients have to not worry about all the properties and arguments required to clone.
public class PrototypePatternDemo {
    public static void main(String args[]){
        Student2 student = new Student2(22, 53, "Abhishek");
        Student2 studentClone = student.clone();
        System.out.println(studentClone.name);
    }
}
