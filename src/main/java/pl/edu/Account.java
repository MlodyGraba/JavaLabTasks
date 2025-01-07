package pl.edu;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter

public class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public void transfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("Not enough money");
        }
        balance -= amount;
    }
}
