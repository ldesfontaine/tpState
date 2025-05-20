public class CommandeLivree extends EtatCommande {

    public CommandeLivree(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {
        System.out.println("Impossible d'ajouter un produit, la commande est livrée.");
    }

    @Override
    public void retireProduit(Produit produit) {
        System.out.println("Impossible de retirer un produit, la commande est livrée.");
    }

    @Override
    public void efface() {
        System.out.println("Impossible d'effacer, la commande est livrée.");
    }

    @Override
    public void etatSuivant() {
        System.out.println("La commande est déjà livrée.");
    }
}