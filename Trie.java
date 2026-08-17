// Trie is a tree-like data structure that stores a dynamic set or associative array where the keys are usually strings.
// alos known as prifix trie,digital search, retrievel tree.
//  every node has unlimited sub nodes are available we called them K-ary tree
// mostly used for searching too many words or st ring in the data 
// it is faster than hash table and binary search tree.
// it is used in autocomplete feature, spell checker, autocomplete search engine etc.
// in trie we can find a word in O(l) time where l is the length of the word.
//  it can be implemented using array or linked list.
// roots is an empty node , it dont have its own data its just help us to reach to the children nodes .
// prifix is not repeated. 
// The trie store  data as the letter by letter
// for only a-z / A-z characters we use 26 letters , and if need to store a-z,A-Z, @#$%^&*%$@>... then we use 256 size of array. 

// how trie is generated 
// class node {
//     node[] children: 126
//     boolean EndOfWord;
// }
// for root the end of value is always false becouse becaous ether is no end of value in the root node .

//inserting in tries big(O(l))  l = time complexity of the elemets 
public class Trie {
    static class Node {
        Node[] children;
        boolean isEndOfWord;

        public Node() {
            children = new Node[26]; // store a-z
            // its require to initialize the array with loop i
            for (int i = 0; i < 26; i++) {
                children[i] = null; // for every root it initialy null
            }
            isEndOfWord = false; // by default initialize it as false.
        }

    }

    static Node root = new Node(); // whenever we create trie this root will be there but initially its empty.
    // now store all words in the trie.

    // inserting in tries big(O(l)) l = time complexity of the elemets
    public static void insert(String word) {
        Node currentNode = root; // taking the current node becouse the root is always fix not change againa n
                                 // again.
        for (int i = 0; i < word.length(); i++) { // O(l)
            int index = word.charAt(i) - 'a';

            if (currentNode.children[index] == null) { // if its empty then create new node
                // add new node
                currentNode.children[index] = new Node();
            }
            // if the word is last then end of word will be true .
            if (i == word.length() - 1) {
                currentNode.children[index].isEndOfWord = true;
            }
            currentNode = currentNode.children[index]; // now the rootnode is the rootnode which is creted .
        }
    }

    // seacrching elemstz in the node
    public static boolean seacrch(String key) {
        Node currentNode = root;
        for (int i = 0; i < key.length(); i++) { // O(l) = key length.
            int index = key.charAt(i) - 'a';
            Node node = currentNode.children[index];
            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && node.isEndOfWord == false) {
                return false;
            }
            // now update the currentNode node
            currentNode = currentNode.children[index];
        }
        return true;

    }

    // search for prifix
    public static boolean searchPrefix(String prefix) {
        Node currentvalue = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (currentvalue.children[index] == null) {
                return false;
            }
            currentvalue = currentvalue.children[index]; // updatin level
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(seacrch("their")); // true
        System.out.println(seacrch("thor")); // false
        System.out.println(searchPrefix("jghe")); // false

    }
}
