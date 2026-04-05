package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f4622b;

    public y(z zVar) {
        this.f4622b = zVar;
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void adjustVolume(int i10, int i11, String str) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void fastForward() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public long getFlags() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public PendingIntent getLaunchPendingIntent() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public MediaMetadataCompat getMetadata() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public String getPackageName() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public PlaybackStateCompat getPlaybackState() {
        z zVar = this.f4622b;
        PlaybackStateCompat playbackStateCompat = zVar.f4629g;
        MediaMetadataCompat mediaMetadataCompat = zVar.f4631i;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j10 = -1;
        if (playbackStateCompat.getPosition() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getState() != 3 && playbackStateCompat.getState() != 4 && playbackStateCompat.getState() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getLastPositionUpdateTime() <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long position = playbackStateCompat.getPosition() + ((long) (playbackStateCompat.getPlaybackSpeed() * (jElapsedRealtime - r3)));
        if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey("android.media.metadata.DURATION")) {
            j10 = mediaMetadataCompat.getLong("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.a(playbackStateCompat).setState(playbackStateCompat.getState(), (j10 < 0 || position <= j10) ? position < 0 ? 0L : position : j10, playbackStateCompat.getPlaybackSpeed(), jElapsedRealtime).build();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public List<MediaSessionCompat.QueueItem> getQueue() {
        return null;
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public CharSequence getQueueTitle() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public int getRatingType() {
        return this.f4622b.f4632j;
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public int getRepeatMode() {
        return this.f4622b.f4634l;
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public Bundle getSessionInfo() {
        z zVar = this.f4622b;
        if (zVar.f4626d == null) {
            return null;
        }
        return new Bundle(zVar.f4626d);
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public int getShuffleMode() {
        return this.f4622b.f4635m;
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public String getTag() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public ParcelableVolumeInfo getVolumeAttributes() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public boolean isCaptioningEnabled() {
        return this.f4622b.f4633k;
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public boolean isShuffleModeEnabledRemoved() {
        return false;
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public boolean isTransportControlEnabled() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void next() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void pause() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void play() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void playFromSearch(String str, Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void prepare() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void previous() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void rate(RatingCompat ratingCompat) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void registerCallbackListener(c cVar) {
        if (this.f4622b.f4627e) {
            return;
        }
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        this.f4622b.f4628f.register(cVar, new androidx.media.l0("android.media.session.MediaController", callingPid, callingUid));
        synchronized (this.f4622b.f4625c) {
            try {
                h0 h0Var = this.f4622b.f4637o;
                if (h0Var != null) {
                    h0Var.postCallbackRegistered(callingPid, callingUid);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void removeQueueItemAt(int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void rewind() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void seekTo(long j10) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void sendCommand(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public boolean sendMediaButton(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void setCaptioningEnabled(boolean z10) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void setPlaybackSpeed(float f10) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void setRepeatMode(int i10) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void setShuffleMode(int i10) throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void setVolumeTo(int i10, int i11, String str) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void skipToQueueItem(long j10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void stop() throws RemoteException {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void unregisterCallbackListener(c cVar) {
        this.f4622b.f4628f.unregister(cVar);
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        synchronized (this.f4622b.f4625c) {
            try {
                h0 h0Var = this.f4622b.f4637o;
                if (h0Var != null) {
                    h0Var.postCallbackUnregistered(callingPid, callingUid);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.support.v4.media.session.e, android.support.v4.media.session.f
    public void setShuffleModeEnabledRemoved(boolean z10) throws RemoteException {
    }
}
