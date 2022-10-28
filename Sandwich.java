import java.util.ArrayList;

public class Sandwich{
    private ArrayList<Ingredients> sandwich;
    private static int nbIngredients = 0;
    private String nom;


    public Sandwich(String nom){
      sandwich = new ArrayList<Ingredients>();
      sandwich.add(Pain.getInstance());
      this.nom = nom;
    }

    public void ajouterSandwich(Ingredients s){
      sandwich.add(s);
    }


    public double getcalories(){
      double a = 0.0;
      for(Ingredients i: sandwich){
        a+= i.calories();
      }
      return a;
    }

    public double getprix(){
      double a = 0.0;
      for(Ingredients n: sandwich){
        a+= n.prix();
      }
      return a;
    }

    public static int getnbIngredients(){
        return nbIngredients;
    }

    public Sandwich clone(){
      Sandwich newSandwich = new Sandwich(nom);
      for (Ingredients i : sandwich){
        if (( i instanceof Pain)==false)
        newSandwich.ajouterSandwich(i.clone());
      }
      return newSandwich;
     }


    public String toString(){
      nbIngredients=0;
      String a = "\nLe sandwich nommee " + nom + " est composee de : \n\n";
      for (Ingredients i: sandwich){
        nbIngredients++;
        a+= i.getNom() + "  |  ";
      }
      a+= "\nCe sandwich a " + getnbIngredients()  +  " ingredients\nLe prix de ce sandwich sera de " + getprix() + " euros, et le nombre de calories sera de " + getcalories() + "kcal \n";
    return a;
    }



}
