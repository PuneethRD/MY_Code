package Amazon;

public class ArrayNoofRepetitions {
	
	/* int arr[]={1,2,5,4,5,5};
	int brr[]=new int[arr.length];
*/
	public static void main(String[] args) {
		int arr[]={1,2,5,4,5,5};
		int brr[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					
				}
				
			}
			System.out.println(arr[i]+" "+count);
			update(count,brr,arr,arr[i]);
			count=0;
		}
		for(int a=0;a<brr.length;a++){
			System.out.print(brr[a]);
		}

	}

	private static void update(int count, int[] brr,int arr[],int k) {
		
	
			for(int j=0;j<arr.length;j++){
				if(arr[j]==k){
					brr[j]=count;
				}
			}

		
		
	}

}
