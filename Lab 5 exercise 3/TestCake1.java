abstract class Cake{
    String name;
    String[] toppings;
    String[] toppingOrder;
    double Smallprice;
    double Mediumprice;
    double Bigprice;
    double totalPrice;
    int size;
    int quantity;
   
   Cake(String name){
      this.name = name;
   }
  
   abstract public void setCake(String[] toppings, double Smallprice, double Mediumprice, double Bigprice);
   
   public void orderCake(String[] tO, int q, int s){
       toppingOrder = tO;
       quantity = q;
       size = s;
   } 
   public double getSizePrice(){
       double sizePrice = 0.0;
       if(size == 1){
          sizePrice = Smallprice;
       }else if(size == 2){
          sizePrice = Mediumprice;
       }else if(size == 3){
          sizePrice = Bigprice;
       }
       return sizePrice;
   }   
    public double getTotalPrice(){
       totalPrice = getSizePrice() * quantity + (toppingOrder.length*10);
       return totalPrice;
   }
   public String getSize(){
       String cakeSize = " ";
       if(size == 1){
         cakeSize = "Small";
       }else if(size == 2){
         cakeSize = "Medium";
       }else if(size == 3){
         cakeSize = "Big";
       }
       return cakeSize;
   }
   public void printCake(){
       System.out.println("-----------------------------");
       System.out.println("\t\t\tCake Menus");
       System.out.println("-----------------------------");
       System.out.println(name + " with available toppings:");
       for(int i = 0; i < toppings.length; i++){
          System.out.println((i+1) + ") " + toppings[i]);
      }
      System.out.print("\n");
      System.out.println("Price: ");
      System.out.println("[1] Small : RM" + Smallprice);
      System.out.println("[2] Medium: RM" + Mediumprice);
      System.out.println("[3] Big   : RM" + Bigprice);
      System.out.print("\n");
  }       
  public void printOrder(){
      System.out.println("Cake Order details:");
      System.out.println("-------------------------------------------");
      System.out.print("Toppings : " );
      for(int i = 0; i < toppingOrder.length; i++){
          System.out.print((i+1) + ") " + toppingOrder[i] + " ");
      }
      System.out.println("\nSize    : " + getSize());
      System.out.println("-------------------------------------------");
      System.out.println("Total Price: RM" + getTotalPrice());
      System.out.println("-------------------------------------------");
  }
}
   class BlackForest extends Cake{
      BlackForest(String name){
      super(name);
   }  
   public void setCake(String[] t, double Sp, double Mp, double Bp){
       toppings = t;
       Smallprice = Sp;
       Mediumprice = Mp;
       Bigprice = Bp;
   }
}
   public class TestCake1{
      public static void main(String args[]){
        Cake c = new BlackForest("BlackForest");
        String[] topping = {"Chocolate", "Cherries", "Whipped Cream"};
        c.setCake(topping, 45.00, 65.00, 80.00);
        c.printCake();
       
        String[] order = {"Cherries", "Whipped Cream"};
        c.orderCake(order, 2, 3);
        c.printOrder();
     }
 }
        