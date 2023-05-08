import java. util. Scanner;


class Main {
    public static void main(String[] args) {
        CreditCard[] list = new CreditCard[0];
        Scanner action = new Scanner(System.in);
        while(true){
            System.out.printf("In order to see the list of credit cards press 0 and in order to add a new credit card press 1: ");
            int actionChosen = action.nextInt();
            if (actionChosen == 1) {
                Scanner scanner = new Scanner(System.in);
                CreditCard[] temp = new CreditCard[list.length + 1];
                temp[list.length] = new CreditCard();
                for(int i = 0; i < list.length; i++) {
                    temp[i] = list[i];
                }
                System.out.printf("Enter the name of the cardholder: ");
                temp[list.length].cardholderName = scanner.nextLine();
                System.out.printf("Enter the number of the card: ");
                temp[list.length].cardNumber = scanner.nextInt();
                System.out.printf("Enter the expiration date of the card: ");
                temp[list.length].expirationDate = scanner.nextInt();
                System.out.printf("Enter the cvv2 of the card: ");
                temp[list.length].cvv2 = scanner.nextInt();
                list = temp;
                System.out.println("The card has been successfully added to the list");
            }
            else {
                if(list.length > 0) {
                    for (int i = 0; i < list.length; i++) {
                        System.out.println("Name of the cardholder: " + list[i].cardholderName);
                        System.out.println("Number of the card: " + list[i].cardNumber);
                        System.out.println("Expiration date of the card: " + list[i].expirationDate);
                        System.out.println("Cvv2 of the card: " + list[i].cvv2 + "\n");
                    }
                }
                else {
                    System.out.println("There are no cards in the list");
                }
            }
        }

    }
}
