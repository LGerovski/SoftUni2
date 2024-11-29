package SoftUni2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> royalGuards = new ArrayList<>();
        List<String> footmans = new ArrayList<>();
        String kingsName;

        Scanner scanner =new Scanner(System.in);

        kingsName = scanner.nextLine();

        String royalGuardsLine = scanner.nextLine();
        String[] royalGuradsArr = royalGuardsLine.split(" ");
        for (String royalGuard : royalGuradsArr) {
            royalGuards.add(royalGuard);
        }

        String footmansLine = scanner.nextLine();
        String[] footmansArr = footmansLine.split(" ");
        for (String footman : footmansArr) {
            footmans.add(footman);
        }

        String command;
        command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.equals("Attack King")){
                System.out.printf("King %s is under attack!\n",kingsName);
                for (String royalGuard : royalGuards) {
                    System.out.printf("Royal Guard %s is defending!\n", royalGuard);
                }
                for (String footman :footmans) {
                    System.out.printf("Footman %s is panicking!\n",footman);
                }
                command = scanner.nextLine();
            }else {
                String name = command.split(" ")[1];
                if (royalGuards.contains(name)){
                    royalGuards.remove(name);
                    System.out.println("removed royalGuard " + name);
                }else {
                    footmans.remove(name);
                    System.out.println("removed footman " + name);
                }
                command = scanner.nextLine();
            }
        }
    }
    /*
    създаване на списък за футман и роялгардс
    променлива за име на краля
    четене име на краля
    read input for роялгард
    parse the line to отделни елементи в списък
    read input for фоотман
    parse the line to отделни елементи в списък

    четене на команди до прочитане на енд
    ако командата е атак кинг:
        краля изписва кинг ъдер...
        роял гард ис дефендинг
        фоотман ис паник
     ако командата е кил „наме“
     премахваме елемент с това име от даден списък

     */
}
