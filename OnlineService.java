import java.util.Scanner;
public class OnlineService extends Hospital{

    public void welcome(){
        Doctors doct = new Doctors();
        System.out.println("Доброго дня,оберіть те,що вам потрібно: (Онлайн запис до лікаря - 1),(Онлайн купівля ліків - 2),(Виклик швидкої допомоги - 3),(Резервування палати - 4),(Реєстрація в лікарні - 5),(Вихід)");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                doct.pruyom();
                break;
            case 2:
                Pharmacy phar = new Pharmacy();
                phar.obsluga();
                break;
            case 3:
                Ambulance ambulance = new Ambulance();
                ambulance.CallAmbulance();
                break;
            case 4:
                Palatu pal = new Palatu();
                pal.ReservD();
                break;
            case 5:
                Hospital hosp = new Hospital();
                hosp.Registration();
                break;
            case 6:
                System.out.println("Ви вийшли з програми.До побачення!");
                break;
            default:
                System.out.println("Введіть правильний варіант!");
                break;}
        if (choice != 6){
            welcome();
        }
    }
    public void cherguvanya(){
        Doctors doct = new Doctors();
        int indToday = 0;
        int Days = 7;
        for(int i = 0; i<Days;i++){
            if (indToday>= doct.Imena.length){
                indToday = 0;
            }
    }String technicalSup = doct.Imena[indToday];
        System.out.println("Зараз на техпідтримці: " + technicalSup);


}}
