// importa a classe Scanner
import java.util.Scanner; // utiliza para entrada de dados

public class MultiplicarDividir
{
	public static void main(String[] args)
	{
		//cria u, Scanner para entrada de dados
		Scanner input = new Scanner(System.in );
		// variáveis
		
		System.out.println( "Entre com dois inteiros: " );
		int num1 = input.nextInt(); // lê o primeiro inteiro
		int num2 = input.nextInt(); // lê o segundo inteiro
		
		int p = num1 * num2; // multiplicação
		int q = num1 / num2; // divisão
		int r = num1 % num2; // resto
		
		// imprime com concatenação
		System.out.println( num1 + " * " + num2 + " = " + p );
		System.out.println( num1 + " / " + num2 + " = " + q );
		System.out.println( num1 + " % " + num2 + " = " + r );
		System.out.println( num1 + " = " + q + " * " + num2 + " + " + r );
		
	} // fim main
} // fim class
