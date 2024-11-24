package Arrays;

import java.util.Comparator;

public class Arrays {
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length-1, key);
    }
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int firstIndex = fromIndex;
        int lastIndex = toIndex;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = Byte.compare(key, a[middleIndex]);

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

    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length-1, key);
    }
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int firstIndex = fromIndex;
        int lastIndex = toIndex;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = Character.compare(key, a[middleIndex]);

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

    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length-1, key);
    }
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int firstIndex = fromIndex;
        int lastIndex = toIndex;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = Double.compare(key, a[middleIndex]);

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

    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length-1, key);
    }
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int firstIndex = fromIndex;
        int lastIndex = toIndex;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = Float.compare(key, a[middleIndex]);

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

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length-1, key);
    }
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int firstIndex = fromIndex;
        int lastIndex = toIndex;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = Integer.compare(key, a[middleIndex]);

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

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length-1, key);
    }
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int firstIndex = fromIndex;
        int lastIndex = toIndex;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = Long.compare(key, a[middleIndex]);

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

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length-1, key);
    }
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int firstIndex = fromIndex;
        int lastIndex = toIndex;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = Short.compare(key, a[middleIndex]);

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

    public static <T> int binarySearch(T[] a, T key, Comparator c) {
        return binarySearch(a, 0,a.length-1, key, c);
    }
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) {
        int firstIndex = fromIndex;
        int lastIndex = toIndex;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int compare = c.compare(key, a[middleIndex]);

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
