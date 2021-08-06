import java.util.Scanner;

import java.io.*;

public class MaximumPerRow

{

public static void main(String args[]) throws FileNotFoundException

{

Scanner input = new Scanner(new File("input.csv"));

String line = "";

int max = 0, count = 1;

String[] arr = null;

System.out.println("Maximum values");

while(input.hasNext())

{

line = input.nextLine();

arr = line.split(",");

max = 0;

for(int i=0; i<arr.length; i++)

{

if(Integer.parseInt(arr[i]) > max)

max = Integer.parseInt(arr[i]);

}

System.out.println("ROW " + count + " : " + max);

count++;

}

}

}

