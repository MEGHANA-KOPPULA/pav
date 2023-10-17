import java.util.HashMap;
import java.util.Map;

public class BookSuggestionSystem {
    public static void main(String[] args) {
        Map<String, Map<String, String>> books = new HashMap<>();
        books.put("It Ends With Us", Map.of("Genre", "Romance", "Link", "https://www.readanybook.com/online/587823"));
        books.put("Harry Potter and the Sorcerer's Stone", Map.of("Genre", "Fiction", "Link", "https://www.read-any-book.net/online/68"));
        // Add more books with genres and links

        System.out.println("Genres and Book Links:");
        for (String book : books.keySet()) {
            Map<String, String> bookData = books.get(book);
            String genre = bookData.get("Genre");
            String link = bookData.get("Link");
            System.out.println("Genre: " + genre + ", Book Link: " + link);
        }
    }
}
