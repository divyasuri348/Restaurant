import java.util.ArrayList;

public class Restaurant {
    String [] menu;
    String [][] reserved;
    ArrayList<String> customers;
    public Restaurant() {
        menu = new String[10];
    }
    public void setMenu(){
        menu[0] = "Hamburger";
        menu[1] = "Pizza";
        menu[2] = "Ice cream";
        menu[3] = "French Fries";
        menu[4] = "Fried Chicken";
        menu[5] = "Cake";
        menu[6] = "Bread";
        menu[7] = "Taco";
        menu[8] = "Doughnut";
        menu[9] = "Salad";

    }
    public void setReserved(int r, int c){
        for(int r = 0; r < reserved.length; r++){
            for(int c = 0; c < reserved[r].length; c++){

            }
        }
    }
    public void getOrder(String order){
        for(int i = 0; i < menu.length; i++){
            if(menu[i].equals(order)){
                System.out.println("We added "+ menu[i]+ " to your order");
            }
            else{
                System.out.println(menu[i]+ " isn't  apart of our menu, please pick something from the menu. ");
            }
        }
    }
}
