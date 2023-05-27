import java.util.Scanner;

public class Medukamentu extends Hospital {
    private int analgin = 50;
    private int strepsils = 50;
    private int bynt = 50;
    private int paracetamol = 50;
    private  int antybiotyk = 50 ;
    private int ykol = 50;
    private int gips = 50;
    private int all;



    public void allMedycamenty(){
        all = analgin+strepsils+bynt+paracetamol+antybiotyk+ykol+gips;
        System.out.println("В даний момент на складі знаходиться така кількість медикаментів: " + all);
    }

   public void addNewPostavka(int kilkist){
        analgin += kilkist;
        strepsils += kilkist;
        bynt+=kilkist;
        paracetamol+=kilkist;
        antybiotyk+=kilkist;
        ykol+=kilkist;
        gips+=kilkist;
        System.out.println("На склад було добавлено нові медикаменти,кількість = " + kilkist);
    }
    public void removePostavka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть кількість медикаменту");
        int choice = scanner.nextInt();
        if (choice < 1) {
            System.out.println("Неможливо забрати таку кількість");
        }else if (choice == 1) {
            System.out.println("Ви забрали 1 медикамент");
        }else
            System.out.println("Ви забрали " + choice + " медикаментів");
        }



    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public int getAnalgin() {
        return analgin;
    }

    public void setAnalgin(int analgin) {
        this.analgin = analgin;
    }

    public int getBynt() {
        return bynt;
    }

    public void setBynt(int bynt) {
        this.bynt = bynt;
    }

    public int getStrepsils() {
        return strepsils;
    }

    public void setStrepsils(int strepsils) {
        this.strepsils = strepsils;
    }

    public int getParacetamol() {
        return paracetamol;
    }

    public void setParacetamol(int paracetamol) {
        this.paracetamol = paracetamol;
    }

    public int getAntybiotyk() {
        return antybiotyk;
    }

    public void setAntybiotyk(int antybiotyk) {
        this.antybiotyk = antybiotyk;
    }

    public int getYkol() {
        return ykol;
    }

    public void setYkol(int ykol) {
        this.ykol = ykol;
    }

    public int getGips() {
        return gips;
    }

    public void setGips(int gips) {
        this.gips = gips;
    }
}