public class Main {
	public static void main(String[] args) {
		Library library = new Library();

		Book b1 = new Book("1", "Harry Potter 1", "JK Rowling");
		Book b2 = new Book("2", "Harry Potter 2", "JK Rowling");
		Book b3 = new Book("3", "Harry Potter 3", "JK Rowling");

		library.addBook(b1);
		library.addBook(b2);
		library.addBook(b3);

		System.out.println("Linear Search for 'Harry Potter 3':");
		Book result = library.linearSearchByTitle("Harry Potter 3");
		if (result != null) {
			System.out.println(result);
		} else {
			System.out.println("Book not found.");
		}

		library.sortBooksByTitle();

		System.out.println("\nBinary Search for 'Harry Potter 3':");
		result = library.binarySearchByTitle("Harry Potter 3");
		if (result != null) {
			System.out.println(result);
		} else {
			System.out.println("Book not found.");
		}
	}
}
