public class CommandeValidee extends EtatCommande {

    public CommandeValidee(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {
        // Aucun message ou action
    }

    @Override
    public void retireProduit(Produit produit) {
        // Aucun message ou action
    }

    @Override
    public void efface() {
        // Aucun message ou action
    }

    @Override
    public void etatSuivant() {
        commande.setEtatCommande(new CommandeLivree(commande));
    }
}