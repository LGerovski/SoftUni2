package SoftUni2;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.Arrays;
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
        //List<RoyalGuard> royalGuards = new ArrayList<>();
        //List<Footman> footmans = new ArrayList<>();
        //String kingsName;
        List<Liege> lieges = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);

        String kingsName = scanner.nextLine();
        King king = new King(kingsName);

        String royalGuardsLine = scanner.nextLine();
        String[] royalGuradsArr = royalGuardsLine.split(" ");
        for (String royalGuard : royalGuradsArr) {
            lieges.add(new RoyalGuard(royalGuard));
        }

        String footmansLine = scanner.nextLine();
        String[] footmansArr = footmansLine.split(" ");
        //footmans.addAll(Arrays.asList(footmansArr));
        for (String footman : footmansArr) {
            lieges.add(new Footman(footman));
        }

        String command;
        command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.equals("Attack King")){
                king.print();
                for (Liege liege :lieges ) {
                    liege.print();
                }
                command = scanner.nextLine();
            }else {
                String name = command.split(" ")[1];
                for (Liege liege :lieges) {
                    if (liege.getName().equals(name)){
                        liege.kill();
                    }
                }
                    //да се пробва с лабда
                command = scanner.nextLine();
            }
        }
    }
    // Commint
    // Two interfaces - respond and kill
    // Create an abstract class (fields and methods for Footman and royalGuard). Implement both - respond and kill
    // Footman and royalGuard should extend this class

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
