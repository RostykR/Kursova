import java.util.Scanner;

public class Ambulance extends Hospital{
    public int car;
    public int parkPlace = 20;
    String chergovuy;

    public void CallAmbulance(){
        Doctors doct = new Doctors();
        Scanner scan = new Scanner(System.in);
        System.out.println("Доброго дня,гаряча лінія швидкої допомоги.Введіть ваш адрес: ");
        String adress = scan.next();
        System.out.println("Введіть ваші симптоми");
        String message = scan.next();
        System.out.println("Карета швидкої допомоги готова  виїхати на виклик ");
        doct.CallAmb();
    }

    public void NewCar(){
        while(car<parkPlace){
            car++;
        }System.out.println("Нові автомобілі прибули на парковку,кількість зайнятих місць: " + car);
    }

     public void cherguvanya() {
        Doctors doct = new Doctors();
        Medukamentu medk = new Medukamentu();
        int indToday = 0;
        int Days = 7;
        for(int i = 0; i<Days;i++){
            chergovuy = doct.Feldsher[indToday];
            indToday++;
            if (indToday>=doct.Feldsher.length){
                indToday = 0;
            }
        }System.out.println(chergovuy);
         System.out.println("В кареті знаходяться всі медикаменти: " + "Бинт: " +  medk.getBynt()/3 + "  Парацетамол: " + medk.getParacetamol()/3 + " Антибіотик " + medk.getAntybiotyk()/3 + " Гіпс " + medk.getGips()/3 + " Укол " + medk.getYkol()/3 + " Стрепсілс " + medk.getStrepsils()/3 + " Анальгін " + medk.getAnalgin()/3);
    }
}
