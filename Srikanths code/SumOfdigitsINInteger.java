package Amazon;

public class SumOfdigitsINInteger {

	public static void main(String[] args) {
		
		int a=1234;
		int x;int y;int sum=a%10;int i=0;
		while(true){
			
			x=a/10;
			a=x;
			//System.out.println(x);
			y=x%10;
		//	System.out.println(y);
			sum=sum+y;
			if((a/10)==0)
				break;
		}
		System.out.println(sum);

	}

}
