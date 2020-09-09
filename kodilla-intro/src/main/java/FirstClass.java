public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 5000, 2019);
        notebook.printParameters();
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkParameters();
        System.out.println();

        Notebook heavyNotebook = new Notebook(2000, 500, 2015);
        heavyNotebook.printParameters();
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkParameters();
        System.out.println();

        Notebook oldNotebook = new Notebook(1200, 1500, 2015);
        oldNotebook.printParameters();
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkParameters();
        System.out.println();

        Notebook notebook1 = new Notebook(1800, 2100, 2018);
        notebook1.printParameters();
        notebook1.checkPrice();
        notebook1.checkWeight();
        notebook1.checkParameters();
        System.out.println();

        Notebook notebook2 = new Notebook(2100, 1749, 2017);
        notebook2.printParameters();
        notebook2.checkPrice();
        notebook2.checkWeight();
        notebook2.checkParameters();
        System.out.println();

        Notebook notebook3 = new Notebook(3000, 1400, 2014);
        notebook3.printParameters();
        notebook3.checkParameters();
        System.out.println();
    }
}
