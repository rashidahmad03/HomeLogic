package hackerearth.algo;

import java.util.Scanner;

public class MannasFirstName {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int count = 0;
int t = sc.nextInt();
char arr[];
String s;
for(int i = 0; i < t+1; i++){
int suvo = 0, suvojeet = 0;
s = sc.nextLine();
arr = s.toCharArray();
for(int j = 0;j < arr.length; j++){
if(arr.length >= 4 && ((j+3)<arr.length)){
if(arr[j] == 'S' && arr[j+1] == 'U' && arr[j+2] == 'V' && arr[j+3] == 'O'){
suvo++;
}
}
if(arr.length >= 7 && ((j+6)<arr.length)){
if(arr[j] == 'S'&& arr[j+1] == 'U' && arr[j+2] == 'V'&& arr[j+3] == 'O' && arr[j+4] == 'J' && arr[j+5] == 'I' &&arr[j+6] == 'T'){
suvojeet++;
suvo--;
}
}
}


if(count != 0){
System.out.println("SUVO = " +suvo +"," +" SUVOJIT = " +suvojeet);
}count++;
}

}

}