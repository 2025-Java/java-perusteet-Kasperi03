package viikko1;

public class TimesTable {
    public static String table(int n) {
        String[] kaikki = new String[10];

        for (int i = 1; i <= 10; i++) {
            kaikki[i-1] = n + " x " + i + " = " + (n * i);
        }

        String tulos = "";
        for (int i = 0; i < kaikki.length; i++) {
            tulos += kaikki[i] + "\n";
        }

        return tulos;
    }
}

