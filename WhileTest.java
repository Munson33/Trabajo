import java.util.Scanner;
public class WhileTest
{
	public static void main(String args[]){

			Scanner teclado = new Scanner(System.in);
			boolean continuar = false;
			char continuarChar = 'y';
			int menu=0;
	do{
			System.out.println("Ingrese el primer valor:");
			int valor1 = teclado.nextInt();
			System.out.println("Ingrese el segundo valor:");
			int valor2 = teclado.nextInt();
			System.out.println("----------------------------------");
			System.out.println("Seleccione su opcion: ");
			System.out.println("1.SUMAR");
			System.out.println("2.RESTAR");
			System.out.println("3.MULTIPLICAR");
			System.out.println("4.DIVIDIR");
			System.out.println("5.EXIT");
			System.out.println("6.CAMBIAR VALORES");
			menu = teclado.nextInt();
			System.out.println("Resultado =");



			switch(menu){
				case 1: System.out.println(valor1+valor2);
				break;
				case 2: System.out.println(valor1-valor2);
				break;
				case 3: System.out.println(valor1*valor2);
				break;
				case 4: System.out.println(valor1/valor2);
				break;
				case 5: System.exit(0);
				break;
				case 6: WhileTest.main(null);
				break;

				default: break;
			}
			System.out.println("-----------------------------");
			System.out.println("Intentar de nuevo Y/N");
			 continuarChar = teclado.next().charAt(0);
			continuar = false;
			if(continuarChar == 'Y' ||continuarChar == 'y'){
				continuar = true;

			} else if(continuarChar == 'N' || continuarChar == 'n'){
				continuar = false;
				break;
			}
		} while(menu!=6);
	}
}