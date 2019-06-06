package com.sorting;

import java.util.Scanner;

public class allsort {



        private static int b_c=0;
    private static int i_c=0;
    private static int s_c=0;
    private static int shell_c=0;
        private static long b_r=0;
    private static long i_r=0;
    private static long s_r=0;
    private static long shell_r=0;

        private static int[] fun_shell(int[] array, int n)
        {
            int i, j, k, tmp,c=0;
            long start=System.nanoTime();
            for (i=n/2;i>0;i=i/ 2)
            {
                for (j = i; j < n; j++)
                {
                    for(k = j - i; k >= 0; k = k - i)
                    {
                        if (array[k+i] >= array[k])
                            break;
                        else
                        {
                            tmp = array[k];
                            array[k] = array[k+i];
                            array[k+i] = tmp;
                            c++;
                            shell_c++;
                            print_A(array,c);
                        }
                    }
                }
            }
            long end=System.nanoTime();
            shell_r=end-start;
            return array;
        }
        private static int[] fun_insertion(int[] array, int n)
        {
            int t1,j;
            int c=0;
            long start=System.nanoTime();
            for(int i=1;i<n;i++)
            {
                t1=array[i];
                j=i-1;
                while(j>=0&&t1<array[j])
                {
                    array[j+1] =array[j];
                    --j;
                }
                array[j+1]=t1;
                c++;
                i_c++;
                print_A(array,c);

            }
            long end=System.nanoTime();
            i_r=end-start;
            return array;
        }
        private static int[] fun_selection(int[] array, int n)
        {
            int c=0;
            long start=System.nanoTime();
            for(int steps=0;steps<n;++steps)
            {
                for(int i=steps+1;i<n;++i)
                {
                    if(array[steps]>array[i])
                    { c++;
                        s_c++;
                        int temp=array[steps];
                        array[steps]=array[i];
                        array[i]=temp;
                        print_A(array,c);
                    }

                }
            }
            long end=System.nanoTime();
            s_r=end-start;
            return array;
        }
        private static int[] fun_bubble(int[] array, int n)
        {
            int c=0;
            long start=System.nanoTime();
            for(int i=0;i<n-1;++i)
            {
                for(int j=0;j<n-i-1;++j)
                {
                    if(array[j]>array[j+1])
                    { c++;
                        b_c++;
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;

                        print_A(array,c);
                    }


                }
            }
            long end=System.nanoTime();
            b_r=end-start;


            return array;
        }
        private static void print_A(int[] Array, int c)
        {
            //  System.out.println("-----------");
            // System.out.println("");
            // System.out.println("Itr:"+c);
            System.out.println("__________");
            System.out.println("|Itr:"+c+"|");

            for (int i1 : Array) {
                System.out.print(i1 + " ");
            }

            System.out.println();
        }
        private static int[] rev_A(int[] Array)
        {
            int d=0;
            int[] a2 = new int[Array.length];
            for(int i=Array.length-1;i>=0;i--)
            {
                a2[d]=Array[i];
                d++;
            }
            //System.out.println();
            return a2;
        }
        private static void print_Array(int[] Array, String data)
        {
            System.out.print(data+"\n");
            for (int i1 : Array) {
                System.out.print(i1 + " ");
            }
            System.out.println();
        }
        private static void developer_asif()
        {
            System.out.print("__________________________________________");
            System.out.print("\nThank you\nAsif Bilakhiya\n");
            System.out.print("------------------------------------------");//
        }
        public static void main(String[] args) {
            int[] array = {10, 9, 8, 7, 6};
            Scanner sc=new Scanner(System.in);
            int n=array.length;
            System.out.println("------------------------------");
            System.out.println("if you like then please \ncomment & upvote\nRemaining Algorithm Arrive within 2-Days\nThank you to be here");
            System.out.println("------------------------------");
            //insertion sort
            System.out.println("--------------------------");
            print_Array(array, "Insertion sort Input:");
            int[] insertion_Array = fun_insertion(array, n);
            print_Array(insertion_Array, "\nInsertion sort output:");
            array=rev_A(array);
            //selection
            System.out.println("--------------------------");
            print_Array(array, "\nSelection sort Input:");
            int[] selection_Array = fun_selection(array, n);
            print_Array(selection_Array, "\nSelection sort output:");
            array=rev_A(array);

            //bubble
            System.out.println("--------------------------");
            print_Array(array, "\nBubble sort Input:");
            int[] bubble_Array = fun_bubble(array, n);
            print_Array(bubble_Array, "\nBubble sort output:");
            array=rev_A(array);

            //shell
            System.out.println("--------------------------");
            print_Array(array, "\nShell sort Input:");
            int[] shell_Array = fun_shell(array, n);
            print_Array(shell_Array, "\nShell sort output:");

            double i_r_t=(double)i_r/1000000000.0;
            double s_r_t=(double)s_r/1000000000.0;
            double b_r_t=(double)b_r/1000000000.0;
            double shell_r_t=(double)shell_r/1000000000.0;
            System.out.print("\n");        System.out.print("-------------------------------------------------");
            System.out.println("Algorithm Runtime summary:");
            System.out.print("-------------------------------------------------");
            System.out.println("||Insertion\t:"+i_c+"-Itr\t||"+"Time:"+i_r_t+"-Sec\t\t\t|");
            System.out.println("||Selection\t:"+s_c+"-Itr\t||"+"Time:"+s_r_t+"-Sec\t\t\t|");
            System.out.println("||Bubble   \t:"+b_c+"-Itr\t||"+"Time:"+b_r_t+"-Sec\t\t\t|");
            System.out.println("||Shell    \t:"+shell_c+"-Itr\t||"+"Time:"+shell_r_t+"-Sec\t\t\t|");
            System.out.println("-------------------------------------------------");
            developer_asif();


        }
    }

