public class UE_07_Strings {
    public static void main(String[] args) {
        System.out.println(repeat("ab", 3));
        System.out.println(reverse("1234"));
        System.out.println(removeNonLetters("Die Liebe ist Sieger; stets rege ist sie bei Leid."));
        System.out.println(isPalindrom("Die Liebe ist Sieger; stets rege ist sie bei Leid."));
    }

    public static String repeat(String text, int anzahl) {
        String ruckgabe = "";
        for (int i = 0; i < anzahl; i++) {
            ruckgabe += text;
        }
        return ruckgabe;
    }

    public static String reverse(String s) {
        String rstring = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rstring += s.charAt(i);
        }
        return rstring;
    }

    public static String removeNonLetters(String s) {
        String rstring = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                rstring += s.charAt(i);
            }
        }
        return rstring;
    }

    public static boolean isPalindrom(String word) {
        word = removeNonLetters(word);
        word = word.toLowerCase();
        String reverseWord = reverse(word);
        boolean ruckgabe = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == reverseWord.charAt(i)) {
                ruckgabe = true;
            } else {
                return false;
            }
        }
        return ruckgabe;
    }

    public static int random(int min, int max) {
        int returnNr = min + (int) ((max - min + 1) * Math.random());
        return returnNr;
    }


    public static String getRandomPassword(int length) {
        char randomChar = ' ';
        String returnString = "";

        for (int i = 0; i < length; i++) {

            int rand_nr = random(1, 5);
            if (rand_nr == 1) {
                randomChar = (char) random(48, 57);
            }
            if (rand_nr == 2) {
                randomChar = (char) random(97, 107);
            }
            if (rand_nr == 3) {
                randomChar = (char) random(109, 122);
            }
            if (rand_nr == 4) {
                randomChar = (char) random(65, 78);
            }
            if (rand_nr == 5) {
                randomChar = (char) random(80, 90);
            }
            returnString += "" + randomChar;
        }
        return returnString;
    }

}
