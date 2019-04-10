package practice03;

public class Person {
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    Person(String name , int age){
        this.age = age;
        this.name = name;
    }
    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }
}
