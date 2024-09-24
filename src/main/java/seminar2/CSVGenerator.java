package seminar2;

public class CSVGenerator {
    public static String generateCSV(String[] headers, String[][] data) {
        //String.join(",", headers);
        StringBuilder str = new StringBuilder(String.join(",", headers));
        str.append("\n");
        for (int i = 0; i < data.length; i++) {
            //str.append(Arrays.toString(data[i]));
            str.append(String.join(",", data[i]));
            str.append("\n");
        }
        return str.toString().trim();
    }
}
