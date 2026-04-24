class Trie {

    class Node {
        Node[] children = new Node[26];
        boolean isEnd = false;
    }

    private Node root;

    public Trie() {
        root = new Node();
    }

    // Insert word
    public void insert(String word) {

        Node curr = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }

            curr = curr.children[index];
        }

        curr.isEnd = true;
    }

    // Search full word
    public boolean search(String word) {

        Node node = findNode(word);
        return node != null && node.isEnd;
    }

    // Prefix check
    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    // Helper
    private Node findNode(String str) {

        Node curr = root;

        for (char ch : str.toCharArray()) {
            int index = ch - 'a';

            if (curr.children[index] == null) return null;

            curr = curr.children[index];
        }

        return curr;
    }
}