package DataStractureBasics;

import java.util.Arrays;

public class Program {
	
	
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here
        if(array.length==0)
            return new int[0];

        int [] newarray= new int[2];
        for(int i=0;i<array.length;i++){
            for(int j=1;j<array.length;j++){
                if(array[i] !=array[j]){
                    if(array[i] +array[j]== targetSum){
                        //newarray[0]=array[i];
                        //newarray[1]=array[j];
                        return new int[]{array[i],array[j]};
                    }
                }
            }
        }
        // if(newarray[0]!=0 || newarray[1]!=0 )
        // return newarray;
        // else
        return new int[0];
    }
    
    
    
    
    

    public static void main(String[] args) {
        int [] array={21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int  targetSum= 16;

        System.out.println(Arrays.toString(twoNumberSum(array,16))) ;
        // System.out.println("hi");

    }
}

