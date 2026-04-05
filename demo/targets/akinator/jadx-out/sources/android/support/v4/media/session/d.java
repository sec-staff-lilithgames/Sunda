package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: c, reason: collision with root package name */
    public static f f4596c;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f4597b;

    @Override // android.support.v4.media.session.f
    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (mediaDescriptionCompat != null) {
                parcelObtain.writeInt(1);
                mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(41, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().addQueueItem(mediaDescriptionCompat);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (mediaDescriptionCompat != null) {
                parcelObtain.writeInt(1);
                mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(i10);
            if (this.f4597b.transact(42, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().addQueueItemAt(mediaDescriptionCompat, i10);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void adjustVolume(int i10, int i11, String str) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeString(str);
            if (this.f4597b.transact(11, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().adjustVolume(i10, i11, str);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f4597b;
    }

    @Override // android.support.v4.media.session.f
    public void fastForward() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(22, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().fastForward();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public Bundle getExtras() throws RemoteException {
        Bundle extras;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(31, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                extras = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
            } else {
                extras = e.getDefaultImpl().getExtras();
            }
            return extras;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public long getFlags() throws RemoteException {
        long flags;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(9, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                flags = parcelObtain2.readLong();
            } else {
                flags = e.getDefaultImpl().getFlags();
            }
            return flags;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return "android.support.v4.media.session.IMediaSession";
    }

    @Override // android.support.v4.media.session.f
    public PendingIntent getLaunchPendingIntent() throws RemoteException {
        PendingIntent launchPendingIntent;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(8, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                launchPendingIntent = parcelObtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcelObtain2) : null;
            } else {
                launchPendingIntent = e.getDefaultImpl().getLaunchPendingIntent();
            }
            return launchPendingIntent;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public MediaMetadataCompat getMetadata() throws RemoteException {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(27, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                mediaMetadataCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain2) : null;
            } else {
                mediaMetadataCompatCreateFromParcel = e.getDefaultImpl().getMetadata();
            }
            return mediaMetadataCompatCreateFromParcel;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public String getPackageName() throws RemoteException {
        String string;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(6, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } else {
                string = e.getDefaultImpl().getPackageName();
            }
            return string;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public PlaybackStateCompat getPlaybackState() throws RemoteException {
        PlaybackStateCompat playbackStateCompatCreateFromParcel;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(28, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                playbackStateCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
            } else {
                playbackStateCompatCreateFromParcel = e.getDefaultImpl().getPlaybackState();
            }
            return playbackStateCompatCreateFromParcel;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public List<MediaSessionCompat.QueueItem> getQueue() throws RemoteException {
        List<MediaSessionCompat.QueueItem> listCreateTypedArrayList;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(29, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                listCreateTypedArrayList = parcelObtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
            } else {
                listCreateTypedArrayList = e.getDefaultImpl().getQueue();
            }
            return listCreateTypedArrayList;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public CharSequence getQueueTitle() throws RemoteException {
        CharSequence queueTitle;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(30, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                queueTitle = parcelObtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcelObtain2) : null;
            } else {
                queueTitle = e.getDefaultImpl().getQueueTitle();
            }
            return queueTitle;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public int getRatingType() throws RemoteException {
        int ratingType;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(32, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                ratingType = parcelObtain2.readInt();
            } else {
                ratingType = e.getDefaultImpl().getRatingType();
            }
            return ratingType;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public int getRepeatMode() throws RemoteException {
        int repeatMode;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(37, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                repeatMode = parcelObtain2.readInt();
            } else {
                repeatMode = e.getDefaultImpl().getRepeatMode();
            }
            return repeatMode;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public Bundle getSessionInfo() throws RemoteException {
        Bundle sessionInfo;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(50, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                sessionInfo = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
            } else {
                sessionInfo = e.getDefaultImpl().getSessionInfo();
            }
            return sessionInfo;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public int getShuffleMode() throws RemoteException {
        int shuffleMode;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(47, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                shuffleMode = parcelObtain2.readInt();
            } else {
                shuffleMode = e.getDefaultImpl().getShuffleMode();
            }
            return shuffleMode;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public String getTag() throws RemoteException {
        String string;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(7, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } else {
                string = e.getDefaultImpl().getTag();
            }
            return string;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public ParcelableVolumeInfo getVolumeAttributes() throws RemoteException {
        ParcelableVolumeInfo parcelableVolumeInfoCreateFromParcel;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(10, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
                parcelableVolumeInfoCreateFromParcel = parcelObtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } else {
                parcelableVolumeInfoCreateFromParcel = e.getDefaultImpl().getVolumeAttributes();
            }
            return parcelableVolumeInfoCreateFromParcel;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public boolean isCaptioningEnabled() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f4597b.transact(45, parcelObtain, parcelObtain2, 0) && e.getDefaultImpl() != null) {
                return e.getDefaultImpl().isCaptioningEnabled();
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public boolean isShuffleModeEnabledRemoved() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f4597b.transact(38, parcelObtain, parcelObtain2, 0) && e.getDefaultImpl() != null) {
                return e.getDefaultImpl().isShuffleModeEnabledRemoved();
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public boolean isTransportControlEnabled() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f4597b.transact(5, parcelObtain, parcelObtain2, 0) && e.getDefaultImpl() != null) {
                return e.getDefaultImpl().isTransportControlEnabled();
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void next() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(20, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().next();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void pause() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(18, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().pause();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void play() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(13, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().play();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(14, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().playFromMediaId(str, bundle);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void playFromSearch(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(15, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().playFromSearch(str, bundle);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(16, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().playFromUri(uri, bundle);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void prepare() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(33, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().prepare();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(34, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().prepareFromMediaId(str, bundle);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(35, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().prepareFromSearch(str, bundle);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(36, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().prepareFromUri(uri, bundle);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void previous() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(21, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().previous();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void rate(RatingCompat ratingCompat) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (ratingCompat != null) {
                parcelObtain.writeInt(1);
                ratingCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(25, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().rate(ratingCompat);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (ratingCompat != null) {
                parcelObtain.writeInt(1);
                ratingCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(51, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().rateWithExtras(ratingCompat, bundle);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void registerCallbackListener(c cVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
            if (this.f4597b.transact(3, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().registerCallbackListener(cVar);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (mediaDescriptionCompat != null) {
                parcelObtain.writeInt(1);
                mediaDescriptionCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(43, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().removeQueueItem(mediaDescriptionCompat);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void removeQueueItemAt(int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i10);
            if (this.f4597b.transact(44, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().removeQueueItemAt(i10);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void rewind() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(23, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().rewind();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void seekTo(long j10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeLong(j10);
            if (this.f4597b.transact(24, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().seekTo(j10);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (resultReceiverWrapper != null) {
                parcelObtain.writeInt(1);
                resultReceiverWrapper.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(1, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().sendCommand(str, bundle, resultReceiverWrapper);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (this.f4597b.transact(26, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().sendCustomAction(str, bundle);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (keyEvent != null) {
                parcelObtain.writeInt(1);
                keyEvent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.f4597b.transact(2, parcelObtain, parcelObtain2, 0) && e.getDefaultImpl() != null) {
                boolean zSendMediaButton = e.getDefaultImpl().sendMediaButton(keyEvent);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return zSendMediaButton;
            }
            parcelObtain2.readException();
            boolean z10 = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z10;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.support.v4.media.session.f
    public void setCaptioningEnabled(boolean z10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(z10 ? 1 : 0);
            if (this.f4597b.transact(46, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().setCaptioningEnabled(z10);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void setPlaybackSpeed(float f10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeFloat(f10);
            if (this.f4597b.transact(49, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().setPlaybackSpeed(f10);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void setRepeatMode(int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i10);
            if (this.f4597b.transact(39, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().setRepeatMode(i10);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void setShuffleMode(int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i10);
            if (this.f4597b.transact(48, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().setShuffleMode(i10);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void setShuffleModeEnabledRemoved(boolean z10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(z10 ? 1 : 0);
            if (this.f4597b.transact(40, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().setShuffleModeEnabledRemoved(z10);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void setVolumeTo(int i10, int i11, String str) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeString(str);
            if (this.f4597b.transact(12, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().setVolumeTo(i10, i11, str);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void skipToQueueItem(long j10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeLong(j10);
            if (this.f4597b.transact(17, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().skipToQueueItem(j10);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void stop() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (this.f4597b.transact(19, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().stop();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void unregisterCallbackListener(c cVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
            if (this.f4597b.transact(4, parcelObtain, parcelObtain2, 0) || e.getDefaultImpl() == null) {
                parcelObtain2.readException();
            } else {
                e.getDefaultImpl().unregisterCallbackListener(cVar);
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
