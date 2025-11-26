
package array;

import arrays.arrays;


public class main {

    public static void main(String[] args) {
     arrays arr=new arrays();
     int []numbers={1,7,9,8,5};
     numbers[3]=15;
     arr.update(numbers, 3, 15);
     arr.delete(numbers, 4);
     int []numbers2=new int[5];
     arr.input(numbers2);
     arr.R_Traversal(numbers);
     arr.Traversal(numbers);
     
    }

}
