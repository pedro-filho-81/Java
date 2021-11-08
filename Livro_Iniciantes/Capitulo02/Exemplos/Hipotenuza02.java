/*  
	Usa o teorema de Pitágoras  para encontrar o comprimento  da hipotenusa 
	dados os comprimentos  dos dois lados opostos.
	Schildt, Herbert. Java para iniciantes (p. 35). Edição do Kindle.
	08/11/2021
*/

class Hipotenuza
{
	public static void main(String[] args)
	{
		double x = 3;
		double y = 4;
		double z = Math.sqrt(x*x + y*y);
		
		System.out.println("Para x = " + x + " e y = " + y +
							" hipotenusa = " + z );
	} // fim main
} // fim class
		
		