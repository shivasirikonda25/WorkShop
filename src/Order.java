import java.util.*;
public class Order
{
    private long order_number;
    private String status;

    public long getOrder_number() {
        return order_number;
    }

    public void setOrder_number(long order_number) {
        this.order_number = order_number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void order(List<Products> l,HashMap<Integer,Products>m)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 to order from the cart ");
        System.out.println("enter 2 to order directly");
        int t=sc.nextInt();
        if(t==1)
        {
            System.out.println("enter the product number");
            long t1=sc.nextLong();
            for(int i=0;i<l.size();i++)
            {
                while(true) {
                    if (l.get(i).getProduct_number() == t1) {
                        Random r = new Random();
                        int x = r.nextInt(1000000);
                        if(!m.containsKey(x))
                        {
                            m.put(x,l.get(i));
                            Order r=new Order()
                            break;
                        }

                    }
                }
            }

        }
    }
}
