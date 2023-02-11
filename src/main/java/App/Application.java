/*
package App;

import config.JPAConfiguration;
import Dao.BetalingenDao;
import Dao.KlantenDao;
import Dao.ReserveringenDao;
import Dao.WerknemersDao;
import Entities.Betalingen;
import Entities.Reserveringen;
import Entities.Werknemers;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class Application {
    public static void main(String[] args) {

        //scanner test
        Scanner YesNo =new Scanner(System.in);

        JPAConfiguration.getEntityManager();
        KlantenDao klantenDAO = new KlantenDao(JPAConfiguration.getEntityManager());
        BetalingenDao betalingenDao = new BetalingenDao(JPAConfiguration.getEntityManager());
        ReserveringenDao reserveringenDao = new ReserveringenDao(JPAConfiguration.getEntityManager());
        WerknemersDao werknemersDao = new WerknemersDao(JPAConfiguration.getEntityManager());

        //select All
        //List<Klanten> klantenList = klantenDAO.retrieveKlantenList();
        //klantenList.stream().forEach(System.out::println);
    */
/*for(Klanten klanten : klantenList){
      System.out.println(klanten);
    }*//*


        //Insert
        */
/*Klanten klanten = Klanten.builder().familienaam("Tom").voornaam("Jerry").adres("Gravenstraat 5").distrikt("Paramaribo").land("Suriname").telefoonnummer(887785).klantnummer("K20020007").build();
        Klanten savedKlanten = klantenDAO.insert(klanten);
        System.out.println(savedKlanten);*//*



        //Update find by familienaam en telefoonnummer
        */
/*Klanten foundKlanten = klantenDAO.findByFamilienaamTelefoonnummer("Tom", 887785);
        foundKlanten.setAdres("Gravenstraat 6");
        int updatedRecords = klantenDAO.updateKlanten(foundKlanten);
        System.out.println(updatedRecords);
        System.out.println(foundKlanten);*//*


        //Update find by klantnummer
        */
/*Klanten foundklanten = klantenDAO.findByKlantnummer("K20220001");
        foundklanten.setAdres("Domineestraat 25");
        int updatedRedcords = klantenDAO.updateKlanten(foundklanten);
        System.out.println(updatedRedcords);
        System.out.println(foundklanten);*//*


        //Delete find by klantnummer
        */
/*System.out.println("Bent u zeker dat u alle klant data wilt verwijderen?");
        String yesno = YesNo.next();

        if (yesno.equals("ja")){
            Klanten foundDeletedKlanten = klantenDAO.findByKlantnummer("k20220025");
            int totalRecordsDeleted = klantenDAO.delete("k20220025");
            System.out.println(totalRecordsDeleted);
            System.out.println(foundDeletedKlanten);


        }else if (yesno.equals("nee")){
            System.out.println("Verwijderings process gestopt");
        }
        JPAConfiguration.shutdown();*//*




        //Builder
        */
/*HotelEmployee hotelEmployee = new HotelEmployee();
        System.out.println("Hotelmedewerker: Welke kamer zou u willen hebben?");
        KamerBuilder budgetKamer = new BudgetKamer();
        KamerBuilder economieKamer = new EconomyKamer();
        KamerBuilder deluxeKamer = new DeluxeKamer();
        System.out.println("Parker Peter: Budget kamer");
        System.out.println("Stark Tony: Economie kamer");
        System.out.println("Nick Fury: Deluxe kamer");
        hotelEmployee.setKamerBuilder(budgetKamer);
        hotelEmployee.constructKamer();
        Kamer kamer1 = hotelEmployee.getKamer();
        System.out.println("\n Hier is uw kamer meneer Parker: \n- Comfort:" + kamer1.getComfort() +
                "\n- Features: " + kamer1.getFeatures());
        hotelEmployee.setKamerBuilder(economieKamer);
        hotelEmployee.constructKamer();
        Kamer kamer2 = hotelEmployee.getKamer();
        System.out.println("\n Hier is uw kamer meneer Stark: \n- Comfort:" + kamer2.getComfort() +
                "\n- Features: " + kamer2.getFeatures());
        hotelEmployee.setKamerBuilder(deluxeKamer);
        hotelEmployee.constructKamer();
        Kamer kamer3 = hotelEmployee.getKamer();
        System.out.println("\n Hier is uw kamer mevrouw Romanoff: \n- Comfort:" + kamer3.getComfort() +
                "\n- Features: " + kamer3.getFeatures());*//*


        //ChainOfResponsibility

        */
/*Database database = new Database();
        Handler handler = new ReservationExistHandler(database)
                .setNextHandler(new ValidDateHandler(database))
                .setNextHandler((new ReservationCheckHandler()));
        AuthenticationServices service = new AuthenticationServices(handler);
        service.CheckReservation("Stark Tony", "01-03-2022");*//*


        //Adapter
        */
/*List<DesignPatterns.StructuralPattern.AdapterPattern.Werknemers> werknemersList = getAllWerknemers();
        System.out.println(werknemersList);
    }
        private static List<DesignPatterns.StructuralPattern.AdapterPattern.Werknemers> getAllWerknemers()
        {
            List<Werknemers> allWerknemers = new ArrayList<>();
            DatabaseWerknemers databaseWerknemers = new DatabaseWerknemers(
                    12,
                    "Ventura",
                    "Ace",
                    "Tamansarieweg 101",
                    8755872);
            allWerknemers.add(databaseWerknemers);
            // creating HotelLelydorpWerknemers
            HotelLelydorpWerknemers hotelLelydorpWerknemers = new HotelLelydorpWerknemers(
                    14,
                    "Vader",
                    "Darth",
                    "Javaweg 344",
                    8274599);
            allWerknemers.add(new HotelLelydorpWerknemersAdapter(hotelLelydorpWerknemers));
            // creating HotelNoordWerknemers
            HotelNoordWerknemers hotelNoordWerknemers = new HotelNoordWerknemers(
                    1,
                    "Bond",
                    "James",
                    "Wilhelminastraat 7",
                    8678784);
            allWerknemers.add(new HotelNoordWerknemersAdapter(hotelNoordWerknemers));
            return allWerknemers;*//*

        //Rapportage
        System.out.println("Rapportage aantal betalingen in het jaar 2022");
        List<Betalingen> betalingenList = betalingenDao.getBetalingRapportage(Date.valueOf("2022-01-01"), Date.valueOf("2022-12-31"));
        System.out.println("\n" + "Rapportage aantal reserveringen 2e helft 2022");
        List<Reserveringen> reserveringenList = reserveringenDao.getReserveringRapportage(Date.valueOf("2022-06-01"), Date.valueOf("2022-12-31"));
        System.out.println("\n" + "Aantal werknemers aangenomen 2019");
        List<Werknemers> werknemersList = werknemersDao.getWerknemersRapportage(Date.valueOf("2019-01-01"), Date.valueOf("2019-12-31"));
    }

    public abstract Map<String, Object> getProperties();
}
*/
