/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class cart {
	public static void main (String[] args) {
	    List<item> stock = new ArrayList<item>();
	    stock.add(new item("a","a#e",100,50));
	    stock.add(new item("b","b#)",56,88));
	    stock.add(new item("c","c#_",10000,11));
	    stock.add(new item("d","d#+",40,101));
	    
	    Scanner sc = new Scanner(System.in);
	    List<item> cart = new ArrayList<item>();
	    int i = Integer.parseInt(sc.nextLine().trim());
	    //sc.next();
	    while(i>0)
	    {
	        String itemname = sc.nextLine().trim();
	        int qtyneeded = Integer.parseInt(sc.nextLine().trim());
	        System.out.println(itemname+" "+qtyneeded);
	        int find=0;
	        boolean found = false;
	        while(find<stock.size() && !found)
	        {
	           item itemobj = stock.get(find);
	            if(itemobj.name.equals(itemname))
	            {
	   if(itemobj.qty>=qtyneeded)
	   {
	       cart.add(new item(itemobj.name,itemobj.id,itemobj.price,itemobj.qty-qtyneeded));
	       stock.get(find).qty = stock.get(find).qty - qtyneeded;
	       System.out.println("Item added to cart");
	       found = true;
	   System.out.println("Items in stock now:"+ stock.get(find).qty);
	       break;
	   }
	   else{
	       System.out.println("Not available");
	       found = true;
	       
	   }
	   find=0;             
	            }
find++;
	        }
	        i--;
	    }
	    //System.out.println(stock.get(0).qty);
	}
}

class item{
    String name;
    String id;
    int price;
    int qty;
    
    public item(String name, String id, int price, int qty)
    {
        this.name = name;
        this.id = id;
        this.price = price;
        this.qty = qty;
    }
}
