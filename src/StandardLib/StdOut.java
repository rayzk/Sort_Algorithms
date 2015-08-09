package StandardLib;

import java.io.*;
import java.util.Locale;

public final class StdOut {

	// force Unicode UTF-8 encoding; ortherwise it's system dependent.
	private static final String CHARSET_NAME = "UTF-8";

	// assume language = English, country = US for consistency.
	private static final Locale LOCALE = Locale.US;

	// send output here.
	private static PrintWriter out;

	// this is called before invoking any methods.
	static {
		try {
			out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
		} catch (UnsupportedEncodingException e) {
			System.out.println(e);
		}
	}

	// don't instantiate.
	private StdOut() {
	}

	// close standard output.
	public static void close() {
		out.close();
	}

	/*
	 * Print and terminate the line.
	 */

	// terminate the current line by printing the line separator string.
	public static void println() {
		out.println();
	}

	// print an object to standard output and them terminate the line.
	public static void println(Object x) {
		out.println(x);
	}

	// print a boolean to standard output and then terminate the line.
	public static void println(boolean x) {
		out.println(x);
	}

	// print a char to standard output and then terminate the line.
	public static void println(char x) {
		out.println(x);
	}

	// print a double to standard output and then terminate the line.
	public static void println(double x) {
		out.println(x);
	}

	// print a float to standard output and then terminate the line.
	public static void println(float x) {
		out.println(x);
	}

	// print an int to standard output and then terminate the line.
	public static void println(int x) {
		out.println(x);
	}

	/*
	 * Print and flush standard output.
	 */
	// Flush standard output.
	public static void print() {
		out.flush();
	}

	// Print an Object to standard output and flush standard output.
	public static void print(Object x) {
		out.print(x);
		out.flush();
	}

	// Print a boolean to standard output and flush standard output.
	public static void print(boolean x) {
		out.print(x);
		out.flush();
	}

	// Print a char to standard output and flush standard output.
	public static void print(char x) {
		out.print(x);
		out.flush();
	}

	// Print a double to standard output and flush standard output.
	public static void print(double x) {
		out.print(x);
		out.flush();
	}

	// Print a float to standard output and flush standard output.
	public static void print(float x) {
		out.print(x);
		out.flush();
	}

	// Print an int to standard output and flush standard output.
	public static void print(int x) {
		out.print(x);
		out.flush();
	}

	// Print a long to standard output and flush standard output.
	public static void print(long x) {
		out.print(x);
		out.flush();
	}

	// Print a short to standard output and flush standard output.
	public static void print(short x) {
		out.print(x);
		out.flush();
	}

	// Print a byte to standard output and flush standard output.
	public static void print(byte x) {
		out.print(x);
		out.flush();
	}

	/*
	 * Print a formatted string to standard output, and flush standard output.
	 */
	public static void printf(String format, Object... args) {
		out.printf(LOCALE, format, args);
		out.flush();
	}

	// This method is just here to test the class.
	public static void main(String[] args) {
		// write to stdout
		StdOut.println("Test");
		StdOut.println(17);
		StdOut.println(true);
		StdOut.printf("%.6f\n", 1.0 / 7.0);

	}

}
