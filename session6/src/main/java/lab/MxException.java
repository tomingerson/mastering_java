/*
Copyright:
Kathy Sierra and Bert Bates,
SCJP Sun Certified Programmer for Java 6 Exam 310-065,
McGraw-Hill Education,
2008,
ISBN 978-0-07-159106-0,
URL www.amazon.com/SCJP-Certified-Programmer-Java-310-065/dp/0071591060?SubscriptionId=AKIAIOBINVZYXZQZ2U3A&tag=chimbori05-20&linkCode=xm2&camp=2025&creative=165953&creativeASIN=0071591060
 */
package lab;

/**
 * We try to decide, if a given food is bad or ok. The food is given as
 * commandline-argument.
 * In this excercise we want to create our own exception without any methods.
 * <ol>
 * <li>Let's first create our exception. We will call it {@code BadFoodException}.
 * This exception will be thrown when bad food is encountered.</li>
 * <li>Create a method called {@code checkFood}. It takes a String argument and
 * throws our exception if it doesn't like the food it was given. Otherwise it
 * tells ut it likes the food. You can add any foods you aren't particularly fond
 * id to the list.</li>
 * <li>Now in the {@code main} method of this class (MyException), you'll get the
 * commandline-argument out of the String-array, and them pass that String on to
 * the {@code checkFood} method. Because it is a checked exception, the {@code
 * checkFood} method must declare it, and the {@code main} method must handle it
 * (using a try-catch). Do not have {@code main} declare the exception, because
 * if {@code main} propagates the exception, who else is back there to catch it?</li>
 * <li>As nifty as exception handling is, it is still up to the developer to make
 * proper use of it. Exception handling makes organizing our code and signaling
 * problems easy, but the exception handlers still have to be written. You will
 * find that even the most complex situations can be handled, and your code will be
 * reusable, readable, and maintainable.</li>
 * </ol>
 *
 * @author Created by tom on 15.10.2018.
 */
public class MxException {

    public static void main(String[] args) {

    }
}
