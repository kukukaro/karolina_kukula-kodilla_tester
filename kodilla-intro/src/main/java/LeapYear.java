public class LeapYear {
    public static void main(String[] args) {
        int year = 350;
        System.out.println(isLeap(year));
        System.out.println(isLeap2(year));
    }

    public static boolean isLeap(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isLeap2(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}
