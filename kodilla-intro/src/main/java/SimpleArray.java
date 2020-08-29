public class SimpleArray {
    public static void main(String[] args) {
        String[] cats= new String[5];
        cats[0] = "Moki";
        cats[1] = "Mizia";
        cats[2] = "Zyzia";
        cats[3] = "Hyzia";
        cats[4] = "Misia";

        String cat = cats[3];
        System.out.println(cat);

        System.out.println("Moja tablica z zawiera " + cats.length + " elementów.");
    }
}
