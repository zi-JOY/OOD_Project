import java.util.Scanner;

public class Admin extends Product_Info{
    Scanner scanner = new Scanner(System.in);
    void adminLogin(){
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        if(username.equals(info.getAdmin_username())){
            System.out.println("Enter Password: ");
            String pass = scanner.nextLine();
            if(pass.equals(info.getAdmin_password())){
                while (true) {
                    System.out.println("1.View product");
                    System.out.println("2.Add product");
                    System.out.println("3.Remove product");
                    System.out.println("4.Exit");
                    System.out.println("Enter Your Choice");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            view();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 2:
                            adminAdd();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 3:
                            adminRemove();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 4:
                            return;
                    }
                }
            }else System.out.println("Invalid Password");
        }else System.out.println("Invalid Username");
    }
    void adminAdd(){
        System.out.println("How Many Products To Add: ");
        int size = scanner.nextInt();
        for(int i=0; i<size; i++){
            scanner.nextLine();
            System.out.println("Enter Product Name: ");
            product_list.add(scanner.nextLine());
            System.out.println("Enter Product Price: ");
            product_price.add(scanner.nextInt());
        }
        System.out.println("Product Saved");
    }
    void adminRemove(){
        scanner.nextLine();
        System.out.println("Enter The name of the product You want to remove: ");
        String name = scanner.nextLine();
        if(product_list.contains(name)){
            int index=product_list.indexOf(name);
            System.out.println("Product Removed "+name);
            product_list.remove(name);
            product_price.remove(index);
        }
    }
}
