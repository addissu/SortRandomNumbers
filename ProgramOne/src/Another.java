
import java.util.Random;

public class Another {

	public static void main(String[] args) {
		 Random g = new Random();
		 
		 
		 
		 	int[] a = new int[100];
	        int [] number = new int [100];
	        int [] numberTwo = new int[200000];
	        
	        
	        System.out.print("Selection sort:");
	        for (int c = 0 ; c<a.length ; c++){
	            int RandomG = g.nextInt(50000)+1;
	            a[c] = RandomG;
	            System.out.print(" " +RandomG);
	            }
	        
	        
	        

	        System.out.print("Random Numbers:");
	        for (int d = 0 ; d<number.length ; d++){
	            int RandomG = g.nextInt(50000)+1;
	            number[d] = RandomG;
	            System.out.print(" " +RandomG);
	            }
	        //System.out.print("\nTime:"+(BubbleSortAsceMethod(number)));
	        
	        System.out.print("Random Numbers:");
	        for (int d = 0 ; d<numberTwo.length ; d++){
	            int RandomG = g.nextInt(50000)+1;
	            numberTwo[d] = RandomG;
	            System.out.print(" " +RandomG);
	            }

	        System.out.print("\nTimer:"+(BubbleSortAsceMethod(numberTwo)));
	        
	        

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
	    public long SelectionSort(int[] a) {
	    	long startTime = System.currentTimeMillis();
	    //int [] a = new int[100];
	    int temp;
	    int j;
	        for(int i=1;i<a.length;i++){
	            j = i-1; 
	            while(i>0 && a[j] > a[i]){
	                temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	        for(int x=0; x<a.length;x++){
	            System.out.println(a[x]);   
	        }
	        return (System.currentTimeMillis() - startTime); 
	    }

}
