public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Muhammad", "Abimayu");
        bank.addCustomer("Ahmad", "Fauzan");
        bank.addCustomer("Budi", "Santoso");

        Customer customer1 = bank.getCustomer(0);
        Customer customer2 = bank.getCustomer(1);
        Customer customer3 = bank.getCustomer(2);

        customer1.setAccount(new Account(1000000));
        customer2.setAccount(new Account(2000000));
        customer3.setAccount(new Account(3000000));

        customer1.getAccount(0).deposit(500000);
        customer2.getAccount(0).withdraw(250000);

        System.out.println("Jumlah Customer: " + bank.getNumOfCustomers());
        System.out.println();

        System.out.println("Customer 1:");
        System.out.println("Nama: " + customer1.getFirstName() + " "
                + customer1.getLastName());
        System.out.println("Jumlah Account: " + customer1.getNumOfAccounts());
        System.out.println("Saldo: " + customer1.getAccount(0).getBalance());

        System.out.println();

        System.out.println("Customer 2:");
        System.out.println("Nama: " + customer2.getFirstName() + " "
                + customer2.getLastName());
        System.out.println("Jumlah Account: " + customer2.getNumOfAccounts());
        System.out.println("Saldo: " + customer2.getAccount(0).getBalance());

        System.out.println();

        System.out.println("Customer 3:");
        System.out.println("Nama: " + customer3.getFirstName() + " "
                + customer3.getLastName());
        System.out.println("Jumlah Account: " + customer3.getNumOfAccounts());
        System.out.println("Saldo: " + customer3.getAccount(0).getBalance());
    }
}
