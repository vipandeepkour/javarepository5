package mypackage;
import java.util.Scanner;
public class productclass
{
public int id;
public String name;
public int price;
 public productclass (int id, String name, int price)
 {
	 this.id=id;
	 this.name=name;
	 this.price=price;
 }
/*public void readData()
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter product id");
id=Integer.parseInt(sc.nextLine());//
//id=sc.nextInt();
System.out.println("Enter product name");
name=sc.nextLine();
System.out.println("Enter product price");
price=Integer.parseInt(sc.nextLine());
//price=sc.nextInt();
sc.close();
}*/
public void printData()
{
System.out.println("product id: " +id);
System.out.println("product name: "+name);
System.out.println("product price: Rs "+price);
}
}