/*

1. Create a class called Book with the following properties using appropriate data types: Title, Author, numberOfPages,
2.	Create a second class called Volume with the following properties using appropriate data types: volumeName, numberOfBooks and Book [ ]. Book [ ] will contain an array of book objects.
3.	Create an application called DemoVolume.
	In the main method,
4.	Create an array of book objects to be added to the volume.
5.	Create a volume object called volume1.
6.	Display the properties of volume1.


*/
public class DemoVolume {

    public static void main(String[] args) {

        Book Twilight = new Book("Twilight", "Stephenie Meyer", 417);
        Book NewMoon = new Book("New Moon", "Stephenie Meyer", 462);
        Book Eclipse = new Book("Eclipse", "Stephenie Meyer", 523);

        Book[] bookArray = {Twilight,NewMoon,Eclipse};

        Volume volume1 = new Volume("Volume1", bookArray.length, bookArray);

        System.out.println(volume1);

    }
}
