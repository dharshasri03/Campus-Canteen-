import java.sql.SQLOutput;

public class Order {

    private MenuItem item;
    private int quantity;

    public Order(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public MenuItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
<<<<<<< HEAD
        return item.getPrice() * quantity ;
=======
        System.out.println("called get total"+item);
        return item.getPrice();
>>>>>>> 82896bc (fixed the bugs)
    }

}
