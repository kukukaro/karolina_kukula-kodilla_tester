package fizzbuzz;

public class FizzBuzzChecker {

    public String checkIfIsFizzBuzz(int number) {

        if (isFizz(number)) {
            if (isBuzz(number)) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        }
        if (isBuzz(number)) {
            return "Buzz";
        } else {
            return "Nope";
        }


    }
        public static boolean isFizz (int number){
            if (number % 3 == 0)
                return true;

            return false;

        }

        public static boolean isBuzz (int number){
            if (number % 5 == 0)
                return true;
            return false;
        }

}
