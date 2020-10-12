package ir.aut.ceit.app.applications;

import java.util.Objects;

public abstract class Card {
    private String name;
    private String description;

    Card(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Boolean equals(Card card) {
        return Objects.equals(card.name, this.name) && Objects.equals(card.description, this.description);
    }

    public void turnEffect(Field num1 , Field num2){

    }

    public String toString() {
        return this.name + " : " + this.description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
