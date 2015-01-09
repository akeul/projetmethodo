
public class Canette {

	private float prix;
	
	public Canette(){
		this.prix=(float) 0.7;
	}
	
	public Canette(float prix){
		this.prix=prix;
	}
	
	
	public float getPrix(){
		return prix;
	}
	
	public void setPrix(float prix){
		this.prix=prix;
	}

	@Override
	public String toString() {
		return "Prix canette " + prix + "";
	}
	
	
}
