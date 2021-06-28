import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        int menu_num;

        Menu m=new Menu();
        Scanner sc=new Scanner(System.in);

        m.printMenu();
        menu_num=sc.nextInt();

        switch(menu_num){

            case "1":
                m.view();
                break;

            case "2":
                m.record();
                break;

            case "3":
                m.upload();
                break;

            case "4":
                m.delete();
                break;

            case "0":
                System.out.println("종료");


        }





    }
}
