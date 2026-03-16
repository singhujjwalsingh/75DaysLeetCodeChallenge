class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> a = new HashMap<>();
        for(String s : strs){
            char[] c =s.toCharArray();
            Arrays.sort(c);
            String sw = new String(c);
            if (!a.containsKey(sw)) {
                a.put(sw, new ArrayList<>());
            }

            a.get(sw).add(s);
        }

        return new ArrayList<>(a.values());
    }
}
        