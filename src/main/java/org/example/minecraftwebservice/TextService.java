package org.example.minecraftwebservice;

import java.util.ArrayList;
import java.util.List;

public class TextService {

    public static String rules =   "1.Читы бан" +
            "\n2.Кемперство бан" +
            "\n3.Багоюз бан" +
            "\n4.Оск адм бан навсегда" +
            "\n5.Оск бан сутки";

    public static String ip = "199:99:919212:13";



    public static List<Developer> developers(){
        Developer developer =
                new Developer(
                        "Михаил",
                "викенд програмист",
                "Admin",
                        "misha000112");


        Developer developer2 = new Developer("Илья","cheat hunter","Admin","xsen0nn");
        Developer developer3 = new Developer("Максим","Дизайнер","St.Admin","Maksud_developer");


        List<Developer> developers= new ArrayList<Developer>();
        developers.add(developer);
        developers.add(developer2);
        developers.add(developer3);
        return developers;
    }
}
