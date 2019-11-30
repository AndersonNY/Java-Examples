import jdk.nashorn.api.tree.ArrayLiteralTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class HomeWorkDay18 {



//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

        public static void main(String[] args) {


            ArrayList<String> colors = new ArrayList<String>();
            ArrayList<String> colorsCopy = new ArrayList<String>();
            ArrayList<String> colors1 = new ArrayList<String>();

            colors.add("black");
            colors.add("blue");
            colors.add("red");
            colors.add("green");
            colors.add("yellow");

            System.out.println("colors");

            colors.set(3,"purple");





//2. Write a Java program to iterate through all elements in a array list.


    for (int i=0; i<colors.size(); i++) {

        System.out.println(colors.get(i));

    }

//3. Write a Java program to insert an element into the array list at the first position.

            colors.add(0,"brown");


//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

            System.out.println(colors.get(3));


//5. Write a Java program to update specific array element by given element.

            colors.set(2,"pink");

//6. Write a Java program to remove the third element from a array list.

            colors.remove(4);

//7. Write a Java program to search an element in a array list.


            System.out.println(colors.contains("yellow"));


//8. Wr/ite a Java program to sort a given array list.

            for (int i = 0; i <colors.size(); i++) {

                System.out.println(colors.get(i)+" ");
            }

            System.out.println();

            Collections.sort(colors);

            for (int i = 0; i <colors.size() ; i++) {
                System.out.println(colors.get(i));

            }

//9. Write a Java program to copy one array list into another.

            colorsCopy.addAll(colors);

//10. Write a Java program to shuffle elements in a array list.[advanced]
    Collections.shuffle(colors);
            System.out.println(colors);

//11. Write a Java program to reverse elements in a array list.
            Collections.reverse(colors);

            System.out.println(colors);


//12. Write a Java program to extract a portion of a array list.
            for (int i = 0; i <colors.size() ; i++) {
                System.out.print(colors.get(i) + " ");

            }
            System.out.println();
            for (int i = 0; i <4 ; i++) {

                System.out.print(colors.get(i)+" ");

            }
//
//
//13. Write a Java program to compare two array lists.

            if(colors.equals(colors1)){
                System.out.println("They are equal");
            }
            else{
                System.out.println("They are not equal");
            }

//14. Write a Java program of swap two elements in an array list.

            Collections.swap(colors,1,2);

            System.out.println(colors);


//15. Write a Java program to join two array lists.
//
//
//16. Write a Java program to clone an array list to another array list.
//
//
//17. Write a Java program to empty an array list.
//
//
//18. Write a Java program to test an array list is empty or not.
//
//
//19. Write a Java program to trim the capacity of an array list the current list size.
//
//
//20. Write a Java program to increase the size of an array list.
//
//
//21. Write a Java program to replace the second element of a ArrayList with the specified element.
//
//
//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.

    } }



