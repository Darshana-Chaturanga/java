package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckArrayList {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while(true){
            System.out.print("Enter number : ");
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }else {
                numbers.add(num);
            }
        }
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 1){
                numbers.remove(i);
                i--;
            }
        }
        for (int num : numbers){
            System.out.print(num + ", ");
        }
    }
}
