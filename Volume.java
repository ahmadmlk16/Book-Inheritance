public class Volume {
    private String volumeName;
    private int NumOfBooks;
    private Book[] bookArray;

    public Volume(String volumeName, int NumOfBooks, Book[] bookArray) {
        super();
        this.volumeName = volumeName;
        this.NumOfBooks = NumOfBooks;
        this.bookArray = bookArray;
    }

    public String getBookArray() {
        String returnString = "";
        for (int i = 0; i < bookArray.length; i++) {
            returnString = returnString + bookArray[i].toString();
        }
        return returnString;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Volume :");
        builder.append(volumeName);
        builder.append("\nNum Of Books: ");
        builder.append(NumOfBooks);
        builder.append("\nBook Array::\n");
        builder.append(getBookArray());
        return builder.toString();
    }
}
