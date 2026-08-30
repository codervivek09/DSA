// Q.88 Merge Sorted Array 

public class Q0088_Megre_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] left = new int[m];

        for (int i = 0; i < m; i++) {
            left[i] = nums1[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (left[i] < nums2[j]) {
                nums1[k++] = left[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }

        while (i < m) {
            nums1[k++] = left[i++];
        }

        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}
