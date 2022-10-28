public class Oignon extends Condiments{

    public Oignon(){
        super("Oignon");
    }


    @Override
    public double calories(){
        return 40;
    }
    @Override
    public double prix(){
        return 0.70;
    }
    @Override
    public int eau(){
        return 90;
    }
    @Override
    public String getNom(){
      return nom;
    }

    @Override
    public Ingredients clone(){
      return new Oignon();
    }


}
