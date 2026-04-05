package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.j;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i extends b {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f4601b;

    public i(j.a aVar) {
        this.f4601b = new WeakReference(aVar);
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onCaptioningEnabledChanged(boolean z10) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(11, Boolean.valueOf(z10), null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onEvent(String str, Bundle bundle) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(1, str, bundle);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onExtrasChanged(Bundle bundle) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(7, bundle, null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(3, mediaMetadataCompat, null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(5, list, null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(6, charSequence, null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onRepeatModeChanged(int i10) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(9, Integer.valueOf(i10), null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onSessionDestroyed() throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(8, null, null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onSessionReady() throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(13, null, null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onShuffleModeChanged(int i10) throws RemoteException {
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            aVar.a(12, Integer.valueOf(i10), null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
        o oVar;
        j.a aVar = (j.a) this.f4601b.get();
        if (aVar != null) {
            if (parcelableVolumeInfo != null) {
                oVar = new o(parcelableVolumeInfo.f4561b, new AudioAttributesCompat.a().setLegacyStreamType(parcelableVolumeInfo.f4562c).build(), parcelableVolumeInfo.f4563e, parcelableVolumeInfo.f4564f, parcelableVolumeInfo.f4565g);
            } else {
                oVar = null;
            }
            aVar.a(4, oVar, null);
        }
    }

    @Override // android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onShuffleModeChangedRemoved(boolean z10) throws RemoteException {
    }
}
