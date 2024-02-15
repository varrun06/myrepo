package Examples;
//Instance methods

public class Person {
    
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

  
    public void celebrateBirthday() {
        age++;
        System.out.println("Happy birthday! Now I am " + age + " years old.");
    }

    public static void main(String[] args) {
        
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        
        person1.greet();  
        person2.greet();  

        person1.celebrateBirthday();  
        person2.celebrateBirthday();  
    }
}

