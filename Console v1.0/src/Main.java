import java.util.*;
import java.awt.Desktop;
import java.net.URI;

public class Main {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int sw = 0;
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||  //////      ///////      ///////       ///////    ///////   //      //////");
        System.out.println("|||  //          //   //      //   //       //         //   //   //      //");
        System.out.println("|||  //          //   //      //   //       ///////    //   //   //      /////");
        System.out.println("|||  //          //   //      //   //            //    //   //   //      //");
        System.out.println("|||  //          //   //      //   //            //    //   //   //      //");
        System.out.println("|||  /////       ///////      //   //       ///////    ///////   /////   /////");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| ");
        System.out.println("Что вы хотите сделать?");
        System.out.println("[1]Увидеть моды для Minecraft forge 1.16.5");
        System.out.println("[2]Это не доступно))))))");
        System.out.println("[3]Github разработчика");
        System.out.println("Выбор:");
        sw = scn.nextInt();

        switch (sw) {
            case 1:
                mods();
                break;
            case 2:
                coming_soon();
                break;
            case 3:
                openUrl("https://github.com/Gleb30ru");
                break;

        }

    }
        public static void mods() {

                System.out.println("Моды разработчика Gleb30ru");
                System.out.println("------------------------------------------");
                System.out.println("[1]Wooden_floor|Деревянный пол");
                System.out.println("-----------------------------------------");
                System.out.println("Хотите скачать мод?");
                System.out.println("Залетайте в 3-ую вкладку консоли");
                System.out.println("---------------------------------------");
                System.out.println("Напиши 1 чтобы вернуться назад");
                int one = scn.nextInt();
                if (one == 1)
                    main(new String[0]);
            }
        public static void coming_soon() {
            int one = 0;
            System.out.println("Это же вкладка недоступна!");
            System.out.println("-------------------------------------");
            System.out.println("Кстати код консоли есть на github");
            System.out.println("-------------------------------------");
            System.out.println("Напиши 1 чтобы вернуться назад");
            one = scn.nextInt();
            if (one == 1)
                main(new String[0]);
        }


        public static void openUrl(String url) {
            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    if (desktop.isSupported(Desktop.Action.BROWSE)) {
                        desktop.browse(new URI(url));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
    }
}