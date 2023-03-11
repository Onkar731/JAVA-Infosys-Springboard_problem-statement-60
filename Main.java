import java.util.Scanner;

import javax.swing.InputMap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting elements
        String []stringArray = inpuString.split("#");

        int []array1 = Arrays.stream(stringArray[0].split(",")).mapToInt(Integer::parseInt).toArray();
        int []array2 = Arrays.stream(stringArray[1].split(",")).mapToInt(Integer::parseInt).toArray();

        // printing count of common elements
        System.out.println(CommonElements.countCommonElements(array1, array2));

        // closing resource
        sc.close();
    }
}