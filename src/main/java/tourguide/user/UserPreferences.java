package tourguide.user;

import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;


public class UserPreferences {

    private final CurrencyUnit currency            = Monetary.getCurrency("USD");
    private       int          attractionProximity = Integer.MAX_VALUE;
    private       Money        lowerPricePoint     = Money.of(0, this.currency);
    private       Money        highPricePoint      = Money.of(Integer.MAX_VALUE, this.currency);
    private       int          tripDuration        = 1;
    private       int          ticketQuantity      = 1;
    private       int          numberOfAdults      = 1;
    private       int          numberOfChildren    = 0;

    public UserPreferences() {
    }

    public int getAttractionProximity() {

        return this.attractionProximity;
    }

    public void setAttractionProximity(int attractionProximity) {

        this.attractionProximity = attractionProximity;
    }

    public Money getLowerPricePoint() {

        return this.lowerPricePoint;
    }

    public void setLowerPricePoint(Money lowerPricePoint) {

        this.lowerPricePoint = lowerPricePoint;
    }

    public Money getHighPricePoint() {

        return this.highPricePoint;
    }

    public void setHighPricePoint(Money highPricePoint) {

        this.highPricePoint = highPricePoint;
    }

    public int getTripDuration() {

        return this.tripDuration;
    }

    public void setTripDuration(int tripDuration) {

        this.tripDuration = tripDuration;
    }

    public int getTicketQuantity() {

        return this.ticketQuantity;
    }

    public void setTicketQuantity(int ticketQuantity) {

        this.ticketQuantity = ticketQuantity;
    }

    public int getNumberOfAdults() {

        return this.numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {

        this.numberOfAdults = numberOfAdults;
    }

    public int getNumberOfChildren() {

        return this.numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {

        this.numberOfChildren = numberOfChildren;
    }

}
