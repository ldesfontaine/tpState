import java.util.ArrayList;
import java.util.List;

public class Commande {
    private List<Produit> produits = new ArrayList<>();
    private EtatCommande etatCommande;

    public Commande() {
        this.etatCommande = new CommandeEnCours(this);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setEtatCommande(EtatCommande etatCommande) {
        this.etatCommande = etatCommande;
    }

    public void ajouteProduit(Produit produit) {
        etatCommande.ajouteProduit(produit);
    }

    public void retireProduit(Produit produit) {
        etatCommande.retireProduit(produit);
    }

    public void efface() {
        etatCommande.efface();
    }

    public void etatSuivant() {
        etatCommande.etatSuivant();
    }

    public void affiche() {
        System.out.println("Contenu de la commande");
        for (Produit produit : produits) {
            System.out.println("Produit : " + produit.getNom());
        }
        System.out.println();
    }
}