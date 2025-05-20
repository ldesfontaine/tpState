public class CommandeValidee extends EtatCommande {

    public CommandeValidee(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {
        // No action
    }

    @Override
    public void retireProduit(Produit produit) {
        // No action
    }

    @Override
    public void efface() {
        commande.getProduits().clear();
    }

    @Override
    public void etatSuivant() {
        commande.setEtatCommande(new CommandeLivree(commande));
    }
}