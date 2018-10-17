package FLY_SYSTEM;

public class PremiumSeat extends Seat {
    private boolean includeMeal;
    private boolean isIncludeDrinks;
    private boolean comfortSeat;

    public PremiumSeat(int number, int price, boolean includeMeal, boolean isIncludeDrinks, boolean comfortSeat) {
        super(number, price);
        this.includeMeal = includeMeal;
        this.isIncludeDrinks = isIncludeDrinks;
        this.comfortSeat = comfortSeat;
    }

    public boolean isIncludeMeal() {
        return includeMeal;
    }

    public void setIncludeMeal(boolean includeMeal) {
        this.includeMeal = includeMeal;
    }

    public boolean isIncludeDrinks() {
        return isIncludeDrinks;
    }

    public void setIncludeDrinks(boolean includeDrinks) {
        isIncludeDrinks = includeDrinks;
    }

    public boolean isComfortSeat() {
        return comfortSeat;
    }

    public void setComfortSeat(boolean comfortSeat) {
        this.comfortSeat = comfortSeat;
    }

    @Override
    public String toString() {              // Для вивода информации
        return "PremiunSeat{" +
                "includeMeal=" + includeMeal +
                ", isIncludeDrinks=" + isIncludeDrinks +
                ", comfortSeat=" + comfortSeat +
                "} " + super.toString();
    }
}
