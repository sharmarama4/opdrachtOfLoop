import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Je wilt ervoor zorgen dat je plantjes maximum 4 glaasjes water krijgen per dag. Jij hebt zelf 20 plantjes. Zorg ervoor dat je alle plantjes water geeft in een loop.
         */
        int plants = 20;
        int x = 0;
        while (x < 20) {
            x++;
            System.out.println(x + " plants");
        }
// if you divide 4 glass water for 20 plants
        int water=4;
        double waterPerPlant=(double)water/plants;
        for (int i = 1; i <= plants; i++) {
            System.out.println("Plant " + i + " get " + waterPerPlant + " glass water per day");
//if you have 200 schepes water to give for all plants equally
        }
         int waterScheps=200;
         //To divide for 20 plants
            double schepsWater=(double)waterScheps/plants;
            for (int i = 1; i <= plants; i++) {
                System.out.println("Plant " +i+ " get "+schepsWater+" schep water per day");
        }
       /* Je maakt hierdoor een systeem zodat je plantjes kunt blijven water geven op basis van de seizoenen.
       Tijdens de lente en de herfst krijgen ze 2 schepjes. Tijdens de zomer 3. Tijdens de winter 1.

    }*/

        System.out.println("Enter the name of the season  ");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number of the season");
        int num =scan.nextInt();
        switch (num){
            case 1:
                System.out.println("This is winter and you have to give 1 scheps water");
                break;
            case 2:
                System.out.println("This is herfst and you have to give 2 scheps water");
                break;
            case 3:
                System.out.println("This is summer and you have to give 3 scheps water");
            break;
            default:
                System.out.println("Invalid season");
        }
        //with if else alternative

      /*  if(num==1){
            System.out.println("This is winter and you have to give 1 scheps water ");

        } else if (num==2) {
            System.out.println("This is herfst and you have to give 2 scheps water");
        } else if (num==3) {
            System.out.println("This is summer and you have to give 3 scheps water");
        }else{
            System.out.println("Invalid season");
        }*/
      /*  Extra: Maak een loop voor 1 volledige dag tijdens de zomer, waarin dat je op 24 uur gaat werken.
      Je gaat ervoor zorgen dat je alleen maar plantjes geeft elk 6de uur (6,12,18,24).
*/
        final int hour=24;
        for (int i=1; i<=hour;i++){
            /*if(i%6==0){
                System.out.println("Give the water for the plants ");
                continue;
            }

*/
//This is the alternative

            if(i==6 || i==12 || i==18 || i==24){
                System.out.println("Go and give the water for plants");
                continue;
            }
            System.out.println(i);
        }
    }
}