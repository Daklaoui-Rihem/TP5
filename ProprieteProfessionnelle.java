package propriete;

public class ProprieteProfessionnelle extends Proprietere{
	
	private int nbemployes;
	private boolean estEtatique;
	
	public ProprieteProfessionnelle(int id,Personne responsable,String adresse,double surface,int nbemployes,boolean estEtatique)
	{
		super(id,responsable,adresse,surface);
		this.nbemployes=nbemployes;
		this.estEtatique=estEtatique;
	}

	@Override
	public String toString() {
		return super.toString()+"ProprieteProfessionnelle [nbemployes=" + nbemployes + ", estEtatique=" + estEtatique + "]";
	}
	
	public double calcullmpot()
	{
		if(estEtatique)
		{
			return 0;
		}
		else
		{
			double s=surface/100;
			return s*100+30*nbemployes;
		}
	}

	public int getNbemployes() {
		return nbemployes;
	}

	public void setNbemployes(int nbemployes) {
		this.nbemployes = nbemployes;
	}

	public boolean isEstEtatique() {
		return estEtatique;
	}

	public void setEstEtatique(boolean estEtatique) {
		this.estEtatique = estEtatique;
	}
	
	
}
