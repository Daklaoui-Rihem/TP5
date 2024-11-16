package propriete;

import java.util.Objects;

abstract public class Proprietere {
	
	protected int id;
	protected Personne responsable;
	protected String adresse;
	protected double surface;
	
	public Proprietere(int id,Personne responsable,String adresse,double surface)
	{
		this.id=id;
		this.responsable=responsable;
		this.adresse=adresse;
		this.surface=surface;
	}
	
	

	public Personne getResponsable() {
		return responsable;
	}



	public void setResponsable(Personne responsable) {
		this.responsable = responsable;
	}



	@Override
	public String toString() {
		return "Proprietere [id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", surface="
				+ surface + "]";
	}
	
	abstract public double calcullmpot();
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietere other = (Proprietere) obj;
		return Objects.equals(adresse, other.adresse) && id == other.id
				&& Objects.equals(responsable, other.responsable)
				&& Double.doubleToLongBits(surface) == Double.doubleToLongBits(other.surface);
	}
	
	
}
