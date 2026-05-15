class Solution {

    public String longestCommonPrefix(String[] strs) {

        // take first string as initial prefix
        String prefix = strs[0];

        // start checking from second string
        for(int i = 1; i < strs.length; i++) {

            // keep shrinking prefix until current string starts with it
            while(!strs[i].startsWith(prefix)) {

                // remove last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // if prefix becomes empty
                // then no common prefix exists
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // final common prefix
        return prefix;
    }
}