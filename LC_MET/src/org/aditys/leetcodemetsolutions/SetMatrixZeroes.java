/* First, we will use two loops(nested loops) to traverse all the cells of the matrix.
 
If any cell (i,j) contains the value 0, we will mark all cells in row i and column j with -1 except those which contain 0.

We will perform step 2 for every cell containing 0.

Finally, we will mark all the cells containing -1 with 0.

Thus the given matrix will be modified according to the question. */

package org.aditys.leetcodemetsolutions;

public class SetMatrixZeroes {
	 public void setZeroes(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        boolean firstRow = false;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (matrix[i][j] == 0) {
	                    matrix[0][j] = 0;
	                    if (i == 0) {
	                        firstRow = true;
	                    } else {
	                        matrix[i][0] = 0;
	                    }
	                }
	            }
	        }

	        for (int i = 1; i < rows; i++) {
	            for (int j = 1; j < cols; j++) {
	                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
	                    matrix[i][j] = 0;
	                }
	            }
	        }

	        if (matrix[0][0] == 0) {
	            for (int i = 0; i < rows; i++) {
	                matrix[i][0] = 0;
	            }
	        }

	        if (firstRow) {
	            for (int j = 0; j < cols; j++) {
	                matrix[0][j] = 0;
	            }
	        }
	    }
	}


