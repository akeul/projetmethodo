
public class Stock {

	private int nombreCanettes;
	private float prixFournisseur;
	private Canette uneCanette;
	
	
	public Stock(int nombreCanettes, float prixFournisseur) {
		this.nombreCanettes = nombreCanettes;
		this.prixFournisseur = prixFournisseur;
	}
	
	public Stock(){
		this.nombreCanettes=0;
		this.prixFournisseur=(float) 0.50;
	}
	
	public int getNombreCanettes() {
		return nombreCanettes;
	}
	public void setNombreCanettes(int nombreCanettes) {
		this.nombreCanettes = nombreCanettes;
	}
	public float getPrixFournisseur() {
		return prixFournisseur;
	}
	public void setPrixFournisseur(float prixFournisseur) {
		this.prixFournisseur = prixFournisseur;
	}

	@Override
	public String toString() {
		return "Stock : Nombre de canettes " + nombreCanettes + ", prixFournisseur = "
				+ prixFournisseur + ".";
	}
	
	
	
}
