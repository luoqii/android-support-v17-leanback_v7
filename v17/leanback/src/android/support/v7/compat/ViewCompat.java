package android.support.v7.compat;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.v7.compat.ViewCompat.OnLayoutChangeListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * 
 * if android support(v4/v7) has one,use it;
 * otherwise, add one.
 * 
 * @author bysong
 *
 */
public class ViewCompat extends android.support.v4.view.ViewCompat {
	public static void setBackground (View view, Drawable background) {
		
	}
	
	
	public static void addOnLayoutChangeListener(View view, OnLayoutChangeListener listener) {
		
	}
	
    public static void removeOnLayoutChangeListener(View itemView,
			OnLayoutChangeListener mLayoutChangeListener) {
		// TODO Auto-generated method stub
		
	}

	/**
     * Interface definition for a callback to be invoked when the layout bounds of a view
     * changes due to layout processing.
     */
    public static interface OnLayoutChangeListener {
        /**
         * Called when the layout bounds of a view changes due to layout processing.
         *
         * @param v The view whose bounds have changed.
         * @param left The new value of the view's left property.
         * @param top The new value of the view's top property.
         * @param right The new value of the view's right property.
         * @param bottom The new value of the view's bottom property.
         * @param oldLeft The previous value of the view's left property.
         * @param oldTop The previous value of the view's top property.
         * @param oldRight The previous value of the view's right property.
         * @param oldBottom The previous value of the view's bottom property.
         */
        void onLayoutChange(View v, int left, int top, int right, int bottom,
            int oldLeft, int oldTop, int oldRight, int oldBottom);
    }

	public static Matrix getMatrix(View v) {
		return null;
	}


	public static int combineMeasuredStates(int state, int measuredState) {
		return 0;
	}


	public static boolean isActivated(View view) {
		// TODO Auto-generated method stub
		return false;
	}


	public static void setActivated(View itemView, boolean mExpanded) {
		// TODO Auto-generated method stub
		
	}


	public static void setColorFilter(ImageView mIcon, int iconColor) {
		// TODO Auto-generated method stub
		
	}


	public static int generateViewId() {
		// TODO Auto-generated method stub
		return 0;
	}


	public static void setLineSpacing(TextView mTitle, float f,
			float lineSpacingMultiplier) {
		// TODO Auto-generated method stub
		
	}


	public static int getLineSpacingExtra(TextView mBody) {
		// TODO Auto-generated method stub
		return 0;
	}
}
