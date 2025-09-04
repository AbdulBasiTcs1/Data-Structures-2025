package DataStructuresLab01;

public class Activity07 {
    public static void main(String[] args) {
        //Write a program to search an element in an array.
        double[] myList = {1.9,2.9,3.4,3.5};
        double val =3.5;
        int pos = 0;
        boolean found = false;
        for(int i=0;i<myList.length;i++){
            if(myList[i]==val){
                found=true;
                pos=i;
            }
            
        }
        if(found)
            System.out.println(val+" found at position"+pos);
            else
            System.out.println(val+" not found!");

    }
}
