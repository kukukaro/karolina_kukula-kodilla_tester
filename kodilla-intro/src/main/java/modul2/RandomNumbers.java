package modul2;

import java.util.Random;

public class RandomNumbers {
    int min = 30 ;
    int max = 0;


    public void getRandomNumberInRange(){
        int sum = 0 ;
        Random generator = new Random();

        while (sum <= 500){
            int value =  generator.nextInt(31);
            min = Math.min(min, value);
            max = Math.max(max, value);
            sum += value ;
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers random = new RandomNumbers();
        random.getRandomNumberInRange();
        System.out.println("Minimalna wylosowana liczba to: " + random.getMin());
        System.out.println("Maksymalna wylosowana liczba to: " + random.getMax());
    }
}
