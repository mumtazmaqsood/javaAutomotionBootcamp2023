package Array;

public class arrayDefining {
    public static void main(String[] args){
        //Method 1 > defining array
        int arrayOne[] = new int[10];
        arrayOne[0] = 10;
        arrayOne[1] = 20;
        arrayOne[2] = 30;
        arrayOne[3] = 40;
        arrayOne[4] = 50;
        arrayOne[5] = 60;
        arrayOne[6] = 70;
        arrayOne[7] = 80;
        arrayOne[8] = 90;
        arrayOne[9] = 100;
        for(int i=0; i<arrayOne.length; i++){
            System.out.println(arrayOne[i]);
        }
        System.out.println("Method 2 > defining array");
        //Method 2 > defining array
        int arrayTwo[] = {1,2,3,4,5,6,7,8,9};
        for(int j=0; j<arrayTwo.length; j++){
            System.out.println(arrayTwo[j]);
        }
    }
}
