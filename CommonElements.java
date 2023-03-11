public class CommonElements {
    public static int countCommonElements(int []array1, int []array2) {
        // declaring variables
        int count = 0;

        // counting common elements
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    count++;
                    break;
                }
            }
        }

        // returning count
        return count;
    }
}