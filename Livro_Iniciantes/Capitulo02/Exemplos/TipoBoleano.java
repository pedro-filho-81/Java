// demonstração do tipo boleano
class Boleano
{
	public static void main(String[] args)
	{
		// variável
		boolean b = false;
		
		System.out.println("\nboolean b = " + b );
		if(b) System.out.println( "Este não vai aparecer." + b);
		
		// b recebe verdade
		b = true;
		
		System.out.println("\nb agora -> " + b );
		if(b) System.out.println( "Este vai aparecer." + b);
		
		// operadores relacionais
		System.out.println("\nOPERADORES RELACIONAIS");
		System.out.println( "(10 < 9) -> " + (10 < 9 ) );
		System.out.println( "(10 > 9) -> " + (10 > 9 ) );
		System.out.println( "(10 == 9) -> " + (10 == 9 ) );
		System.out.println( "(10 != 9) -> " + (10 != 9 ) );
		System.out.println( "(10 <= 9) -> " + (10 <= 9 ) );
		System.out.println( "(10 >= 9) -> " + (10 >= 9 ) );	
		
	} // fim main
} // fim class