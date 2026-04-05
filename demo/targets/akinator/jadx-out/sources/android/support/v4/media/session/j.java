package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import com.digidust.elokence.akinator.freemium.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final m f4602a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaSessionCompat.Token f4603b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f4604c = new ConcurrentHashMap();

    public j(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token sessionToken = mediaSessionCompat.getSessionToken();
        this.f4603b = sessionToken;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4602a = new n(context, sessionToken);
        } else {
            this.f4602a = new m(context, sessionToken);
        }
    }

    public static void a(Bundle bundle, String str) {
        if (str == null) {
            return;
        }
        if (str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
            if (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
                throw new IllegalArgumentException(a.b.l("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
            }
        }
    }

    public static j getMediaController(Activity activity) {
        Object tag = activity.getWindow().getDecorView().getTag(R.id.media_controller_compat_view_tag);
        if (tag instanceof j) {
            return (j) tag;
        }
        MediaController mediaController = activity.getMediaController();
        if (mediaController == null) {
            return null;
        }
        return new j(activity, MediaSessionCompat.Token.fromToken(mediaController.getSessionToken()));
    }

    public static void setMediaController(Activity activity, j jVar) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, jVar);
        activity.setMediaController(jVar != null ? new MediaController(activity, (MediaSession.Token) jVar.getSessionToken().getToken()) : null);
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f4602a.addQueueItem(mediaDescriptionCompat);
    }

    public void adjustVolume(int i10, int i11) {
        this.f4602a.adjustVolume(i10, i11);
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f4602a.dispatchMediaButtonEvent(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle getExtras() {
        return this.f4602a.getExtras();
    }

    public long getFlags() {
        return this.f4602a.getFlags();
    }

    public MediaMetadataCompat getMetadata() {
        return this.f4602a.getMetadata();
    }

    public String getPackageName() {
        return this.f4602a.getPackageName();
    }

    public o getPlaybackInfo() {
        return this.f4602a.getPlaybackInfo();
    }

    public PlaybackStateCompat getPlaybackState() {
        return this.f4602a.getPlaybackState();
    }

    public List<MediaSessionCompat.QueueItem> getQueue() {
        return this.f4602a.getQueue();
    }

    public CharSequence getQueueTitle() {
        return this.f4602a.getQueueTitle();
    }

    public int getRatingType() {
        return this.f4602a.getRatingType();
    }

    public int getRepeatMode() {
        return this.f4602a.getRepeatMode();
    }

    public g6.i getSession2Token() {
        return this.f4603b.getSession2Token();
    }

    public PendingIntent getSessionActivity() {
        return this.f4602a.getSessionActivity();
    }

    public Bundle getSessionInfo() {
        return this.f4602a.getSessionInfo();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.f4603b;
    }

    public int getShuffleMode() {
        return this.f4602a.getShuffleMode();
    }

    public p getTransportControls() {
        return this.f4602a.getTransportControls();
    }

    public boolean isCaptioningEnabled() {
        return this.f4602a.isCaptioningEnabled();
    }

    public boolean isSessionReady() {
        return this.f4602a.isSessionReady();
    }

    public void registerCallback(a aVar) {
        registerCallback(aVar, null);
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f4602a.removeQueueItem(mediaDescriptionCompat);
    }

    @Deprecated
    public void removeQueueItemAt(int i10) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> queue = getQueue();
        if (queue == null || i10 < 0 || i10 >= queue.size() || (queueItem = queue.get(i10)) == null) {
            return;
        }
        removeQueueItem(queueItem.getDescription());
    }

    public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.f4602a.sendCommand(str, bundle, resultReceiver);
    }

    public void setVolumeTo(int i10, int i11) {
        this.f4602a.setVolumeTo(i10, i11);
    }

    public void unregisterCallback(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f4604c.remove(aVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.f4602a.unregisterCallback(aVar);
        } finally {
            aVar.b(null);
        }
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        this.f4602a.addQueueItem(mediaDescriptionCompat, i10);
    }

    public void registerCallback(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f4604c.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        aVar.b(handler);
        this.f4602a.registerCallback(aVar, handler);
    }

    public Object getMediaController() {
        return this.f4602a.getMediaController();
    }

    public j(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f4603b = token;
            this.f4602a = new m(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final g f4605a = new g(this);

        /* renamed from: b, reason: collision with root package name */
        public h f4606b;

        /* renamed from: c, reason: collision with root package name */
        public l f4607c;

        public final void a(int i10, Object obj, Bundle bundle) {
            h hVar = this.f4606b;
            if (hVar != null) {
                Message messageObtainMessage = hVar.obtainMessage(i10, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        public final void b(Handler handler) {
            if (handler != null) {
                h hVar = new h(this, handler.getLooper());
                this.f4606b = hVar;
                hVar.f4599a = true;
            } else {
                h hVar2 = this.f4606b;
                if (hVar2 != null) {
                    hVar2.f4599a = false;
                    hVar2.removeCallbacksAndMessages(null);
                    this.f4606b = null;
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            a(8, null, null);
        }

        public c getIControllerCallback() {
            return this.f4607c;
        }

        public void onSessionDestroyed() {
        }

        public void onSessionReady() {
        }

        public void onAudioInfoChanged(o oVar) {
        }

        public void onCaptioningEnabledChanged(boolean z10) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i10) {
        }

        public void onShuffleModeChanged(int i10) {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }
    }
}
