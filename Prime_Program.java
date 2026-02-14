package Interview_Pre;

public class Prime_Pro {
	public static void main(String[] args) {
		int n=4;
		Boolean pro=true;
		int count=0;
		if(n==1||n==0) {
			System.out.println("it is prime number");
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				pro=false;
				count++;
			}
		}
		if(count==0) {
			System.out.println("it is prime");
		}
		else
		{
			System.out.println("it is not prime number");
		}
}
}
