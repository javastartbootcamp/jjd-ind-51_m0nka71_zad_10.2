package pl.javastart.task;

public abstract class PhoneContract {
    private double balance;
    private double smsPrice;
    private double mmsPrice;
    private double oneMinuteCallPrice;

    public PhoneContract(double balance, double smsPrice, double mmsPrice, double oneMinuteCallPrice) {
        this.balance = balance;
        this.smsPrice = smsPrice;
        this.mmsPrice = mmsPrice;
        this.oneMinuteCallPrice = oneMinuteCallPrice;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(double smsPrice) {
        this.smsPrice = smsPrice;
    }

    public double getMmsPrice() {
        return mmsPrice;
    }

    public void setMmsPrice(double mmsPrice) {
        this.mmsPrice = mmsPrice;
    }

    public double getOneMinuteCallPrice() {
        return oneMinuteCallPrice;
    }

    public void setOneMinuteCallPrice(double oneMinuteCallPrice) {
        this.oneMinuteCallPrice = oneMinuteCallPrice;
    }
}

