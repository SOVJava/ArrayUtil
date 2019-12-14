package util;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil {

    public static void test(int[] mass) {
        if (mass == null)
            return;
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

    /**
     * getRandom
     * Возвращает случайное число в пределах от "a" до "b"
     */
    public static int getRandom(int a, int b) {
        return (int) (a + Math.random() * (b - a + 1));
    }

    /**
     * getRandomArray
     * Возвращает массив из n элементов со случайными числами в пределах от "a" до "b"
     */
    public static int[] getRandomArray(int n, int a, int b) {
        if (n <= 0 || b < a)
            return null;
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = getRandom(a, b);
        }
        return mass;
    }

    /**
     * getRandomDeepArray
     * Возвращает многомерный массив из n элементов и m строк со случайными числами в пределах от "a" до "b"
     */
    public static int[][] getRandomDeepArray(int n, int m, int a, int b) {
        if (n <= 0 || m <= 0 || b < a)
            return null;
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = getRandom(a, b);
            }
        }
        return mas;
    }

    /**
     * countPositive
     * Дан массив целых чисел. Определить количество положительных элементов в данном массиве.
     */
    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                count++;
        }
        return count;
    }

    /**
     * evenData
     * Дан массив целых чисел. Выведите все четные элементы массива.
     */
    private static boolean isEven(int x) {     // 5.1 Четное или нет
        return x % 2 == 0;
    }

    public static ArrayList<Integer> evenData(int[] arr) {
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i]))
                mass.add(arr[i]);
        }
        return mass;
    }

    public static String evenDataJSON(int[] arr) {
        String res = "[";
        boolean hasPrevElement = false;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                if (hasPrevElement)
                    res += ", ";
                res += arr[i];
                hasPrevElement = true;
            }
        }
        return res + "]";
    }

    /**
     * greatPrev
     * Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
     */
    public static ArrayList<Integer> greatPrev1(int[] arr) {
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                mass.add(arr[i + 1]);
        }
        return mass;
    }

    public static String greatPrevJSON(int[] arr) {
        String res = "[";
        boolean hasN = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (hasN)
                    res += ", ";
                res += arr[i + 1];
                hasN = true;
            }
        }
        return res + "]";
    }

    /**
     * sameNeighbours
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа. Если соседних
     * элементов одного знака нет - не выводите ничего. Если таких пар соседей несколько - выведите первую пару.
     */
    public static int[] sameNeighbours(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0 && arr[i + 1] > 0 || arr[i] < 0 && arr[i + 1] < 0) {
                return new int[]{arr[i], arr[i + 1]};
            }
        }
        return new int[0];
    }

    /**
     * greaterNeighbours
     * Дан массив целых чисел. Определите, сколько в этом массиве элементов,
     * которые больше двух своих соседей и выведите количество таких элементов.
     */
    public static int greaterNeighbours(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                count++;
            }
        }
        return count;
    }

    /**
     * max
     * Дан массив целых чисел. Выведите значение наибольшего элемента в массиве
     */
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    /**
     * min
     * Дан массив целых чисел. Выведите значение наибольшего элемента в массиве
     */
    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    /**
     * minPositive
     * Дан массив целых чисел. Выведите значение наименьшего из всех положительных элементов в массиве.
     * Известно, что в массиве есть хотя бы один положительный элемент.
     */
    public static int minPositive(int[] arr) {
        int positive = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positive = (positive < arr[i] && positive > 0) ? positive : arr[i];
        }
        return positive;
    }

    /**
     * minOdd
     * Дан массив целых чисел. Выведите значение наименьшего нечетного элемента массива,
     * а если в массиве нет нечетных элементов см. способы реализации.
     */
    public static Integer minOdd(int[] arr) {
        int minOdd = Integer.MAX_VALUE;
        boolean hasOdd = false;
        for (int i = 0; i < arr.length; i++) {
            if (!isEven(arr[i]) && arr[i] < minOdd) {
                minOdd = arr[i];
                hasOdd = true;
            }
        }
        return hasOdd ? minOdd : null;
    }

    /**
     * toStringDeep
     * Дан двумермассив целых чисел. Преобразовать данный массив в строковое значение в формате JSON
     */
    public static String toStringDeep(int[][] arr) {  // доделать
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            boolean hasI = false;
            res += "[";
            for (int j = 0; j < arr[i].length; j++) {
                if (hasI)
                    res += ", ";
                res += arr[i][j];
                hasI = true;
            }
            if (i != arr.length - 1) {
                res += "]\n";
            } else res += "]";
        }
        return res;
    }

    /**
     * toString
     * Дан массив целых чисел. Преобразовать данный массив в строковое значение в формате JSON
     */
    public static String toString(int[] arr) {
        String res = "[";
        boolean hasN = false;
        for (int i = 0; i < arr.length; i++) {
            if (hasN)
                res += ", ";
            res += arr[i];
            hasN = true;
        }
        return res + "]";
    }

    /**
     * maxValues
     * Дан массив целых чисел. Выведите все индексы наибольшего значения данного массива
     */
    public static String maxValues1(int[] arr) {
        String res = "";
        boolean has = false;
        int max = ArrayUtil.max(arr);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == max) {
                if (has)
                    res += ", ";
                res += j;
                has = true;
            }
        }
        return res;
    }

    public static int[] maxValues2(int[] arr) {
        int max = max(arr);
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i])
                countMax++;
        }
        int[] mass = new int[countMax];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                mass[j] = i; //!!!
                j++;
            }
        }
        return mass;
    }

    // Вернуть результат в виде массива используя ArrayList (вернуть массив типа INTEGER,
    // сделать преобразование из Arraylist в массив
    public static Integer[] maxValues3(int[] arr) {
        ArrayList<Integer> mass = new ArrayList<>();
        int maxVal = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxVal)
                mass.add(i);
        }
        return mass.toArray(new Integer[mass.size()]);
    }

    /**
     * sumDeepArrays
     * Складывает два двумерных массива, при условии что количество строк и столбцов совпадает
     */
    public static int[][] sumDeepArrays(int[][] arr1, int[][] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            return null;
        }
        int[][] arr3 = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }

    /**
     * evenIndexes
     * Дан массив целых чисел. Выведите все элементы массива с четными индексами.
     * В программе запрещено использовать условную инструкцию для проверки четности индексов
     */
    public static ArrayList<Integer> evenIndexes(int[] arr) {
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            mass.add(arr[i]);
        }
        return mass;
    }

    public static String evenIndexesGSON(int[] arr) {
        String evenIndexesGSON = "[";
        boolean has = false;
        for (int i = 0; i < arr.length; i += 2) {
            if (has)
                evenIndexesGSON += ", ";
            evenIndexesGSON += arr[i];
            has = true;
        }
        return evenIndexesGSON + "]";
    }

    /**
     * nearest
     * Дан массив целых чисел и число x. Найдите в данном массиве элемент,
     * ближайший к x(элемент с минимальной абсолютной разницей с х).
     * Если таких чисел несколько, выведите см. способы реализации.
     */
    // Вернуть последний элемент, удовлетворяющий условиям задачи
    public static int nearest1(int[] arr, int x) {
        int minDif = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(x - arr[i]) <= minDif) {
                minDif = Math.abs(x - arr[i]);
                minIndex = i;
            }
        }
        return arr[minIndex];
    }

    // Вернуть все элементы, удовлетворяющие условиям задачи, используя массивы
    public static int[] nearest2(int[] arr, int x) {
        int[] minDif = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            minDif[i] = Math.abs(x - arr[i]);
        }
        int min = min(minDif);
        int countMin = 0;
        for (int i = 0; i < minDif.length; i++) {
            if (min == minDif[i])
                countMin++;
        }
        int[] mass = new int[countMin];
        for (int i = 0, j = 0; i < minDif.length; i++) {
            if (min == minDif[i]) {
                mass[j] = arr[i];
                j++;
            }
        }
        return mass;
    }

    // Вернуть все элементы, удовлетворяющие условиям задачи, используя ArrayList
    public static ArrayList<Integer> nearest3(int[] arr, int x) {
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            mass.add(Math.abs(arr[i] - x));
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i) <= min)
                min = mass.get(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i) == min)
                res.add(arr[i]);
        }
        return res;
    }

    /**
     * nearest5
     * Найдите в массиве два ближайших элемента (то есть два элемента с минимальной абсолютной разностью)
     */
    public static int[] nearest5(int[] arr) {
        int[] res = new int[2];
        int x = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < x) {
                    x = Math.abs(arr[i] - arr[j]);
                    res[0] = arr[i];
                    res[1] = arr[j];
                }
            }
        }
        return res;
    }

    /**
     * countDifferent
     * Дан массив целых чисел, упорядоченный по неубыванию элементов в нем. Определите,
     * сколько в нем различных элементов (количество неравных друг другу элементов)
     */
    public static int countDifferent(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                count++;
            }
        }
        return count;
    }

    /**
     * reverse
     * Дан массив целых чисел. Переставьте элементы данного массива в обратном порядке.
     * Метод должен производить разворот исходного массива, ничего не возвращая
     */
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int buf = arr[i];
            arr[i] = arr[j];
            arr[j] = buf;
        }
    }

    /**
     * reverseNeighbours
     * Дан массив целых чисел. Переставьте соседние элементы массива.
     * Если элементов нечетное число, то последний элемент остается на своем месте
     */
    public static void reverseNeighbours(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int buf = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = buf;
        }
    }

    /**
     * indexInsertion
     * Дана невозрастающая последовательность целых чисел в виде массива и число x.
     * Вывести номер этой последовательности, куда можно было бы вставить данных элемент х,
     * чтобы правило невозрастания сохранилось, учитывая, что элементы в последовательности
     * начинаются с 1. Если в последовательности уже есть элементы, равные х, то считается,
     * что данный элемент вставляется после них (через while)
     */
    public static int indexInsertion(int[] arr, int x) {
        int i = 0; //!!!!
        while (!(i == arr.length || arr[i] < x)) { //!(i == arr.length || arr[i] < x) <=> i != arr.length && arr[i] >= x
            i++;
        }
        return i + 1;
    }

    /**
     * delete
     * Дан массив целых чисел и номер элемента в массиве k. Удалите из массива элемент с индексом k
     */
    // использовать вспомогательный массив для хранения элементов
    public static int[] delete1(int[] arr, int k) {
        if (k >= arr.length) {
            return null;
        }
        int[] res = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (i < k) {
                res[i] = arr[i];
            } else
                res[i] = arr[i + 1];
        }
        return res;
    }

    // использовать ArrayList для выполнения операции удаления
    public static Integer[] delete2(int[] arr, int k) {
        if (arr.length - 1 < k)
            return null;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int value : arr)
            integers.add(value);
        integers.remove(k);
        return integers.toArray(new Integer[0]);
    }

    /**
     * insert
     * Дан массив целых чисел, число k и значение C. Необходимо вставить в массив на позицию
     * с индексом k элемент, равный C
     */
    //использовать вспомогательный массив для хранения элементов
    public static int[] insert1(int[] arr, int k, int c) {
        if (k > (arr.length - 1))
            return null;
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        res[k] = c;
        for (int i = k + 1, j = k; i < res.length; i++, j++) {
            res[i] = arr[j];
        }
        return res;
    }

    //использовать ArrayList для выполнения операции вставки
    public static Integer[] insert2(int[] arr, int k, int c) {
        if (k > arr.length - 1)
            return null;
        ArrayList<Integer> mass = new ArrayList();
        for (int i = 0, j = i - 1; i < arr.length + 1; i++, j++) {
            if (i == k)
                mass.add(k, c);
            else if (i > k)
                mass.add(i, arr[j]);
            else mass.add(i, arr[i]);
        }
        return mass.toArray(new Integer[mass.size()]);
    }

    /**
     * shift
     * Дан массив целых чисел и параметр k. Если данный параметр истинный, то выполнить
     * циклический сдвиг массива на одну позицию вправо, если ложный, то влево. Метод должен
     * производить операции над массивом, ничего не возвращая
     */
    public static void shift(int[] arr, boolean k) {
        if (!k) {
            int buf = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = buf;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                int buf = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = buf;
            }
        }
    }

    /**
     * shift
     * Дан массив целых чисел и число k. Выполнить циклический сдвиг массива на |k| позиций вправо,
     * если k>0 или влево, если k<0. Метод должен производить операции над массивом, ничего не возвращая
     */
    public static void shift(int[] arr, int k) {
        for (int i = 0; i < Math.abs(k); i++) {
            shift(arr, k > 0);
        }
    }

    /**
     * countEqualPairs
     * Дан массив целых чисел. Посчитайте, сколько в нем пар элементов, равных друг другу. Считается,
     * что любые два элемента, равные друг другу образуют одну пару, которую необходимо посчитать
     */
    public static int countEqualPairs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * countUnique
     * Дан массив целых чисел. Посчитайте, сколько в нем уникальных элементов, не изменяя самого массива
     */
    public static int countUnique(int[] arr) {
        int i = 0;
        int count = 0;
        int uniq = 0;
        while (i < arr.length) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1)
                uniq++;
            count = 0;
            i++;
        }
        return uniq;
    }

    /**
     * unique
     * Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз.
     * Элементы нужно выводить в том порядке, в котором они встречаются в массиве.
     */
    //использовать вспомогательный массив для хранения элементов
    public static int[] unique(int[] arr) {
        int countUnique = countUnique(arr);
        int[] res = new int[countUnique];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1) {
                res[index] = arr[i];
                index++;
            }
        }
        return res;
    }

    //использовать ArrayList для накопления элементов, удовлетворяющих условию задачи
    public static ArrayList<Integer> unique1(int[] arr) {
        ArrayList mass = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1)
                mass.add(arr[i]);
        }
        return mass;
    }

    /**
     * frequent
     * Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
     */
    //Вернуть первый элемент, удовлетворяющий условиям задачи
    public static int frequent(int[] arr) {
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int count1 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count1++;
            }
            if (count1 > maxCount) {
                maxCount = count1;
                index = i;
            }
        }
        return arr[index];
    }

    //Вернуть все элементы, удовлетворяющие условиям задачи, используя дополнительный массив
    //вернуть элементы с маскимальным числом повторов
    public static int[] frequent2(int[] arr) {
        int num = frequent(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }
        int countArr = 0;
        for (int i = 0; i < arr.length; i++) {
            int countI = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    countI++;
            }
            if (count==countI)
                countArr++;
        }
        int[] res = new int[countArr];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int countI = 0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i] == arr[j])
                    countI++;
            }
            if (count==countI) {
                res[index]=arr[i];
                index++;
            }
        }
        return res;
    }

    //Вернуть все элементы, удовлетворяющие условиям задачи, используя ArrayList
    public static ArrayList<Integer> frequent3(int[] arr) {
        ArrayList res = new ArrayList();
        int num = frequent(arr);
        int countNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                countNum++;
        }
        for (int i = 0; i < arr.length; i++) {
            int countI = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    countI++;
            }
            if (countI==countNum)
                res.add(arr[i]);
        }
        return res;
    }

    /**
     * search
     * Дан массив целых чисел и число key. Методом линейного поиска при помощи цикла for найти
     * индекс вхождения числа key в массиве
     */
    public static Integer search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return null;
    }


}
