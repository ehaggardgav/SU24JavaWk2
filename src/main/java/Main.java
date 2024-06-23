
import java.util.Scanner; // import scanner class
public class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  // declare one-dimensional array holding items
  String[] items;
  // initialize array
  items = new String[5];
      items[0] = "screwdriver";
      items[1] = "hammer";
      items[2] = "shovel";
      items[3] = "nail";
      items[4] = "screw";

  // declare multi-dimensional array to hold inventory; will be integer because number of items cannot be a decimal value
  int[][] inventory = {
        {20, 17, 18, 12, 9},
        {16, 23, 11, 8, 19},
        {12, 11, 15, 13, 12},
        {1800, 2200, 1800, 2300, 1400},
        {1000, 900, 1200, 1600, 1800}
  };
  
  //Output code for inventory printout
  System.out.println("\nTool Inventory");
  System.out.print(items[0] + ": " + "Warehouse_1 = " + inventory[0][0] + " ");
  System.out.print("Warehouse_2 = " + inventory[0][1] + " ");
  System.out.print("Warehouse_3 = " + inventory[0][2] + " ");
  System.out.print("Warehouse_4 = " + inventory[0][3] + " ");
  System.out.println("Warehouse_5 = " + inventory[0][4] + " ");
  System.out.print(items[1] + ": " + "Warehouse_1 = " + inventory[1][0] + " ");
  System.out.print("Warehouse_2 = " + inventory[1][1] + " ");
  System.out.print("Warehouse_3 = " + inventory[1][2] + " ");
  System.out.print("Warehouse_4 = " + inventory[1][3] + " ");
  System.out.println("Warehouse_5 = " + inventory[1][4] + " ");
  System.out.print(items[2] + ": " + "Warehouse_1 = " + inventory[2][0] + " ");
  System.out.print("Warehouse_2 = " + inventory[2][1] + " ");
  System.out.print("Warehouse_3 = " + inventory[2][2] + " ");
  System.out.print("Warehouse_4 = " + inventory[2][3] + " ");
  System.out.println("Warehouse_5 = " + inventory[2][4] + " ");
  System.out.print(items[3] + ": " + "Warehouse_1 = " + inventory[3][0] + " ");
  System.out.print("Warehouse_2 = " + inventory[3][1] + " ");
  System.out.print("Warehouse_3 = " + inventory[3][2] + " ");
  System.out.print("Warehouse_4 = " + inventory[3][3] + " ");
  System.out.println("Warehouse_5 = " + inventory[3][4] + " ");
  System.out.print(items[4] + ": " + "Warehouse_1 = " + inventory[4][0] + " ");
  System.out.print("Warehouse_2 = " + inventory[4][1] + " ");
  System.out.print("Warehouse_3 = " + inventory[4][2] + " ");
  System.out.print("Warehouse_4 = " + inventory[4][3] + " ");
  System.out.println("Warehouse_5 = " + inventory[4][4] + " ");

  //Customer purchase of three of each item at Warehouse 3
System.out.println("\nCustomer Purchase:");
System.out.println("\nItems");
      
System.out.print(items[0] + ": ");
String item1 = scan.nextLine();
    System.out.print("Warehouse: ");
    String warehouse1 = scan.nextLine();
    System.out.print("Quantity: ");
    Integer quantity1 = scan.nextInt();
      
System.out.print(items[1] + ": ");
String item2 = scan.nextLine();
    System.out.print("Warehouse: ");
    String warehouse2 = scan.nextLine();
    System.out.print("Quantity: ");
    Integer quantity2 = scan.nextInt();
      
System.out.print(items[2] + ": ");
String item3 = scan.nextLine();
    System.out.print("Warehouse: ");
    String warehouse3 = scan.nextLine();
    System.out.print("Quantity: ");
    Integer quantity3 = scan.nextInt();

System.out.print(items[3] + ": ");
String item4 = scan.nextLine();
    System.out.print("Warehouse: ");
    String warehouse4 = scan.nextLine();
    System.out.print("Quantity: ");
    Integer quantity4 = scan.nextInt();

System.out.print(items[3] + ": ");
String item4 = scan.nextLine();
    System.out.print("Warehouse: ");
    String warehouse4 = scan.nextLine();
    System.out.print("Quantity: ");
    Integer quantity4 = scan.nextInt();


        /*
        System.out.println("Item 1:");
        String item1 = scan.nextLine(); 
        System.out.println("Price:");
        float price1 = scan.nextFloat();
        scan.nextLine();
        */
    
    inventory[0][2] = inventory[0][2] - quantity1; 
    inventory[1][2] = inventory[1][2] - 3; 
    inventory[2][2] = 12; 
    inventory[3][2] = 1797; 
    inventory[4][2] = 1197;

    System.out.println("\nTool Inventory");
    System.out.print(items[0] + ": " + "Warehouse_1 = " + inventory[0][0] + " ");
    System.out.print("Warehouse_2 = " + inventory[0][1] + " ");
    System.out.print("Warehouse_3 = " + inventory[0][2] + " ");
    System.out.print("Warehouse_4 = " + inventory[0][3] + " ");
    System.out.println("Warehouse_5 = " + inventory[0][4] + " ");
    System.out.print(items[1] + ": " + "Warehouse_1 = " + inventory[1][0] + " ");
    System.out.print("Warehouse_2 = " + inventory[1][1] + " ");
    System.out.print("Warehouse_3 = " + inventory[1][2] + " ");
    System.out.print("Warehouse_4 = " + inventory[1][3] + " ");
    System.out.println("Warehouse_5 = " + inventory[1][4] + " ");
    System.out.print(items[2] + ": " + "Warehouse_1 = " + inventory[2][0] + " ");
    System.out.print("Warehouse_2 = " + inventory[2][1] + " ");
    System.out.print("Warehouse_3 = " + inventory[2][2] + " ");
    System.out.print("Warehouse_4 = " + inventory[2][3] + " ");
    System.out.println("Warehouse_5 = " + inventory[2][4] + " ");
    System.out.print(items[3] + ": " + "Warehouse_1 = " + inventory[3][0] + " ");
    System.out.print("Warehouse_2 = " + inventory[3][1] + " ");
    System.out.print("Warehouse_3 = " + inventory[3][2] + " ");
    System.out.print("Warehouse_4 = " + inventory[3][3] + " ");
    System.out.println("Warehouse_5 = " + inventory[3][4] + " ");
    System.out.print(items[4] + ": " + "Warehouse_1 = " + inventory[4][0] + " ");
    System.out.print("Warehouse_2 = " + inventory[4][1] + " ");
    System.out.print("Warehouse_3 = " + inventory[4][2] + " ");
    System.out.print("Warehouse_4 = " + inventory[4][3] + " ");
    System.out.println("Warehouse_5 = " + inventory[4][4] + " ");
  }

  
}