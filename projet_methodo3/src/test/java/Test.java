
public class Test {

    public static void main (String [] arg){
    	// Test de la classe Stock
    	Stock stockos = new Stock();
    	Stock stockos2 = new Stock(15,(float) 0.8);
    	System.out.println(stockos);
    	System.out.println(stockos2);
    	stockos2.setNombreCanettes(25);
    	stockos.setPrixFournisseur((float) 0.1);
    	System.out.println(stockos2.getNombreCanettes());
    	System.out.println(stockos.getPrixFournisseur());

    	// Test de la classe Canette
    	Canette canettos = new Canette();
    	Canette canettos2 = new Canette((float) 0.3);
    	System.out.println(canettos);
    	System.out.println(canettos2);
    	canettos.setPrix((float) 0.6);
    	System.out.println(canettos.getPrix());
    
    	// Test de la classe Caisse
    	Caisse caissos = new Caisse();
    	Caisse caissos2 = new Caisse((float) 197);
    	System.out.println("" + caissos2.toString() + " Nombre canettes achetables : "  + caissos2.calculerCanAchetable()  );
    }
}
