public class Student {
    int age;
    int grade;
    String name;
    boolean isboarder;
    String sports;

    public void print()
    {
        System.out.println("the student " + name + " is " + age + " years old");
        System.out.println("they are in class " + grade );
        System.out.println("it is " + isboarder + " that they are a boarder");
    }

    public void printsport()
    {
        System.out.println(name + " is a " + sports + " player");
    }
}
