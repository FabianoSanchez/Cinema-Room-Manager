package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row: ");
        int numberOfSeatsInEachRow = scanner.nextInt();

        int sizeScreenRoom = numberOfRows * numberOfSeatsInEachRow;
        int ticketPrice;

        int smallScreenRoom=sizeScreenRoom*10;
        int firstHalf = numberOfRows / 2;
        int totalIncomeFront = 10*(sizeScreenRoom/2);
        int totalIncomeBack=8*(sizeScreenRoom/2);
        char s = 'S';

        int purchasedTickets=0;
        float tickets = (Integer)purchasedTickets;
        int bigScreenRoom = totalIncomeBack+totalIncomeFront;
        int currentIncome=0;

        char[][] cinemaBlueprint = new char[numberOfRows][numberOfSeatsInEachRow];
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        int option = scanner.nextInt();

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j <numberOfSeatsInEachRow ; j++) {
                cinemaBlueprint[i][j]=s;

            }
        }

        while(option!=0){
            float percentageSold=+(tickets/sizeScreenRoom)*100;

            switch (option) {
                
                case 1:
                    System.out.println("Cinema: ");
                    System.out.print("  ");
                    for (int i = 0; i < numberOfSeatsInEachRow; i++) {
                        System.out.print(1 + i + " ");
                    }
                    System.out.println();
                    for (int i = 0; i < numberOfRows; i++) {
                        System.out.print(1 + i);
                        for (int j = 0; j < numberOfSeatsInEachRow; j++) {
                            System.out.print(" " + cinemaBlueprint[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nEnter a row number:");
                    int rowNumber = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int seatNumberInThatRow = scanner.nextInt();

                    while(rowNumber<0||rowNumber>cinemaBlueprint.length||seatNumberInThatRow<0||seatNumberInThatRow>cinemaBlueprint.length||cinemaBlueprint[rowNumber - 1][seatNumberInThatRow - 1 ]=='B'){

                        if(rowNumber<0||rowNumber>cinemaBlueprint.length||seatNumberInThatRow<0||seatNumberInThatRow>cinemaBlueprint.length){
                            System.out.println("Wrong Input!");
                        }else if(cinemaBlueprint[rowNumber - 1][seatNumberInThatRow - 1 ]=='B'){
                            System.out.println("That ticket has already been purchased!");
                        }
                        System.out.println("\nEnter a row number:");
                        rowNumber = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        seatNumberInThatRow = scanner.nextInt();
                    }
                    if (sizeScreenRoom <= 60) {
                        ticketPrice=10;
                        currentIncome=+currentIncome+10;
                        System.out.println("Ticket price: $" + ticketPrice  +"\n");
                    } else if (rowNumber <= firstHalf) {
                        ticketPrice=10;
                        currentIncome=+currentIncome+10;
                        System.out.println("Ticket price: $" + ticketPrice  +"\n");
                    } else {
                        ticketPrice=8;
                        currentIncome=+currentIncome+8;
                        System.out.println("Ticket price: $" + ticketPrice  +"\n");
                    }
                    char busy = 'B';
                    cinemaBlueprint[rowNumber - 1][seatNumberInThatRow - 1] = busy;
                    purchasedTickets++;
                    tickets++;
                    tickets =+tickets;
                    break;
                case 3:
                    System.out.println("Number of purchased tickets: "+purchasedTickets);
                    System.out.printf("Percentage:%.2f%s ", percentageSold,"%");
                    System.out.println("\nCurrent income: $"+currentIncome);
                    if(sizeScreenRoom<=60){
                        System.out.println("Current income $"+smallScreenRoom+"\n");
                    }else
                        System.out.println("Total income: $"+bigScreenRoom+"\n");
                    break;


            }
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            option = scanner.nextInt();
        }
    }
}
