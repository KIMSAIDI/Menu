public class Jambon extends Viandes{
    public Jambon(){
        super("Jambon");
    }


    @Override
    public double calories(){
        return 145;
    }
    @Override
    public double prix(){
        return 1.50;
    }
    @Override
    public String getNom(){
      return nom;
    }

    @Override
    public Ingredients clone(){
      return new Jambon();
    }
}
