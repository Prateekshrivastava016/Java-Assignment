Input:
public class Person {
    private String name;
    private int age;
    private String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

    public static void main(String[] args) {
        Person person = new Person("Prateek", 28, "India");

        person.displayInfo();

        person.setName("Amit");
        person.setAge(30);
        person.setCountry("USA");

        System.out.println("\nUpdated Info:");
        person.displayInfo();
    }
}

Output:
Name: Prateek
Age: 28
Country: India

Updated Info:
Name: Amit
Age: 30
Country: USA
