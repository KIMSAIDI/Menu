import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Test {
  public static void main(String[] args) throws ValeurIncorrect{
    Scanner scanner = new Scanner(System.in);

    int cptSandwichs = 0, choix, cpt, nbSandwich, choixBis;
    String nom;
    double cptPrix = 0.0, cptCalo = 0.0;
    ArrayList<Sandwich> menu = new ArrayList<Sandwich>();
    Ingredients[] tableau = new Ingredients[6];
    tableau[0] = new Soja();
    tableau[1] = new Jambon();
    tableau[2] = new Poulet();
    tableau[3] = new Tomate();
    tableau[4] = new Oignon();
    tableau[5] = new Salade();




    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ COMMANDE DE SANDWICH ORIGINAL ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("\t\t\t\tBienvenue dans notre restaurant specialise dans la confection de sandwich.\n\nVous avez la possibilite de\n1. Commander un sandwich fait aleatoirement\n2. Composer votre propre sandwich\n");
    System.out.print("Entrez le numero correspondant aux choix qui vous donne envie : ");
    try{
    choix = scanner.nextInt();
    if (choix != 2 && choix != 1){
      throw new ValeurIncorrect();
    }
    }catch (InputMismatchException e){
      throw new ValeurIncorrect();
    }

    if (choix == 1){
      System.out.print("Veuillez rentrer le nombre de sandwichs que vous voulez : ");
      try{
      nbSandwich = scanner.nextInt();
    }catch (InputMismatchException e){
      throw new ValeurIncorrect();
    }
      while (nbSandwich != 0){
          System.out.print("Veuillez choisir un nom pour votre sandwich (sans espace) : ");
          nom = scanner.next();
          int aleatoire;
          Sandwich sandwich = new Sandwich(nom);
          for (cpt = 0; cpt < 4; cpt ++){
            aleatoire = (int)(Math.random()*6);
            sandwich.ajouterSandwich(tableau[aleatoire]);
        }
        menu.add(sandwich);
        nbSandwich--;
    }
  }if (choix == 2){
    System.out.print("Veuillez rentrer le nombre de sandwichs que vous voulez : ");
    try{
    nbSandwich = scanner.nextInt();
    }catch (InputMismatchException e){
      throw new ValeurIncorrect();
  }
    while (nbSandwich != 0){
      System.out.print("Veuillez choisir un nom pour votre sandwich (sans espace) : ");
      nom = scanner.next();
      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("\t\tVoici notre catalogue d'ingredients :\n");
      for (cpt = 0; cpt < 6; cpt++){
        System.out.println(cpt+1 + ". " + tableau[cpt].toString());
        System.out.println("--------------------------------------------------------");
      }

    System.out.println("Veuillez choisir les numeros composant votre futurs sandwich\nVous ne pouvez avoir que 4 ingredients\nAppuyez sur entree une fois un ingredient choisi\n");
    Sandwich sandwich = new Sandwich(nom);
    for (cpt = 0; cpt < 4; cpt++){
      try{
      choix = scanner.nextInt();
      sandwich.ajouterSandwich(tableau[choix-1]);
    }catch (InputMismatchException e){
        throw new ValeurIncorrect();
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Erreur, choisir un chiffre entre 1 et 6 :\n");
        choix = scanner.nextInt();
      }
    }

      menu.add(sandwich);
      nbSandwich--;
      if (nbSandwich > 0){
      System.out.println("Si vous voulez deux fois le meme sandwich tapez 10 sinon tapez un autre chiffre : ");
      try{
      choixBis = scanner.nextInt();
      if (choixBis == 10){
        Sandwich sand2 = sandwich.clone();
        menu.add(sand2);
        nbSandwich--;
        }
      }catch(InputMismatchException e){
        throw new ValeurIncorrect();
          }
        }
      }
    }


    for (Sandwich i : menu){
      cptSandwichs++;
      cptPrix += i.getprix();
      cptCalo += i.getcalories();
      System.out.println(i.toString());
      System.out.println("  ------------------------------------------------------------------------\n");
    }
    System.out.println("\nLe prix final sera de " + cptPrix + " euros et le nombre de calories final sera de " + cptCalo + " kcal\nVous avez commander " + cptSandwichs + " sandwichs.\n");
    System.out.println("Merci pour votre visite, a bientot !");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ RESTAURANT CREE PAR SOTHIRA ET KIM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    scanner.close();

    }
  }
