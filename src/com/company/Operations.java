package com.company;

import java.util.List;
import java.util.Map;
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

    public void  topPlace(List<Offer> offerList)
    {
        /*List<Offer> offers = offerList.stream()
                .collect(Collectors.groupingBy(Offer::getPlace))
                .entrySet().stream()
                .map(e->e.getValue().stream()
                        .reduce((o1,o2)->new Offer(o1.getId(),o1.getShopName(),o1.getPrice()+o2.getPrice(),o1.getTax(),o1.getAddress(),o1.getPlace()))
                        .map(Collectors.);*/
       /* Map<Place, Long> result = offerList.stream()
                .collect(Collectors.groupingBy(Offer::getPlace),Collectors.summingLong(Offer::getPrice));

       return result;*/
    }


}
