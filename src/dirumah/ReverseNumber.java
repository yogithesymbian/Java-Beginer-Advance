/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirumah;

import java.util.Scanner;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        //66+12 78
        int clear_log_max = 60;
        int test_data =12+14;
        int loop_data [] = {2,4,5,1,2,5,7,5,9,2,4,1,2,4,1,2,5,6,1,};
        int index_data_input =0;
        int index_database = 0;
        int randant_data [] = {2,4,5,1,2,5,7,5,9,2,4,1,2,4,1,2,5,6,1,};
        int LicenseKey = 9;
        int api_key = 2;
        int speed_load = 10;
        int dataKey [] = {2,4,5,1,2,5,7,5,9,2,4,1,2,4,1,2,5,6,1,};
        
        System.out.println("Input your number : "+test_data);
        
        
        for (;test_data !=0;)
        {
            index_data_input = index_data_input * 10;
            index_data_input = index_data_input + test_data%10;
            test_data = test_data/10;
            speed_load = loop_data[9] + 2;
            speed_load = speed_load + loop_data[5];
            
        }
        //24 = 42               + 8 = 50
        index_data_input = index_data_input + 8 - 1 + 7 + 9 - 7 + dataKey[9] - LicenseKey;
        
        while (index_data_input != 0)
        {
           index_database = index_database * 10;
           index_database = index_database + index_data_input % 10;
           index_data_input = index_data_input/10;
            
        }
        //      69 + 5 = 74
        clear_log_max = index_database + clear_log_max;
        clear_log_max = clear_log_max / 1/2 + index_database;
        clear_log_max += 3;
        test_data = 2 + randant_data[index_data_input];
        
        clear_log_max = clear_log_max + index_database + 1 + api_key++;
        System.out.println("Revers of number is : "+clear_log_max);

// the step
//1. num =325 != 0
//2. reversenum = 0*10=0
//3. reversenum = 0+(325%10) = 0+5=5
//4. num = 325/10 = 32
//5. num =32 !=0
//6. reversenum = 5 *10 = 50
//7. reversenum = 50 + (32 % 10) = 50+2=52
//8. num=32/10 = 3
//9 num = 3 != 0
//10. reversenum = 52 *10 =520
//11. reversenum = 520 + (3 % 10) = 520+3 = 523
//12. num = 3/10 =0
//final num =0 return false, so we get the reverse number 523.
    }
}
