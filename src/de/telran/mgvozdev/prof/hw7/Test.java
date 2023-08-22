package de.telran.mgvozdev.prof.hw7;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayIterator arrayIterator = new ArrayIterator(numbers);
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        ReverseArrayIterator reverseIterator = new ReverseArrayIterator(numbers);
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        File file1 = new File("document", "txt", "Text");
        File file2 = new File("image", "jpg", "Picture");
        Folder folder = new Folder("MyFolder", "John");
        folder.addFile(file1);
        folder.addFile(file2);
        for (File file : folder) {
            System.out.println("File name: " + file.getName() +
                               ", Extension: " + file.getExtension() +
                               ", Content: " + file.getContent());
        }

        Integer[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        TwoDimensionalArrayIterator twoDimensionalArrayIterator = new TwoDimensionalArrayIterator(array);
        while (twoDimensionalArrayIterator.hasNext()) {
            System.out.println(twoDimensionalArrayIterator.next());
        }

        List<String> players = Arrays.asList("Player1", "Player2", "Player3", "Player4");
        InfiniteIterator infiniteIterator = new InfiniteIterator(players);
        for (int i = 0; i < 20; i++) {
            System.out.println("Dealer: " + infiniteIterator.next());
        }
    }
}
