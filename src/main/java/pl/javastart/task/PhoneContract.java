package pl.javastart.task;

public abstract class PhoneContract {
    protected double smsPrice;
    protected double mmsPrice;
    protected double callPrice;
    protected int smsCounter;
    protected int mmsCounter;
    protected int secondsCounter;
    private double oneMinuteCallPrice;

    public PhoneContract(double smsPrice, double mmsPrice, double callPrice) {
        this.smsPrice = smsPrice;
        this.mmsPrice = mmsPrice;
        this.callPrice = callPrice;
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

    public abstract boolean sendSms();

    public abstract boolean call();

    public abstract boolean sendMms();

    public abstract void printStatus();

}

