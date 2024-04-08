public class CountVowel {
    public static void main(String[] args) {
        String str = "Rohan Barai";
        int count = 0;
        int[] vowelCounts = new int[5]; // Index 0: 'a', Index 1: 'e', Index 2: 'i', Index 3: 'o', Index 4: 'u'
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    vowelCounts[j]++;
                    count++;
                    break; // Break the inner loop once a vowel is found
                }
            }
        }
        
        for (int k = 0; k < vowels.length; k++) {
            System.out.println("Number of '" + vowels[k] + "' in the string: " + vowelCounts[k]);
        }
        
        System.out.println("Total number of vowels in the string: " + count);
    }
}
