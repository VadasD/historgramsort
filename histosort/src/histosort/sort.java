/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histosort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Paul
 */
public class sort {

    List<Integer> ints = new ArrayList<Integer>();

    public sort() {
        System.out.println("Want to make a list of numbers?");
        System.out.println("Just type in a number from 0=50 and hit enter!");
        System.out.println("once youre tired of entering number just input a number outside of the stated range.");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        while (input <= 50 && input >= 0) {
            ints.add(input);
            input = in.nextInt();
        }
        histoInt();
        insertionSort();
        selectionSort();

    }

    public void histoInt() {
        int counter;
        for (int k = 0; k <= 50; k++) {
            System.out.print(k + ": ");
            counter = 0;
            for (Integer x : ints) {
                if (x.equals(k)) {
                    counter++;
                }
            }
            System.out.print(counter + "\n");
        }
    }

    public void insertionSort() {
        for (int k = 1; k < ints.size(); k++) {
            int temp = ints.get(k);
            int j;
            for (j = k - 1; j >= 0 && temp < ints.get(j); j--) {
                ints.get(j) = ints.get(j);
                ints[j+1] = temp;
            }
        }
    }

    public void selectionSort() {

        {
            for (int k = 0; k < ints.size() - 1; k++) {

                int minIndex = k;
                for (int j = k + 1; j < ints.size(); j++) {
                    if (ints.get(j) < ints.get(minIndex)) {
                        minIndex = j;
                    }
                }

                int temp = ints.get(k);
                ints.set(k, ints.get(minIndex));
                ints.set(minIndex, temp);

                System.out.println("The sorted values are:" + ints);
            }

        }

    }

}
