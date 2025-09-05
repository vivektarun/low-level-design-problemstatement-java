package basic.universityQuestion.model;

// Composition (IDCard cannot exists without Student)
public class IDCard {
    private final String cardNumber;

    public IDCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
