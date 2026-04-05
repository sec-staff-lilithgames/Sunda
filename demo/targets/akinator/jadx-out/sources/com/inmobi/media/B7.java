package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B7 extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final F5 f31654a;

    /* renamed from: b, reason: collision with root package name */
    public C3105z7 f31655b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f31656c;

    /* renamed from: d, reason: collision with root package name */
    public A7 f31657d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31658e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f31659f;

    /* renamed from: g, reason: collision with root package name */
    public int f31660g;

    /* renamed from: h, reason: collision with root package name */
    public String f31661h;

    /* renamed from: i, reason: collision with root package name */
    public String f31662i;

    /* renamed from: j, reason: collision with root package name */
    public int f31663j;

    /* renamed from: k, reason: collision with root package name */
    public int f31664k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7(Activity activity, F5 f52) {
        super(activity);
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f31654a = f52;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f31660g = 100;
        this.f31663j = -1;
        this.f31664k = 0;
        this.f31659f = new WeakReference(activity);
        C2925od.a(activity, this);
    }

    public static final void a(B7 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f52 = this$0.f31654a;
        if (f52 != null) {
            ((G5) f52).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (this$0.f31655b == null) {
            C3105z7 c3105z7 = new C3105z7(this$0.getContext());
            this$0.f31655b = c3105z7;
            c3105z7.setAnchorView(this$0);
            this$0.setMediaController(this$0.f31655b);
            this$0.requestLayout();
            this$0.requestFocus();
        }
    }

    public final void b() {
        F5 f52 = this.f31654a;
        if (f52 != null) {
            ((G5) f52).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        ViewGroup viewGroup = this.f31656c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f31656c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f31656c = null;
        }
        setMediaController(null);
        this.f31655b = null;
        A7 a72 = this.f31657d;
        if (a72 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(this, "mp");
            F5 f53 = ((K7) a72).f31948a.f32002b;
            if (f53 != null) {
                ((G5) f53).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.f31660g;
    }

    @Override // android.view.View
    public final String getId() {
        return this.f31661h;
    }

    public final A7 getListener() {
        return this.f31657d;
    }

    public final int getMCurrentPosition() {
        return this.f31664k;
    }

    public final String getPlaybackUrl() {
        return this.f31662i;
    }

    public final int getPreviousPosition() {
        return this.f31663j;
    }

    public final ViewGroup getViewContainer() {
        return this.f31656c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        if (this.f31659f.get() == null || !kotlin.jvm.internal.e0.areEqual(this.f31659f.get(), activity)) {
            return;
        }
        this.f31658e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        Activity activity2 = (Activity) this.f31659f.get();
        if (activity2 == null || !kotlin.jvm.internal.e0.areEqual(activity2, activity)) {
            return;
        }
        this.f31658e = true;
        if (getCurrentPosition() != 0) {
            this.f31664k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mp2, "mp");
        F5 f52 = this.f31654a;
        if (f52 != null) {
            ((G5) f52).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp2, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mp2, "mp");
        F5 f52 = this.f31654a;
        if (f52 != null) {
            ((G5) f52).b("MediaRenderView", ">>> onError (" + i10 + ", " + i11 + ')');
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mp2, "mp");
        F5 f52 = this.f31654a;
        if (f52 != null) {
            ((G5) f52).a("MediaRenderView", ">>> onPrepared");
        }
        mp2.setOnVideoSizeChangedListener(new zk.j(this, 0));
        int i10 = this.f31664k;
        if (i10 < getDuration()) {
            this.f31664k = i10;
            seekTo(i10);
        }
        A7 a72 = this.f31657d;
        if (a72 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(this, "mp");
            F5 f53 = ((K7) a72).f31948a.f32002b;
            if (f53 != null) {
                ((G5) f53).a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        Context contextD;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        super.onVisibilityChanged(view, i10);
        F5 f52 = this.f31654a;
        if (f52 != null) {
            ((G5) f52).a("MediaRenderView", b0.e2.h(')', ">>> onVisibilityChanged (", i10));
        }
        if (i10 != 0 || (contextD = C2925od.d()) == null) {
            return;
        }
        setBackground(new BitmapDrawable(contextD.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        F5 f52 = this.f31654a;
        if (f52 != null) {
            ((G5) f52).a("MediaRenderView", b0.e2.h(')', ">>> onWindowVisibilityChanged (", i10));
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        F5 f52 = this.f31654a;
        if (f52 != null) {
            ((G5) f52).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setCurrentAudioVolume(int i10) {
        this.f31660g = i10;
    }

    public final void setId(String str) {
        this.f31661h = str;
    }

    public final void setListener(A7 a72) {
        this.f31657d = a72;
    }

    public final void setMCurrentPosition(int i10) {
        this.f31664k = i10;
    }

    public final void setPlaybackData(String url) {
        String str;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(sv.g.f86134b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            if (((byte) (b10 & (-128))) > 0) {
                sb2.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
                sb2.append(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[(byte) (b10 & 15)]}));
            } else {
                sb2.append((char) b10);
            }
        }
        try {
            String string = sb2.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bytes2 = string.getBytes(sv.g.f86134b);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            str = new String(bytes2, sv.g.f86137e);
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.f31662i = str;
        this.f31661h = "anonymous";
    }

    public final void setPlaybackUrl(String str) {
        this.f31662i = str;
    }

    public final void setPreviousPosition(int i10) {
        this.f31663j = i10;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.f31656c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f31658e) {
            return;
        }
        F5 f52 = this.f31654a;
        if (f52 != null) {
            ((G5) f52).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void a() {
        setVideoPath(this.f31662i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.f31655b == null) {
            C3105z7 c3105z7 = new C3105z7(getContext());
            this.f31655b = c3105z7;
            c3105z7.setAnchorView(this);
            setMediaController(this.f31655b);
        }
    }

    public final void setAudioMuted(boolean z10) {
    }

    public final void setPlayerPrepared(boolean z10) {
    }
}
