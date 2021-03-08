import java.util.Scanner;
public class Modul2Niv2B 
{
	
	public static void main(String[] args) 
	{
	
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Introdueix l'altura : ");
		        int altura = sc.nextInt();
		        sc.close();
		        System.out.println();
		        for(int espais = 0, asterisc = (altura*2)-1; asterisc>0; espais++, asterisc -= 2)
		        {    
		            for(int i=0; i < espais; i++)
		            {
		                System.out.print(" ");
		            }
		             
		            
		            for(int j=asterisc; j > 0; j--)
		            {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
	}   
}

	


