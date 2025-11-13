public static void findDuplicates(String s) {
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

    // Count each character
    for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    // Print only duplicates in order of first occurrence
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.print("['" + entry.getKey() + "', " + entry.getValue() + "] ");
        }
    }
}
