public class Notebook2 {

    String weightInGrams ;
    int price;
    int year;

    public Notebook2(String weightInGrams, int price, int year) {
        this.weightInGrams = weightInGrams;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is very expensive.");
        } else {
            System.out.printf("The price is good.");
        }
    }

    public void checkWeight(){
        weightInGrams = weightInGrams.substring(0,weightInGrams.length()-1);
        int weightInGrams2 = Integer.parseInt(weightInGrams);
        System.out.println(weightInGrams2);
        if (weightInGrams2 < 1000){
            System.out.println("This notebook is light.");
        } else if (weightInGrams2 > 2500){
            System.out.println("This notebook is heavy.");
        } else{
            System.out.println("This notebook is not very heavy");
        }
    }


    /*public void checkParameters(){
        if (this.year > 2018 && this.weightInGrams < 1200) {
            System.out.println("Your notebook is really good! New and light!");
        } else if (this.year < 2016 && this.weightInGrams > 2500){
            System.out.println("You have pretty old and heavy stuff. Maybe it's good time to thinh about something new? :)");
        } else{
            System.out.println("You have really decent notebook.");
        }
    } */

    public void printParameters(){
        System.out.println("Weigh: " + this.weightInGrams + "\tPrice: " + this.price + "\tYear of production: " + this.year);
    }

    public static void main(String[] args) {
        Notebook2 note = new Notebook2("600g", 1500, 2200);
        Notebook2 note2 = new Notebook2("2500g", 1459, 2017);
        note.checkWeight();
        note2.checkWeight();
    }

}


