package pl.edu;

public class Main {
    public static void main(String[] args) {
        GenerateNullPointer gen = new GenerateNullPointer();

        try{
            gen.generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException!");
            e.printStackTrace();
            System.out.println(e.toString());
        }

        Account account = new Account("Jan Kowalski", 1000, "123456789");

        try{
            account.transfer(1500);
        } catch (NotEnoughMoneyException e){
            System.out.println("Exception:" + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception:" + e.getMessage());
        } finally {
            System.out.println("Your balance is:" + account.getBalance());
        }
    }
}