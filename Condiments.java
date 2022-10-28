public abstract class Condiments extends Ingredients{


    public Condiments(String nom){
        super(nom);
    }


    @Override
    public String toString(){
    return super.toString() + "\npourcentage en eau :" + eau() + "%";
  }


    public abstract int eau();



}
