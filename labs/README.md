Certainly! Here's the updated instruction sheet with **explicit styling tasks** for students to add in the external CSS file.

---

## Thymeleaf Lab: Displaying a List of Books

### Objective:
In this lab, you'll practice using Thymeleaf to display a list of objects in an HTML page. You will:

- Create a Java entity class with six fields
- Create a repository class that initializes a list of 10 objects
- Create a controller that exposes an endpoint to view all values
- Create a Thymeleaf HTML page that displays the data using:
  - `th:each`
  - `th:if`
  - `th:unless`
- Add **very basic styling** using an external CSS file inside the `static` folder

---

###  Instructions:

#### 1. **Create an Entity class**
Create a class called `Book` with the following fields:
- `title` (String)
- `author` (String)
- `genre` (String)
- `year` (int)
- `inStock` (boolean)
- `price` (double)

---

#### 2. **Create a Repository class**
Create a `BookRepository` class that holds a list of books using an `ArrayList<Book>` and initialize it with the following 10 books:

```java
books.add(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937, true, 10.99));
books.add(new Book("1984", "George Orwell", "Dystopian", 1949, true, 8.99));
books.add(new Book("Clean Code", "Robert C. Martin", "Programming", 2008, false, 30.00));
books.add(new Book("Moby Dick", "Herman Melville", "Classic", 1851, true, 12.50));
books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "Classic", 1951, true, 9.75));
books.add(new Book("Effective Java", "Joshua Bloch", "Programming", 2018, true, 35.20));
books.add(new Book("Pride and Prejudice", "Jane Austen", "Romance", 1813, false, 11.80));
books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", "Programming", 1999, true, 28.45));
books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 1960, true, 7.30));
books.add(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 1997, false, 14.00));
```

---

#### 3. **Create a Controller**
- Create an endpoint like `/books` that returns a view called `book-list.html`
- inject the dependancy of the `BookRepository` into the `BookController` class using constructor injection
- Pass the list of books from the repository to the HTML using a model attribute (e.g., `model.addAttribute("books", bookRepository.findAll());`)

---

#### 4. **Create the HTML View**
- Use Thymeleaf syntax to display each book inside an HTML template
- Use:
  - `th:each` to loop through books
  - `th:if` to display `[In Stock]` when `inStock` is `true`
  - `th:unless` to display `[Out of Stock]` when `inStock` is `false`

---

#### 5. **Add Basic Styling**
In `src/main/resources/static`, create a file called `style.css`. if the book is out of stock than it should have the class name out-of-stock and if it is in stock it should have the classname in-stock

> You should apply the `in-stock` or `out-of-stock` class conditionally using Thymeleaf, depending on whether the book is in stock.
