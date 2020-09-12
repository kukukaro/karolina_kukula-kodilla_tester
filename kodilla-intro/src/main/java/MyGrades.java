public class MyGrades {
    public static void main(String[] args) {
        Grades karolinaGrades = new Grades();
        Grades arekGrades = new Grades();

        karolinaGrades.add(5);
        System.out.println("Dodana ocena to:\t" + karolinaGrades.returnLastValue());
        karolinaGrades.add(4);
        System.out.println("Dodana ocena to:\t" + karolinaGrades.returnLastValue());
        karolinaGrades.add(3);
        System.out.println("Dodana ocena to:\t" + karolinaGrades.returnLastValue());

        System.out.println("Średnia ocen wynosi:\t" + karolinaGrades.returnAverageOfValues());

        arekGrades.add(-5); // Metoda pozwala na wprowadzanie ocen ujemnych
        System.out.println("Dodana ocena to:\t" + arekGrades.returnLastValue());
    }
}
