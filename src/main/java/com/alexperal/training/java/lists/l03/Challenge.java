package com.alexperal.training.java.lists.l03;

import com.alexperal.training.java.lists.l03.impls.Impl01Fair;
import com.alexperal.training.java.lists.l03.impls.Impl02CollectionModification;
import com.alexperal.training.java.lists.l03.impls.Impl03ElementModification;
import com.alexperal.training.java.lists.l03.impls.Impl04Hell;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Challenge {

    public static void main(String[] args) {
        final List<TicketElement> ticketElements = getTicketElements();
        List<TicketElement> throwAwayElements = copyDeeply(ticketElements);
        LegacyUntrustedApi api = new Impl04Hell();
        System.out.println(api.computeTicketPrice(throwAwayElements) == 45L);
        throwAwayElements = copyDeeply(ticketElements);
        System.out.println(api.computeTicketPrice(throwAwayElements) == 45L);
    }

    private static List<TicketElement> getTicketElements() {
        TicketElement p1 = new TicketElement("P1", 10L);
        TicketElement p2 = new TicketElement("P2", 20L);
        TicketElement p3 = new TicketElement("P3", 15L);
        List<TicketElement> ticketElements = new ArrayList<>();
        ticketElements.add(p1);
        ticketElements.add(p2);
        ticketElements.add(p3);
        return ticketElements;
    }

    private static List<TicketElement> copyDeeply(List<TicketElement> copyList) {
        List<TicketElement> newCopy = new ArrayList<>();
        for (TicketElement ticketElement : copyList) {
            TicketElement temp = new TicketElement(ticketElement.getProduct(), ticketElement.getProductPrice());
            newCopy.add(temp);
        }
        return newCopy;
    }
}
