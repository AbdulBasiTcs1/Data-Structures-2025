package DataStructuresLab01;

public class ArrayInsertion {
    public static void main(String[] args) {
        //Write a program to insert an element in an array
        double[] arr = new double[8];
        arr[0]=1.9;
        arr[1]=9.3;
        arr[2]=2.1;
        arr[3]=3.8;
        int k=0;
        double value=1.12;
        if(k>=arr.length){
            System.out.println("The position should be less than size");
        return;
        }
        int j=arr.length-2;
        while(j>=k){
            arr[j+1]=arr[j];
            j--;
        }
        arr[k]=value;
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
