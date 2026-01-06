class Solution {
    public String reverseWords(String s) {
        String[] word=s.trim().split("\\s+");

        StringBuilder result =new StringBuilder();

        for(int i=word.length-1;i>=0;i--){
            result.append(word[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}

/**
without using split()
class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            int j = i;

            // Find the start of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Append the word
            result.append(s.substring(i + 1, j + 1));

            // Add space if more words exist
            result.append(" ");
        }

        // Remove trailing space
        return result.toString().trim();
    }
}
 */