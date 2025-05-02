public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            return ""; // or you could return null based on the desired behavior for an empty array
        }

        // Initialize the longest string with the first string in the array
        String longestString = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Compare the current string with the longest one
            if (arr[i].length() > longestString.length()) {
                longestString = arr[i]; // Update if current string is longer
            }
        }

        return longestString; // Return the longest string found
    }
}
