public class Salade extends Condiments {

    public Salade(){
        super("Salade");
    }



    @Override
    public double calories(){
        return 15.5;
    }
    @Override
    public double prix(){
        return 0.50;
    }
    @Override
    public int eau(){
        return 95;
    }
    @Override
    public String getNom(){
      return nom;
    }

    @Override
    public Ingredients clone(){
      return new Salade();
    }


}
