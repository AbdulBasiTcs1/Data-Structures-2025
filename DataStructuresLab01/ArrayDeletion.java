package DataStructuresLab01;

public class ArrayDeletion {
    public static void main(String[] args) {
        //Write a program to delete an eelemnt of an arrya from specified position
        double[] arr= new double[8];
        arr[0]=1.9;
        arr[1]=9.0;
        arr[2]=2.3;
        arr[3]=3.3;
        int k=3;
        if (k>=arr.length) {
            System.out.println("The positionshould ne less than the  size of an array");
            return;            
        }
        int j=k;
        while (j<arr.length-1) {
            arr[j]=arr[j+1];
            j++;
        }
        for(int i=0;i<=arr.length;i++)
        System.out.println(arr[i]);
    }
}
