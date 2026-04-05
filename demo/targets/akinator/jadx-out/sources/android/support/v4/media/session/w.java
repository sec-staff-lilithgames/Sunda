package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends MediaSession.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaSessionCompat.a f4621a;

    public w(MediaSessionCompat.a aVar) {
        this.f4621a = aVar;
    }

    public static void b(z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        String callingPackage = zVar.getCallingPackage();
        if (TextUtils.isEmpty(callingPackage)) {
            callingPackage = "android.media.session.MediaController";
        }
        zVar.setCurrentControllerInfo(new androidx.media.l0(callingPackage, -1, -1));
    }

    public final z a() {
        z zVar;
        synchronized (this.f4621a.f4556a) {
            zVar = (z) this.f4621a.f4559d.get();
        }
        if (zVar == null || this.f4621a != zVar.getCallback()) {
            return null;
        }
        return zVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        b(zVarA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat.Token sessionToken = zVarA.getSessionToken();
                f extraBinder = sessionToken.getExtraBinder();
                k3.p.putBinder(bundle2, "android.support.v4.media.session.EXTRA_BINDER", extraBinder == null ? null : extraBinder.asBinder());
                g6.b.putVersionedParcelable(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", sessionToken.getSession2Token());
                resultReceiver.send(0, bundle2);
            } else {
                boolean zEquals = str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM");
                MediaSessionCompat.a aVar = this.f4621a;
                if (zEquals) {
                    aVar.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    aVar.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    aVar.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    aVar.onCommand(str, bundle, resultReceiver);
                } else if (zVarA.f4630h != null) {
                    int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    MediaSessionCompat.QueueItem queueItem = (i10 < 0 || i10 >= zVarA.f4630h.size()) ? null : (MediaSessionCompat.QueueItem) zVarA.f4630h.get(i10);
                    if (queueItem != null) {
                        aVar.onRemoveQueueItem(queueItem.getDescription());
                    }
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onCustomAction(String str, Bundle bundle) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        b(zVarA);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            MediaSessionCompat.a aVar = this.f4621a;
            if (zEquals) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.ensureClassLoader(bundle2);
                aVar.onPlayFromUri(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                aVar.onPrepare();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.ensureClassLoader(bundle3);
                aVar.onPrepareFromMediaId(string, bundle3);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.ensureClassLoader(bundle4);
                aVar.onPrepareFromSearch(string2, bundle4);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.ensureClassLoader(bundle5);
                aVar.onPrepareFromUri(uri2, bundle5);
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                aVar.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                aVar.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                aVar.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.ensureClassLoader(bundle6);
                aVar.onSetRating(ratingCompat, bundle6);
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                aVar.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            } else {
                aVar.onCustomAction(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onFastForward() {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onFastForward();
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public boolean onMediaButtonEvent(Intent intent) {
        z zVarA = a();
        if (zVarA == null) {
            return false;
        }
        b(zVarA);
        boolean zOnMediaButtonEvent = this.f4621a.onMediaButtonEvent(intent);
        zVarA.setCurrentControllerInfo(null);
        return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPause() {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onPause();
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlay() {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onPlay();
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromMediaId(String str, Bundle bundle) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        b(zVarA);
        this.f4621a.onPlayFromMediaId(str, bundle);
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromSearch(String str, Bundle bundle) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        b(zVarA);
        this.f4621a.onPlayFromSearch(str, bundle);
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromUri(Uri uri, Bundle bundle) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        b(zVarA);
        this.f4621a.onPlayFromUri(uri, bundle);
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepare() {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onPrepare();
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromMediaId(String str, Bundle bundle) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        b(zVarA);
        this.f4621a.onPrepareFromMediaId(str, bundle);
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromSearch(String str, Bundle bundle) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        b(zVarA);
        this.f4621a.onPrepareFromSearch(str, bundle);
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromUri(Uri uri, Bundle bundle) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        b(zVarA);
        this.f4621a.onPrepareFromUri(uri, bundle);
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onRewind() {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onRewind();
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSeekTo(long j10) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onSeekTo(j10);
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetPlaybackSpeed(float f10) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onSetPlaybackSpeed(f10);
        zVarA.setCurrentControllerInfo(null);
    }

    public void onSetRating(Rating rating, Bundle bundle) {
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToNext() {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onSkipToNext();
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToPrevious() {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onSkipToPrevious();
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSkipToQueueItem(long j10) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onSkipToQueueItem(j10);
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onStop() {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onStop();
        zVarA.setCurrentControllerInfo(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onSetRating(Rating rating) {
        z zVarA = a();
        if (zVarA == null) {
            return;
        }
        b(zVarA);
        this.f4621a.onSetRating(RatingCompat.fromRating(rating));
        zVarA.setCurrentControllerInfo(null);
    }
}
