
public class Caisse {
	
	
	private float somme;
	
	public Caisse(){
	this.somme=0;
	}
	
	public Caisse(float somme){
		this.somme=somme;
	}
	public float getSomme() {
		return somme;
	}

	public void setSomme(float somme) {
		this.somme = somme;
	}
	
	public int calculerCanAchetable(){
		return (int) (this.getSomme()/0.7);
	}
	@Override
	public String toString() {
		return "Dans la caisse il y a " + this.getSomme() + " €";
	}
	

}
