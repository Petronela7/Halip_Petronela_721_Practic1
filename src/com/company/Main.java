package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	Repository repository = new Repository();
    Operations operations = new Operations();
    List<Offer> offerList = repository.readFile("C:\\Users\\Utilizator\\JavaProjects\\Halip_Petronela_721_Practic1\\src\\com\\company\\offerten.txt","&");
        System.out.println(offerList);

        List<Offer> sortedList = operations.sortByPrice(offerList);
        repository.writeFile("C:\\Users\\Utilizator\\JavaProjects\\Halip_Petronela_721_Practic1\\src\\com\\company\\offertensortiert.txt","#",sortedList);

        String result =operations.topPlace(offerList);
        repository.writeWord("C:\\Users\\Utilizator\\JavaProjects\\Halip_Petronela_721_Practic1\\src\\com\\company\\statistik.txt" ,result);

    }
}
