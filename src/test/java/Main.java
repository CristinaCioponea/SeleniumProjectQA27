
public class Main {

    public static void main(String[] args) {
//      LoginTest loginTest = new LoginTest();
//      loginTest.validLoginTest();
//      RegisterTest registerTest = new RegisterTest();
//      registerTest.validRegisterTest();
      AccountInformation accountInformation = new AccountInformation();
      accountInformation.validAccountInformation();


    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}