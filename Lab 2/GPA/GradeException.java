/**
 * 
 */
package GPA;

/**
 * @author David Hamilton
 * @category Homework
 * @version 1.0
 * 
 * Exception for when an invalid grade value is passed to {@link GPATracker#addCourse(int, char)} or {@link GPATracker#addCourse(int, int)}
 */
@SuppressWarnings("serial")
public class GradeException extends Exception {

	/**
	 * Constructor.
	 * Calls the constructor of Exception, passing the message.
	 * 
	 * @param msg - Message to be displayed with the exception.
	 */
	public GradeException(String msg) {
		super(msg);
	}
}