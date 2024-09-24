package seminar2;

public class TextCleaner {
    public static String removeEmptyLines(String text) {
        StringBuilder spl = new StringBuilder("");
        String[] sss = text.split("\n");
        for (int i = 0; i < sss.length; i++){
            if (!sss[i].trim().isEmpty()){
                spl.append("\n");
            }
            spl.append(sss[i]);
        }
        return spl.toString();
    }
}
