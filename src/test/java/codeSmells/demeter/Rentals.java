package codeSmells.demeter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rentals implements Iterable<Rental> {
    List<Rental> rentalList = new ArrayList<Rental>();

    public Rentals() {
    }

    public void add(Rental rental) {
        rentalList.add(rental);
    }

    public Iterator<Rental> iterator() {
        return rentalList.iterator();
    }

}
