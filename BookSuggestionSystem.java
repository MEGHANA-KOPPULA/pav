import java.util.HashMap;
import java.util.Map;

public class BookSuggestionSystem {
    public static void main(String[] args) {
        Map<String, Map<String, String>> books = new HashMap<>();
        books.put("It Ends With Us", Map.of("Genre", "Romance", "Link", "https://www.readanybook.com/online/587823"));
        books.put("Pride and Prejudice",Map.of("Genre","Romance", "Link","https://www.readanybook.com/online/717283"));
        books.put("Dreamland",Map.of("Genre","Romance", "Link","https://www.readanybook.com/online/765611"));
        books.put("It Starts With Us",Map.of("Genre","Romance", "Link","https://www.readanybook.com/online/765604"));
        books.put("Every Breath",Map.of("Genre","Romance", "Link","https://www.readanybook.com/online/765359"));
        books.put("Things Fall Apart",Map.of("Genre","Fiction", "Link","https://www.readanybook.com/online/656740"));
        books.put("The Book Thief",Map.of("Genre","Fiction", "Link","https://www.readanybook.com/online/678694"));
        books.put("Code Red",Map.of("Genre","Fiction", "Link","https://www.readanybook.com/online/601287"));
        books.put("Harry Potter and the Sorcerer's Stone", Map.of("Genre", "Fiction", "Link", "https://www.read-any-book.net/online/68"));
        books.put("The Great Gatsby",Map.of("Genre","Fiction", "Link","https://www.readanybook.com/online/14391"));
        books.put("The Shadows",Map.of("Genre","Horror", "Link","https://www.readanybook.com/online/765596"));
        books.put("The Only Good Indians",Map.of("Genre","Horror", "Link","https://www.readanybook.com/online/765591"));
        books.put("The Gunslinger",Map.of("Genre","Horror", "Link","https://www.readanybook.com/online/565905"));
        books.put("The Institute",Map.of("Genre","Horror", "Link","https://www.readanybook.com/online/765198"));
        books.put("Fairy Tale",Map.of("Genre","Fantasy", "Link","https://www.readanybook.com/online/765608"));
        books.put("The Year Of Witching",Map.of("Genre","Fantasy", "Link","https://www.readanybook.com/online/765595"));
        books.put("The Tale Of Magic..",Map.of("Genre","Fantasy", "Link","https://www.readanybook.com/online/765308"));
        books.put("The Crimson Witch",Map.of("Genre","Fantasy", "Link","https://www.readanybook.com/online/765599"));
        books.put("The Rose Society",Map.of("Genre","Fantasy", "Link","https://www.readanybook.com/online/565967"));
        books.put("Warcross",Map.of("Genre","Science Fiction","Link","https://www.readanybook.com/online/565965"));
        books.put("Fahrenheit 451",Map.of("Genre","Science Fiction","Link","https://www.readanybook.com/online/565952"));
        books.put("Infernal Devices",Map.of("Genre","Science Fiction","Link","https://www.readanybook.com/online/565999"));
        books.put("Champion",Map.of("Genre","Science Fiction","Link","https://www.readanybook.com/online/565964"));
        books.put("Predator's Gold",Map.of("Genre","Science Fiction","Link","https://www.readanybook.com/online/566000"));
        books.put("Then She Was Gone",Map.of("Genre","Mystery","Link","https://www.read-any-book.net/online/565953"));
        books.put("Land Of Wolves",Map.of("Genre","Mystery","Link","https://www.readanybook.com/online/765231"));
        books.put("Galveston",Map.of("Genre","Mystery","Link","https://www.readanybook.com/online/565977"));
        books.put("The Alienist",Map.of("Genre","Mystery","Link","https://www.readanybook.com/online/565949"));
        books.put("The Boys From Biloxi",Map.of("Genre","Mystery","Link","https://www.readanybook.com/online/765613"));
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
