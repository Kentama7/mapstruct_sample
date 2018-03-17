package qualifier;

@CharacterConverter
public class Characters {

    @ToUpper
    public String upperCase(String string) {
        return (string == null) ? null : string.toUpperCase();
    }
}
