package propriete;

public class Fiscalite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1= new Personne(11464772,"Daklaoui","Rihem");
        Personne p2= new Personne(11679239,"Ben Hassine","Rahma");
        Personne p3= new Personne(12387862,"Khemiri","Cheima");

        Lotissement lotissement= new Lotissement(10);

        lotissement.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajouter(new ProprieteProfessionnelle(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new ProprieteProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));

        lotissement.afficherproprietere();
        
        System.out.println("Nombre des pieces: "+lotissement.getnbPieces());
        
        Proprietere ap1 = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        
        ProprietePrivee min = null;
        double minImpot = Double.MAX_VALUE;

        for (int i=0;i<lotissement.nombre;i++) {
            if (lotissement.getProprieteByIndice(i) instanceof ProprietePrivee) {
                ProprietePrivee proprietePrivee = (ProprietePrivee) lotissement.getProprieteByIndice(i);
                double impot= proprietePrivee.calcullmpot();
                if (impot<minImpot) {
                    minImpot=impot;
                    min=proprietePrivee;
                }
            }
        }

        if (min != null) {
            System.out.println("\nPropriété privée avec le moins d’impôts :");
            System.out.println("Propriétaire : " + min.getResponsable());
            System.out.println("Montant des impôts : " + minImpot + " DT");
        }
        
        lotissement.supprimer(ap1);
        System.out.println("Apres la supression");
        lotissement.afficherproprietere();
        
        LotissementPrivee lotispr =new LotissementPrivee(10);

        lotispr.ajouter(new ProprietePrivee(6,p1,"Zarzouna Bizerte",500,5));
        lotispr.ajouter(new Villa(7,p2,"Zahrouni Tunis",450,7,false));
        lotispr.ajouter(new Appartement(8,p3,"Jendouba Centre",200,3,2));

        System.out.println("Liste des proprietes:");
        lotispr.afficherproprietere();

        System.out.println("Nombre total de pieces:" + lotispr.getnbPieces());
	}

}
