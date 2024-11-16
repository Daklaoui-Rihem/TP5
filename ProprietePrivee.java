package propriete;

public class ProprietePrivee extends Proprietere{
	
	private int nbPieces;
	
	public ProprietePrivee(int id,Personne responsable,String adresse,double surface,int nbPieces)
	{
		super(id,responsable,adresse,surface);
		this.nbPieces=nbPieces;
	}

	@Override
	public String toString() {
		return super.toString()+"ProprietePrivee  adresse="+ adresse + ", surface=" + surface +"]";
	}
	
	public double calcullmpot()
	{
		double s=surface/100;
		return 50*s+10*nbPieces;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	
	
}
