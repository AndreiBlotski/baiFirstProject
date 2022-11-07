package lesson6.ship;

import lesson6.port.Port;

import static lesson6.deck.Deck.*;

public class Ship extends Port {


    String name;
    double[] deckShip;

    public Ship(String name, double[] deckShip) {

        Ship ship1 = new Ship("Чёрная Жемчужина", twoDeckSmall());
        Ship ship2 = new Ship("Месть Королевы Анны", twoDeckBig());
        Ship ship3 = new Ship("Турецкое рыболовецкое судно", singleDeckSmall());
        Ship ship4 = new Ship("Летучий голландец", singleDeckBig());
        Ship ship5 = new Ship("Перехватчик", twoDeckSmall());
        Ship ship6 = new Ship("Разящий", twoDeckBig());
        Ship ship7 = new Ship("Стремительный", singleDeckSmall());
        Ship ship8 = new Ship("Провидэнс", singleDeckBig());
        Ship ship9 = new Ship("Сантьяго", twoDeckSmall());
        Ship ship10 = new Ship("Императрица", twoDeckBig());
    }

    public void Ship(String name, double[] deckShip) {
        this.deckShip = deckShip;
        this.name = name;

    }


}






