public class MyGrades {
    public static void main(String[] args) {
        Grades karolinaGrades = new Grades();

        karolinaGrades.Add(5);
        System.out.println("Dodana ocena to:\t" + karolinaGrades.returnLastValue());
        karolinaGrades.Add(4);
        System.out.println("Dodana ocena to:\t" + karolinaGrades.returnLastValue());
        karolinaGrades.Add(3);
        System.out.println("Dodana ocena to:\t" + karolinaGrades.returnLastValue());

        System.out.println("Średnia ocen wynosi:\t" + karolinaGrades.returnAverageOfValues());
    }
}
