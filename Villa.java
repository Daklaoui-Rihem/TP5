package propriete;

public class Villa extends ProprietePrivee{
	private boolean avecPiscine;
	
	public Villa(int id,Personne responsable,String adresse,double surface,int nbPieces,boolean avecPiscine)
	{
		super(id,responsable,adresse,surface,nbPieces);
		this.avecPiscine=avecPiscine;
	}


	public boolean isAvecPiscine() {
		return avecPiscine;
	}



	public void setAvecPiscine(boolean avecPiscine) {
		this.avecPiscine = avecPiscine;
	}



	public double calcullmpot()
	{
		double so=super.calcullmpot();
		if(avecPiscine==true)
		{
			return so+200;
		}
		else 
		{
			return so;
		}
	}
}
