import java.util.Scanner;


public class Main {

	public static void main ( String[] args){
				
		int choix = 0;
		
		while (true)
		{
			switch(choix)
			{
				case 0:
				System.out.println("Bienvenue au système de gestion des stocks du BDE.\n");				
				System.out.println("Somme restant dans la caisse : \n" + Caisse.getSomme()+"\n");
				System.out.println("Stock restant : \n" + Stock.getNombreCannettes() + "\n");
				System.out.println("1/Vendre\n2/Recharger le stock");
				
				Scanner menu = new Scanner(System.in);
				choix = menu.nextInt();	
				
				
				case 1:
				System.out.println("Veuillez saisir le nombre de cannettes à vendre.\n");
				Scanner vente = new Scanner(System.in);
				int saisieVente = vente.nextInt();
				consulterVente(saisieVente);
				encaisser(saisieVente*0.70);
				
				choix = 0;
				break;
				
				case 2:
				System.out.println("Nombre de cannettes achetables : \n" + calculerCanAchetable());
				System.out.println("Veuillez saisir le nombre de cannettes à rajouter au stock");
				Scanner cannettes = new Scanner(System.in);
				int saisieRecharge = cannettes.nextInt();
				rechargerStock(saisieRecharge);
				
				choix = 0;
				break;
				
				default:
				System.out.println("Choix invalide, veuillez reessayer.");
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	

	
	
	
	
}
