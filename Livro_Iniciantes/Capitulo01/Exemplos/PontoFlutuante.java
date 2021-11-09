/*
	Exibe uma tabela de conversão de galões para litros
	08/11/2021
*/
class PontoFlutuante
{
	public static void main( String[] args )
	{
		double gallons, liters;
		int counter = 0;
		
		for( gallons = 1; gallons <= 100; gallons++ )
		{
			liters = gallons * 3.7854; // converte galões para litros
			System.out.println( gallons + " gallons is " + liters + " litros " );
			
			counter++; // incrementa em 1
			if( gallons % 10 == 0 )
				System.out.println(); // pula uma linha
			
			counter = 0; // zera o contador
		} // fim fim
	} // fim main
} // fim class
		