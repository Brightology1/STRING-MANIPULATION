public class VowelCount {
    public static void main(String[] args) {
        //String str = "Vowel and consonant count, and special character count";
        String str = "it is getting better by God's Grace!!!";
         String x = str.toUpperCase();
        char y[] = x.toCharArray();
        int size = y.length;
        int i = 0;
        int vowel = 0;
        int consonant = 0;
        int special = 0;
        while (i != size) {
            if(y[i] >= 'A' && y[i] <= 'Z')
                if (y[i] == 'A' || y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U') {
                    vowel++;
                } else {
                    consonant++;
                }

            else {
                special++;
            }
            i++;
    }
        System.out.println(str);
        System.out.println("Vowel count: " + vowel);
        System.out.println("Consonant count: " + consonant);
        System.out.println("Special character count: " + special);
    }
}
