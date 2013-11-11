package com.myimageloader;

/*
 * Class Name: Utils
 * Author: 
 * Description: Utils Class. 
 * Test Configuration will Happen Here
 * Change log: 
 * 03-Jan (Ravi Shankar P): Code Review Changes Incorporated. 
 * [1] All Variables Consolidated. 
 */
import java.io.InputStream;
import java.io.OutputStream;

public class Utils {
	public static void CopyStream(InputStream is, OutputStream os) {
		final int buffer_size = 1024;
		try {
			byte[] bytes = new byte[buffer_size];
			for (;;) {
				int count = is.read(bytes, 0, buffer_size);
				if (count == -1)
					break;
				os.write(bytes, 0, count);
			}
		} catch (Exception ex) {
		}
	}
}