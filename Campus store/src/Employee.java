import java.util.ArrayList;

public class Employee extends Product_Info{
    ArrayList<Integer> total = new ArrayList<>();
    ArrayList<Integer> price1=new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> quantity=new ArrayList<>();
    int total2=0;
    void employeeLongin(){
        System.out.println("Enter Username: ");
        String user=scanner.nextLine();
        if(user.equals(info.getEmployee_username())) {
            System.out.println("Enter Password: ");
            String pass = scanner.nextLine();
            if(pass.equals(info.getEmployee_password())){
                while (true) {
                    System.out.println("1.Make Bill");
                    System.out.println("2.Exit");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        view1();
                        name.clear();
                        price1.clear();
                        quantity.clear();
                        total.clear();
                        total2=0;
                        System.out.println("Press 1 To Continue: ");
                        scanner.next();

                    } else if (choice == 2) {
                        return;
                    } else System.out.println("Invalid Choice");
                }
            }else System.out.println("Invalid Password");
        }else System.out.println("Invalid Username");
    }

    void view1() {
        view();
        while (true) {
            System.out.println("O To Bill");
            System.out.println("Enter Your Choice: ");
            int choice= scanner.nextInt();
            if(choice==0)break;
            int total1=product_price.get(choice-1);
            System.out.println("Enter Quantity: ");
            int quantity1 =scanner.nextInt();
            total1 = total1*quantity1;
            name.add(product_list.get(choice-1));
            price1.add(product_price.get(choice-1));
            total.add(total1);
            quantity.add(quantity1);
            total2+=total1;
        }
        priceView();
    }
    void priceView(){
        System.out.println("Name        Price        Quantity    =    Total");
        for(int i=0; i<name.size(); i++){
            System.out.printf("%s          %d           %d         =    %d\n",name.get(i),price1.get(i),quantity.get(i),total.get(i));
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Total                                     = "+total2);
    }
}
