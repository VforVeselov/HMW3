import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.Value;

@Value
public class Phone {
    @NonNull public String prefix;
    @NonNull public String number;
    public String bonus;
}
