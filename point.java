public class point{
    private String nom;
    private int abs;
    private int ord;
    public point(String nom){
        this.nom=nom;
    }
    public point(int abs,int ord){
        this.abs=abs;
        this.ord=ord;
        this.nom=".";
    }
    public point(String nom,int abs,int ord){
        this.nom=nom;
        this.abs=abs;
        this.ord=ord;
    }
    public void Affiche(){
        System.out.println(nom+"("+abs+", "+ord+")");
    }
    public void TranslHoriz(int a){
        abs=abs+a;
    }
    public void TranslVert(int a){
        ord=ord+a;
    }
    public void Translation(int a,int b){
        abs+=a;
        ord+=b;
    }
    public boolean Coincide(point p){
        return(p.abs==abs && p.ord==ord);
    }
    public String getNom(){
        return nom;
    }
    public int getAbscisse(){
        return abs;
    }
    public int getOrdonnée(){
        return ord;
    }
    public void setNom(String ch){
        nom=ch;
    }
    public void setAbscisse(int a){
        abs=a;
    }
    public void setOrdonnée(int a){
        ord=a;
    }


    
}

