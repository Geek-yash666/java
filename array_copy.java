public class array_copy {
    public static void main(String[] args) {
        int[] source = {100,200,300};
        System.out.println(source);
        int[] dest = new int[3];
        System.arraycopy(source, 0, dest, 1, 2);
        for (int i=0; i<dest.length;i++)
            System.out.println("Element at index" + i + ':' +dest[i]);
    }
}
