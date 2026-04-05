package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {
    public abstract void fastForward();

    public abstract void pause();

    public abstract void play();

    public abstract void playFromMediaId(String str, Bundle bundle);

    public abstract void playFromSearch(String str, Bundle bundle);

    public abstract void playFromUri(Uri uri, Bundle bundle);

    public abstract void prepare();

    public abstract void prepareFromMediaId(String str, Bundle bundle);

    public abstract void prepareFromSearch(String str, Bundle bundle);

    public abstract void prepareFromUri(Uri uri, Bundle bundle);

    public abstract void rewind();

    public abstract void seekTo(long j10);

    public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

    public abstract void sendCustomAction(String str, Bundle bundle);

    public abstract void setCaptioningEnabled(boolean z10);

    public abstract void setRating(RatingCompat ratingCompat);

    public abstract void setRating(RatingCompat ratingCompat, Bundle bundle);

    public abstract void setRepeatMode(int i10);

    public abstract void setShuffleMode(int i10);

    public abstract void skipToNext();

    public abstract void skipToPrevious();

    public abstract void skipToQueueItem(long j10);

    public abstract void stop();

    public void setPlaybackSpeed(float f10) {
    }
}
