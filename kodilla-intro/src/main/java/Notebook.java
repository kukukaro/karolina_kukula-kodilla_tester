public class Notebook {
    int weightInGrams;
    int price;
    int year;

    public Notebook(int weightInGrams, int price, int year) {
        this.weightInGrams = weightInGrams;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (price > 1000) {
            System.out.println("This notebook is very expensive.");
        } else {
            System.out.println("The price is good.");
        }
    }

    public void checkWeight(){
        if (weightInGrams < 1000){
            System.out.println("This notebook is light.");
        } else if (weightInGrams > 2500){
            System.out.println("This notebook is heavy.");
        } else{
            System.out.println("This notebbok is not very heavy");
        }
    }

    public void checkParameters(){
        if (year > 2018 && weightInGrams < 1200) {
            System.out.println("Your notebook is really good! New and light!");
        } else if (year < 2016 && weightInGrams > 2500){
            System.out.println("You have pretty old and heavy stuff. Maybe it's good time to thinh about something new? :)");
        } else{
            System.out.println("You have really decent notebook.");
        }
    }

    public void printParameters(){
        System.out.println("Weigh: " + weightInGrams + "\tPrice: " + price + "\tYear of production: " + year);
    }



}
