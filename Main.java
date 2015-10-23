

public class Main {
	public void Nacci(int n){
		int[] numbers = new int[n];
		int i =0;
		int f=1;

		for(int a = 2; a < n; a++){
			System.out.print(f+" ");
			f=f + i;
			i=f - i;
	}
		
	
}