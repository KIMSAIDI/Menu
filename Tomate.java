public class Tomate extends Condiments implements Allergene{

    public Tomate(){
        super("Tomate");
    }

    @Override
    public double calories(){
        return 20.10;
    }
    @Override
    public double prix(){
        return 0.50;
    }
    @Override
    public int eau(){
        return 90;
    }

    public String Allergie(){
      return "\n[ ! Attention ce produit contient l'allergene : celeri ! ]";
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
    return new Tomate();
  }




}
