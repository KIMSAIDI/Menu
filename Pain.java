public class Pain extends Ingredients implements Allergene{
    private static final Pain pain = new Pain();

    private Pain(){
        super("Pain complet");
    }

    public static Pain getInstance(){
      return pain;
    }

    @Override
    public double calories(){
        return 265.0 ;
    }
    @Override
    public double prix(){
        return 1.00 ;
    }

    public String Allergie(){
      return "\n[ ! Attention ce produit contient l'allergene : gluten ! ]\n";
    }
    public String getNom(){
      return nom;
    }

    @Override
    public String toString(){
        return super.toString() + Allergie();
    }

    @Override
    public Ingredients clone(){
      return new Pain();
    }



}
