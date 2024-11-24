package Collections;

import java.util.Comparator;
import java.util.List;

public class Collections {
    public static <T> int binarySearch(List list, T key) {
        return binarySearch(list, key, list.spliterator().getComparator());
    }
    public static <T> int binarySearch(List list, T key, Comparator c) {
        int firstIndex = 0;
        int lastIndex = list.size()-1;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = c.compare(key, list.get(middleIndex));

            if (compare == 0) {
                return middleIndex;
            }
            if (compare > 0) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
