public class Poulet extends Viandes implements Allergene{

    public Poulet(){
        super("Poulet");
    }


    @Override
    public double calories(){
        return 239;
    }
    @Override
    public double prix(){
        return 1.75;
    }

    public String Allergie(){
      return "\n[ ! Attention ce produit contient l'allergene : celeri, gluten ! ]";
    }
    @Override
    public String getNom(){
      return nom;
    }

    @Override
    public String toString(){
    return super.toString() + Allergie();
  }

  @Override
  public Ingredients clone(){
    return new Poulet();
  }


}
