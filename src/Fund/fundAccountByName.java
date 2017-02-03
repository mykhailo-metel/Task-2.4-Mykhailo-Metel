package Fund;

/**
 ДЗ №02.4

 You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding

 Input

 int[] balances = {1200, 250, 2000, 500, 3200};

 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

 String ownerName = Oww
 double withdrawal = 100;

 Output
 Oww 600
 */
public class fundAccountByName {
    public static void main(String[] args) {
        double[] balances = {15, 250, 2000, 500, 3200};
        String[] ownerNames = {"Vasia", "Ann", "Petia", "Oww", "Lane"};

        String ownerName="Vasia";
        double amount=10;
        fundMoney(ownerName, amount, balances, ownerNames);

        ownerName="Petia";
        amount=200;
        fundMoney(ownerName, amount, balances, ownerNames);

        printBalances(ownerNames,balances);

    }

    private static void printBalances(String[] ownerNames, double[] balances) {
        for (int i = 0; i < ownerNames.length; i++)
            System.out.println("Name: " + ownerNames[i] + "\t Balance: " + balances[i]);
    }

    private static void fundMoney(String Name, double amountOfFunding, double[] balancesOnAccounts, String[] Names) {
        System.out.println(Name + " want to fund his account on "+ amountOfFunding);

        for (int i = 0; i < Names.length; i++) {
            if(Names[i]== Name)
            {
                System.out.println(Name+"'s balance before funding is " + balancesOnAccounts[i]);
                balancesOnAccounts[i]+= amountOfFunding;
                System.out.println("Operation successful");
                System.out.println(Name+"'s balance after funding is " + balancesOnAccounts[i]);
                break;
            }
        }
    }

}
