import java.util.Scanner;

public class Pharmacy extends Hospital{
     public String[]pharmacist = {"Гуменюк Надія","Абраменко Ольга","Манько Зоряна","Мудрик Анастасія"};

     public void obsluga(){
         Medukamentu med = new Medukamentu();
         Scanner scan = new Scanner(System.in);
         System.out.println("Доброго дня,оберіть ліки які вам потрібно: (Анальгін - 1),(Стрепсілс - 2),(Парацетамол - 3),(Антибіотик - 4),(Бинт - 5),(Укол - 6),(Гіпс - 7)");
         int choice  = scan.nextInt();
         if (choice == 1){
             med.removePostavka();
             System.out.println("Ви купили анальгін");
         } else if (choice == 2){
             med.removePostavka();
             System.out.println("Ви купили стрепсілс");
         } else if (choice == 3){
             med.removePostavka();
             System.out.println("Ви купили парацетамол");
         } else if (choice == 4){
             med.removePostavka();
             System.out.println("Ви купили антибіотик");
         } else if (choice == 5){
             med.removePostavka();
             System.out.println("Ви купили бинт");
         } else if (choice == 6){
             med.removePostavka();
             System.out.println("Ви купили укол");
         } else if (choice == 7){
             med.removePostavka();
             System.out.println("Ви купили гіпс");
         }else {
             System.out.println("Ви обрали невірну цифру");
         }



     }

     }


