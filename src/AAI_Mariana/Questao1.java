package AAI_Mariana;
import java.util.Scanner; 

public class Questao1 {

	public static void main(String[] args) {
	int num;
	Scanner input = new Scanner (System.in);
	System.out.print("Digite um número inteiro: ");
	num = input.nextInt();
	
	if (num < 0) {
		num = (num*-1);
	}
	
	
	System.out.println(num);
			

	}

}
