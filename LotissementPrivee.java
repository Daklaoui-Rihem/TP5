package propriete;

public class LotissementPrivee extends Lotissement {

    public LotissementPrivee(int capacite) {
        super(capacite);
    }

    @Override
    public boolean ajouter(Proprietere p) 
    {
        if (p instanceof ProprietePrivee) 
        {
            return super.ajouter(p);
        } 
        else 
        {
            System.out.println("Seules les proprietes privées peuvent être ajoutees au LotissementPrivee.");
            return false;
        }
    }

    @Override
    public ProprietePrivee getProprieteByIndice(int i) {
        if (i>=0 && i<nombre && tabProp[i] instanceof ProprietePrivee) 
        {
            return (ProprietePrivee) tabProp[i];
        } 
        else 
        {
            System.out.println("Indice invalide ou la propriete n est pas privee.");
            return null;
        }
    }

    @Override
    public int getnbPieces() 
    {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) 
        {
            if (tabProp[i] instanceof ProprietePrivee) 
            {
                totalPieces += ((ProprietePrivee) tabProp[i]).getNbPieces();
            }
        }
        return totalPieces;
    }
}