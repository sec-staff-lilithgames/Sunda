package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.session.MediaButtonReceiver;
import androidx.media.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: d, reason: collision with root package name */
    public static int f4544d;

    /* renamed from: a, reason: collision with root package name */
    public final z f4545a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4546b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4547c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new e0();

        /* renamed from: b, reason: collision with root package name */
        public final MediaDescriptionCompat f4548b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4549c;

        /* renamed from: e, reason: collision with root package name */
        public MediaSession.QueueItem f4550e;

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            this(null, mediaDescriptionCompat, j10);
        }

        public static QueueItem fromQueueItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.fromMediaDescription(f0.b(queueItem)), f0.c(queueItem));
        }

        public static List<QueueItem> fromQueueItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromQueueItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.f4548b;
        }

        public long getQueueId() {
            return this.f4549c;
        }

        public Object getQueueItem() {
            MediaSession.QueueItem queueItem = this.f4550e;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItemA = f0.a((MediaDescription) this.f4548b.getMediaDescription(), this.f4549c);
            this.f4550e = queueItemA;
            return queueItemA;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
            sb2.append(this.f4548b);
            sb2.append(", Id=");
            return a.b.g(this.f4549c, " }", sb2);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f4548b.writeToParcel(parcel, i10);
            parcel.writeLong(this.f4549c);
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f4548b = mediaDescriptionCompat;
            this.f4549c = j10;
            this.f4550e = queueItem;
        }

        public QueueItem(Parcel parcel) {
            this.f4548b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f4549c = parcel.readLong();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new i0();

        /* renamed from: b, reason: collision with root package name */
        public ResultReceiver f4551b;

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f4551b = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f4551b.writeToParcel(parcel, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new j0();

        /* renamed from: b, reason: collision with root package name */
        public final Object f4552b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final Object f4553c;

        /* renamed from: e, reason: collision with root package name */
        public f f4554e;

        /* renamed from: f, reason: collision with root package name */
        public g6.i f4555f;

        public Token(Object obj, f fVar, g6.i iVar) {
            this.f4553c = obj;
            this.f4554e = fVar;
            this.f4555f = iVar;
        }

        public static Token fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            f fVarAsInterface = e.asInterface(k3.p.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            g6.i versionedParcelable = g6.b.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            Token token = (Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token == null) {
                return null;
            }
            return new Token(token.f4553c, fVarAsInterface, versionedParcelable);
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = ((Token) obj).f4553c;
            Object obj3 = this.f4553c;
            if (obj3 == null) {
                return obj2 == null;
            }
            if (obj2 == null) {
                return false;
            }
            return obj3.equals(obj2);
        }

        public f getExtraBinder() {
            f fVar;
            synchronized (this.f4552b) {
                fVar = this.f4554e;
            }
            return fVar;
        }

        public g6.i getSession2Token() {
            g6.i iVar;
            synchronized (this.f4552b) {
                iVar = this.f4555f;
            }
            return iVar;
        }

        public Object getToken() {
            return this.f4553c;
        }

        public int hashCode() {
            Object obj = this.f4553c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void setExtraBinder(f fVar) {
            synchronized (this.f4552b) {
                this.f4554e = fVar;
            }
        }

        public void setSession2Token(g6.i iVar) {
            synchronized (this.f4552b) {
                this.f4555f = iVar;
            }
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.f4552b) {
                try {
                    f fVar = this.f4554e;
                    if (fVar != null) {
                        k3.p.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", fVar.asBinder());
                    }
                    g6.i iVar = this.f4555f;
                    if (iVar != null) {
                        g6.b.putVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2", iVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f4553c, i10);
        }

        public static Token fromToken(Object obj, f fVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, fVar, null);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {

        /* renamed from: c, reason: collision with root package name */
        public boolean f4558c;

        /* renamed from: e, reason: collision with root package name */
        public v f4560e;

        /* renamed from: a, reason: collision with root package name */
        public final Object f4556a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final w f4557b = new w(this);

        /* renamed from: d, reason: collision with root package name */
        public WeakReference f4559d = new WeakReference(null);

        public final void a(x xVar, Handler handler) {
            if (this.f4558c) {
                this.f4558c = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackState = xVar.getPlaybackState();
                long actions = playbackState == null ? 0L : playbackState.getActions();
                boolean z10 = playbackState != null && playbackState.getState() == 3;
                boolean z11 = (516 & actions) != 0;
                boolean z12 = (actions & 514) != 0;
                if (z10 && z12) {
                    onPause();
                } else {
                    if (z10 || !z11) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            x xVar;
            v vVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT < 27) {
                synchronized (this.f4556a) {
                    xVar = (x) this.f4559d.get();
                    vVar = this.f4560e;
                }
                if (xVar != null && vVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                    androidx.media.l0 currentControllerInfo = xVar.getCurrentControllerInfo();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79 && keyCode != 85) {
                        a(xVar, vVar);
                        return false;
                    }
                    if (keyEvent.getRepeatCount() != 0) {
                        a(xVar, vVar);
                        return true;
                    }
                    if (!this.f4558c) {
                        this.f4558c = true;
                        vVar.sendMessageDelayed(vVar.obtainMessage(1, currentControllerInfo), ViewConfiguration.getDoubleTapTimeout());
                        return true;
                    }
                    vVar.removeMessages(1);
                    this.f4558c = false;
                    PlaybackStateCompat playbackState = xVar.getPlaybackState();
                    if (((playbackState == null ? 0L : playbackState.getActions()) & 32) != 0) {
                        onSkipToNext();
                    }
                    return true;
                }
            }
            return false;
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPrepare() {
        }

        public void onRewind() {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onStop() {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i10) {
        }

        public void onSeekTo(long j10) {
        }

        public void onSetCaptioningEnabled(boolean z10) {
        }

        public void onSetPlaybackSpeed(float f10) {
        }

        public void onSetRepeatMode(int i10) {
        }

        public void onSetShuffleMode(int i10) {
        }

        public void onSkipToQueueItem(long j10) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
        int i10 = Build.VERSION.SDK_INT;
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, i10 >= 29 ? new c0(obj) : i10 >= 28 ? new b0(obj) : new z(obj));
    }

    public static Bundle unparcelWithClassLoader(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ensureClassLoader(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public void addOnActiveChangeListener(d0 d0Var) {
        if (d0Var == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f4547c.add(d0Var);
    }

    public String getCallingPackage() {
        return this.f4545a.getCallingPackage();
    }

    public j getController() {
        return this.f4546b;
    }

    public final androidx.media.l0 getCurrentControllerInfo() {
        return this.f4545a.getCurrentControllerInfo();
    }

    public Object getMediaSession() {
        return this.f4545a.getMediaSession();
    }

    public Object getRemoteControlClient() {
        return this.f4545a.getRemoteControlClient();
    }

    public Token getSessionToken() {
        return this.f4545a.getSessionToken();
    }

    public boolean isActive() {
        return this.f4545a.isActive();
    }

    public void release() {
        this.f4545a.release();
    }

    public void removeOnActiveChangeListener(d0 d0Var) {
        if (d0Var == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f4547c.remove(d0Var);
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f4545a.sendSessionEvent(str, bundle);
    }

    public void setActive(boolean z10) {
        this.f4545a.setActive(z10);
        Iterator it = this.f4547c.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
    }

    public void setCallback(a aVar) {
        setCallback(aVar, null);
    }

    public void setCaptioningEnabled(boolean z10) {
        this.f4545a.setCaptioningEnabled(z10);
    }

    public void setExtras(Bundle bundle) {
        this.f4545a.setExtras(bundle);
    }

    public void setFlags(int i10) {
        this.f4545a.setFlags(i10);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.f4545a.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.f4545a.setMetadata(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.f4545a.setPlaybackState(playbackStateCompat);
    }

    public void setPlaybackToLocal(int i10) {
        this.f4545a.setPlaybackToLocal(i10);
    }

    public void setPlaybackToRemote(t0 t0Var) {
        if (t0Var == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f4545a.setPlaybackToRemote(t0Var);
    }

    public void setQueue(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.getQueueId()))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + queueItem.getQueueId(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(queueItem.getQueueId()));
            }
        }
        this.f4545a.setQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.f4545a.setQueueTitle(charSequence);
    }

    public void setRatingType(int i10) {
        this.f4545a.setRatingType(i10);
    }

    public void setRegistrationCallback(g0 g0Var, Handler handler) {
        this.f4545a.setRegistrationCallback(g0Var, handler);
    }

    public void setRepeatMode(int i10) {
        this.f4545a.setRepeatMode(i10);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.f4545a.setSessionActivity(pendingIntent);
    }

    public void setShuffleMode(int i10) {
        this.f4545a.setShuffleMode(i10);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public void setCallback(a aVar, Handler handler) {
        z zVar = this.f4545a;
        if (aVar == null) {
            zVar.setCallback(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        zVar.setCallback(aVar, handler);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, g6.i iVar) {
        this.f4547c = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = MediaButtonReceiver.getMediaButtonReceiverComponent(context)) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    this.f4545a = new c0(context, str, iVar, bundle);
                } else if (i10 >= 28) {
                    this.f4545a = new b0(context, str, iVar, bundle);
                } else {
                    this.f4545a = new a0(context, str, iVar, bundle);
                }
                setCallback(new u(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f4545a.setMediaButtonReceiver(pendingIntent);
                this.f4546b = new j(context, this);
                if (f4544d == 0) {
                    f4544d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public MediaSessionCompat(Context context, z zVar) {
        this.f4547c = new ArrayList();
        this.f4545a = zVar;
        this.f4546b = new j(context, this);
    }
}
