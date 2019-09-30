public class Wilder {

// Ajoute les attributs String firstname et boolean aware
    private String firstName;
    private boolean aware;


// Crée un constructeur permettant d'initialiser firstname et aware
    public Wilder(String firstName, boolean aware){
        this.firstName = firstName;
        this.aware = aware;
    }


// Ajoute des getters et setters pour tous les attributs, en respectant les conventions
    public String getFirstName() {
        return this.firstName;
    }
    public boolean isAware() {
        return this.aware;
    }
    public String setFirstName (String firstName) {
        return this.firstName;
    }
    public boolean setAware (boolean aware) {
        return this.aware;
    }
    


// Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware"
//  ou "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs 
//  firstname et aware
    public String whoAmI() {
            if (this.aware == true) {
                return "Je m'appelle " + this.getFirstName() + " et je suis aware";
            }
            return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
            
    }
}

// Pour chacune des références, affiche le retour de la méthode whoAmI() dans le terminal
// Compile et teste Classroom : quand tout fonctionne, crée un dépôt git et envoie le tout 
// sur GitHub
// Partage le lien du dépôt GitHub en solution