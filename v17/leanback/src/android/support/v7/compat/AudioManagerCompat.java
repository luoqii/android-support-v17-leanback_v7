package android.support.v7.compat;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

public class AudioManagerCompat {

	public static void abandonAudioFocus(AudioManager mAudioManager,
			OnAudioFocusChangeListener mAudioFocusChangeListener) {
		// TODO Auto-generated method stub
		
	}
	
    /**
     * Interface definition for a callback to be invoked when the audio focus of the system is
     * updated.
     */
    public static interface OnAudioFocusChangeListener {
        /**
         * Called on the listener to notify it the audio focus for this listener has been changed.
         * The focusChange value indicates whether the focus was gained,
         * whether the focus was lost, and whether that loss is transient, or whether the new focus
         * holder will hold it for an unknown amount of time.
         * When losing focus, listeners can use the focus change information to decide what
         * behavior to adopt when losing focus. A music player could for instance elect to lower
         * the volume of its music stream (duck) for transient focus losses, and pause otherwise.
         * @param focusChange the type of focus change, one of {@link AudioManager#AUDIOFOCUS_GAIN},
         *   {@link AudioManager#AUDIOFOCUS_LOSS}, {@link AudioManager#AUDIOFOCUS_LOSS_TRANSIENT}
         *   and {@link AudioManager#AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK}.
         */
        public void onAudioFocusChange(int focusChange);
    }

	public static int requestAudioFocus(
			AudioManager mAudioManager,
			OnAudioFocusChangeListener mAudioFocusChangeListener,
			int streamMusic, int audiofocusGainTransientMayDuck) {
		// TODO Auto-generated method stub
		return 0;
	}

}
