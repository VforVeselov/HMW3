import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {

    public String getFullNumber(Phone phone) {
        return phone.prefix + phone.prefix;
    }

    public String getPhoneWithCode(Phone phone) {
        return phone.bonus == null ? phone.prefix + phone.number : phone.prefix + phone.number + "#" + phone.bonus;
    }
}
