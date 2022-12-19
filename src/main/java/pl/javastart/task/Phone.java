package pl.javastart.task;

public class Phone {
    private PhoneContract phoneContract;

    public Phone(PhoneContract phoneContract) {
        this.phoneContract = phoneContract;
    }

    public void sendSms() {
        boolean success = phoneContract.sendSms();
        if (success) {
            System.out.println("SMS wysłany");
        } else {
            System.out.println("Nie udało się wysłać SMSa");
        }
    }

    public void call(int seconds) {
        boolean success = phoneContract.call();
        if (success) {
            phoneContract.secondsCounter += seconds;
            System.out.println("Rozmowa trwała: " + seconds + " sekund");
        } else {
            System.out.println("Rozmowa przerwana, brak środków");
        }
    }

    public void sendMms() {
        boolean success = phoneContract.sendMms();
        if (success) {
            System.out.println("MMS wysłany");
        } else {
            System.out.println("Nie udało się wysłać MMSa");
        }
    }

    public void printAccountState() {
        phoneContract.printStatus();
    }
}
