import java.util.Scanner;
public class GamingRentalShopSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean transaction = true;
        int total= 0;
        int price[] = {200,250,300,350,400,450,500,550};
        
        System.out.print("Welcome to Bacani`s Game Rental Shop!\n");
        System.out.print("Username : "); 
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        System.out.print("1.) Rent Games\n");
        System.out.print("2.) Return Games\n");
        System.out.print("3.) About\n");
        System.out.print("4.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(transaction){
                    
                System.out.print("\n\tAVAILABLE GAMES\n\n");
                System.out.print("GAMES\t\t\tPRICE\n\n");
                System.out.print("1.) Roblox\t\tP 200 per day\n\n");
                System.out.print("2.) Dota 2\t\tP 250 per day\n\n");
                System.out.print("3.) Fornite\t\tP 300 per day\n\n");
                System.out.print("4.) Farlight 84\t\tP 350 per day\n\n");
                System.out.print("5.) Warzone 2.0\t\tP 400 per day\n\n");
                System.out.print("6.) Planetside 2\tP 450 per day\n\n");
                System.out.print("7.) Combat Master\tP 500 per day\n\n");
                System.out.print("8.) Veiled Experts\tP 550 per day\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter the quantity here : ");
                int quantity = input.nextInt();
                
                System.out.print("How many day/s you wanted it to rent: ");
                int days = input.nextInt();
                
                total += price[userChoice - 1] * quantity;
                
                System.out.print("Do you want to rent more games? (y/n): ");
                input.nextLine();
                String rentMore = input.nextLine();
                
                if(rentMore.equalsIgnoreCase("n")){
                    transaction = false;
                    System.out.print("The total price is: P " + total + "\n");
                    
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU FOR RENTING OUR GAME/S ^_^\n\n");
                }
                
                }
                
                break;
                
            case 2:
                System.out.print("\n\tAVAILABLE GAMES TO BE RETURNED\n\n");
                System.out.print("1.) Roblox\n\n");
                System.out.print("2.) Dota 2\n\n");
                System.out.print("3.) Fornite\n\n");
                System.out.print("4.) Farlight 84\n\n");
                System.out.print("5.) Warzone 2.0\n\n");
                System.out.print("6.) Planetside 2\n\n");
                System.out.print("7.) Combat Master\n\n");
                System.out.print("8.) Veiled Experts\n\n");
                
                System.out.print("Enter your choice here : ");
                int returnGames = input.nextInt();
                
                System.out.print("\n\n---SUCCESSFULLY RETURNED---\n\n");
                break;
                
            case 3:
                System.out.print("\n\nWelcome to our gaming rental shop system! We are passionate about gaming and want to share that\npassion with you. Our goal is to provide you with the best gaming experience possible by offering a wide\nselection of games and consoles at affordable prices. Whether you’re a casual gamer or a hardcore\nenthusiast, we have something for everyone.\n\n");
                break;
            
            case 4:
                System.out.print("\n\n---EXITED---\n\n");
                break;
                
            default:
                System.out.print("\n\nINVALID CHOICE!\n\n");
                break;
                
        }
        
        
        
        
                
    }
}
