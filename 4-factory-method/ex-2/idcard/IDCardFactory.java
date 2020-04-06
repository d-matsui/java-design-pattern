package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<Integer, String>();
    private int serial = 0;
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }
    public HashMap getDatabase() {
        return database;
    }
}
