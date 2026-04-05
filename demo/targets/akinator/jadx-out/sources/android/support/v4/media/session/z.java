package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.t0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class z implements x {

    /* renamed from: a, reason: collision with root package name */
    public final MediaSession f4623a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaSessionCompat.Token f4624b;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f4626d;

    /* renamed from: g, reason: collision with root package name */
    public PlaybackStateCompat f4629g;

    /* renamed from: h, reason: collision with root package name */
    public List f4630h;

    /* renamed from: i, reason: collision with root package name */
    public MediaMetadataCompat f4631i;

    /* renamed from: j, reason: collision with root package name */
    public int f4632j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4633k;

    /* renamed from: l, reason: collision with root package name */
    public int f4634l;

    /* renamed from: m, reason: collision with root package name */
    public int f4635m;

    /* renamed from: n, reason: collision with root package name */
    public MediaSessionCompat.a f4636n;

    /* renamed from: o, reason: collision with root package name */
    public h0 f4637o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.media.l0 f4638p;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4625c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4627e = false;

    /* renamed from: f, reason: collision with root package name */
    public final RemoteCallbackList f4628f = new RemoteCallbackList();

    public z(Context context, String str, g6.i iVar, Bundle bundle) {
        MediaSession mediaSessionCreateFwkMediaSession = createFwkMediaSession(context, str, bundle);
        this.f4623a = mediaSessionCreateFwkMediaSession;
        this.f4624b = new MediaSessionCompat.Token(mediaSessionCreateFwkMediaSession.getSessionToken(), new y(this), iVar);
        this.f4626d = bundle;
        setFlags(3);
    }

    public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    @Override // android.support.v4.media.session.x
    public MediaSessionCompat.a getCallback() {
        MediaSessionCompat.a aVar;
        synchronized (this.f4625c) {
            aVar = this.f4636n;
        }
        return aVar;
    }

    @Override // android.support.v4.media.session.x
    public String getCallingPackage() {
        MediaSession mediaSession = this.f4623a;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e10) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
            return null;
        }
    }

    @Override // android.support.v4.media.session.x
    public androidx.media.l0 getCurrentControllerInfo() {
        androidx.media.l0 l0Var;
        synchronized (this.f4625c) {
            l0Var = this.f4638p;
        }
        return l0Var;
    }

    @Override // android.support.v4.media.session.x
    public Object getMediaSession() {
        return this.f4623a;
    }

    @Override // android.support.v4.media.session.x
    public PlaybackStateCompat getPlaybackState() {
        return this.f4629g;
    }

    @Override // android.support.v4.media.session.x
    public Object getRemoteControlClient() {
        return null;
    }

    @Override // android.support.v4.media.session.x
    public MediaSessionCompat.Token getSessionToken() {
        return this.f4624b;
    }

    @Override // android.support.v4.media.session.x
    public boolean isActive() {
        return this.f4623a.isActive();
    }

    @Override // android.support.v4.media.session.x
    public void release() {
        this.f4627e = true;
        this.f4628f.kill();
        int i10 = Build.VERSION.SDK_INT;
        MediaSession mediaSession = this.f4623a;
        if (i10 == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e10) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
            }
        }
        mediaSession.setCallback(null);
        mediaSession.release();
    }

    @Override // android.support.v4.media.session.x
    public void sendSessionEvent(String str, Bundle bundle) {
        this.f4623a.sendSessionEvent(str, bundle);
    }

    @Override // android.support.v4.media.session.x
    public void setActive(boolean z10) {
        this.f4623a.setActive(z10);
    }

    @Override // android.support.v4.media.session.x
    public void setCallback(MediaSessionCompat.a aVar, Handler handler) {
        synchronized (this.f4625c) {
            this.f4636n = aVar;
            this.f4623a.setCallback(aVar == null ? null : aVar.f4557b, handler);
            if (aVar != null) {
                synchronized (aVar.f4556a) {
                    try {
                        aVar.f4559d = new WeakReference(this);
                        v vVar = aVar.f4560e;
                        v vVar2 = null;
                        if (vVar != null) {
                            vVar.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            vVar2 = new v(aVar, handler.getLooper());
                        }
                        aVar.f4560e = vVar2;
                    } finally {
                    }
                }
            }
        }
    }

    @Override // android.support.v4.media.session.x
    public void setCaptioningEnabled(boolean z10) {
        if (this.f4633k != z10) {
            this.f4633k = z10;
            synchronized (this.f4625c) {
                for (int iBeginBroadcast = this.f4628f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((c) this.f4628f.getBroadcastItem(iBeginBroadcast)).onCaptioningEnabledChanged(z10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f4628f.finishBroadcast();
            }
        }
    }

    @Override // android.support.v4.media.session.x
    public void setCurrentControllerInfo(androidx.media.l0 l0Var) {
        synchronized (this.f4625c) {
            this.f4638p = l0Var;
        }
    }

    @Override // android.support.v4.media.session.x
    public void setExtras(Bundle bundle) {
        this.f4623a.setExtras(bundle);
    }

    @Override // android.support.v4.media.session.x
    public void setFlags(int i10) {
        this.f4623a.setFlags(i10 | 3);
    }

    @Override // android.support.v4.media.session.x
    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.f4623a.setMediaButtonReceiver(pendingIntent);
    }

    @Override // android.support.v4.media.session.x
    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.f4631i = mediaMetadataCompat;
        this.f4623a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.getMediaMetadata());
    }

    @Override // android.support.v4.media.session.x
    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.f4629g = playbackStateCompat;
        synchronized (this.f4625c) {
            for (int iBeginBroadcast = this.f4628f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((c) this.f4628f.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f4628f.finishBroadcast();
        }
        this.f4623a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.getPlaybackState());
    }

    @Override // android.support.v4.media.session.x
    public void setPlaybackToLocal(int i10) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i10);
        this.f4623a.setPlaybackToLocal(builder.build());
    }

    @Override // android.support.v4.media.session.x
    public void setPlaybackToRemote(t0 t0Var) {
        this.f4623a.setPlaybackToRemote((VolumeProvider) t0Var.getVolumeProvider());
    }

    @Override // android.support.v4.media.session.x
    public void setQueue(List<MediaSessionCompat.QueueItem> list) {
        this.f4630h = list;
        MediaSession mediaSession = this.f4623a;
        if (list == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<MediaSessionCompat.QueueItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next().getQueueItem());
        }
        mediaSession.setQueue(arrayList);
    }

    @Override // android.support.v4.media.session.x
    public void setQueueTitle(CharSequence charSequence) {
        this.f4623a.setQueueTitle(charSequence);
    }

    @Override // android.support.v4.media.session.x
    public void setRatingType(int i10) {
        this.f4632j = i10;
    }

    @Override // android.support.v4.media.session.x
    public void setRegistrationCallback(g0 g0Var, Handler handler) {
        synchronized (this.f4625c) {
            try {
                h0 h0Var = this.f4637o;
                if (h0Var != null) {
                    h0Var.removeCallbacksAndMessages(null);
                }
                if (g0Var != null) {
                    this.f4637o = new h0(handler.getLooper());
                } else {
                    this.f4637o = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.support.v4.media.session.x
    public void setRepeatMode(int i10) {
        if (this.f4634l != i10) {
            this.f4634l = i10;
            synchronized (this.f4625c) {
                for (int iBeginBroadcast = this.f4628f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((c) this.f4628f.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f4628f.finishBroadcast();
            }
        }
    }

    @Override // android.support.v4.media.session.x
    public void setSessionActivity(PendingIntent pendingIntent) {
        this.f4623a.setSessionActivity(pendingIntent);
    }

    @Override // android.support.v4.media.session.x
    public void setShuffleMode(int i10) {
        if (this.f4635m != i10) {
            this.f4635m = i10;
            synchronized (this.f4625c) {
                for (int iBeginBroadcast = this.f4628f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((c) this.f4628f.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f4628f.finishBroadcast();
            }
        }
    }

    public z(Object obj) {
        if (obj instanceof MediaSession) {
            MediaSession mediaSession = (MediaSession) obj;
            this.f4623a = mediaSession;
            this.f4624b = new MediaSessionCompat.Token(mediaSession.getSessionToken(), new y(this), null);
            this.f4626d = null;
            setFlags(3);
            return;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }
}
