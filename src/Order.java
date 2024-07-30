import java.util.*;
public class Order
{
     public static void main(String[] args)
     {
         HashMap<Integer,Products> order=new HashMap<>();
         List<Products>l=new ArrayList<>();
         Cart c=new Cart();
         int qn=0;
         Scanner sc=new Scanner(System.in);
         while(true)
         {
             System.out.println("enter 1 to add to cart");
             System.out.println("enter 2 to remove from the cart");
             System.out.println("enter 3 to order");
             System.out.println("enter 4 to exit");
             int t=sc.nextInt();
             if(t==1)
             {
                 c.addProduct(l);
             }
             else if(t==2)
             {
                 String cc=sc.next();
                 c.removeProduct(l,cc);
             }
             else if(t==3)
             {
                 System.out.println("enter the product name");
                 String str=sc.next();
                 for(int i=0;i<l.size();i++)
                 {
                     if(l.get(i).getName().equals(str))
                     {
                           order.put(qn++,l.get(i));
                     }
                 }
             }
             else break;
         }

     }
}
