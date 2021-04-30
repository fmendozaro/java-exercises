package prep;

public class DuplicateWord {
    public static void main(String[] args) {
        findDuplicateWord("A song can be included in a music library if it matches my music taste");
        findDuplicateWord("We have an update on the status of your claim – we have received the documents you sent.\n" +
                "However, we still need a few more to process your claim");
    }

    public static void findDuplicateWord(String term) {
        int count;
        // Converts the string into lowercase
        term = term.toLowerCase();
        // Split the string into words using built-in function
        String[] words = term.split(" ");

        System.out.println("Duplicate words in a given string: ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if (count > 1 && !words[i].equals("0"))
                System.out.println(words[i]);
        }
    }
}