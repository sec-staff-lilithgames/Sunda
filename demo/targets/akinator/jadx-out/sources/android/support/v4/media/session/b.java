package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b extends Binder implements c {
    public b() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof c)) {
            return (c) iInterfaceQueryLocalInterface;
        }
        a aVar = new a();
        aVar.f4595b = iBinder;
        return aVar;
    }

    public static c getDefaultImpl() {
        return a.f4594c;
    }

    public static boolean setDefaultImpl(c cVar) {
        if (a.f4594c != null) {
            throw new IllegalStateException("setDefaultImpl() called twice");
        }
        if (cVar == null) {
            return false;
        }
        a.f4594c = cVar;
        return true;
    }

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onCaptioningEnabledChanged(boolean z10) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onEvent(String str, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onExtrasChanged(Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onQueueChanged(List list) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onQueueTitleChanged(CharSequence charSequence) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onRepeatModeChanged(int i10) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onSessionDestroyed() throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onSessionReady() throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onShuffleModeChanged(int i10) throws RemoteException;

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onShuffleModeChangedRemoved(boolean z10) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i10) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onEvent(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onSessionDestroyed();
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onPlaybackStateChanged(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onMetadataChanged(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onQueueChanged(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onQueueTitleChanged(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onExtrasChanged(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onVolumeInfoChanged(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onShuffleModeChangedRemoved(parcel.readInt() != 0);
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onCaptioningEnabledChanged(parcel.readInt() != 0);
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onShuffleModeChanged(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onSessionReady();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.support.v4.media.session.c
    public abstract /* synthetic */ void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
