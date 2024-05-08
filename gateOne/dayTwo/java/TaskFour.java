

import java.util.*;
public class TaskFour{
public static void main(String... args){

int[] arr = {8, 10, 8, 12, 5, 14, 8, 9 };
String result = Arrays.toString(evenIndex(arr));
System.out.print(result);

}

public static int[] evenIndex(int[] array){
	int[] value = new int [array.length / 2];
	int count =0;
           for(int index = 0; index < array.length; index++){
		if (index % 2 == 0){
			value[count] = array[index];
			count++;
		}
			}
    	

        return value;
}






}