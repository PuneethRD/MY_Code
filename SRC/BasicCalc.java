package JavaCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class BasicCalc {
    public static void main(String[] args) throws IOException {
	    double val1,val2,result;
	    char Opcode;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the first number");
            val1 = Double.parseDouble(br.readLine());
    //        System.out.println(val1);
        System.out.println("Enter the second number");
            val2 = Double.parseDouble(br.readLine());
  //          System.out.println(val2);
        System.out.println("Enter the operation you want to perform: You can choose 'a' for Add,'s' for subtract,'m' for multiply and 'd' for division");
            Opcode = (char)br.read();
//            System.out.println(Opcode);

       if (Opcode == 'a')
            result = (val1 +  val2);
        else if (Opcode == 's')
            result = (val1 - val2);
        else if (Opcode == 'm')
            result = (val1* val2);
        else if (Opcode == 'd') {
            if (val2 != 0)
                result = (val1 / val2);
            else
                result = 0.0d;
        }
        else {
            System.out.println("Please enter legal Opcodes from the list a=add,s=subtract,m=multiple,d=divide");
            result = 0.0d;
        }
        System.out.println("the value is : "+result);



	          }
}
