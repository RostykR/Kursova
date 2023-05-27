import java.util.Scanner;

public class Palatu extends Hospital {
    private int SimplePalata = 15;
    private int VipPalata = 10;
    private int LuxuryPalata =5;

    private void Reserv(){
        System.out.println("Доброго дня,бажаєте зарезервувати палату? Оберіть тип палати: (Палата стандартна - 1),( Палата стандарту VIP - 2),(Палата стандарту Luxury - 3)");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1){
            System.out.println("Ви обрали стандартну палату! Виберіть кількість днів:");
            int choice2 = scan.nextInt();
            System.out.println("Ви зарезервували палату типу 'Standart'! Кількість днів - " + choice2);
        } else if (choice == 2){
            System.out.println("Ви обрали VIP палату! Виберіть кількість днів:");
            int choice3 = scan.nextInt();
            System.out.println("Ви зарезервували палату типу 'VIP'! Кількість днів - " + choice3);
        } else if (choice == 3){
            System.out.println("Ви обрали Luxury палату! Виберіть кількість днів:");
            int choice4 = scan.nextInt();
            System.out.println("Ви зарезервували палату типу 'Luxury'! Кількість днів - " + choice4);
        }else {
            System.out.println("Ви ввели невірну цифру");
        }
    }
    public void ReservD(){
        Reserv();
    }


    public int getLuxuryPalata() {
        return LuxuryPalata;
    }

    public void setLuxuryPalata(int luxuryPalata) {
        LuxuryPalata = luxuryPalata;
    }

    public int getVipPalata() {
        return VipPalata;
    }

    public void setVipPalata(int vipPalata) {
        VipPalata = vipPalata;
    }

    public int getSimplePalata() {
        return SimplePalata;
    }

    public void setSimplePalata(int simplePalata) {
        SimplePalata = simplePalata;
    }
}
