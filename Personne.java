package propriete;

public class Personne {
	
	private int cin;
	private String nom;
	private String prenom;
	
	public Personne(int cin,String nom,String prenom)
	{
		this.cin=cin;
		this.nom=nom;
		this.prenom=prenom;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
