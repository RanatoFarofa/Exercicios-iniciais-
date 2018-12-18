
/*public class Nota {

	 static double x = 8.5 * 3;
	 static double y = 7.5 * 2;
	 static double z = 6.0 * 5;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Peso 1:");
		System.out.println(x);
		System.out.println("Peso 2:");
		System.out.println(y);
		System.out.println("Peso 3:");
		System.out.println(z);
		System.out.println("A média do aluno:");
		System.out.println((x+y+z)/10);

	}

	
}
*/
public class Nota {

	public static void main(String[] args) {
		
		//notas do alunos nas provas
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.0;
		
		//pesos das provas
		int peso1 = 3;
		int peso2 = 2;
		int peso3 = 5;
		
		//cálculo parcial da nota, multiplicando a nota pelo peso
		double parcial1 = nota1 * peso1;
		double parcial2 = nota2 * peso2;
		double parcial3 = nota3 * peso3;
		
		//cálculo da média, onde ocorre a soma das parciais, dividida pela soma dos pesos
		//a presença dos parênteses é obrigatória para que as adições sejam feitas antes da divisão
		double media = (parcial1 + parcial2 + parcial3) / (peso1 + peso2 + peso3);
		
		System.out.println(media);
	}
}
