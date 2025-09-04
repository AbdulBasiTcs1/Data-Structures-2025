package DataStructuresLab01;

public class ArrayToMethods {
   public static void main(String[] args) {
    //Write a program to pass array to methods
    printArray(new int[] {1,2,3,4,5,6});
    printArray(new int[] {3,2,1,0});
   } 
   public static void printArray(int[] array){
    for(int i=0;i<array.length;i++){
        System.out.println(array[i]+" ");
    }
    
   }
}
