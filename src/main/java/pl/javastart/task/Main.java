package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(new CardPhoneContract(2.5, 0.1, .2, 0.5));

        phone.printAccountState();

        phone.sendSms();
        phone.sendMms();
        phone.call(20);

        phone.printAccountState();

        phone.sendSms();
        phone.printAccountState();

        phone.sendSms();
        phone.call(20);

        phone.printAccountState();

    }
}
