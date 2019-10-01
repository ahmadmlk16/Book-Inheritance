public class Book {
    private String title;
    private String author;
    private int NumOfPages;


    public Book(String title, String authur, int NumOfPages) {
        super();
        this.title = title;
        this.author = authur;
        this.NumOfPages = NumOfPages;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Title: ");
        builder.append(title);
        builder.append("\nAuthor: ");
        builder.append(author);
        builder.append("\nNumOfPages: ");
        builder.append(NumOfPages);
        builder.append("\n");
        return builder.toString();
    }


}
