package seminar2;

public class URLBuilder {
    public static String buildURL(String baseURL, String params) {
        String[] pairs = params.split("&");
        StringBuilder url = new StringBuilder(baseURL);

        if (url.charAt(url.length() - 1) != '?') url.append("?");
        for (int i = 0; i < pairs.length; i++) {
            String[] b = pairs[i].split("=");
            if (!b[1].equals("null")) {
                url.append(pairs[i]);
                if (i != pairs.length - 2) url.append("&");
            }
        }
        return url.toString();
    }
}
