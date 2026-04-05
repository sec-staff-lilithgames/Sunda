package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static c f4594c;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f4595b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f4595b;
    }

    public String getInterfaceDescriptor() {
        return "android.support.v4.media.session.IMediaControllerCallback";
    }

    @Override // android.support.v4.media.session.c
    public void onCaptioningEnabledChanged(boolean z10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(z10 ? 1 : 0);
            if (this.f4595b.transact(11, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                return;
            }
            b.getDefaultImpl().onCaptioningEnabledChanged(z10);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.c
    public void onEvent(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4595b.transact(1, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                parcelObtain.recycle();
            } else {
                b.getDefaultImpl().onEvent(str, bundle);
                parcelObtain.recycle();
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.c
    public void onExtrasChanged(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4595b.transact(7, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                parcelObtain.recycle();
            } else {
                b.getDefaultImpl().onExtrasChanged(bundle);
                parcelObtain.recycle();
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.c
    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (mediaMetadataCompat != null) {
                parcelObtain.writeInt(1);
                mediaMetadataCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4595b.transact(4, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                parcelObtain.recycle();
            } else {
                b.getDefaultImpl().onMetadataChanged(mediaMetadataCompat);
                parcelObtain.recycle();
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.c
    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                parcelObtain.writeInt(1);
                playbackStateCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4595b.transact(3, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                parcelObtain.recycle();
            } else {
                b.getDefaultImpl().onPlaybackStateChanged(playbackStateCompat);
                parcelObtain.recycle();
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.c
    public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeTypedList(list);
            if (this.f4595b.transact(5, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                return;
            }
            b.getDefaultImpl().onQueueChanged(list);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.c
    public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (charSequence != null) {
                parcelObtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4595b.transact(6, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                parcelObtain.recycle();
            } else {
                b.getDefaultImpl().onQueueTitleChanged(charSequence);
                parcelObtain.recycle();
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.c
    public void onRepeatModeChanged(int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i10);
            if (this.f4595b.transact(9, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                return;
            }
            b.getDefaultImpl().onRepeatModeChanged(i10);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.c
    public void onSessionDestroyed() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (this.f4595b.transact(2, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                return;
            }
            b.getDefaultImpl().onSessionDestroyed();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.c
    public void onSessionReady() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (this.f4595b.transact(13, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                return;
            }
            b.getDefaultImpl().onSessionReady();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.c
    public void onShuffleModeChanged(int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i10);
            if (this.f4595b.transact(12, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                return;
            }
            b.getDefaultImpl().onShuffleModeChanged(i10);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.c
    public void onShuffleModeChangedRemoved(boolean z10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(z10 ? 1 : 0);
            if (this.f4595b.transact(10, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                return;
            }
            b.getDefaultImpl().onShuffleModeChangedRemoved(z10);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.c
    public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (parcelableVolumeInfo != null) {
                parcelObtain.writeInt(1);
                parcelableVolumeInfo.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4595b.transact(8, parcelObtain, null, 1) || b.getDefaultImpl() == null) {
                parcelObtain.recycle();
            } else {
                b.getDefaultImpl().onVolumeInfoChanged(parcelableVolumeInfo);
                parcelObtain.recycle();
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }
}
