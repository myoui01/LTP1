package AAI_Mariana;
import java.util.Scanner; 

public class Questao8 {

	public static void main(String[] args) {
	int sal, prestacao, aux;
	Scanner input = new Scanner (System.in);
	System.out.println("Digite seu sal�rio bruto: ");
	sal = input.nextInt();
	System.out.println("Digite sua presta��o: ");
	prestacao = input.nextInt();
	
	aux = prestacao*sal/100;
	
	if (aux >= 30) {
		System.out.println("Ultrapassou o valor limite.");
		
	}

	else {
		System.out.println("Empr�stimo concedido!");
	}

	}

}
