package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
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
public abstract class e extends Binder implements f {
    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    public static f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof f)) {
            return (f) iInterfaceQueryLocalInterface;
        }
        d dVar = new d();
        dVar.f4597b = iBinder;
        return dVar;
    }

    public static f getDefaultImpl() {
        return d.f4596c;
    }

    public static boolean setDefaultImpl(f fVar) {
        if (d.f4596c != null) {
            throw new IllegalStateException("setDefaultImpl() called twice");
        }
        if (fVar == null) {
            return false;
        }
        d.f4596c = fVar;
        return true;
    }

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void adjustVolume(int i10, int i11, String str) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void fastForward() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ Bundle getExtras() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ long getFlags() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ PendingIntent getLaunchPendingIntent() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ MediaMetadataCompat getMetadata() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ String getPackageName() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ PlaybackStateCompat getPlaybackState() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ List getQueue() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ CharSequence getQueueTitle() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ int getRatingType() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ int getRepeatMode() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ Bundle getSessionInfo() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ int getShuffleMode() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ String getTag() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ ParcelableVolumeInfo getVolumeAttributes() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ boolean isCaptioningEnabled() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ boolean isShuffleModeEnabledRemoved() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ boolean isTransportControlEnabled() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void next() throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        switch (i10) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                sendCommand(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zSendMediaButton = sendMediaButton(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zSendMediaButton ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                registerCallbackListener(b.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                unregisterCallbackListener(b.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zIsTransportControlEnabled = isTransportControlEnabled();
                parcel2.writeNoException();
                parcel2.writeInt(zIsTransportControlEnabled ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                String packageName = getPackageName();
                parcel2.writeNoException();
                parcel2.writeString(packageName);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PendingIntent launchPendingIntent = getLaunchPendingIntent();
                parcel2.writeNoException();
                if (launchPendingIntent != null) {
                    parcel2.writeInt(1);
                    launchPendingIntent.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                long flags = getFlags();
                parcel2.writeNoException();
                parcel2.writeLong(flags);
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ParcelableVolumeInfo volumeAttributes = getVolumeAttributes();
                parcel2.writeNoException();
                if (volumeAttributes != null) {
                    parcel2.writeInt(1);
                    volumeAttributes.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                play();
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                playFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                playFromSearch(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                playFromUri(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                skipToQueueItem(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                pause();
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                fastForward();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                rewind();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                seekTo(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                rate(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                sendCustomAction(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                MediaMetadataCompat metadata = getMetadata();
                parcel2.writeNoException();
                if (metadata != null) {
                    parcel2.writeInt(1);
                    metadata.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PlaybackStateCompat playbackState = getPlaybackState();
                parcel2.writeNoException();
                if (playbackState != null) {
                    parcel2.writeInt(1);
                    playbackState.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                List queue = getQueue();
                parcel2.writeNoException();
                parcel2.writeTypedList(queue);
                return true;
            case 30:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                CharSequence queueTitle = getQueueTitle();
                parcel2.writeNoException();
                if (queueTitle != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(queueTitle, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle extras = getExtras();
                parcel2.writeNoException();
                if (extras != null) {
                    parcel2.writeInt(1);
                    extras.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int ratingType = getRatingType();
                parcel2.writeNoException();
                parcel2.writeInt(ratingType);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                prepare();
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                prepareFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                prepareFromSearch(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                prepareFromUri(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int repeatMode = getRepeatMode();
                parcel2.writeNoException();
                parcel2.writeInt(repeatMode);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zIsShuffleModeEnabledRemoved = isShuffleModeEnabledRemoved();
                parcel2.writeNoException();
                parcel2.writeInt(zIsShuffleModeEnabledRemoved ? 1 : 0);
                return true;
            case 39:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                setRepeatMode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                setShuffleModeEnabledRemoved(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                addQueueItem(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 42:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                addQueueItemAt(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                removeQueueItem(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 44:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                removeQueueItemAt(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zIsCaptioningEnabled = isCaptioningEnabled();
                parcel2.writeNoException();
                parcel2.writeInt(zIsCaptioningEnabled ? 1 : 0);
                return true;
            case 46:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                setCaptioningEnabled(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int shuffleMode = getShuffleMode();
                parcel2.writeNoException();
                parcel2.writeInt(shuffleMode);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                setShuffleMode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                setPlaybackSpeed(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle sessionInfo = getSessionInfo();
                parcel2.writeNoException();
                if (sessionInfo != null) {
                    parcel2.writeInt(1);
                    sessionInfo.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                rateWithExtras(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void pause() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void play() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void playFromMediaId(String str, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void playFromSearch(String str, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void playFromUri(Uri uri, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void prepare() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void prepareFromMediaId(String str, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void prepareFromSearch(String str, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void previous() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void rate(RatingCompat ratingCompat) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void registerCallbackListener(c cVar) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void removeQueueItemAt(int i10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void rewind() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void seekTo(long j10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void sendCustomAction(String str, Bundle bundle) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ boolean sendMediaButton(KeyEvent keyEvent) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void setCaptioningEnabled(boolean z10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void setPlaybackSpeed(float f10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void setRepeatMode(int i10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void setShuffleMode(int i10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void setShuffleModeEnabledRemoved(boolean z10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void setVolumeTo(int i10, int i11, String str) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void skipToQueueItem(long j10) throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void stop() throws RemoteException;

    @Override // android.support.v4.media.session.f
    public abstract /* synthetic */ void unregisterCallbackListener(c cVar) throws RemoteException;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
