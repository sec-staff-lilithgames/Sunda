package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.j;
import android.view.KeyEvent;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface k {
    void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

    void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void adjustVolume(int i10, int i11);

    boolean dispatchMediaButtonEvent(KeyEvent keyEvent);

    Bundle getExtras();

    long getFlags();

    Object getMediaController();

    MediaMetadataCompat getMetadata();

    String getPackageName();

    o getPlaybackInfo();

    PlaybackStateCompat getPlaybackState();

    List<MediaSessionCompat.QueueItem> getQueue();

    CharSequence getQueueTitle();

    int getRatingType();

    int getRepeatMode();

    PendingIntent getSessionActivity();

    Bundle getSessionInfo();

    int getShuffleMode();

    p getTransportControls();

    boolean isCaptioningEnabled();

    boolean isSessionReady();

    void registerCallback(j.a aVar, Handler handler);

    void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

    void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

    void setVolumeTo(int i10, int i11);

    void unregisterCallback(j.a aVar);
}
