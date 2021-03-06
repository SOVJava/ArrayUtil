package program;

import util.ArrayUtil;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        /*// getRandomArray
        int[] randomArr1 = ArrayUtil.getRandomArray(10,-10, 10);
        System.out.println(Arrays.toString(randomArr1)+ " Массив 1");

        // countPositive
        Integer cp = ArrayUtil.countPositive(randomArr1);
        System.out.println(cp + " Число положительных элементов");

        // greatPrev
        int[] randomArr2 = ArrayUtil.getRandomArray(10,-10, 10);
        System.out.println(Arrays.toString(randomArr2) + " Массив 2");
        ArrayList greatPrev1 = ArrayUtil.greatPrev1(randomArr2);
        System.out.println(greatPrev1 + " Последующее больше предыдущего");
        String greatPrevJSON = ArrayUtil.greatPrevJSON(randomArr2);
        System.out.println(greatPrevJSON + " kak JSON");

        // toString
        System.out.println(ArrayUtil.toString(randomArr2));

        // sameNeighbours
        int[] mass = {4,4,2,-2};
        System.out.println(Arrays.toString(mass) + " Массив 3");
        int[] sameNeighbours = ArrayUtil.sameNeighbours(mass);
        System.out.println(Arrays.toString(sameNeighbours));

        int[] randomArr4 = ArrayUtil.getRandomArray(1000,-1000, 1000);
        System.out.println(Arrays.toString(randomArr4) + " Массив 4");

        // greaterNeighbours
        int greaterNeighbours = ArrayUtil.greaterNeighbours(randomArr4);
        System.out.println(greaterNeighbours + " Кол-во эл. больше соседей");

        // max
        int max = ArrayUtil.max(randomArr4);
        System.out.println(max + " Максимальное число массива");

        // minPositive
        int minPositive = ArrayUtil.minPositive(randomArr4);
        System.out.println(minPositive + " Минимальное из положительных");

        // minOdd
        Integer minOdd = ArrayUtil.minOdd(randomArr4);
        if(minOdd != null)
            System.out.println(minOdd + " Наименьшее нечетное");
        else
            System.out.println("Нет нечетных элементов");

        String s = ArrayUtil.evenDataJSON(randomArr4);
        System.out.println(s + " Четные из массива в JSON");

        // getRandomDeepArray, toStringDeep
        int[][] randomArrDeep5 = ArrayUtil.getRandomDeepArray(2,3,0,10);
        String deepArr = ArrayUtil.toStringDeep(randomArrDeep5);
        System.out.println(deepArr);

        // maxValues
        String maxValues1 = ArrayUtil.maxValues1(randomArr4);
        System.out.println(maxValues1 + " maxValues");
        int[] maxValues2 = ArrayUtil.maxValues2(randomArr4);
        System.out.println(Arrays.toString(maxValues2) + " maxValues2");
        Integer[] maxValues3 = ArrayUtil.maxValues3(randomArr4);
        System.out.println(Arrays.toString(maxValues3) + " maxValues3");

        // sumDeepArrays
        int[][] mass1 = ArrayUtil.getRandomDeepArray(3,3,-10,10);
        int[][] mass2 = ArrayUtil.getRandomDeepArray(3,3,-10,10);
        int[][] sumDeepArrays = ArrayUtil.sumDeepArrays(mass1, mass2);
        if (sumDeepArrays != null)
            System.out.println(ArrayUtil.toStringDeep(sumDeepArrays));
        else
            System.out.println("Размеры массивов не равны");

        // evenIndexes
        ArrayList evenIndexes = ArrayUtil.evenIndexes(randomArr4);
        System.out.println(evenIndexes + " evenIndexes");
        String evenIndexesGSON = ArrayUtil.evenIndexesGSON(randomArr4);
        System.out.println(evenIndexesGSON + " evenIndexesGSON");

        // nearest1
        int[] massnearest = {9,-4,4,9,3,4,9,-7,6,-1};
        System.out.println(Arrays.toString(massnearest));
        int nearest1 = ArrayUtil.nearest1(massnearest,5);
        System.out.println(nearest1 + " nearest1");
        // nearest2
        int[] nearest2 = ArrayUtil.nearest2(massnearest, 5);
        System.out.println(Arrays.toString(nearest2) + " nearest2");
        // nearest3
        ArrayList nearest3 = ArrayUtil.nearest3(massnearest,5);
        System.out.println(nearest3 + " nearest3");

        // nearest4
        int[] randomArr6 = ArrayUtil.getRandomArray(30,0, 1000);
        System.out.println(Arrays.toString(randomArr6) + " Массив 6");

        // nearest5
        int[] minRazn = ArrayUtil.nearest5(randomArr6);
        System.out.println(Arrays.toString(minRazn) + " nearest5");

        // countDifferent
        Arrays.sort(massnearest);
        System.out.println(Arrays.toString(massnearest));
        int countDifferent = ArrayUtil.countDifferent(massnearest);
        System.out.println(countDifferent);

        // reverse
        int[] reverse = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse));
        ArrayUtil.reverse(reverse);
        System.out.println(Arrays.toString(reverse));

        // reverseNeighbours
        int[] reverseNeighbours = {1,100,2,200,3,5};
        System.out.println(Arrays.toString(reverseNeighbours));
        ArrayUtil.reverseNeighbours(reverseNeighbours);
        System.out.println(Arrays.toString(reverseNeighbours));

        // indexInsertion
        int[] indexInsertion = {1,1,0,-2,-3,-3,-3,-4,-4,-6,-10,-10};
        System.out.println(Arrays.toString(indexInsertion));
        int index = ArrayUtil.indexInsertion(indexInsertion,0);
        System.out.println(index);

        //delete
        int[] del ={1,2,3,3,4,5,6};
        System.out.println(Arrays.toString(del));
        int[] resDel = ArrayUtil.delete1(del, 6);
        System.out.println(Arrays.toString(resDel));
        Integer[] resDel2 = ArrayUtil.delete2(del, 3);
        System.out.println(Arrays.toString(resDel2));
        int[] arrSort = {5,65,4,3,2,3,4,5};
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));

        //insert
        int[] ins = {1,2,3,4,5,6,7,8,9,10};
        Integer[] insI = {1,2,3,4,5,6,7,8,9,10};
        int[] ins1 = ArrayUtil.insert1(ins,3,20);
        System.out.println(Arrays.toString(ins1));
        Integer[] ins2 = ArrayUtil.insert2(insI,3,20);
        System.out.println(Arrays.toString(ins2) + "test");

        //shift
        int[] shi1 = {1,2,3,4,5};
        ArrayUtil.shift(shi1,false);
        System.out.println(Arrays.toString(shi1));

        //shift2
        int[] shi2 = {1,2,3,4,5};
        ArrayUtil.shift(shi2, 4);
        System.out.println(Arrays.toString(shi2));

        //countEqualPairs
        int[] cop = {1,1,1,1};
        int countEqualPairs = ArrayUtil.countEqualPairs(cop);
        System.out.println(countEqualPairs + " countEqualPairs");

        //countUnique
        int[] uni = {1,2,3,4,2,1,3,10};
        int countU = ArrayUtil.countUnique(uni);
        System.out.println(countU);

        //unique
        int[] uniMass = ArrayUtil.unique(uni);
        System.out.println(Arrays.toString(uniMass));
        ArrayList uniq = ArrayUtil.unique1(uni);
        System.out.println(uniq + "unique1");

        //frequent
        int[] fre = {1,2,3,4,5,1,2,2,3,4,4,5};
        int freq1 = ArrayUtil.frequent(fre);
        System.out.println(freq1 + " frequent");
        int[] freq2 = ArrayUtil.frequent2(fre);
        System.out.println(Arrays.toString(freq2));
        ArrayList freq3 = ArrayUtil.frequent3(fre);
        System.out.println(freq3);

        //search
        int[] sea = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,4};
        Integer sea1 = ArrayUtil.search(sea,4);
        System.out.println(sea1);
        int[] search1 = ArrayUtil.search1(sea,4);
        System.out.println(Arrays.toString(search1));
        ArrayList search2 = ArrayUtil.search2(sea,4);
        System.out.println(search2);

        //equals
        int[] array1 = {1,2,4,3,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        boolean equals = ArrayUtil.equals(array1,array2);
        System.out.println(equals);
        boolean equalsIgnoreCase = ArrayUtil.equalsIgnoreCase(array1,array2);
        System.out.println(equalsIgnoreCase);

        //copyOf
        int[] copyOf1 = {1,2,3,4,5};
        int[] copyOf2 = ArrayUtil.copyOf(copyOf1,3);
        int[] copyOf3 = ArrayUtil.copyOf(copyOf1,5);
        int[] copyOf4 = ArrayUtil.copyOf(copyOf1,7);
        System.out.println(Arrays.toString(copyOf2));
        System.out.println(Arrays.toString(copyOf3));
        System.out.println(Arrays.toString(copyOf4));

        //isOrder
        int[] isOrder1 = {1,2,3,4,5,5};
        int[] isOrder2 = {5,4,3,2,1,1};
        int[] isOrder3 = {1,2,1,2,1,2};
        boolean isOrder4 = ArrayUtil.isOrder(isOrder1);
        boolean isOrder5 = ArrayUtil.isOrder(isOrder2);
        boolean isOrder6 = ArrayUtil.isOrder(isOrder3);
        System.out.println(isOrder4 + " " + isOrder5 + " " + isOrder6);

        //fillPrimeRandom
        int[] fillPrimeRandom = {1,2,3,4,5,6,7,8,9,10};
        ArrayUtil.fillPrimeRandom(fillPrimeRandom);
        System.out.println(Arrays.toString(fillPrimeRandom));

        //towards
        String towards = ArrayUtil.towards(1,2,3,4,5,6,7,8,9,10);
        System.out.println(towards + "towards");

        //equalItems
        int[] equalItems = {1,2,3,1,1,2,4,4};
        int[] equalItems1 = ArrayUtil.equalItems(equalItems);
        System.out.println(Arrays.toString(equalItems1) + "equalItems");
        ArrayList equalItems2 = ArrayUtil.equalItems1(equalItems);
        System.out.println(equalItems2);

        //countDifferent
        int[] countDifferent = {6,1,2,3,4,1,2,3,4,1,5};
        int countDifferent1 = ArrayUtil.countDifferent1(countDifferent);
        System.out.println(countDifferent1);

        //equalsIgnoreCase
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,1,2,3,4};
        int[] arr3 = {1,2,3,4,5,1,2,3,4,5,10};
        boolean equalsIgnoreCaseA = ArrayUtil.equalsIgnoreCase1(arr1,arr2);
        boolean equalsIgnoreCaseB = ArrayUtil.equalsIgnoreCase1(arr1,arr3);
        System.out.println(equalsIgnoreCaseA + " " + equalsIgnoreCaseB);

        //countPassengersTime
        int[][] countPT = {{1,2},{1,3},{3,4},{1,5},{5,6}};
        int resCPT = ArrayUtil.countPassengersTime(countPT, 3);
        System.out.println(resCPT);

        //rushHour
        int[] rushH = {1,1,2,2,1};
        int rushHour = ArrayUtil.rushHour(rushH, 2);
        System.out.println(rushHour);

        //sort
        Integer[] arrSort = {10, 5, 4, 7, 9, 2};
        System.out.println(Arrays.toString(arrSort));

        Arrays.sort(arrSort, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(Arrays.toString(arrSort));

        //averagePoint
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] averagePoint2 = new int[n];
        for (int i = 0; i < averagePoint2.length; i++) {
            averagePoint2[i] = sc.nextInt();
        }

        int averagePoint = ArrayUtil.averagePoint(averagePoint2);
        System.out.println(averagePoint + " averagePoint");

        //group
        String[] group = {"aa", "b", "a", "bb", "aa", "bb", "bb","aa", "bb", "bb", "b"};
        String[] resGroup = ArrayUtil.group(group);
        System.out.println(Arrays.toString(resGroup));
        ArrayList<String> resGroup1 = ArrayUtil.group1(group);
        System.out.println(resGroup1);
        ArrayList<ArrayList<String>> resGroup3 = ArrayUtil.group3(group);
        System.out.println(resGroup3);*/

        //debts
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество джентельменов");
        int n = sc.nextInt();
        System.out.println("введите количество расписок");
        int k = sc.nextInt();
        int[][] debts = new int[k][3];
        for (int i = 0; i <debts.length ; i++) {
            for (int j = 0; j < 3; j++) {
                debts[i][j] = sc.nextInt();
            }
        }
        int[] resDebts = ArrayUtil.debts1(debts,n);
        System.out.println(Arrays.toString(resDebts));

        int[][] debts = {{1,2,10},{1,2,20},{1,3,20}};
        int[] resDebts = ArrayUtil.debts1(debts,3);
        System.out.println(Arrays.toString(resDebts));*/


        /*//sort
        Scanner sc = new Scanner(System.in);
        System.out.println("длинна массива");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayUtil.sort1(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(Arrays.toString(arr));*/

        /*//temperatureMinimum
        int[][] temperatureMinimum = {{1,2,3,4,5},{2,3,4,5,1},{3,4,5,1,2},{4,5,1,2,3}};
        int[] tmp = ArrayUtil.temperatureMinimum(temperatureMinimum);
        System.out.println(Arrays.toString(tmp));

        String[] group = {"aa", "b", "a", "bb", "aa", "bb", "bb","aa", "bb", "bb", "b", "ba"};
        String[] res = ArrayUtil.group2(group);
        System.out.println(Arrays.toString(res));*/

        //countMaxLength
        int[] arr = {10, 99, 108, 0, 1, 1000000, 1000000, 1000000};
        int[] res = ArrayUtil.maxSize(arr);
        System.out.println(Arrays.toString(res));
        int[] res2 = ArrayUtil.maxSize2(arr);
        System.out.println(Arrays.toString(res2));
    }

}
