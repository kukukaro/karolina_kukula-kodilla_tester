package modul2;

public class Grades {
    private int [] grades;
    private int size;

    public Grades(){
        this.grades = new int [10];
        this.size = 0;
    }

    public void add(int value){
        if (size == 10){
            return;
        }
        grades[size] = value;
        size++;
    }

    public int returnLastValue(){
        if(size == 0){
            return 0;
        }
        return grades[size-1];
    }

    public double returnAverageOfValues(){
        if (size == 0) return 0;

        double sumOfValue = 0;
        for (int i = 0 ; i < size ; i++){
            sumOfValue += grades[i];
        }
        return sumOfValue/size;
    }

}
