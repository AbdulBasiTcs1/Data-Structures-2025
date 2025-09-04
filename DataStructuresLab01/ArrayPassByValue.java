package DataStructuresLab01;

public class ArrayPassByValue {
    public static void main(String[] args) {
        //Write a program to pass array to methods by value
        int x=1;
        int[] y = new int[10];
        y[0]=232;
        m(x,y);
        System.out.println("The value of x is : "+x);
        System.out.println("The value of y is : "+y);
    }
    public static void m(int number,int numbers[]){
        number=1001; //Assign a new value to number
        numbers[0]=5555; //Assign a new value to numbers[0]
    }
}
