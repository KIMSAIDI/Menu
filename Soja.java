public class Soja extends Viandes implements Allergene{

    public Soja(){
        super("Soja");
    }


    @Override
    public double calories(){
        return 185;
    }
    @Override
    public double prix(){
        return 2.50;
    }

    public String Allergie(){
      return "\n[ ! Attention le soja est un allergene ! ]";
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
    return new Soja();
  }


}
