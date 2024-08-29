package access;

public class BankAccount {

    private int balance; // 데이터 필드는 외부에 직접 노출하지 않는다

    public BankAccount() {
        balance = 0;
    }

    //public 메서드: deposit(입금)
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드: withdraw(출금)
    public void withdraw(int amount){
        if(isAmountValid(amount)&&balance - amount >0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드: getBalance(잔고)
    public int getBalance() {
        return balance;
    }

    // 입력 금액을 검증하는 기능은 내부에서만 필요함 - private
    private boolean isAmountValid(int amount){
        // 금액이 0보다 커야함
        return amount > 0;
    }


}