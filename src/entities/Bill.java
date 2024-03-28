package entities;

public class Bill {
    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    private static final double PRICE_BEER = 5.0;
    private static final double PRICE_SOFT_DRINK = 3.0;
    private static final double PRICE_BARBECUE = 7.0;
    private static final double COUVERT = 4.0;
    private static final double TICKET_MALE = 10.0;
    private static final double TICKET_FEMALE = 8.0;


    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    private double couvertValue() {
        return (feeding() > 30) ? 0.0 : COUVERT;
    }

    public String cover() {
        return (couvertValue() == 0.0) ? "Isento de Couvert" : String.format("R$ %.2f", couvertValue());
    }

    public double feeding() {
        return (beer * PRICE_BEER) + (barbecue * PRICE_BARBECUE) + (softDrink * PRICE_SOFT_DRINK);
    }

    public double ticket() {
        if (gender == 'M') {
            return TICKET_MALE;
        } else {
            return TICKET_FEMALE;
        }
    }

    public double total() {
        return feeding() + couvertValue() + ticket();
    }

}
