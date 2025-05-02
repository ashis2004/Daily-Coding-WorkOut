class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m1 = nums2.length;
        int[] m = new int[n + m1];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while(i < n && j < m1) {
            if(nums1[i] < nums2[j]) {
                m[k++] = nums1[i++];
            } else {
                m[k++] = nums2[j++];
            }
        }

        while(i < n) {
            m[k++] = nums1[i++];
        }

        while(j < m1) {
            m[k++] = nums2[j++];
        }

        int len = m.length;

        if(len % 2 != 0) {
            return m[len / 2];  // Middle element
        } else {
            int mid1 = m[len / 2];
            int mid2 = m[(len / 2) - 1];
            return (mid1 + mid2) / 2.0;  // Average of two middle elements
        }
    }
}
