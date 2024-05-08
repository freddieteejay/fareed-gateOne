

import java.util.*;
public class TaskFour{
public static void main(String... args){

int[] arr = {8, 10, 8, 12, 5, 14, 8, 9 };
String result = TaskFour.evenIndex(arr);
System.out.print(result);

}

public static String evenIndex(int[] array){
	ArrayList<Integer> value = new ArrayList<>();
	//int[] value = new int [array.length / 2];
           for(int index = 0; index < array.length; index++){
		if (index % 2 == 0){
		value.add( array[index]);
		}
    	}

        return Arrays.toString(value);
}






}