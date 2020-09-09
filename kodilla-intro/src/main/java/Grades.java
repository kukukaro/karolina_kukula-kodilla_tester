public class Grades {
    private int [] grades;
    private int size;

    public Grades(){
        this.grades = new int [10];
        this.size = 0;
    }

    public void Add(int value){
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        size++;
    }

    public int returnLastValue(){
        return this.grades[this.size-1];
    }

    public double returnAverageOfValues(){
        if (this.size == 0) return 0;
        if (this.size == 1) return this.grades[this.size];

        double sumOfValue = 0;
        for (int i = 0 ; i < this.size ; i++){
            sumOfValue += this.grades[i];
        }
        return sumOfValue/this.size;
    }

}
