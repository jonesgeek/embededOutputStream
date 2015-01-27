/**
 * 
 */
package org.adidac.io;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

/**
 * @author will
 *
 */
public class EmbededOutputStreamTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws IOException {
		final String testString = "Embeded output goes here <p>{EMBED: /swagger/ObservationResource.html }</p>\n";
		OutputStream out = new EmbededOutputStream(System.out);
		out.write(testString.getBytes());
		out.flush();
	}

}
