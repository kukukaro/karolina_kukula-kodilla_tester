public class User {
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void showNameBelowAverageAge(User[] users){
        if (users.length == 0) {
            System.out.println("Your array is empty.");
            return ;
        }
        double averageAge = 0 ;
        for (int i = 0 ; i < users.length ; i++){
            averageAge += users[i].age ;
        }

        averageAge /= users.length;

        for (int i = 0 ; i < users.length ; i++){
            if (users[i].age < averageAge){
                System.out.println(users[i].name);
            }
        }
    }

    public static void main(String[] args) {
        User[] users = new User[]{
            new User("Jarek", 72),
            new User("Mateusz", 42),
            new User("Matylda", 36),
            new User("Jan", 49),
            new User("Adam", 19),
            new User("Klaudia", 15),
            new User("Monika", 45),
            new User("Aurelia", 98),
        };

        User[] userEmpty = new User[0];

    showNameBelowAverageAge(users);
    showNameBelowAverageAge(userEmpty);


    }
}
