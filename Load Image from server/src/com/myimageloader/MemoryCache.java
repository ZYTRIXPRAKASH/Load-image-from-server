package com.myimageloader;

/*
 * Class Name: MemoryCache
 * Author: 
 * Description: MemoryCache Class. 
 * Test Configuration will Happen Here
 * Change log: 
 * 03-Jan (Ravi Shankar P): Code Review Changes Incorporated. 
 * [1] All Variables Consolidated. 
 */
import java.lang.ref.SoftReference;
import java.util.HashMap;
import android.graphics.Bitmap;

public class MemoryCache {
	private HashMap<String, SoftReference<Bitmap>> cache = new HashMap<String, SoftReference<Bitmap>>();

	public Bitmap get(String id) {
		if (!cache.containsKey(id))
			return null;
		SoftReference<Bitmap> ref = cache.get(id);
		return ref.get();
	}

	public void put(String id, Bitmap bitmap) {
		cache.put(id, new SoftReference<Bitmap>(bitmap));
	}

	public void clear() {
		cache.clear();
	}
}