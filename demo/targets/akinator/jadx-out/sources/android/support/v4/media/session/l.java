package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends i {
    @Override // android.support.v4.media.session.i, android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onExtrasChanged(Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.i, android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.i, android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.i, android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.i, android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onSessionDestroyed() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.i, android.support.v4.media.session.b, android.support.v4.media.session.c
    public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
        throw new AssertionError();
    }
}
