import java.util.Scanner;
class Menu{
String item;
double price;

public Menu(String item,double price){
this.item = item;
this.price = price;
}
public double getPrice(){
return price;
}
public void printItem(){
System.out.println("\t" + item);
System.out.print("\tPrice: ");
}
}
public class Lab4_Menu{
public static void main(String args[]) throws java.io.IOException{
String item;
double price;
int qty;
double total=0.0;

Scanner scan = new Scanner(System.in);
System.out.println("Menu: ");
System.out.println("------------------------------------------------");
System.out.println("[1] Nasi Lemak [RM2.00]");
System.out.println("[2] Roti [RM1.00]");
System.out.println("[3] Teh Tarik [RM1.50]");
System.out.println("[4] Kopi O [RM2.00]");
System.out.println("------------------------------------------------");
System.out.println("Place order [1-4] or type s to quit");
System.out.println("Please maintain social distancing while out in public");
System.out.println("Stay safe,stay at home");

do{
System.out.print("Add menu: ");
item = scan.next();

String[] qwer = {"Nasi Lemak", "Roti", "Teh Tarik", "Kopi O"};
double[] asdf = {2.0, 1.0, 1.5, 2.0}; 

Menu[] menu = new Menu[4]; 
for (int i = 0; i < 4; i++) { 
menu[i] = new Menu(qwer[i], asdf[i]); 
}
switch(item.charAt(0)){

case '1':
System.out.print("Nasi Lemak - quantity: ");
qty = scan.nextInt();
menu[0].printItem();
total += (menu[0].getPrice() * qty);
System.out.println(menu[0].getPrice() * qty);
break;

case '2':
System.out.print("Roti - quantity: ");
qty = scan.nextInt();
menu[1].printItem();
total += (menu[1].getPrice() * qty);
System.out.println(menu[1].getPrice() * qty);
break;

case '3':
System.out.print("Teh Tarik - quantity: ");
qty = scan.nextInt();
menu[2].printItem();
total += (menu[2].getPrice() * qty);
System.out.println(menu[2].getPrice() * qty);
break;

case '4':
System.out.print("Kopi O - quantity: ");
qty = scan.nextInt();
menu[3].printItem();
total += (menu[3].getPrice() * qty);
System.out.println(menu[3].getPrice() * qty);
break;

case 's':break;

default:break;}
 }
while(item.charAt(0) != 's');

System.out.println("\nThank you for your order.");
System.out.printf("Total due: RM %.2f", total);
}
}

