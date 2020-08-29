public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        for( int i = 0; i < names.length ; i++){
            System.out.println(names[i]);
        }

        int[] arrayOneToTen = new int[10];
        for (int i = 1; i < arrayOneToTen.length ; i++){
            arrayOneToTen[i] = i;
        }

        System.out.println(returnArraySum(arrayOneToTen));

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static int returnArraySum(int[] array){

        int sum = 0;

        for( int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        return sum;
    }

}
