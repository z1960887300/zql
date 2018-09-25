public class test17 {
    public static void main(String[] args) {
        int  [] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int n = 3;
        int  [] arr2 = {2,3,4};
        merge(arr1,m,arr2,n);
    }
    public static  void merge(int[] A, int m, int[] B, int n) {
        if (m <= 0 && n <= 0) return;
        int a = 0, b = 0;
        int []C = new int [m+n];
        for (int i = 0; i < m + n; ++i) {
            if (a < m && b < n) {
                if (A[a] < B[b]) {
                    C[i] = A[a];
                    ++a;
                    }
                    else {
                       C[i] = B[b];
                       ++b;
                       }
            }
            else if (a < m && b >= n) {
                        C[i] = A[a];
                        ++a;
                        }
                        else if (a >= m && b < n) {
                                C[i] = B[b];
                                    ++b;
                                }
                       else return;
            }
            for (int i = 0; i < m + n; ++i) {
                A[i] = C[i];
            }
        for (int i : A) {
            System.out.println(i);
        }
         }

    }

