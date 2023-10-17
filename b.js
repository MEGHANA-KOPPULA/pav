// Dictionary of books with their genres and links
var books = {
    "It Ends With Us": {"Genre": "Romance", "Link": "https://www.readanybook.com/online/587823"},
    "Harry Potter and the Sorcerer's Stone": {"Genre": "Fiction", "Link": "https://www.read-any-book.net/online/68"},
    "The Great Gatsby":{"Genre":"Fiction", "Link":"https://www.readanybook.com/online/14391"},
    "Pride and Prejudice":{"Genre":"Romance", "Link":"https://www.readanybook.com/online/717283"},
    "Things Fall Apart":{"Genre":"Fiction", "Link":"https://www.readanybook.com/online/656740"},
    "The Book Thief":{"Genre":"Fiction", "Link":"https://www.readanybook.com/online/678694"},
    "Code Red":{"Genre":"Fiction", "Link":"https://www.readanybook.com/online/601287"},
    "Dreamland":{"Genre":"Romance", "Link":"https://www.readanybook.com/online/765611"},
    "It Starts With Us":{"Genre":"Romance", "Link":"https://www.readanybook.com/online/765604"},
    "Every Breath":{"Genre":"Romance", "Link":"https://www.readanybook.com/online/765359"},
    "The Shadows":{"Genre":"Horror", "Link":"https://www.readanybook.com/online/765596"},
    "The Only Good Indians":{"Genre":"Horror", "Link":"https://www.readanybook.com/online/765591"},
    "The Gunslinger":{"Genre":"Horror", "Link":"https://www.readanybook.com/online/565905"},
    "The Institute":{"Genre":"Horror", "Link":"https://www.readanybook.com/online/765198"},
    "Fractured":{"Genre":"Horror", "Link":"https://www.readanybook.com/online/723036"},
    "Fairy Tale":{"Genre":"Fantasy", "Link":"https://www.readanybook.com/online/765608"},
    "The Year Of Witching":{"Genre":"Fantasy", "Link":"https://www.readanybook.com/online/765595"},
    "The Tale Of Magic..":{"Genre":"Fantasy", "Link":"https://www.readanybook.com/online/765308"},
    "The Crimson Witch":{"Genre":"Fantasy", "Link":"https://www.readanybook.com/online/765599"},
    "The Rose Society":{"Genre":"Fantasy", "Link":"https://www.readanybook.com/online/565967"},
    
    
    // Add more books with genres and links
};

// Function to suggest books based on genre
function suggestBooks() {
    var userGenre = document.getElementById("genre").value;
    var suggestionsDiv = document.getElementById("suggestions");
    suggestionsDiv.innerHTML = "";

    for (var book in books) {
        if (books.hasOwnProperty(book) && books[book]["Genre"] === userGenre) {
            var bookLink = books[book]["Link"];
            suggestionsDiv.innerHTML += "<p>" + book + ": <a href='" + bookLink + "'>" + bookLink + "</a></p>";
        }
    }

    if (suggestionsDiv.innerHTML === "") {
        suggestionsDiv.innerHTML = "<p>Sorry, no " + userGenre + " books found in our database.</p>";
    }
}