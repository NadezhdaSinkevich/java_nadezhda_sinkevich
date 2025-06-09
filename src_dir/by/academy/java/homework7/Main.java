package by.academy.java.homework7;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        /*
       //1. Сумма всех элементов двумерного массива

        int[][] array = new int[4][5];
        int sum = 0 ;

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++)
            {
                array[i][j] = (int) (Math.random()*10 +1);
            }

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++)
            {
                sum += array[i][j];
            }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("sum= " + sum);

        */

        //2. Поиск минимального и максимального в двумерном массиве

        /*
        int[][] array = new int[3][6];
        int minElement=0;
        int maxElement=0;
        int iMin=0,jMin=0;
        int iMax=0, jMax =0;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 6; j++) {
                array[i][j]= (int) (Math.random()*100 - 50);
            }

        minElement = array[0][0];
        maxElement = array[0][0];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 6; j++) {

                if (minElement > array[i][j]){
                    minElement = array[i][j];
                    iMin = i;
                    jMin = j;
                }

                if (maxElement < array[i][j]){
                    maxElement = array[i][j];
                    iMax = i;
                    jMax = j;
                }

            }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("минимальный элемент =  "+minElement + " находится в позиции " + iMin + " " +jMin );
        System.out.println("максимальный элемент =  "+maxElement + " находится в позиции " + iMax + " " +jMax);
    */


        //3. Суммы по строкам и по столбцам
/*
    int[][] array = new int[5][5];
    int sumRow = 0 ;
    int sumColum =0;

    int[] rowSums = new int[5];
    int[] colSums = new int[5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random()*20 + 1);
            }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumRow += array[i][j];
            }
            rowSums[i] = sumRow;
            sumRow = 0;
        }

        System.out.println();

        System.out.println("сумма по строке");
        for (int i = 0; i < 5; i++) {
            System.out.println( "сумма по строке " + i + " = "+rowSums[i]);
        }

        System.out.println();

            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 5; i++)
                {
                    sumColum += array[i][j];
                }
                colSums[j] = sumColum;
                sumColum = 0;
            }

            System.out.println("сумма по колонке");
        for (int i = 0; i < 5; i++) {
            System.out.println("сумма по колонке "+i+ " = " + colSums[i] + " ");
        }

*/
        // 4.  Транспонирование (смена строк и столбцов) квадратной матрицы
        /*
        int n = 4;

        int[][] array = new int[n][n];
        int[][] transpose = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random()*10 );
            }

        System.out.println("исходная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                transpose[i][j] = array[j][i];
            }

        System.out.println();
        System.out.println("транспонированная матрица");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

       */

        //5. Умножение двух матриц   ????
/*
        Scanner in = new Scanner(System.in);
        int numberRead = 0;
        int m=0,k=0,n=0;

        System.out.println("размер матрицы M=");
        m = in.nextInt();
        System.out.println("размер матрицы K=");
        k = in.nextInt();
        System.out.println("размер матрицы N=");
        n = in.nextInt();

        int[][] arrayA = new int[m][k];
        int[][] arrayB = new int[k][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < k; j++) {
                System.out.printf("ввести элемент матрицы A [%d][%d]= ",i,j);
                arrayA[i][j] = in.nextInt();
        }

        System.out.println("матрица A:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(arrayA[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < k; i++)
            for (int j = 0; j < n; j++) {
                System.out.printf("ввести элемент матрицы B [%d][%d]= ",i,j);
                arrayB[i][j] = in.nextInt();
            }

        System.out.println("матрица B:");

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayB[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println();

        int a=0;
        int sum =0;

        int[][] arraySum = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                a = arrayA[i][j] * arrayB[j][i];
                System.out.println("a=" + a);
                sum += a;

            }System.out.println("sum=" + sum);
            sum = 0;

        }



        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arraySum[i][j]+" ");
            }
            System.out.println();
        }
*/

        // 6 сумма элементов главной и побочной диагонали

        /*
        int[][] array = new int[6][6];

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++) {
                array[i][j] = (int) (Math.random()*10);
            }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int sumMain=0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i==j) {
                    sumMain += array[i][j];
                }
            }
        }
         System.out.println("сумма эл по главной диагонали= "+sumMain);

        int sumSecondly=0;
        int countJ=5;

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j >= 0; j--) {
                if (j==countJ)
                {
                    sumSecondly += array[i][j];
                }
            }
            countJ--;
        }

        System.out.println("Сумма эл побочной диагонали = "+sumSecondly);

       */


        // 7. максимальная сумма подматрицы 2*2

        /*


        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                // array[i][j] = (int) (Math.random()*20-10);
                array[i][j] = (int) (Math.random()*10);
            }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int sum = 0;
        int maxSum = 0;
        int iMaxSum =0;
        int jMaxSum = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                // array[i][j] - верхний левый элемент
               if ((j+1 < 5) & (i+1 < 5)){
                   sum = array[i][j] + array[i][j+1] + array[i+1][j] + array[i+1][j+1] ;

                   System.out.println("подматрица");
                   System.out.print( array[i][j] + " " + array[i][j+1] );
                   System.out.println();
                   System.out.print( array[i+1][j] + " " + array[i+1][j+1]);
                   System.out.println();
                   System.out.println("сумма= " + sum);
                   System.out.println();

               }

                if (sum > maxSum) {
                    maxSum = sum;

                    iMaxSum = i;
                    jMaxSum = j;

                }
            }
        }

        System.out.println("maxSum= "+ maxSum);
        System.out.println("iMax= " + iMaxSum + " jMax= " + jMaxSum);
        System.out.println();
        System.out.println("подматрица с maxSum:");

        for (int i = iMaxSum; i < iMaxSum+2; i++) {
            for (int j = jMaxSum; j < jMaxSum+2; j++) {

                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
  */

        // 8. поиск элемента

        /*
        int[][] array = new int[4][7];

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (Math.random()*10);
            }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("x= ");
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();

        //int x = 5;
        boolean findElement = false;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 7; j++) {
                if (array[i][j]==x){
                    System.out.printf("элемент х =%d найден на позиции [%d][%d]", x, i, j );
                    System.out.println();
                    findElement = true;
                }
            }

        if (findElement == false) {
            System.out.println("элемент отсутствует");
        }
     */

        // 9. отражение по горизонтали и вертикале массива
/*
        int[][] array = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random()*10);
            }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        int x;
        int between=0;
        int iMax = 2;
        int jMax = 4;

        System.out.println("ввести 1 - по горизонтали, 2- по вертикале ");
        System.out.println("x= ");
        x = in.nextInt();

        switch (x) {
            case 1: {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {

                        if (i < iMax) {
                            between = array[i][j];
                            array[i][j] = array[iMax][j];
                            array[iMax][j] = between;
                        }

                    }
                    iMax--;
                }

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
            break;
            }
            case 2: {


                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {

                        if (j < jMax) {
                            between = array[i][j];
                            array[i][j] = array[i][jMax];
                            array[i][jMax] = between;
                        }
                        jMax--;
                    }
                    jMax = 4;
                }

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }

                break;
            }
        }

*/

        //калькулятор
    }
}
