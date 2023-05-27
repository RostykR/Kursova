import java.util.Random;
import java.util.Scanner;
public class Doctors extends Hospital {
    int xirurg;
    int stomatolog;
    int pediatr;
    int feldsher;
    int oftalmolog;
    int golovLikar;

    public String[]Imena = {"Потапенко Андрій","Іваненко Павло","Рядюк Максим","Пулан Стефан","Червоний Назар","Сергієнко Олександр","Марнюк Олег","Пелипенко Семен","Лоданій Олександр","Ворентюк Дмитро"};
    public String[]Narada = {" ' Майбутні плани лікарні ' "," ' Новітні технології закладу '"," ' Покращення роботи персоналу ' "," ' Статистика захворювань в місті ' "," 'Набір нового персоналу' "," 'Поставка новітніх медикаментів '"," ' Покращення умов в лікарні '"};
    public String[]Xirurg = {"Потапенко Андрій","Іваненко Павло"};
    public String[]Stomatolog = {"Радюк Максим","Пулан Стефан"};
    public String[]Pediatr = {"Червоний Назар","Сергієнко Олександр","Марнюк Олег","Пелипенко Семен"};
    public String[]Oftalmolog ={"Лоданій Олександр","Ворентюк Дмитро"};
    public String []Feldsher = {"Карпо Андрій","Яків Сергій","Коваленко Максим","Бучан Олег"};

    public void Information(){
        System.out.println("Імена всіх лікарів працюючих в лікарні: Потапенко Андрій,Іваненко Павло,Рядюк Максим,Пулан Стефан,Червоний Назар,Сергієнко Олександр,Марнюк Олег,Пелипенко Семен,Лоданій Олександр,Ворентюк Дмитро ");}

    public  String narada(){
        Random random = new Random();
        int index = random.nextInt(Narada.length);
        return Narada[index];
    }

    public void cherguvanya(){
       Random random = new Random();
       int name = random.nextInt(Imena.length);
       System.out.println(Imena[name]);
    }

    public void  pruyom(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Доброго дня,бажаєте записатись на прийом?Оберіть лікаря який вам потрібний:(Стоматолог - 1,Педіатр - 2,Офтальмолог - 3,Хірург - 4)");
        int choice = scan.nextInt();
        if(choice == 1){
            Random random = new Random();
            int likar = random.nextInt(Stomatolog.length);
            System.out.println("Вас було записано на прийом до лікаря - " + Stomatolog[likar]);
        } else if (choice == 2) {
            Random random = new Random();
            int likar1 = random.nextInt(Pediatr.length);
            System.out.println("Вас було записано на прийом до лікаря - " + Pediatr[likar1]);
        } else if (choice == 3) {
            Random random = new Random();
            int likar2 = random.nextInt(Oftalmolog.length);
            System.out.println("Вас було записано на прийом до лікаря  - " + Oftalmolog[likar2]);
        } else if (choice == 4) {
            Random random = new Random();
            int likar3 = random.nextInt(Xirurg.length);
            System.out.println("Вас було записано на прийом до - " + Xirurg[likar3]);
        }else {
            System.out.println("Ви  обрали невірну цифру");
    }
    }
    public void CallAmb(){
        Random rand = new Random();
        Medukamentu med = new Medukamentu();
        int feldsh = rand.nextInt(Feldsher.length);
        System.out.println("На виклик поїхав фельдшер: "+ Feldsher[feldsh] + " В аптечці знаходиться: " + med.getParacetamol()/5 + " упаковок парацетамолу , " + med.getAntybiotyk()/5 + " упаковок антибіотику , " +med.getBynt()/5 + " упаковок бинта");


    }


}

