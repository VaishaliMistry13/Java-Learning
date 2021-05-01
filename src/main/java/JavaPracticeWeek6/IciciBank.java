package JavaPracticeWeek6;

public class IciciBank implements UKBank, USBank, AusBank{

    @Override
    public void freeCash() {
        System.out.println("Max is 300");
    }

    @Override
    public void debitCard() {
        System.out.println("New Debit Card");
    }

    @Override
    public void creditCard() {
        System.out.println("New Credit Card");
    }

    @Override
    public void onlineBanking() {
        System.out.println("Able to Use Online Banking");
    }

    @Override
    public void over18() {
        System.out.println("Person Has To Be Over 18");
    }

    @Override
    public void chequeBook() {
        System.out.println("New Cheque Book");
    }

}
