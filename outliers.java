

package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<Integer>();
        System.out.println("Enter the values: ");
        int limit = 0;
        while (numbers.hasNextInt() && limit <= 10)
        {
            values.add(numbers.nextInt());
            limit += 1;
        }
        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);
        int i = 0;
        ArrayList<Integer> outliers = new ArrayList<Integer>();
        for (i = 0; i < values.size(); i++)
        {
            System.out.println(values.get(i));
            if (i < 2 || i > 8)
            {
                outliers.add(values.get(i));
            }
        }
        for ( int k = 0; k < outliers.size(); k++)
        {
            for (int j = 0; j < values.size(); j++)
            {
                if (outliers.get(k) == values.get(j))
                {
                    values.remove(j);
                }
            }
        }
        System.out.println("These are the  outliers" + outliers);
        System.out.println("These are the Numbers remaining after the outliers are removed" + values);

    }
}
