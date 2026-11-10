
class Solution {

    public String encode(java.util.List<String> strs) {
        String res = "";

        for (String s : strs) {
            res += s.length() + "#" + s;
        }

        return res;
    }

    public java.util.List<String> decode(String s) {
        java.util.List<String> res = new java.util.ArrayList<>();

        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));

            res.add(s.substring(j + 1, j + 1 + length));

            i = j + 1 + length;
        }

        return res;
    }
}
