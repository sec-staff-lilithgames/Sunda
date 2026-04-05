package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.j;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaController f4608a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4609b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4610c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4611d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public Bundle f4612e;

    /* renamed from: f, reason: collision with root package name */
    public final MediaSessionCompat.Token f4613f;

    public m(Context context, MediaSessionCompat.Token token) {
        this.f4613f = token;
        this.f4608a = new MediaController(context, (MediaSession.Token) token.getToken());
        if (token.getExtraBinder() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f4543b = new WeakReference(this);
            sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat.Token token = this.f4613f;
        if (token.getExtraBinder() == null) {
            return;
        }
        ArrayList arrayList = this.f4610c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j.a aVar = (j.a) it.next();
            l lVar = new l(aVar);
            this.f4611d.put(aVar, lVar);
            aVar.f4607c = lVar;
            try {
                token.getExtraBinder().registerCallbackListener(lVar);
                aVar.a(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        arrayList.clear();
    }

    @Override // android.support.v4.media.session.k
    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        if ((getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
        sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, null);
    }

    @Override // android.support.v4.media.session.k
    public void adjustVolume(int i10, int i11) {
        this.f4608a.adjustVolume(i10, i11);
    }

    @Override // android.support.v4.media.session.k
    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        return this.f4608a.dispatchMediaButtonEvent(keyEvent);
    }

    @Override // android.support.v4.media.session.k
    public Bundle getExtras() {
        return this.f4608a.getExtras();
    }

    @Override // android.support.v4.media.session.k
    public long getFlags() {
        return this.f4608a.getFlags();
    }

    @Override // android.support.v4.media.session.k
    public Object getMediaController() {
        return this.f4608a;
    }

    @Override // android.support.v4.media.session.k
    public MediaMetadataCompat getMetadata() {
        MediaMetadata metadata = this.f4608a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.fromMediaMetadata(metadata);
        }
        return null;
    }

    @Override // android.support.v4.media.session.k
    public String getPackageName() {
        return this.f4608a.getPackageName();
    }

    @Override // android.support.v4.media.session.k
    public o getPlaybackInfo() {
        MediaController.PlaybackInfo playbackInfo = this.f4608a.getPlaybackInfo();
        if (playbackInfo != null) {
            return new o(playbackInfo.getPlaybackType(), AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
        return null;
    }

    @Override // android.support.v4.media.session.k
    public PlaybackStateCompat getPlaybackState() {
        MediaSessionCompat.Token token = this.f4613f;
        if (token.getExtraBinder() != null) {
            try {
                return token.getExtraBinder().getPlaybackState();
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
            }
        }
        PlaybackState playbackState = this.f4608a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.fromPlaybackState(playbackState);
        }
        return null;
    }

    @Override // android.support.v4.media.session.k
    public List<MediaSessionCompat.QueueItem> getQueue() {
        List<MediaSession.QueueItem> queue = this.f4608a.getQueue();
        if (queue != null) {
            return MediaSessionCompat.QueueItem.fromQueueItemList(queue);
        }
        return null;
    }

    @Override // android.support.v4.media.session.k
    public CharSequence getQueueTitle() {
        return this.f4608a.getQueueTitle();
    }

    @Override // android.support.v4.media.session.k
    public int getRatingType() {
        return this.f4608a.getRatingType();
    }

    @Override // android.support.v4.media.session.k
    public int getRepeatMode() {
        MediaSessionCompat.Token token = this.f4613f;
        if (token.getExtraBinder() == null) {
            return -1;
        }
        try {
            return token.getExtraBinder().getRepeatMode();
        } catch (RemoteException e10) {
            Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e10);
            return -1;
        }
    }

    @Override // android.support.v4.media.session.k
    public PendingIntent getSessionActivity() {
        return this.f4608a.getSessionActivity();
    }

    @Override // android.support.v4.media.session.k
    public Bundle getSessionInfo() {
        if (this.f4612e != null) {
            return new Bundle(this.f4612e);
        }
        MediaSessionCompat.Token token = this.f4613f;
        if (token.getExtraBinder() != null) {
            try {
                this.f4612e = token.getExtraBinder().getSessionInfo();
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in getSessionInfo.", e10);
                this.f4612e = Bundle.EMPTY;
            }
        }
        Bundle bundleUnparcelWithClassLoader = MediaSessionCompat.unparcelWithClassLoader(this.f4612e);
        this.f4612e = bundleUnparcelWithClassLoader;
        return bundleUnparcelWithClassLoader == null ? Bundle.EMPTY : new Bundle(this.f4612e);
    }

    @Override // android.support.v4.media.session.k
    public int getShuffleMode() {
        MediaSessionCompat.Token token = this.f4613f;
        if (token.getExtraBinder() == null) {
            return -1;
        }
        try {
            return token.getExtraBinder().getShuffleMode();
        } catch (RemoteException e10) {
            Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e10);
            return -1;
        }
    }

    @Override // android.support.v4.media.session.k
    public p getTransportControls() {
        MediaController.TransportControls transportControls = this.f4608a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new t(transportControls) : new s(transportControls);
    }

    @Override // android.support.v4.media.session.k
    public boolean isCaptioningEnabled() {
        MediaSessionCompat.Token token = this.f4613f;
        if (token.getExtraBinder() == null) {
            return false;
        }
        try {
            return token.getExtraBinder().isCaptioningEnabled();
        } catch (RemoteException e10) {
            Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e10);
            return false;
        }
    }

    @Override // android.support.v4.media.session.k
    public boolean isSessionReady() {
        return this.f4613f.getExtraBinder() != null;
    }

    @Override // android.support.v4.media.session.k
    public final void registerCallback(j.a aVar, Handler handler) {
        this.f4608a.registerCallback(aVar.f4605a, handler);
        synchronized (this.f4609b) {
            if (this.f4613f.getExtraBinder() != null) {
                l lVar = new l(aVar);
                this.f4611d.put(aVar, lVar);
                aVar.f4607c = lVar;
                try {
                    this.f4613f.getExtraBinder().registerCallbackListener(lVar);
                    aVar.a(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            } else {
                aVar.f4607c = null;
                this.f4610c.add(aVar);
            }
        }
    }

    @Override // android.support.v4.media.session.k
    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        if ((getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
        sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }

    @Override // android.support.v4.media.session.k
    public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f4608a.sendCommand(str, bundle, resultReceiver);
    }

    @Override // android.support.v4.media.session.k
    public void setVolumeTo(int i10, int i11) {
        this.f4608a.setVolumeTo(i10, i11);
    }

    @Override // android.support.v4.media.session.k
    public final void unregisterCallback(j.a aVar) {
        this.f4608a.unregisterCallback(aVar.f4605a);
        synchronized (this.f4609b) {
            if (this.f4613f.getExtraBinder() != null) {
                try {
                    l lVar = (l) this.f4611d.remove(aVar);
                    if (lVar != null) {
                        aVar.f4607c = null;
                        this.f4613f.getExtraBinder().unregisterCallbackListener(lVar);
                    }
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                }
            }
            this.f4610c.remove(aVar);
        }
    }

    @Override // android.support.v4.media.session.k
    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        if ((getFlags() & 4) != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
            bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i10);
            sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
            return;
        }
        throw new UnsupportedOperationException("This session doesn't support queue management operations");
    }
}
