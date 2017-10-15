package Amazon;

public class SeriesPrint {

	public static void main(String[] args) {
		int magicNum;
		int temp=0;
		int i=1;
		int k=0;
		while(true){
			
			for(int j=0;j<i;j++){
				temp++;
				if(temp==11)
					break;
				/*System.out.println("temp is "+temp);
				System.out.println("Values of M and N are "+j+" "+k+" "+i);*/
				magicNum=(int)((Math.pow(5, j))+Math.pow(5, k)); 
				System.out.println(magicNum);
			}
			i++;
			k++;
			if(temp==11)
				break;
		}

	}

}
