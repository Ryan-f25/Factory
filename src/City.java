public class City {
    int pop;
    String continent;
    String name;
    int avetemp;

    public City()
    {
        name="Boston";
        pop = 1000;
        continent = "Idaho";
        avetemp = 60;
        print();
    }

    public void print()
    {
        System.out.println("the City, " + name + ", in " + continent);
        System.out.println("with an average temp of " + avetemp + " and a population of " + pop + " people,");
        System.out.println("is a tourist trap");

    }
}
