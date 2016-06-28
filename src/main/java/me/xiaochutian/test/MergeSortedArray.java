package me.xiaochutian.test;

import java.util.Arrays;

/**
 * Created by Xiaochutian on 2016/6/6.
 */
public class MergeSortedArray {
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if (B == null || B.length == 0 || n <= 0){
            return;
        }
        int indexA = m - 1;
        int indexB = n - 1;
        int resultIndex = m + n - 1;
        System.out.println("haha");
        while (indexA >= 0 && indexB >= 0){
            System.out.println("h");
            while (indexA >= 0 && indexB >= 0 && A[indexA] >= B[indexB]){
                A[resultIndex--] = A[indexA--];
            }
            while (indexA >= 0 && indexB >= 0 && B[indexB] >= A[indexA]){
                A[resultIndex--] = B[indexB--];
            }
        }
        System.out.println(indexA + " " + indexB);
        if (indexA < 0){
            while (indexB >= 0){
                A[resultIndex--] = B[indexB--];
            }
        }
        // ���B�ȱ����꣬��A��ʣ�²��ֲ���Ҫ��ֵ�����������A�У�
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] A = new int[300];
        int[] Adata = new int[]{15,51,106,122,128,137,142,151,166,175,204,205,209,215,248,252,253,257,289,299,351,361,377,416,425,430,431,433,434,456,509,541,566,566,593,663,704,721,723,735,741,754,772,797,804,814,817,858,897,913,920,937,950,950,964,975,996,1023,1061,1110,1138,1183,1201,1255,1266,1297,1307,1316,1341,1371,1386,1400,1408,1408,1445,1455,1485,1530,1539,1630,1702,1712,1728,1732,1733,1737,1758,1770,1783,1788,1807,1807,1855,1875,1880,1896,1902,1914,1935,1966};
        for (int i = 0; i < Adata.length; i++) {
            A[i] = Adata[i];
        }
        int[] B = new int[]{16,52,55,63,85,86,91,95,109,160,163,194,197,199,213,226,226,282,284,293,318,339,346,346,363,365,369,380,396,397,411,428,449,459,472,505,509,573,580,590,600,609,614,624,714,721,722,724,729,730,765,790,828,841,850,859,863,892,907,921,927,938,944,946,946,948,956,978,984,1015,1024,1034,1040,1064,1071,1104,1122,1160,1164,1190,1193,1193,1204,1229,1231,1249,1284,1329,1333,1350,1360,1361,1381,1383,1397,1408,1422,1447,1466,1467,1475,1479,1513,1518,1536,1541,1561,1571,1601,1617,1630,1632,1664,1672,1685,1721,1747,1750,1792,1829,1877,1912,1924,1957,1972,1981,1982,1983,1998};
        mergeSortedArray.mergeSortedArray(A,100,B,129);
    }
}
