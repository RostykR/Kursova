public class Main {
    public static void main(String[] args) {
    Doctors d = new Doctors();
    Medukamentu m =new Medukamentu();
    OnlineService o = new OnlineService();
    Ambulance a = new Ambulance();
    Hospital h = new Hospital();

    h.Info();
    h.cherguvanya(5);
    System.out.println();
    d.Information();
    System.out.println("На даний момент лікарі перебувають на нараді,тема наради: "+ d.narada());
    System.out.print("На чергування в ночі залишається-");
    d.cherguvanya();
    System.out.println();
    System.out.print("Автомобілі: ");
    a.NewCar();
    System.out.print("На чергування викликів швидкої допомоги залишається: ");
    a.cherguvanya();
    System.out.println();
    System.out.println("Медикаменти");
    m.allMedycamenty();
    System.out.println("Нова поставка медикаментів");
    m.addNewPostavka(50);
    System.out.println();
    System.out.println("Онлайн сервіс:");
    o.cherguvanya();
    o.welcome();
    }
}