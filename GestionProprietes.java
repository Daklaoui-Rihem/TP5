package propriete;

public interface GestionProprietes {
	
	final int  max_propriete=100;
	abstract void afficherproprietere();
	abstract boolean ajouter(Proprietere p);
	abstract boolean supprimer(Proprietere p);
	
	
}
