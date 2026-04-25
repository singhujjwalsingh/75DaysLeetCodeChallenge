class WordDictionary {

    class Node {
        Node[] children = new Node[26];
        boolean isEnd = false;
    }

    Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {

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

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int i, Node node) {

        if (node == null) return false;

        if (i == word.length()) return node.isEnd;

        char ch = word.charAt(i);

        // normal character
        if (ch != '.') {
            return dfs(word, i + 1, node.children[ch - 'a']);
        }

        // wildcard case
        for (int j = 0; j < 26; j++) {
            if (node.children[j] != null) {
                if (dfs(word, i + 1, node.children[j])) {
                    return true;
                }
            }
        }

        return false;
    }
}