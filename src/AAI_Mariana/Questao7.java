package AAI_Mariana;
import java.util.Scanner; 

public class Questao7 {

	public static void main(String[] args) {
	float peso, altura, imc;
	Scanner input = new Scanner (System.in);
	System.out.println("Digite seu IMC: ");
	peso = input.nextFloat();
	altura = input.nextFloat();
	imc = (peso/altura*altura);
	
	
	if (imc <= 18.5) {
		System.out.println("MAGREZA");
	}
	
	
	if (imc <= 18.5) {
		System.out.println("MAGREZA");
	}
	
	if (imc >= 18.5 && imc <= 24.9) {
		System.out.println("NORMAL");
	}
	
	if (imc >= 25 && imc <= 29.9) {
		System.out.println("SOBREPESO");
	}
	
	if (imc >= 29.9 && imc <= 34.9) {
		System.out.println("OBESIDADE");
	}
	
	if (imc >= 40) {
		System.out.println("OBESIDADE GRAVE");
	}
	
	
	}

}