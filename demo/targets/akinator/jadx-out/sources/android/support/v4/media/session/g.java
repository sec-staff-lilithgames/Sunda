package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.j;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends MediaController.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4598a;

    public g(j.a aVar) {
        this.f4598a = new WeakReference(aVar);
    }

    @Override // android.media.session.MediaController.Callback
    public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        j.a aVar = (j.a) this.f4598a.get();
        if (aVar != null) {
            aVar.onAudioInfoChanged(new o(playbackInfo.getPlaybackType(), AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.ensureClassLoader(bundle);
        j.a aVar = (j.a) this.f4598a.get();
        if (aVar != null) {
            aVar.onExtrasChanged(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onMetadataChanged(MediaMetadata mediaMetadata) {
        j.a aVar = (j.a) this.f4598a.get();
        if (aVar != null) {
            aVar.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(mediaMetadata));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onPlaybackStateChanged(PlaybackState playbackState) {
        j.a aVar = (j.a) this.f4598a.get();
        if (aVar == null || aVar.f4607c != null) {
            return;
        }
        aVar.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueChanged(List<MediaSession.QueueItem> list) {
        j.a aVar = (j.a) this.f4598a.get();
        if (aVar != null) {
            aVar.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueTitleChanged(CharSequence charSequence) {
        j.a aVar = (j.a) this.f4598a.get();
        if (aVar != null) {
            aVar.onQueueTitleChanged(charSequence);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionDestroyed() {
        j.a aVar = (j.a) this.f4598a.get();
        if (aVar != null) {
            aVar.onSessionDestroyed();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.ensureClassLoader(bundle);
        j.a aVar = (j.a) this.f4598a.get();
        if (aVar != null) {
            aVar.onSessionEvent(str, bundle);
        }
    }
}
