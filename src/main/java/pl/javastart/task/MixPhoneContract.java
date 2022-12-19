package pl.javastart.task;

public class MixPhoneContract extends CardPhoneContract {

    private int freeSms = 100;
    private int freeMms = 50;
    private int freeMinutes = 50;

    public MixPhoneContract(double balance, double smsPrice, double mmsPrice, double callPrice) {
        super(balance, smsPrice, mmsPrice, callPrice);
    }

    @Override
    public boolean sendSms() {
        if (freeSms > 0) {
            freeSms = freeSms - 1;
            smsCounter++;
            return true;
        } else {
            if (balance >= smsPrice) {
                balance = balance - smsPrice;
                smsCounter++;
            }
            return false;
        }
    }

    @Override
    public boolean call() {
        if (freeMinutes > 0) {
            freeMinutes = freeMinutes - (secondsCounter / 60);
            return true;
        } else {
            if (balance >= smsPrice) {
                balance = balance - smsPrice;
                smsCounter++;
            }
            return false;
        }
    }

    @Override
    public boolean sendMms() {
        if (freeMms > 0) {
            freeMms = freeMms - 1;
            mmsCounter++;
            return true;
        } else {
            if (balance >= mmsPrice) {
                balance = balance - mmsPrice;
                mmsCounter++;
            }
            return false;
        }
    }

}
