public class CommandeLivree extends EtatCommande {

    public CommandeLivree(Commande commande) {
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
        // No action
    }

    @Override
    public void etatSuivant() {
        // No action
    }
}