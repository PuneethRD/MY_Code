package Amazon;

public class FrequentDigit {

	public static void main(String[] args) {
		String input="heyssssssssssssssssssssssssssssrihaiyyyyyyttttttttttttt";
		int temp=0;
		int temp1=0;
		char ch='a';
		for(int i=0;i<input.length();i++){
			for(int j=i;j<input.length();j++){
				if(input.charAt(i)==input.charAt(j)){
					temp++;
				}
			}
			if(temp>temp1){
				temp1=temp;
				ch=input.charAt(i);
			}
			temp=0;
		}
		System.out.println("Frequent Digit is "+ch);

	}

}
