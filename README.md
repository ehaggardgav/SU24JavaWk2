In this assignment, we will be creating an inventory system. You are free to choose the individual items, but you must keep track of at least 5 items.

Create a 1D array (items[]) to form a mapping between the index and the name of the item (e.g. items[0] = "screwdriver", item[1] = "hammer", etc.)
The inventory system will span at least 5 warehouses. Use a multidimensional array (inventory[][]) to store the quantities of each item at each warehouse. Each column will represent the different warehouses and each row will represent the item. For example, inventory[0][3] should return the quantity of item 0 at warehouse 3. Each warehouse should hold at least 1 quantity of each item (i.e. no warehouse should be out of stock).
Print out the inventory information to the screen:
   items[0] = screwdriver: warehouse_0=10, warehouse_1=9, warehouse_2=7, warehouse_3=3, warehouse_4=13
   items[1] = hammer:      warehouse_0=12, warehouse_1=6, warehouse_2=6, warehouse_3=3, warehouse_4=10
   items[2] = shovel:      warehouse_0=13, warehouse_1=3, warehouse_2=9, warehouse_3=3, warehouse_4=9
   items[3] = nail:        warehouse_0=11, warehouse_1=3, warehouse_2=4, warehouse_3=3, warehouse_4=19
   items[4] = screw:       warehouse_0=15, warehouse_1=4, warehouse_2=4, warehouse_3=3, warehouse_4=8
A customer comes into warehouse_3 and buys 3 multiples of each item. Update your inventory to reflect the change and print to the screen:
   Customer purchased 3 multiples of each item at warehouse_3, new inventory:

   items[0] = screwdriver: warehouse_0=10, warehouse_1=9, warehouse_2=7, warehouse_3=0, warehouse_4=13
   items[1] = hammer:      warehouse_0=12, warehouse_1=6, warehouse_2=6, warehouse_3=0, warehouse_4=10
   items[2] = shovel:      warehouse_0=13, warehouse_1=3, warehouse_2=9, warehouse_3=0, warehouse_4=9
   items[3] = nail:        warehouse_0=11, warehouse_1=3, warehouse_2=4, warehouse_3=0, warehouse_4=19
   items[4] = screw:       warehouse_0=15, warehouse_1=4, warehouse_2=4, warehouse_3=0, warehouse_4=8
A new shipment is delivered to warehouse_2 and warehouse_4 which increases the quantity of each item by 3. Print out the updated inventory:
   New shipment to warehouse_2 and warehouse_4, new inventory:

   items[0] = screwdriver: warehouse_0=10, warehouse_1=9, warehouse_2=10, warehouse_3=0, warehouse_4=16
   items[1] = hammer:      warehouse_0=12, warehouse_1=6, warehouse_2=9,  warehouse_3=0, warehouse_4=13
   items[2] = shovel:      warehouse_0=13, warehouse_1=3, warehouse_2=12, warehouse_3=0, warehouse_4=12
   items[3] = nail:        warehouse_0=11, warehouse_1=3, warehouse_2=7,  warehouse_3=0, warehouse_4=22
   items[4] = screw:       warehouse_0=15, warehouse_1=4, warehouse_2=7,  warehouse_3=0, warehouse_4=11
Have fun with this problem! Feel free to experiment with quantities, items, and warehouses. If you have a better solution to modeling inventory, include that in your code as well.
