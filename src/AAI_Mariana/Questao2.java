package AAI_Mariana;
import java.util.Scanner; 

public class Questao2 {

	public static void main(String[] args) {
	int num;
	Scanner input = new Scanner (System.in);
	System.out.println("Digite um número inteiro: ");
	num = input.nextInt();
	
	if (num%2 == 0) {
		System.out.println("Par");
	}
	
	
	else {
		System.out.println("Ímpar");
	}
			

	}

}
