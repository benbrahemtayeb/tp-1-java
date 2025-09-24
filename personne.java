public class personne {
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
    public personne(){
        this.nom="Ben ALI";
        this.prenom="Med";
        this.age=30;
        this.sexe="M";
    }
    public personne(String nom,String prenom,int age,String sexe){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.sexe=sexe;
    }
    public String getName(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int age(){
        return age;
    }
    public String sexe(){
        return sexe;
    }
    public void affiche(){
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(age);
        System.out.println(sexe);
    }
    public boolean sameLastName(personne p){
        return(p.nom==nom);
    }
    public static void main(String[]args){
        personne p1=new personne();
        personne p2=new personne("Bahroun","Ahmed",45,"M");
        System.out.println("Les personnes sont: ");
        p1.affiche();
        System.out.println("\n-----------------------------\n");
        p2.affiche();
        System.out.println("\n-----------------------------\n");
        if(p1.sameLastName(p2)==true)
            System.out.println("Les personnes ont le meme nom");
        else
            System.out.println("Les personnes n'ont pas le meme nom");
        System.out.println("\n-----------------------------\n");
        if(p1.age>p2.age)
            System.out.println("Le personne 1 est plus agé");
        else
            System.out.println("Le personne 2 est plus agé");
    }
}
