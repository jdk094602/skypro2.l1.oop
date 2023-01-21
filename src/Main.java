
import transport.Car;

import java.util.Arrays;

import static transport.Car.changeTires;

public class Main {
    public static void main(String[] args) {
        Car[] car = new Car[7];
        car[0] = new Car("Lada","Granta",1.7F,"желтый",2015,"Россия",
                "manual", "sedan", "RTY1357908642", "5 человек+3 багажа", true
        );
        car[1] = new Car("Audi","A8 50 L TDI quattro",3F,"чёрный",2020,"Германия",
                "manual", "wagon", "RFV1354645642", "5 человек+3 багажа", true
                );
        car[2] = new Car("BMW","Z8",3F,"чёрный",2021,"Германия" ,
        "automatic", "cabriolet", "WSX4564654542", "2 человек+2 багажа", true
                );
        car[3] = new Car("KIA","Sportage",2.4F,"красный",2018,"Южная Корея" ,
        "manual", "hatchback", "POI2349808642", "5 человек+3 багажа", true
                );
        car[4] = new Car("Hyundai","Avante",1.6F,"оранжевый",2016,"Южная Корея",
        "automatic", "sedan", "FDY1357908665", "", true
                );
        car[5] = new Car("Hewlett Packard","ColorJet",0,"",1998,"США"  ,
        "", "desktop", "FGDFGFDGFD642", "", false
                );
        car[6] = new Car("Epson","FX - 900 ",0,"",1999,"",
        "", "standalone", "R-----3242342", "", false
                );

        System.out.println(Arrays.toString(car));

//        car[6].changeTyres(6);
//        почему то при использовании НЕстатического метода получаю ошибку.
//        java: cannot find symbol
//        symbol:   method changeTyres(int)
//                location: class transport.Car

        changeTires(6, car[1] );
        System.out.println(car[1]);

    }
}