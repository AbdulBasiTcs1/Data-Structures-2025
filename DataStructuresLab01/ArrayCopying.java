package DataStructuresLab01;

public class ArrayCopying {
    public static void main(String[] args) {
        //Write a program to copy content of one array to another array
        double[] arr = {1.9,2.9,3.4,3.5};
        double[] arr1 = {1.2,3.2,5.3,5.4};
        arr1=arr; //Here assighned the value of arr into arr1
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
