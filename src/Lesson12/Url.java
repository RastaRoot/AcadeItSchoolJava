package Lesson12;

public class Url {
    public static String getServerName(String url) {
        final String prefix = "://";

        int startIndex = url.indexOf(prefix) + prefix.length();
        int endIndex = url.indexOf("/", startIndex);

        if (endIndex == -1) {
            endIndex = url.length();
        }

        return url.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        System.out.println(getServerName("http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf"));
    }
}