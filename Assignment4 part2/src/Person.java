public class Person
{
    private String name;
    private int age;

    public Person() {
        name = "";
        age = 0;
    }

    public Person(String s, int i)
    {
        name = new String(s);
        age = i;
    }

    public Person(Person p)
    {
        this.name = p.name;
        this.age = p.age;
    }

    public String getName() {
        return name;
    }

    public int getAge()  {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString()
    {
        return ("Name: " + name + " Age: " + age);
    }
}


