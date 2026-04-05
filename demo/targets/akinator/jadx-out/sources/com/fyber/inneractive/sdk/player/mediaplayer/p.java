package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26201a;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f26208h;

    /* renamed from: i, reason: collision with root package name */
    public n f26209i;

    /* renamed from: j, reason: collision with root package name */
    public Surface f26210j;

    /* renamed from: k, reason: collision with root package name */
    public SurfaceHolder f26211k;

    /* renamed from: l, reason: collision with root package name */
    public long f26212l;

    /* renamed from: n, reason: collision with root package name */
    public HandlerThread f26214n;

    /* renamed from: o, reason: collision with root package name */
    public Handler f26215o;

    /* renamed from: p, reason: collision with root package name */
    public c f26216p;

    /* renamed from: q, reason: collision with root package name */
    public b f26217q;

    /* renamed from: b, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.enums.b f26202b = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26203c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26204d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26205e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26206f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26207g = false;

    /* renamed from: m, reason: collision with root package name */
    public int f26213m = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f26218r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f26219s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f26220t = 0;

    public p(Context context, n nVar, Handler handler) {
        this.f26201a = context;
        this.f26209i = nVar;
        this.f26208h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f26214n = handlerThread;
        handlerThread.start();
        this.f26215o = new Handler(this.f26214n.getLooper());
        this.f26217q = new b(this);
    }

    public static void b(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.e(strB + "timelog: release took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public static void c(p pVar) throws IllegalStateException {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f26202b;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress) {
            super.start();
            pVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        } else {
            IAlog.a("%s Start called in wrong mState! %s", pVar.b(), bVar);
            if (pVar.f26202b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                pVar.f26203c = true;
            }
        }
        IAlog.e(strB + "timelog: start took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final boolean a() {
        return (this.f26202b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.f26202b == com.fyber.inneractive.sdk.player.enums.b.Preparing) ? false : true;
    }

    public final void d() {
        this.f26204d = true;
        if (a()) {
            a(new l(this));
        } else {
            IAlog.a("%s mute called when player is not ready!", b());
        }
        IAlog.a("%s mute", b());
    }

    public final void e() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = this.f26202b;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Idle;
        if (bVar == bVar2) {
            IAlog.a("%s reset called, but player is already resetted. Do nothing", b());
            return;
        }
        a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.e(strB + "timelog: reset took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.f26218r;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.f26220t;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.f26219s;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        return a() && this.f26202b != com.fyber.inneractive.sdk.player.enums.b.Paused && super.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        a(com.fyber.inneractive.sdk.player.enums.b.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.f("%s onError code = %d code2 = %d", b(), Integer.valueOf(i10), Integer.valueOf(i11));
        e();
        this.f26208h.post(new a(this, i10, i11));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("%s onPrepared %s gotPrepared = %s", b(), this, Boolean.valueOf(this.f26207g));
        IAlog.a("%sMedia prepare time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f26212l));
        if (this.f26202b != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.f26202b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.f("%s onPrepared: previous error encountered. Aborting", b());
        } else if (this.f26207g) {
            IAlog.a("%s onPrepared called again??? We are already prepared", b());
        } else {
            this.f26207g = true;
            c();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.a("%s onSeekComplete called current position = %d", b(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f26202b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.a("%s onSeekComplete called when Story is not seeking", b());
            return;
        }
        if (this.f26204d) {
            d();
        }
        if (!this.f26203c) {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = false", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Paused);
        } else {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = true", b());
            this.f26202b = com.fyber.inneractive.sdk.player.enums.b.Paused;
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.a("%s onVideoSizeChanged %d, %d", b(), Integer.valueOf(i10), Integer.valueOf(i11));
        if (this.f26206f) {
            return;
        }
        c cVar = this.f26216p;
        if (cVar != null) {
            r.f26804b.removeCallbacks(cVar);
            IAlog.a("%s onVideoSizeChanged cancelling prepared runnable", b());
        }
        this.f26206f = true;
        if (i10 == 0 || i11 == 0) {
            IAlog.f("%s onVideoSizeChanged - Invalid video size!", b());
            onError(this, 0, 0);
        } else {
            IAlog.a("%sMedia got video size time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f26212l));
            this.f26219s = i10;
            this.f26220t = i11;
            c();
        }
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.f26202b != com.fyber.inneractive.sdk.player.enums.b.Idle && this.f26202b != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f26202b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Paused;
            if (bVar != bVar2 && this.f26202b != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                a(bVar2);
                if (a()) {
                    a(new k(this));
                } else {
                    IAlog.a("%s paused called when player is not ready!", b());
                }
                IAlog.a("%s pause", b());
                return;
            }
        }
        IAlog.a("%s paused called when player is in mState: %s ignoring", b(), this.f26202b);
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.f26205e) {
            a(new g(this));
        }
        this.f26209i = null;
        this.f26217q = null;
        this.f26205e = true;
        IAlog.a("%s release called", b());
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        IAlog.a("%s reset called", b());
        c cVar = this.f26216p;
        if (cVar != null) {
            r.f26804b.removeCallbacks(cVar);
        }
        a(new h(this));
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.a("%s setDisplay called", b());
        if (!a()) {
            IAlog.a("%s setDisplay called when player is not ready!", b());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f26211k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.a("%s setDisplay called with existing surface. ignoring!", b());
        } else {
            this.f26211k = surfaceHolder;
            a(new e(this, surfaceHolder));
        }
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(Surface surface) {
        IAlog.a("%s setSurface called", b());
        Surface surface2 = this.f26210j;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.a("%s setSurface called with existing surface. ignoring!", b());
        } else {
            this.f26210j = surface;
            a(new f(this, surface));
        }
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        IAlog.a("%s Start called", b());
        if (!a()) {
            IAlog.a("%s MediaPlayer: Start called when player is not ready! - mState = %s", b(), this.f26202b);
            return;
        }
        if (this.f26202b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            this.f26203c = true;
        } else if (isPlaying()) {
            IAlog.a("%s MediaPlayer: Start called when player is already playing. do nothing", b());
        } else {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            a(new i(this));
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() throws IllegalStateException {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a()) {
            super.stop();
        }
        IAlog.a("%s stop called", b());
        IAlog.e(strB + "timelog: stop took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final void a(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f26206f = false;
        this.f26207g = false;
        if (isPlaying()) {
            IAlog.a("%s loadUri stopping play before refresh", b());
            stop();
        }
        this.f26212l = System.currentTimeMillis();
        e();
        IAlog.a("%s calling setDataSource with %s", b(), str);
        try {
            setDataSource(str);
            IAlog.a("%s setDataSource succeeded, calling prepareAsync", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e10) {
                IAlog.b("%s prepareAsync failed with illegal mState exception: %s", b(), e10.getMessage());
                this.f26213m++;
                if (this.f26213m < 5) {
                    a(str);
                }
                this.f26213m = 0;
            }
            IAlog.e(strB + "timelog: loadUri took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e11) {
            IAlog.b("%s error setting data source %s", b(), str);
            IAlog.b("%s exception message: %s", b(), e11.getMessage());
        }
    }

    public static void d(p pVar) throws IllegalStateException {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.a("%s paused called cannot set to pause, canceled", pVar.b());
        }
        IAlog.e(strB + "timelog: delayed pause took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final String b() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    public final void c() {
        if (this.f26207g) {
            if (this.f26206f) {
                IAlog.a("%sMedia load time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f26212l));
                this.f26218r = super.getDuration();
                a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                if (this.f26204d) {
                    d();
                    return;
                }
                return;
            }
            IAlog.a("%sGot prepared only, waiting for video size", b());
            if (this.f26216p == null) {
                this.f26216p = new c(this);
            }
            r.f26804b.postDelayed(this.f26216p, 2000L);
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%s updatePlayerState - %s", b(), bVar);
        if (this.f26202b == bVar) {
            IAlog.a("%s updatePlayerState - mState didn't change!", b());
            return;
        }
        IAlog.a("%s updatePlayerState - changing from %s to %s", b(), this.f26202b, bVar);
        this.f26202b = bVar;
        this.f26208h.post(new d(this, bVar));
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:118)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public static void a(p pVar, Surface surface) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setSurface called with %s", pVar.b(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.a("%s setSurface with null! current surface cleared", pVar.b());
            } else {
                IAlog.a("%s setSurface - replacing surface!", pVar.b());
            }
            IAlog.e(strB + "timelog: setSurface took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setSurface threw exception!", pVar.b());
        }
    }

    public static void a(p pVar, SurfaceHolder surfaceHolder) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setDisplay called with %s", pVar.b(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.a("%s setDisplay with null! current display cleared", pVar.b());
            } else {
                IAlog.a("%s setDisplay - replacing surface holder!", pVar.b());
            }
            IAlog.e(strB + "timelog: setDisplayInternal took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setDisplay threw exception!", pVar.b());
        }
    }

    public final void a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f26214n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f26214n.isInterrupted() && (handler2 = this.f26215o) != null) {
            handler2.post(runnable);
        }
        if ((this.f26219s == 0 || this.f26220t == 0 || this.f26218r == 0) && (handler = this.f26215o) != null) {
            handler.post(this.f26217q);
        }
    }

    public static void a(p pVar) {
        if (pVar.a()) {
            pVar.f26219s = super.getVideoWidth();
            pVar.f26220t = super.getVideoHeight();
            pVar.f26218r = super.getDuration();
        }
    }
}
