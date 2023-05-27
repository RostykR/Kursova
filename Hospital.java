import java.util.Arrays;
import java.util.Scanner;
public class Hospital {
    int security;
    int people;
    int poverh = 5;
    int place = 3000;
    String Street = "Шевченка 21";

    public String[]Patients = {};
    public void Info(){
        System.out.println("Загальна інформація про медичний заклад: Вулиця: " + Street + ", кількість поверхів: " + poverh + ", площа: " + place + " квадратних метрів " + ", кількість екіпажів охорони");
    }


    public void Registration(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть ваше ім'я: ");
        String fname = scan.nextLine();
        System.out.println("Введіть ваше прізвище");
        String lname = scan.nextLine();
        int index = -1;
        for (int i = 0; i < Patients.length; i++) {
            if (Patients[i] == null) {
                index = i;
                break;
    }
            Patients[index] = fname + " " + lname;}
    System.out.println("Вас успішно зареєстровано!");}


    public  void cherguvanya(int security){
            int Security = security;
            System.out.println("Зараз на пості знаходиться: " + Security + " нарядів охорони  ");

}}
