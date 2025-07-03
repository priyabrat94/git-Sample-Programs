package DataStractureBasics;

public class BinarySearch{

	public static  boolean  binarySearchR(int []num,int target) {
		return binarySearchRec(num, target, 0, num.length-1);
	}
	private static boolean binarySearchRec(int []num,int target,int left,int right) {
		

		if(right<left)
			return false;
		int middle= (left+right)/2;
		if(num[middle]==target)
			return true;
		
		if(num[middle]> target)
			return binarySearchRec(num, target,left,middle-1);
		
			return binarySearchRec(num, target,middle+1,right);
		
	}
	
	public static  boolean  binarySearchItr(int []num,int target) {
		int left=0,right=num.length-1;
		if (left<=right) 
			return false;
			int middle=(left+right)/2;
			if(num[middle]== target)
				return true;
			if(num[middle]< target)
				left=middle+1;
			return binarySearchItr(num, target);
			//else right=middle-1;
			
		}
		//return false;
	
	
	public static void main(String[] args) {
		int [] num= {1,2,3,4,5 };//always need sorted array
 //System.out.println(binarySearchR(num,2));
 System.out.println(binarySearchItr(num,5));
	}

}
