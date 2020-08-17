public class Main {

    public static void main(String[] args) {
        ITelephone kimsPhone;
        kimsPhone = new DeskPhone(123456);
        kimsPhone.powerOn();
        kimsPhone.callPhone(123456);
        kimsPhone.answer();
        System.out.println();


        ITelephone leesPhone;
        leesPhone = new MobilePhone(24565);
        leesPhone.callPhone(24565);
        leesPhone.answer();
        leesPhone.powerOn();
        leesPhone.callPhone(24565);
        leesPhone.answer();
    }
}
