package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.C3039v9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3039v9 extends TextureView implements MediaController.MediaPlayerControl {
    public static final String C = "v9";
    public final MediaPlayer.OnErrorListener A;
    public final TextureViewSurfaceTextureListenerC3022u9 B;

    /* renamed from: a, reason: collision with root package name */
    public Uri f33485a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f33486b;

    /* renamed from: c, reason: collision with root package name */
    public Q8 f33487c;

    /* renamed from: d, reason: collision with root package name */
    public int f33488d;

    /* renamed from: e, reason: collision with root package name */
    public int f33489e;

    /* renamed from: f, reason: collision with root package name */
    public int f33490f;

    /* renamed from: g, reason: collision with root package name */
    public int f33491g;

    /* renamed from: h, reason: collision with root package name */
    public int f33492h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC2971r9 f33493i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC2955q9 f33494j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2938p9 f33495k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33496l;

    /* renamed from: m, reason: collision with root package name */
    public HandlerC2988s9 f33497m;

    /* renamed from: n, reason: collision with root package name */
    public C2921o9 f33498n;

    /* renamed from: o, reason: collision with root package name */
    public int f33499o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33500p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33501q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f33502r;

    /* renamed from: s, reason: collision with root package name */
    public Handler f33503s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33504t;

    /* renamed from: u, reason: collision with root package name */
    public final C2937p8 f33505u;

    /* renamed from: v, reason: collision with root package name */
    public MediaPlayer.OnVideoSizeChangedListener f33506v;

    /* renamed from: w, reason: collision with root package name */
    public final C3005t9 f33507w;

    /* renamed from: x, reason: collision with root package name */
    public final MediaPlayer.OnCompletionListener f33508x;

    /* renamed from: y, reason: collision with root package name */
    public final MediaPlayer.OnInfoListener f33509y;

    /* renamed from: z, reason: collision with root package name */
    public final MediaPlayer.OnBufferingUpdateListener f33510z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3039v9(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f33492h = Integer.MIN_VALUE;
        Context context2 = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f33505u = new C2937p8(context2, this);
        requestLayout();
        invalidate();
        this.f33506v = new zk.j(this, 1);
        this.f33507w = new C3005t9(this);
        this.f33508x = new MediaPlayer.OnCompletionListener() { // from class: zk.c1
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C3039v9.a(this.f98075b, mediaPlayer);
            }
        };
        this.f33509y = new MediaPlayer.OnInfoListener() { // from class: zk.d1
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
                return C3039v9.b(this.f98088b, mediaPlayer, i10, i11);
            }
        };
        this.f33510z = new MediaPlayer.OnBufferingUpdateListener() { // from class: zk.e1
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
                C3039v9.a(this.f98095b, mediaPlayer, i10);
            }
        };
        this.A = new MediaPlayer.OnErrorListener() { // from class: zk.f1
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                return C3039v9.a(this.f98100b, mediaPlayer, i10, i11);
            }
        };
        this.B = new TextureViewSurfaceTextureListenerC3022u9(this);
    }

    public static final void a(C3039v9 this$0, MediaPlayer mediaPlayer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.d();
        } catch (Exception e10) {
            String TAG = C;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static final boolean b(C3039v9 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (3 != i10) {
            return true;
        }
        this$0.a(8, 8);
        return true;
    }

    public static final void c(C3039v9 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f33489e = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this$0.f33490f = videoHeight;
        if (this$0.f33489e == 0 || videoHeight == 0) {
            return;
        }
        this$0.requestLayout();
    }

    public static final void e(C3039v9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.pause();
    }

    private final void setVideoPath(String str) throws IllegalStateException, IllegalArgumentException {
        setVideoURI(Uri.parse(str));
    }

    private final void setVideoURI(Uri uri) throws IllegalStateException, IllegalArgumentException {
        this.f33485a = uri;
        e();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return this.f33500p;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f33501q;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f33502r;
    }

    public final void d() {
        Q8 q82 = this.f33487c;
        if (q82 != null) {
            q82.f32168a = 5;
        }
        if (q82 != null) {
            q82.f32169b = 5;
        }
        C2921o9 c2921o9 = this.f33498n;
        if (c2921o9 != null) {
            c2921o9.c();
        }
        HandlerC2988s9 handlerC2988s9 = this.f33497m;
        if (handlerC2988s9 != null) {
            handlerC2988s9.removeMessages(1);
        }
        Object tag = getTag();
        if (tag instanceof C2887m9) {
            C2887m9 c2887m9 = (C2887m9) tag;
            Object obj = c2887m9.f33155t.get("didCompleteQ4");
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) obj).booleanValue()) {
                c2887m9.f33155t.put("didCompleteQ4", Boolean.TRUE);
                InterfaceC2971r9 interfaceC2971r9 = this.f33493i;
                if (interfaceC2971r9 != null) {
                    ((J8) interfaceC2971r9).a((byte) 3);
                }
            }
            c2887m9.f33155t.put("didSignalVideoCompleted", Boolean.TRUE);
            HashMap map = c2887m9.f33155t;
            if (map != null) {
                Boolean bool = Boolean.FALSE;
                map.put("didCompleteQ1", bool);
                map.put("didCompleteQ2", bool);
                map.put("didCompleteQ3", bool);
                map.put("didPause", bool);
                map.put("didStartPlaying", bool);
                map.put("didQ4Fire", bool);
            }
            if (c2887m9.B) {
                start();
                return;
            }
            this.f33505u.a();
            Object obj2 = c2887m9.f33155t.get("isFullScreen");
            kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj2).booleanValue()) {
                a(8, 0);
            }
        }
    }

    public final void f() {
        Surface surface = this.f33486b;
        if (surface != null) {
            surface.release();
        }
        this.f33486b = null;
        g();
    }

    public final void g() {
        Q8 q82;
        HandlerC2988s9 handlerC2988s9 = this.f33497m;
        if (handlerC2988s9 != null) {
            handlerC2988s9.removeMessages(1);
        }
        C2937p8 c2937p8 = this.f33505u;
        c2937p8.a();
        if (Build.VERSION.SDK_INT >= 26) {
            c2937p8.f33266f = null;
        }
        c2937p8.f33267g = null;
        Object tag = getTag();
        boolean z10 = tag instanceof C2887m9;
        if (z10) {
            ((C2887m9) tag).f33155t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
        }
        Q8 q83 = this.f33487c;
        if (q83 != null) {
            q83.f32168a = 0;
        }
        if (q83 != null) {
            q83.f32169b = 0;
        }
        if (q83 != null) {
            try {
                q83.reset();
            } catch (Exception e10) {
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
        Q8 q84 = this.f33487c;
        if (q84 != null) {
            q84.setOnPreparedListener(null);
            q84.setOnVideoSizeChangedListener(null);
            q84.setOnCompletionListener(null);
            q84.setOnErrorListener(null);
            q84.setOnInfoListener(null);
            q84.setOnBufferingUpdateListener(null);
        }
        if (z10) {
            Object obj = ((C2887m9) tag).f33155t.get("placementType");
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Byte");
            if (((Byte) obj).byteValue() == 0 && (q82 = this.f33487c) != null) {
                q82.a();
            }
        } else {
            Q8 q85 = this.f33487c;
            if (q85 != null) {
                q85.a();
            }
        }
        String TAG = C;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        this.f33487c = null;
    }

    public final C2937p8 getAudioFocusManager$media_release() {
        return this.f33505u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f33488d == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f33488d = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f33488d;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f33487c != null) {
            return this.f33499o;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        Q8 q82 = this.f33487c;
        if (q82 == null || !a()) {
            return 0;
        }
        return q82.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        Q8 q82 = this.f33487c;
        if (q82 == null || !a()) {
            return -1;
        }
        return q82.getDuration();
    }

    public final int getLastVolume() {
        return this.f33492h;
    }

    public final MediaPlayer.OnVideoSizeChangedListener getMSizeChangedListener() {
        return this.f33506v;
    }

    public final C2921o9 getMediaController() {
        return this.f33498n;
    }

    public final Q8 getMediaPlayer() {
        return this.f33487c;
    }

    public final boolean getPauseScheduled() {
        return this.f33504t;
    }

    public final InterfaceC2955q9 getPlaybackEventListener() {
        return this.f33494j;
    }

    public final InterfaceC2971r9 getQuartileCompletedListener() {
        return this.f33493i;
    }

    public final int getState() {
        Q8 q82 = this.f33487c;
        if (q82 != null) {
            return q82.f32168a;
        }
        return 0;
    }

    public final int getVideoVolume() {
        if (isPlaying()) {
            return this.f33491g;
        }
        return -1;
    }

    public final int getVolume() {
        if (a()) {
            return this.f33491g;
        }
        return -1;
    }

    public final void h() {
        Q8 q82 = this.f33487c;
        if (q82 != null) {
            this.f33491g = 0;
            q82.setVolume(0.0f, 0.0f);
            Object tag = getTag();
            if (tag instanceof C2887m9) {
                ((C2887m9) tag).f33155t.put("currentMediaVolume", 0);
            }
        }
    }

    public final void i() {
        Q8 q82 = this.f33487c;
        if (q82 != null) {
            this.f33491g = 1;
            q82.setVolume(1.0f, 1.0f);
            Object tag = getTag();
            if (tag instanceof C2887m9) {
                ((C2887m9) tag).f33155t.put("currentMediaVolume", 15);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        Q8 q82;
        return a() && (q82 = this.f33487c) != null && q82.isPlaying();
    }

    public final void j() {
        Q8 q82;
        if (a() && (q82 = this.f33487c) != null && q82.isPlaying()) {
            Q8 q83 = this.f33487c;
            if (q83 != null) {
                q83.pause();
            }
            Q8 q84 = this.f33487c;
            if (q84 != null) {
                q84.seekTo(0);
            }
            this.f33505u.a();
            Object tag = getTag();
            if (tag instanceof C2887m9) {
                C2887m9 c2887m9 = (C2887m9) tag;
                HashMap map = c2887m9.f33155t;
                Boolean bool = Boolean.TRUE;
                map.put("didPause", bool);
                c2887m9.f33155t.put("seekPosition", 0);
                c2887m9.f33155t.put("didCompleteQ4", bool);
            }
            Q8 q85 = this.f33487c;
            if (q85 != null) {
                q85.f32168a = 4;
            }
            InterfaceC2955q9 interfaceC2955q9 = this.f33494j;
            if (interfaceC2955q9 != null) {
                ((K8) interfaceC2955q9).a((byte) 4);
            }
        }
        Q8 q86 = this.f33487c;
        if (q86 == null) {
            return;
        }
        q86.f32169b = 4;
    }

    public final void k() {
        if (this.f33487c != null) {
            if (isPlaying()) {
                this.f33505u.c();
            } else {
                i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r1 > r6) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f33489e     // Catch: java.lang.Exception -> L79
            int r0 = android.view.View.getDefaultSize(r0, r6)     // Catch: java.lang.Exception -> L79
            int r1 = r5.f33490f     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.getDefaultSize(r1, r7)     // Catch: java.lang.Exception -> L79
            int r2 = r5.f33489e     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r2 = r5.f33490f     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch: java.lang.Exception -> L79
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch: java.lang.Exception -> L79
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch: java.lang.Exception -> L79
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3c
            if (r1 != r2) goto L3c
            int r0 = r5.f33489e     // Catch: java.lang.Exception -> L79
            int r1 = r0 * r7
            int r2 = r5.f33490f     // Catch: java.lang.Exception -> L79
            int r3 = r6 * r2
            if (r1 >= r3) goto L36
            int r3 = r3 / r0
            goto L73
        L36:
            if (r1 <= r3) goto L5a
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L75
        L3c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L4e
            int r0 = r5.f33490f     // Catch: java.lang.Exception -> L79
            int r0 = r0 * r6
            int r2 = r5.f33489e     // Catch: java.lang.Exception -> L79
            int r0 = r0 / r2
            if (r1 != r3) goto L4b
            if (r0 <= r7) goto L4b
            goto L5a
        L4b:
            r1 = r0
        L4c:
            r0 = r6
            goto L75
        L4e:
            if (r1 != r2) goto L5e
            int r1 = r5.f33489e     // Catch: java.lang.Exception -> L79
            int r1 = r1 * r7
            int r2 = r5.f33490f     // Catch: java.lang.Exception -> L79
            int r1 = r1 / r2
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
        L5a:
            r1 = r7
            goto L4c
        L5c:
            r0 = r1
            goto L3a
        L5e:
            int r2 = r5.f33489e     // Catch: java.lang.Exception -> L79
            int r4 = r5.f33490f     // Catch: java.lang.Exception -> L79
            if (r1 != r3) goto L6a
            if (r4 <= r7) goto L6a
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L6c
        L6a:
            r1 = r2
            r7 = r4
        L6c:
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
            int r4 = r4 * r6
            int r3 = r4 / r2
        L73:
            r1 = r3
            goto L4c
        L75:
            r5.setMeasuredDimension(r0, r1)     // Catch: java.lang.Exception -> L79
            return
        L79:
            java.lang.String r6 = com.inmobi.media.C3039v9.C
            java.lang.String r7 = "TAG"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3039v9.onMeasure(int, int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        Q8 q82;
        if (a() && (q82 = this.f33487c) != null && q82.isPlaying()) {
            Q8 q83 = this.f33487c;
            if (q83 != null) {
                q83.pause();
            }
            Q8 q84 = this.f33487c;
            if (q84 != null) {
                q84.f32168a = 4;
            }
            this.f33505u.a();
            Object tag = getTag();
            if (tag instanceof C2887m9) {
                C2887m9 c2887m9 = (C2887m9) tag;
                c2887m9.f33155t.put("didPause", Boolean.TRUE);
                c2887m9.f33155t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            InterfaceC2955q9 interfaceC2955q9 = this.f33494j;
            if (interfaceC2955q9 != null) {
                ((K8) interfaceC2955q9).a((byte) 2);
            }
        }
        Q8 q85 = this.f33487c;
        if (q85 != null) {
            q85.f32169b = 4;
        }
        this.f33504t = false;
    }

    public final void setIsLockScreen(boolean z10) {
        this.f33496l = z10;
    }

    public final void setLastVolume(int i10) {
        this.f33492h = i10;
    }

    public final void setMSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onVideoSizeChangedListener, "<set-?>");
        this.f33506v = onVideoSizeChangedListener;
    }

    public final void setMediaController(C2921o9 c2921o9) {
        C2921o9 mediaController;
        if (c2921o9 != null) {
            this.f33498n = c2921o9;
            if (this.f33487c == null || (mediaController = getMediaController()) == null) {
                return;
            }
            mediaController.setMediaPlayer(this);
            mediaController.setEnabled(a());
            mediaController.d();
        }
    }

    public final void setMediaErrorListener(InterfaceC2938p9 interfaceC2938p9) {
        this.f33495k = interfaceC2938p9;
    }

    public final void setPlaybackEventListener(InterfaceC2955q9 interfaceC2955q9) {
        this.f33494j = interfaceC2955q9;
    }

    public final void setQuartileCompletedListener(InterfaceC2971r9 interfaceC2971r9) {
        this.f33493i = interfaceC2971r9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    @Override // android.widget.MediaController.MediaPlayerControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3039v9.start():void");
    }

    public final void b() {
        try {
            if (this.f33485a != null) {
                C2925od.a(new zk.b1(this, 2));
            }
        } catch (Exception unused) {
            String TAG = C;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        }
    }

    public final void e() throws IllegalStateException, IllegalArgumentException {
        byte bByteValue;
        Q8 q8A;
        if (this.f33485a == null || this.f33486b == null) {
            return;
        }
        if (this.f33487c != null) {
            d(this);
            return;
        }
        Object tag = getTag();
        C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
        if (c2887m9 != null) {
            Object obj = c2887m9.f33155t.get("placementType");
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Byte");
            bByteValue = ((Byte) obj).byteValue();
        } else {
            bByteValue = 1;
        }
        if (1 == bByteValue) {
            q8A = new Q8();
        } else {
            Object obj2 = Q8.f32165d;
            q8A = P8.a();
        }
        this.f33487c = q8A;
        int i10 = this.f33488d;
        if (i10 != 0) {
            q8A.setAudioSessionId(i10);
        } else {
            this.f33488d = q8A.getAudioSessionId();
        }
        ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).execute(new zk.b1(this, 0));
    }

    public static final void b(C3039v9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            Q8 q82 = this$0.f33487c;
            if (q82 != null) {
                Context applicationContext = this$0.getContext().getApplicationContext();
                Uri uri = this$0.f33485a;
                kotlin.jvm.internal.e0.checkNotNull(uri);
                q82.setDataSource(applicationContext, uri, (Map<String, String>) null);
            }
            ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
            zk.b1 runnable = new zk.b1(this$0, 1);
            executorC3020u7.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            executorC3020u7.f33447a.post(runnable);
        } catch (IOException unused) {
            Q8 q83 = this$0.f33487c;
            if (q83 != null) {
                q83.f32168a = -1;
            }
            if (q83 == null) {
                return;
            }
            q83.f32169b = -1;
        }
    }

    public static final void c(C3039v9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        d(this$0);
    }

    public static final void a(C3039v9 this$0, MediaPlayer mediaPlayer, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f33499o = i10;
    }

    public final void c() {
        if (this.f33487c != null) {
            this.f33505u.a();
            h();
        }
    }

    public static final boolean a(C3039v9 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        String TAG = C;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        InterfaceC2938p9 interfaceC2938p9 = this$0.f33495k;
        if (interfaceC2938p9 != null) {
            L8 l82 = (L8) interfaceC2938p9;
            C2734d8 c2734d8 = l82.f32007a.f32052b;
            if (!c2734d8.f32759t && (c2734d8 instanceof C2853k9)) {
                try {
                    ((C2853k9) c2734d8).a(l82.f32008b, i10);
                } catch (Exception e10) {
                    N8 n82 = l82.f32007a;
                    F5 f52 = n82.f32056f;
                    if (f52 != null) {
                        String str = n82.f32057g;
                        ((G5) f52).b(str, Qf.a(e10, N6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in handling the onVideoError event; ")));
                    }
                }
            }
        }
        Q8 q82 = this$0.f33487c;
        if (q82 != null) {
            q82.f32168a = -1;
        }
        if (q82 != null) {
            q82.f32169b = -1;
        }
        C2921o9 c2921o9 = this$0.f33498n;
        if (c2921o9 != null) {
            c2921o9.c();
        }
        this$0.b();
        return true;
    }

    public static final void a(C3039v9 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        String diskUrl = String.valueOf(this$0.f33485a);
        C2913o1 c2913o1A = AbstractC2807hd.a();
        c2913o1A.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(diskUrl, "diskUrl");
        ArrayList arrayListA = V1.a(c2913o1A, "disk_uri=? ", new String[]{diskUrl}, null, null, "created_ts DESC ", 1, 12);
        C2826j c2826j = arrayListA.isEmpty() ? null : (C2826j) arrayListA.get(0);
        int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (c2826j != null) {
            String url = c2826j.f32940b;
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (url == null) {
                url = "";
            }
            AbstractC2807hd.a().a(new C2826j(iNextInt, url, null, 0, jCurrentTimeMillis, jCurrentTimeMillis2, jCurrentTimeMillis3, 0L));
        }
    }

    public static final void d(C3039v9 c3039v9) throws IllegalStateException, IllegalArgumentException {
        Q8 q82;
        C2921o9 mediaController;
        try {
            Q8 q83 = c3039v9.f33487c;
            if (q83 != null) {
                q83.setOnPreparedListener(c3039v9.f33507w);
                q83.setOnVideoSizeChangedListener(c3039v9.f33506v);
                q83.setOnCompletionListener(c3039v9.f33508x);
                q83.setOnErrorListener(c3039v9.A);
                q83.setOnInfoListener(c3039v9.f33509y);
                q83.setOnBufferingUpdateListener(c3039v9.f33510z);
                q83.setSurface(c3039v9.f33486b);
            }
            if (R3.f32183a.T()) {
                Q8 q84 = c3039v9.f33487c;
                if (q84 != null) {
                    q84.setAudioAttributes(c3039v9.f33505u.f33265e);
                }
            } else {
                Q8 q85 = c3039v9.f33487c;
                if (q85 != null) {
                    q85.setAudioStreamType(3);
                }
            }
            Q8 q86 = c3039v9.f33487c;
            if (q86 != null) {
                q86.prepareAsync();
            }
            c3039v9.f33499o = 0;
            Q8 q87 = c3039v9.f33487c;
            if (q87 != null) {
                q87.f32168a = 1;
            }
            if (q87 != null && (mediaController = c3039v9.getMediaController()) != null) {
                mediaController.setMediaPlayer(c3039v9);
                mediaController.setEnabled(c3039v9.a());
                mediaController.d();
            }
            Object tag = c3039v9.getTag();
            if (tag instanceof C2887m9) {
                Object obj = ((C2887m9) tag).f33155t.get("shouldAutoPlay");
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj).booleanValue() && (q82 = c3039v9.f33487c) != null) {
                    q82.f32169b = 3;
                }
                Object obj2 = ((C2887m9) tag).f33155t.get("didCompleteQ4");
                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj2).booleanValue()) {
                    c3039v9.a(8, 0);
                    return;
                }
            }
            c3039v9.a(0, 0);
        } catch (Exception e10) {
            Q8 q88 = c3039v9.f33487c;
            if (q88 != null) {
                q88.f32168a = -1;
            }
            if (q88 != null) {
                q88.f32169b = -1;
            }
            c3039v9.A.onError(q88, 1, 0);
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
    }

    public final void a(C2887m9 videoAsset) {
        String strB;
        Q8 q8A;
        kotlin.jvm.internal.e0.checkNotNullParameter(videoAsset, "videoAsset");
        this.f33489e = 0;
        this.f33490f = 0;
        Object obj = videoAsset.f33140e;
        InterfaceC3028uf interfaceC3028uf = obj instanceof InterfaceC3028uf ? (InterfaceC3028uf) obj : null;
        if (interfaceC3028uf == null || (strB = ((C3011tf) interfaceC3028uf).b()) == null) {
            strB = "";
        }
        Uri uri = Uri.parse(strB);
        this.f33485a = uri;
        Object obj2 = videoAsset.f33155t.get("placementType");
        kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Byte");
        if (1 == ((Byte) obj2).byteValue()) {
            q8A = new Q8();
        } else {
            Object obj3 = Q8.f32165d;
            q8A = P8.a();
        }
        this.f33487c = q8A;
        int i10 = this.f33488d;
        if (i10 != 0) {
            q8A.setAudioSessionId(i10);
        } else {
            this.f33488d = q8A.getAudioSessionId();
        }
        setTag(videoAsset);
        this.f33497m = new HandlerC2988s9(this);
        setSurfaceTextureListener(this.B);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).execute(new zk.g1(0, this, uri));
    }

    public static final void a(C3039v9 this$0, Uri uri) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            Q8 q82 = this$0.f33487c;
            if (q82 != null) {
                q82.setDataSource(this$0.getContext().getApplicationContext(), uri, (Map<String, String>) null);
            }
        } catch (IOException unused) {
            Q8 q83 = this$0.f33487c;
            if (q83 != null) {
                q83.f32168a = -1;
            }
            if (q83 == null) {
                return;
            }
            q83.f32169b = -1;
        }
    }

    public final boolean a() {
        int i10;
        Q8 q82 = this.f33487c;
        return q82 == null || !((i10 = q82.f32168a) == -1 || i10 == 0 || i10 == 1);
    }

    public final void a(int i10) {
        if (this.f33504t || 4 == getState()) {
            return;
        }
        if (this.f33503s == null) {
            this.f33503s = new Handler(Looper.getMainLooper());
        }
        if (i10 > 0) {
            this.f33504t = true;
            c();
            Handler handler = this.f33503s;
            if (handler != null) {
                handler.postDelayed(new zk.b1(this, 3), i10 * 1000);
                return;
            }
            return;
        }
        pause();
    }

    public final void a(int i10, int i11) {
        if (this.f33487c != null) {
            ViewParent parent = getParent();
            C3056w9 c3056w9 = parent instanceof C3056w9 ? (C3056w9) parent : null;
            ProgressBar progressBar = c3056w9 != null ? c3056w9.getProgressBar() : null;
            if (progressBar != null) {
                progressBar.setVisibility(i10);
            }
            ViewParent parent2 = getParent();
            C3056w9 c3056w92 = parent2 instanceof C3056w9 ? (C3056w9) parent2 : null;
            ImageView posterImage = c3056w92 != null ? c3056w92.getPosterImage() : null;
            if (posterImage == null) {
                return;
            }
            posterImage.setVisibility(i11);
        }
    }
}
