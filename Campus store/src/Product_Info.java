import java.util.ArrayList;
import java.util.Scanner;

public abstract class Product_Info {
    Scanner scanner = new Scanner(System.in);
    Login_Info info = new Login_Info();
    static ArrayList<String> product_list = new ArrayList<>();
    static ArrayList<Integer> product_price = new ArrayList<>();
    void add(){
        product_list.add("Pepsi");
        product_list.add("Milk");
        product_list.add("Chips");
        product_list.add("Bread");
        product_price.add(30);
        product_price.add(40);
        product_price.add(20);
        product_price.add(50);
    }
    static void view(){
        for(int i=0; i<product_list.size(); i++){
            System.out.printf("%d.Name: %s   Price: %d\n",i+1,product_list.get(i),product_price.get(i));
        }
    }
}
