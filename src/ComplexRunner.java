/*public class ComplexRunner {

	public static void main(String[] args) {
		ComplexNum x = new ComplexNum (3,4);
		ComplexNum y = new ComplexNum(9,-1);
		
		ComplexNum z = x.plus(y);
		System.out.println(z);
		
		z = y.minus(x);
		System.out.println(z);
		
		z = y.times(x);
		System.out.println(z);
		
		System.out.println(z.polarize());
	}

} 
public class ComplexRunner {

	public static void main(String[] args) {
		ComplexNum x = new ComplexNum (3,4);
		ComplexNum y = new ComplexNum(9,-1);
		
		ComplexNum z = x.plus(y);
		System.out.println(z);
		
		z = y.minus(x);
		System.out.println(z);
		
		z = y.times(x);
		System.out.println(z);
		
		System.out.println(z.polarize());
		
		z = x.plus(x);
		System.out.println(z.toString());
		
		System.out.println(z.conjugate());
		
		z = y.rationalize();
		System.out.println(z.toString());
	}

}*/
	import java.io.File; 
	import java.util.Scanner; 
	import java.util.*;
public class ComplexRunner {	
	public static void bubbleSort (ComplexNum [] arr) {
			ComplexNum temp;
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if (arr[j].compareTo(arr[i])==1) {
						temp = arr[j];
						arr[j]=arr[i];
						arr[i]= temp;
					}
				}
			}			
		}		
		public static void main(String[] args)  {
	    File file = new File ("H:\\Eclipse\\Workspace\\ComplexNum\\src\\cnlist.txt");
	    Scanner sc = new Scanner(file); 
	      int i=0;
	    ComplexNum[] bigList = new ComplexNum[10];	    
	    while (sc.hasNextLine())  {
	    	  int a = sc.nextInt();
	    	  int b = sc.nextInt();
	    	  bigList[i]=new ComplexNum(a,b);
	    	  i++;
	    }                                                                                
	   for(ComplexNum x: bigList) {
	    	System.out.println(x.toString());
	    }
	    System.out.println("Bubble sort the big list NOW!");
	    bubbleSort(bigList);
	   
	    for(ComplexNum x: bigList) {
	    	System.out.println(x.toString());
	    }		    
	  } 
	} 