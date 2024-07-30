public class Products {
    private String name;
    private long product_number;
    private int cost;
   private int quantity;


    public Products(String name, long product_number, int cost,int quantity)
    {
        this.name=name;
        this.product_number=product_number;
        this.cost=cost;
        this.quantity=quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProduct_number() {
        return product_number;
    }

    public void setProduct_number(long product_number) {
        this.product_number = product_number;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Products{" +
                "name=" + name +
                ", product_number=" + product_number +
                ", cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }
}
