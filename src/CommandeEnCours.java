public class CommandeEnCours extends EtatCommande {

    public CommandeEnCours(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {
        commande.getProduits().add(produit);
        System.out.println("Produit ajouté : " + produit.getNom());
    }

    @Override
    public void retireProduit(Produit produit) {
        commande.getProduits().remove(produit);
        System.out.println("Produit retiré : " + produit.getNom());
    }

    @Override
    public void efface() {
        commande.getProduits().clear();
        System.out.println("Tous les produits ont été effacés.");
    }

    @Override
    public void etatSuivant() {
        commande.setEtatCommande(new CommandeValidee(commande));
        System.out.println("Commande validée.");
    }
}