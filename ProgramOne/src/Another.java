
import java.util.Random;

public class Another {

	public static void main(String[] args) {
		 Random g = new Random();
		 Random f= new Random();
		 
		 
		 	int[] a = new int[10];
	        int [] number = new int [20];
	        //int [] numberTwo = new int[1];
	        
	        
	        System.out.print("Selection sort:");
	        for (int c = 0 ; c<a.length ; c++){
	            int RandomG = f.nextInt(50000)+1;
	            a[c] = RandomG;
	            System.out.print(" " +RandomG);
	            }
	        
	        
	        

	        System.out.print("Random Numbers:");
	        for (int d = 0 ; d<number.length ; d++){
	            int Randomd = g.nextInt(50000)+1;
	            number[d] = Randomd;
	            System.out.print(" " +Randomd);
	            }
	        System.out.print("\nTime:"+(SelectionSort(a)));
	        System.out.print("\nTime:"+(SelectionSort(number)));
	        
	        //System.out.print("Random Numbers:");
	        //for (int d = 0 ; d<numberTwo.length ; d++){
	           // int RandomG = g.nextInt(50000)+1;
	            //numberTwo[d] = RandomG;
	            //System.out.print(" " +RandomG);
	            //}

	        System.out.print("\nTimer:"+(BubbleSortAsceMethod(number)));
	        System.out.print("\nTimer:"+(BubbleSortAsceMethod(a)));
	        

	    }
	    public static long BubbleSortAsceMethod(int[] number){
	    	
	    	long startTime = System.currentTimeMillis();
	        int temp;
	        
	        
	        
	        for(int i = 0 ; i < number.length-1 ; i++){
	            for ( int j = 1 ; j < number.length-i-1 ; j++){
	                if ( number[j-1] > number[j]){
	                    temp = number[j-1];
	                    number[j-1] = number[j];
	                    number[j] = temp;
	                }
	            }
	        }
	        return (System.currentTimeMillis() - startTime);  
	        

	}
	    public static long SelectionSort(int[] a) {
	    	long startTime = System.currentTimeMillis();
	    //int [] a = new int[100];
	    int temp=0;
	    int j;
	    int minValue=0;
	    int minIndex=0;
	    
	        for(int i=0;i<a.length;i++){
	            minValue=a[i];
	            minIndex=i;
	            for(j=i;j<a.length;j++) {
	            	if(a[j]<minValue) {
	            		minValue=a[j];
	            		minIndex=j;
	            	}
	            }
	            if(minValue<a[i]) {
	            	temp=a[i];
	            	a[i]=a[minIndex];
	            	a[minIndex]=temp;
	            }
	        }
	        return (System.currentTimeMillis() - startTime); 
	    }

}
