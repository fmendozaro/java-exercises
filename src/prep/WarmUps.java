package prep;

public class WarmUps {

    public static void main(String[] args) {
        System.out.println("html "+highlight("code", "configure my codeup #$%#$%code123 thisatThendCode, CODEUP"));
        System.out.println(highlight("ana", "banana")); // "b<b>anana</b>"
        System.out.println(highlight("aa", "helloaaaaaa")); // "hello<b>aaaaaa</b>"
    }

    // Given an input string and a query, implement a function `highlight` that highlights all occurrences of the query with bold tag:
    // highlight("code", "configure figma") => "configure my codeup #$%#$%code123 thisatThendCode, FIGMA"
    public static String highlight(String query, String text) {
        String result = "";
        String openB = "<b>";
        String closedB = "</b>";

        int firstIndex = text.toLowerCase().indexOf(query);
        System.out.println("firstIndex: " + firstIndex);
        while (firstIndex > 0) {
            firstIndex = text.toLowerCase().indexOf(query);
            if (text.length() < firstIndex + query.length()) {
                break;
            }

            if (firstIndex < 0) {
                result += text;
                break;
            }

            result += text.substring(0, firstIndex) + openB + text.substring(firstIndex, firstIndex + query.length()) + closedB;

            text = text.substring(firstIndex + query.length());
            System.out.println("text: " + text);
            System.out.println("result so far: " + result);
        }

        // System.out.println("result: "+result);
        return result;
    }


}
