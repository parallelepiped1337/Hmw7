public class Person {

    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        
    }

    public void setProfession(String profession) {
        this.profession = profession;
        
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
        
    }
    
}

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        System.out.println("Інформація про осіб:");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        person1.setProfession("Архітектор");
        System.out.println("\n(Після оновлення професії)");
        person1.displayInfo();

        person1.setProfession("Дизайнер");
        System.out.println("\n(Після другого оновлення професії)");
        person1.displayInfo();
        
    }
    
}
