public class App {
    public static void main(String[] args) throws Exception {

        // UC1: creating linkedlist of MyMapNode
        HashTable<String, Integer> hashtable = new HashTable<>();

        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        countFrequency(sentence, hashtable);

        System.out.println("The frequencies of the words are:");
        System.out.println(hashtable.toString());
    }

    // method to count frequency of words in string
    public static void countFrequency(String str, HashTable<String, Integer> hashtable) {
        String[] words = str.split(" "); // storing all words in array
        for (String word : words) {
            hashtable.put(word, hashtable.getOrDefault(word, 0) + 1);
        }
    }
}
