package propriete;

public class Lotissement implements GestionProprietes {
	
	protected Proprietere[] tabProp;
    protected int nombre;

    public Lotissement(int capacite) 
    {
        tabProp=new Proprietere[capacite];
        nombre=0;
    }

    public boolean ajouter(Proprietere p) 
    {
        if (nombre < tabProp.length) 
        {
            tabProp[nombre] = p;
            nombre++;
            return true;
        }
        return false;
    }

    public boolean supprimer(Proprietere p) 
    {
        for (int i=0;i<nombre;i++) 
        {
            if (tabProp[i].equals(p)) 
            {
                tabProp[i]=tabProp[nombre-1];
                tabProp[nombre]=null;
                return true;
            }
        }
        return false;
    }

    public void afficherproprietere() 
    {
        for (int i=0;i<nombre;i++) {
            System.out.println(tabProp[i].toString());
        }
    }

    public int getnbPieces() 
    {
        int totalPieces = 0;
        for (int i=0; i<nombre;i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                totalPieces +=((ProprietePrivee) tabProp[i]).getNbPieces();
            }
        }
        return totalPieces;
    }
    public Proprietere getProprieteByIndice(int i) 
    {
        if (i>=0 && i<nombre) 
        {
            return tabProp[i];
        } 
        else
        {
            System.out.println("Indice invalide : "+i);
            return null;
        }
    }

}
