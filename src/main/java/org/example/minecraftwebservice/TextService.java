package org.example.minecraftwebservice;

import java.util.ArrayList;
import java.util.List;

public class TextService {

    public static String rules =

            "Правила:" +
                    "\nРазвивайтесь и учавствуйте в евентах"+
                    "\nСтройте город мечты"+
                    "\nПобеждайте в PvP и получайте уважение и авторитет игроков"+
                    "\n\nЗапрещенно:" +
                    "\n1.Читы бан" +
                    "\n2.Кемперство бан" +
                    "\n3.Маты бан";


    public static String ip = "5.35.88.68:25565";



    public static List<Developer> developers(){

        Developer developer1 =
                new Developer("Егор","Админ дискорд канала","Admin","kilkaVTTG");


        Developer developer2 =
                new Developer("Михаил", "Админ cайта", "Admin", "misha000112");


        Developer developer3 =
                new Developer("Илья","Админ сервера","Admin","xsen0nn");


        Developer developer =
                new Developer("Максим","Донат Админ","Admin","Maksud_developer");



        List<Developer> developers= new ArrayList<Developer>();
        developers.add(developer);
        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        return developers;
    }
}
