package AAI_Mariana;
import java.util.Scanner; 

public class Questao3 {

	public static void main(String[] args) {
	int num;
	Scanner input = new Scanner (System.in);
	System.out.println("Digite um número inteiro: ");
	num = input.nextInt();
	
	if (num >= 0 && num <= 10) {
		System.out.println("Entre 0 e 10");
	}

	else {
		System.out.println("Não");
	}

	}

}
