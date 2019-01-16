package lesson2;

public class Main1 {
    public static void main(String[] args) {

        int money = 150;
        int toyCost = 52;
        int booblegoomCost = 10;
        int candyCost = 1;

        int coutToyBuy = money / toyCost;
        int restAfterToysBuy = money - (coutToyBuy * toyCost);

        int countBoobleGoomBuy = restAfterToysBuy / booblegoomCost;
        int restAfterCBG = restAfterToysBuy - (countBoobleGoomBuy / booblegoomCost);

        int countCandyBuy = restAfterCBG / candyCost;
        int restAfterCandy = restAfterCBG - (countCandyBuy / candyCost);

        System.out.println(coutToyBuy);
        System.out.println(countBoobleGoomBuy);
        System.out.println(countCandyBuy);


    }
}
