package Amazon;

public class ArraySum {
	static int arr[]={2,5,8,4};
	static int arr1[]=new int[arr.length];

	public static void main(String[] args) {
		
		int res=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i==j)
					continue;
				res=res+arr[j];
			}
			arr1[i]=res;
			res=0;
		}
		for(int a:arr1)
			System.out.println(a);
	}

}
