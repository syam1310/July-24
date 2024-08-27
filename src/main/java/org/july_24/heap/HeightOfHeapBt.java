package org.july_24.heap;

public class HeightOfHeapBt {

    // Height of complete Binary tree
    public static int height(int n) {
        return (int) Math.ceil(Math.log(n + 1) / Math.log(2)) - 1;
    }
}
