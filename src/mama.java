public class mama {
    String name;
    int age;
    mama(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void sayHello() {
        System.out.println("Hello World!");
    }
    void sayInfo() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
