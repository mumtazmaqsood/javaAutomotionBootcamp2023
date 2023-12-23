package Array;

public class PassArrayToMethod {

    //this method is finding min value in array
    public void findMinInArray(int arrayOne[]){
        int min = arrayOne[0];
        for(int i=0; i<arrayOne.length; i++){
            if(min > arrayOne[i]){
                min = arrayOne[i];
            }
        }
        System.out.println("Minimium Nubmer in Array:" + min);
    }

    //this method is returning array
    public int [] getArray(){
        return new int[] {5,6,7,8,9};
    }

    public static void main(String[] args){
        int arrayTest[] = {1,2,3,4,8};
        PassArrayToMethod obj = new PassArrayToMethod();
        obj.findMinInArray(arrayTest);

        int arrayThree[] = obj.getArray();
        System.out.println(arrayThree[2]);
    }


}
