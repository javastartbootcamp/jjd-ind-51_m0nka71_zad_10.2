package pl.javastart.task;

public interface PhoneUtils {

    void sendSms();

    void call(int seconds);

    void sendMms();

    void printAccountState();
}
