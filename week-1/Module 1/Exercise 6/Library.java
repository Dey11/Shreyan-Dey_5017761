import java.util.*;

public class Library {
	private List<Book> books;

	public Library() {
		this.books = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public Book linearSearchByTitle(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}

	public Book binarySearchByTitle(String title) {
		int left = 0;
		int right = books.size() - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			Book midBook = books.get(mid);
			int comparison = midBook.getTitle().compareToIgnoreCase(title);
			if (comparison == 0) {
				return midBook;
			} else if (comparison < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return null;
	}

	public void sortBooksByTitle() {
		books.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
	}
}
