package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String salasana = "java123";

        for (int i = 0; i < tries.length; i++) {
            if (tries[i].equals(salasana)) {
                return "Tervetuloa!";
            }
            if (i == 2) { 
                return "Liian monta virheellistä yritystä.";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}


