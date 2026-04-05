package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.t0;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface x {
    MediaSessionCompat.a getCallback();

    String getCallingPackage();

    androidx.media.l0 getCurrentControllerInfo();

    Object getMediaSession();

    PlaybackStateCompat getPlaybackState();

    Object getRemoteControlClient();

    MediaSessionCompat.Token getSessionToken();

    boolean isActive();

    void release();

    void sendSessionEvent(String str, Bundle bundle);

    void setActive(boolean z10);

    void setCallback(MediaSessionCompat.a aVar, Handler handler);

    void setCaptioningEnabled(boolean z10);

    void setCurrentControllerInfo(androidx.media.l0 l0Var);

    void setExtras(Bundle bundle);

    void setFlags(int i10);

    void setMediaButtonReceiver(PendingIntent pendingIntent);

    void setMetadata(MediaMetadataCompat mediaMetadataCompat);

    void setPlaybackState(PlaybackStateCompat playbackStateCompat);

    void setPlaybackToLocal(int i10);

    void setPlaybackToRemote(t0 t0Var);

    void setQueue(List<MediaSessionCompat.QueueItem> list);

    void setQueueTitle(CharSequence charSequence);

    void setRatingType(int i10);

    void setRegistrationCallback(g0 g0Var, Handler handler);

    void setRepeatMode(int i10);

    void setSessionActivity(PendingIntent pendingIntent);

    void setShuffleMode(int i10);
}
