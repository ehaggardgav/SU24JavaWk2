
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

//Customer purchase of three of each item at Warehouse 3 (can be filled in with user input)
System.out.println("\nCustomer Purchase:");
System.out.println("\nQuantity");

System.out.println("");
System.out.print(items[0] + ": ");
Integer quantity1 = scan.nextInt();
    System.out.print("Warehouse: ");
    String warehouse1 = scan.nextLine();
      scan.nextLine();
    
System.out.print(items[1] + ": ");
Integer quantity2 = scan.nextInt();
    System.out.print("Warehouse: ");
    String warehouse2 = scan.nextLine();
       scan.nextLine();
    
System.out.print(items[2] + ": ");
Integer quantity3 = scan.nextInt();
    System.out.print("Warehouse: ");
    String warehouse3 = scan.nextLine();
       scan.nextLine();
     
System.out.print(items[3] + ": ");
Integer quantity4 = scan.nextInt();
    System.out.print("Warehouse: ");
    String warehouse4 = scan.nextLine();
       scan.nextLine();
          
System.out.print(items[3] + ": ");
Integer quantity5 = scan.nextInt();
    System.out.print("Warehouse: ");
    String warehouse5 = scan.nextLine();
       scan.nextLine();
    

 //This information will need to be updated manually to reflect the user input
    inventory[0][2] = inventory[0][2] - quantity1; 
    inventory[1][2] = inventory[1][2] - quantity2; 
    inventory[2][2] = inventory[2][2] - quantity3; 
    inventory[3][2] = inventory[3][2] - quantity4; 
    inventory[4][2] = inventory[4][2] - quantity5;

    System.out.println("\nUpdated Tool Inventory");
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

System.out.println("\nShipment Details:");
      System.out.print("Item: ");
      String itemIN = scan.nextLine();
        System.out.print("Warehouse: ");
        String whichHOUSE = scan.nextLine();
        System.out.print("Quantity: ");
        Integer quantIN = scan.nextInt();
            scan.nextLine();
      
//Warehouse 2
    inventory[0][1] = inventory[0][1] + quantIN; 
    inventory[1][1] = inventory[1][1] + quantIN; 
    inventory[2][1] = inventory[2][1] + quantIN; 
    inventory[3][1] = inventory[3][1] + quantIN; 
    inventory[4][1] = inventory[4][1] + quantIN;

//Warehouse 4
    inventory[0][3] = inventory[0][3] + quantIN; 
    inventory[1][3] = inventory[1][3] + quantIN; 
    inventory[2][3] = inventory[2][3] + quantIN; 
    inventory[3][3] = inventory[3][3] + quantIN; 
    inventory[4][3] = inventory[4][3] + quantIN;

//Again, this would have to be manually updated for any changes, so is not a good general approach, but could be used to track simple changes.
      
      System.out.println("\nUpdated Tool Inventory");
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