package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {
    public List<Offer> sortByPrice(List<Offer> offerList)
    {
        for(Offer offer : offerList)
            offer.setPrice(offer.getPrice()+offer.getPrice()*offer.getTax());
        return offerList
                .stream()
                .sorted((o1, o2) -> o2.getPrice().compareTo(o1.getPrice()))
                .collect(Collectors.toList());
    }
    
}
