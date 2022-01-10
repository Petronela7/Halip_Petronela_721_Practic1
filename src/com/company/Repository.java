package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    public List<Offer> readFile(String filename, String separator) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line = bufferedReader.readLine();
        String[] attributes;
        Offer offer;
        List<Offer> offerList = new ArrayList<>();
        while(line != null)
        {
            attributes = line.split(separator);
            offer = new Offer(Integer.parseInt(attributes[0]),attributes[1],Double.parseDouble(attributes[2]),Double.parseDouble(attributes[3]),attributes[4],Place.valueOf(attributes[5]));
            offerList.add(offer);
            line = bufferedReader.readLine();

        }
        return offerList;
    }

    public void writeFile(String filename,String separator, List<Offer> offerList) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        for (Offer offer: offerList)
        {
            String line = offer.getId() + separator + offer.getShopName()+ separator + offer.getPrice() + separator + offer.getTax()+separator
                    + offer.getAddress() + separator+ offer.getPrice();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
    public void writeWord(String filename, String word) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        bufferedWriter.write(word);
        bufferedWriter.close();
    }
}
