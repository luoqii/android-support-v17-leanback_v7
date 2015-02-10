package android.support.v7.compat;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
/**
 * 
 * if android support(v4/v7) has one,use it;
 * otherwise, add one.
 * 
 * @author bysong
 *
 */
public class DrawableCompat extends android.support.v4.graphics.drawable.DrawableCompat{
	// api 16
	public static void setColors(GradientDrawable drawable, int[] colors) {
		
	}

	public static void setColors(ColorDrawable mutate, int color) {
		// TODO Auto-generated method stub
		
	}

	public static void setColor(ColorDrawable colorDrawable, int dimmedColor) {
		// TODO Auto-generated method stub
		
	}

	public static boolean sameAs(Bitmap bitmap, Bitmap bitmap2) {
		// TODO Auto-generated method stub
		return false;
	}
}
