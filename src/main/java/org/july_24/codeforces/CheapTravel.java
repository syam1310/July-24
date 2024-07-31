package org.july_24.codeforces;

public class CheapTravel {
    public static void main(String[] args) {
        int n = 6, m = 2, a = 1, b = 2;

        int singleTiccost = n * a;

        int specialTicket = (n + m- 1) / m;

        int costSpecialTicket = specialTicket * b;

        int costSpecialTicketAndSigle = Math.min(costSpecialTicket, specialTicket * b);

        int leftOverRides = n % m;
        int costSpecialTicketLeftOver = (specialTicket - 1) * b + leftOverRides * a;

        int minCost = Math.min(singleTiccost, Math.min(costSpecialTicket, costSpecialTicketLeftOver));

        System.out.println(minCost);
    }
}
