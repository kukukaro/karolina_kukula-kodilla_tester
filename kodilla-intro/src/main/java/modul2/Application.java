package modul2;

public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void printApplication() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

    public void checkAgeAndHeight(){
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 31 or lower than 161cm");
        }

    }

    public static void main(String[] args) {
        Application application1 = new Application("Adam", 40.5, 178);

        application1.printApplication();
        application1.checkAgeAndHeight();
    }

}
