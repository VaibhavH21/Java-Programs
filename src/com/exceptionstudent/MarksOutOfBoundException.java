
/*Write program to accept roll no, marks from user. Throw user defined exception “Marks out of
Bound” if marks are &lt; 0 or marks &gt; 100.*/

package com.exceptionstudent;

public class MarksOutOfBoundException extends Exception {
	
	 public MarksOutOfBoundException(String message) {
	        super(message);
	    }

}
