import java.util.*;
public class Cart
{
    Scanner sc=new Scanner(System.in);
     public void addFootWear(List<Products> l)
     {
         System.out.println("enter the product name :");
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         for(int i=0;i<l.size();i++)
         {
             if(l.get(i).getName().equals(s))
             {
                 int temp=l.get(i).getQuantity();
                 int u=l.get(i).getCost();
                 l.get(i).setQuantity(temp+1);
                 l.get(i).setCost((temp+1)*u);
                 return;
             }
         }
         System.out.println("enter product number");
         long pro=sc.nextLong();
         System.out.println("enter the cost of the product :");
         int cost=sc.nextInt();
         l.add(new Products(s,pro,cost,1));
     }
//     public void addClothing(List<Clothing> l)
//     {
//         System.out.println("enter the product name :");
//         String s=sc.next();
//         System.out.println("enter product number");
//         long pro=sc.nextLong();
//         System.out.println("enter the cost of the product :");
//         int cost=sc.nextInt();
//         l.add(new Clothing(s,pro,cost));
//     }
//     public void addElectronics(List<Electronics> l)
//     {
//         System.out.println("enter the product name :");
//         String s=sc.next();
//         System.out.println("enter product number");
//         long pro=sc.nextLong();
//         System.out.println("enter the cost of the product :");
//         int cost=sc.nextInt();
//         l.add(new Electronics(s,pro,cost));
//     }
     public void removeProduct(List<Products>l,String s)
     {
         for(int i=0;i<l.size();i++)
         {
             if(l.get(i).getName().equals(s))
             {
                 int temp=l.get(i).getQuantity();
                 if(temp==1)
                 {
                     l.remove(i);
                     return;
                 }
                 else {
                     l.get(i).setQuantity(temp-1);
                 }
             }
         }
     }
     public void diaplay(List<Products> l)
     {
         for(int i=0;i<l.size();i++)
         {
             System.out.println(l.get(i));
         }
     }
//    public void removeClothing(List<Clothing>l,long pro)
//    {
//        for(int i=0;i<l.size();i++)
//        {
//            if(l.get(i).getProduct_number()==pro)
//            {
//                l.remove(i);
//                System.out.println("removed");
//                return;
//            }
//        }
//    }
//    public void removeElectronics(List<Electronics>l,long pro)
//    {
//        for(int i=0;i<l.size();i++)
//        {
//            if(l.get(i).getProduct_number()==pro)
//            {
//                l.remove(i);
//                System.out.println("removed");
//                return;
//            }
//        }
//    }

}
