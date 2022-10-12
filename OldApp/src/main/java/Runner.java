import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.number = "91222331";
        phone.prefix = "+7";
        log.trace(PhoneUtil.getFullNumber(phone));
    }
}
