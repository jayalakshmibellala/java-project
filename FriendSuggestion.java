package xyz;
import java.util.*;

public class FriendSuggestion {

    // Sample data representing a network of friends
    private Map<String, List<String>> friendNetwork;

    public FriendSuggestion(Map<String, List<String>> friendNetwork) {
        this.friendNetwork = friendNetwork;
    }

    public List<String> suggestFriends(String person, int maxSuggestions) {
        // Step 1: Create a map to hold mutual friends counts
        Map<String, Integer> mutualFriendsCount = getMutualFriendsCount(person);

        // Step 2: Sort the suggestions based on mutual friends in descending order
        List<Map.Entry<String, Integer>> sortedSuggestions = new ArrayList<>(mutualFriendsCount.entrySet());
        sortedSuggestions.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Step 3: Collect the top maxSuggestions from the sorted list
        List<String> suggestions = new ArrayList<>();
        for (int i = 0; i < Math.min(maxSuggestions, sortedSuggestions.size()); i++) {
            suggestions.add(sortedSuggestions.get(i).getKey());
        }

        return suggestions;
    }

    public Map<String, Integer> getMutualFriendsCount(String person) {
        // Step 1: Get the person's direct friends
        Set<String> directFriends = new HashSet<>(friendNetwork.getOrDefault(person, new ArrayList<>()));

        // Step 2: Create a map to count mutual friends
        Map<String, Integer> mutualFriendsCount = new HashMap<>();

        // Step 3: Loop through the friends of the person's friends
        for (String friend : directFriends) {
            List<String> friendsOfFriend = friendNetwork.getOrDefault(friend, new ArrayList<>());

            for (String potentialFriend : friendsOfFriend) {
                // Step 4: Ignore the person themselves and their direct friends
                if (!potentialFriend.equals(person) && !directFriends.contains(potentialFriend)) {
                    // Step 5: Count mutual friends
                    mutualFriendsCount.put(potentialFriend, mutualFriendsCount.getOrDefault(potentialFriend, 0) + 1);
                }
            }
        }

        return mutualFriendsCount;
    }

    public static void main(String[] args) {
        // Example: Sample network of friends
        Map<String, List<String>> network = new HashMap<>();
        network.put("Alice", Arrays.asList("Bob", "Charlie"));
        network.put("Bob", Arrays.asList("Alice", "David", "Eve"));
        network.put("Charlie", Arrays.asList("Alice", "Eve"));
        network.put("David", Arrays.asList("Bob"));
        network.put("Eve", Arrays.asList("Bob", "Charlie"));

        // Create a FriendSuggestion instance
        FriendSuggestion fs = new FriendSuggestion(network);

        // Example usage: Suggest top 2 friends for Alice
        List<String> suggestions = fs.suggestFriends("Alice", 2);
        System.out.println(suggestions);  // Expected: ["Eve", "David"]
    }
}