public abstract class Ingredients{
    protected String nom;

    public Ingredients(String nom){
        this.nom = nom;
    }


    public String toString(){
    return "nom : "+ getNom() +"\nprix : " + prix() + " euros,\nnombres calories : " + calories() + " kcal";
  }



    public abstract double calories();
    public abstract double prix();
    public abstract String getNom();
    public abstract Ingredients clone();


}
