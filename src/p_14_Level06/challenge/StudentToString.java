package p_14_Level06.challenge;
public class StudentToString {
    String name;

    int age;

    String rollNumber;

    String house;

    public StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }
    @Override
    public String toString() {
        return "Student deatails: {name: " + name
                + ", age: " + age
                + ", rollNumber: " + rollNumber
                + ", house: " + house + " }";
    }
    public static void main(String[]args){
    StudentToString stu=new  StudentToString("Ankit",30,"444","jaipur");
    System.out.println(stu.toString());
    }
}