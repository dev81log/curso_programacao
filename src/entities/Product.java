package entities;
public class Product {

    public String Name;
    public double Price;
    public int Quantity;

    public double TotalValeuInStock() {
        return Price * Quantity;
    }

    public void AddProducts(int quantity) {
        Quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        Quantity -= quantity;
    }
}
