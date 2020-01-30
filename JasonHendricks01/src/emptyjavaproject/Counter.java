/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;
import java.util.Random;
/**
 *
 * @author jason.hendricks
 */
public class Counter {
    Random rand = new Random();
    static int[] maxArr;
    public Counter(){
        this(1,1);
    }
    public Counter(int roll, int sides) {

        maxArr = new int[sides];
        maxArr[roll - 1] = maxArr[roll - 1] + 1;

        /*
        int[] counterArr = new int[sides];
        for (int i = 0; i < sides; i++) {
            maxArr[i] = i+1;
        }
        for (int j = 0; j < sides; j++) {
            if(maxArr[j] == roll){
         */
    }

    
}
