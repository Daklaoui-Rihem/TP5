package propriete;

public class Appartement extends ProprietePrivee{
	private int numEtage;
	
	public Appartement(int id,Personne responsable,String adresse,double surface,int nbPieces,int numEtage)
	{
		super(id,responsable,adresse,surface,nbPieces);
		this.numEtage=numEtage;
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	
}
