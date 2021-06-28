import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        int menu_num=1;
        boolean check=true;

        Menu m=new Menu();
        Scanner sc=new Scanner(System.in);

        while(check) {
            m.printMenu();
            menu_num = sc.nextInt();

            switch (menu_num) {

                case 1:
                    m.view();
                    break;
                case 2:
                    m.record();
                    System.out.println("2");
                    break;
                case 3:
                   // m.upload();
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    //m.delete();
                    break;
                case 5:
                    System.out.println("5");
                    System.out.println("종료");
                    check=false;
            }

        }


    }

}
