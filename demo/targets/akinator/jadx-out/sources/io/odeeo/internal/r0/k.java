package io.odeeo.internal.r0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.r0.e f66194a = new io.odeeo.internal.r0.e();

    /* renamed from: b, reason: collision with root package name */
    public final b f66195b;

    /* renamed from: c, reason: collision with root package name */
    public final e f66196c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66197d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f66198e;

    /* renamed from: f, reason: collision with root package name */
    public float f66199f;

    /* renamed from: g, reason: collision with root package name */
    public float f66200g;

    /* renamed from: h, reason: collision with root package name */
    public float f66201h;

    /* renamed from: i, reason: collision with root package name */
    public float f66202i;

    /* renamed from: j, reason: collision with root package name */
    public int f66203j;

    /* renamed from: k, reason: collision with root package name */
    public long f66204k;

    /* renamed from: l, reason: collision with root package name */
    public long f66205l;

    /* renamed from: m, reason: collision with root package name */
    public long f66206m;

    /* renamed from: n, reason: collision with root package name */
    public long f66207n;

    /* renamed from: o, reason: collision with root package name */
    public long f66208o;

    /* renamed from: p, reason: collision with root package name */
    public long f66209p;

    /* renamed from: q, reason: collision with root package name */
    public long f66210q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public static void setSurfaceFrameRate(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                p.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface a {
            void onDefaultDisplayChanged(Display display);
        }

        void register(a aVar);

        void unregister();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g, reason: collision with root package name */
        public static final e f66214g = new e();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f66215a = C.TIME_UNSET;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f66216b;

        /* renamed from: c, reason: collision with root package name */
        public final HandlerThread f66217c;

        /* renamed from: e, reason: collision with root package name */
        public Choreographer f66218e;

        /* renamed from: f, reason: collision with root package name */
        public int f66219f;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f66217c = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = g0.createHandler(handlerThread.getLooper(), this);
            this.f66216b = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(0);
        }

        public static e getInstance() {
            return f66214g;
        }

        public final void a() {
            int i10 = this.f66219f + 1;
            this.f66219f = i10;
            if (i10 == 1) {
                ((Choreographer) io.odeeo.internal.q0.a.checkNotNull(this.f66218e)).postFrameCallback(this);
            }
        }

        public void addObserver() {
            this.f66216b.sendEmptyMessage(1);
        }

        public final void b() {
            this.f66218e = Choreographer.getInstance();
        }

        public final void c() {
            int i10 = this.f66219f - 1;
            this.f66219f = i10;
            if (i10 == 0) {
                ((Choreographer) io.odeeo.internal.q0.a.checkNotNull(this.f66218e)).removeFrameCallback(this);
                this.f66215a = C.TIME_UNSET;
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f66215a = j10;
            ((Choreographer) io.odeeo.internal.q0.a.checkNotNull(this.f66218e)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                b();
                return true;
            }
            if (i10 == 1) {
                a();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            c();
            return true;
        }

        public void removeObserver() {
            this.f66216b.sendEmptyMessage(2);
        }
    }

    public k(Context context) {
        b bVarA = a(context);
        this.f66195b = bVarA;
        this.f66196c = bVarA != null ? e.getInstance() : null;
        this.f66204k = C.TIME_UNSET;
        this.f66205l = C.TIME_UNSET;
        this.f66199f = -1.0f;
        this.f66202i = 1.0f;
        this.f66203j = 0;
    }

    public static boolean a(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    public long adjustReleaseTime(long j10) {
        long j11;
        if (this.f66209p == -1 || !this.f66194a.isSynced()) {
            j11 = j10;
        } else {
            long frameDurationNs = this.f66210q + ((long) (((this.f66206m - this.f66209p) * this.f66194a.getFrameDurationNs()) / this.f66202i));
            if (a(j10, frameDurationNs)) {
                j11 = frameDurationNs;
            } else {
                b();
                j11 = j10;
            }
        }
        this.f66207n = this.f66206m;
        this.f66208o = j11;
        e eVar = this.f66196c;
        if (eVar != null && this.f66204k != C.TIME_UNSET) {
            long j12 = eVar.f66215a;
            if (j12 != C.TIME_UNSET) {
                return a(j11, j12, this.f66204k) - this.f66205l;
            }
        }
        return j11;
    }

    public final void b() {
        this.f66206m = 0L;
        this.f66209p = -1L;
        this.f66207n = -1L;
    }

    public final void c() {
        if (g0.f65861a < 30 || this.f66198e == null) {
            return;
        }
        float frameRate = this.f66194a.isSynced() ? this.f66194a.getFrameRate() : this.f66199f;
        float f10 = this.f66200g;
        if (frameRate == f10) {
            return;
        }
        if (frameRate != -1.0f && f10 != -1.0f) {
            if (Math.abs(frameRate - this.f66200g) < ((!this.f66194a.isSynced() || this.f66194a.getMatchingFrameDurationSumNs() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (frameRate == -1.0f && this.f66194a.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.f66200g = frameRate;
        a(false);
    }

    public void onDisabled() {
        b bVar = this.f66195b;
        if (bVar != null) {
            bVar.unregister();
            ((e) io.odeeo.internal.q0.a.checkNotNull(this.f66196c)).removeObserver();
        }
    }

    public void onEnabled() {
        if (this.f66195b != null) {
            ((e) io.odeeo.internal.q0.a.checkNotNull(this.f66196c)).addObserver();
            this.f66195b.register(new af.g(this, 26));
        }
    }

    public void onFormatChanged(float f10) {
        this.f66199f = f10;
        this.f66194a.reset();
        c();
    }

    public void onNextFrame(long j10) {
        long j11 = this.f66207n;
        if (j11 != -1) {
            this.f66209p = j11;
            this.f66210q = this.f66208o;
        }
        this.f66206m++;
        this.f66194a.onNextFrame(j10 * 1000);
        c();
    }

    public void onPlaybackSpeed(float f10) {
        this.f66202i = f10;
        b();
        a(false);
    }

    public void onPositionReset() {
        b();
    }

    public void onStarted() {
        this.f66197d = true;
        b();
        a(false);
    }

    public void onStopped() {
        this.f66197d = false;
        a();
    }

    public void onSurfaceChanged(Surface surface) {
        if (surface instanceof io.odeeo.internal.r0.d) {
            surface = null;
        }
        if (this.f66198e == surface) {
            return;
        }
        a();
        this.f66198e = surface;
        a(true);
    }

    public void setChangeFrameRateStrategy(int i10) {
        if (this.f66203j == i10) {
            return;
        }
        this.f66203j = i10;
        a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r4) {
        /*
            r3 = this;
            int r0 = io.odeeo.internal.q0.g0.f65861a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f66198e
            if (r0 == 0) goto L30
            int r1 = r3.f66203j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f66197d
            if (r1 == 0) goto L21
            float r1 = r3.f66200g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f66202i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f66201h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f66201h = r1
            io.odeeo.internal.r0.k.a.setSurfaceFrameRate(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.r0.k.a(boolean):void");
    }

    public final void a() {
        Surface surface;
        if (g0.f65861a < 30 || (surface = this.f66198e) == null || this.f66203j == Integer.MIN_VALUE || this.f66201h == 0.0f) {
            return;
        }
        this.f66201h = 0.0f;
        a.setSurfaceFrameRate(surface, 0.0f);
    }

    public final void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f66204k = refreshRate;
            this.f66205l = (refreshRate * 80) / 100;
        } else {
            p.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f66204k = C.TIME_UNSET;
            this.f66205l = C.TIME_UNSET;
        }
    }

    public static long a(long j10, long j11, long j12) {
        long j13;
        long j14 = (((j10 - j11) / j12) * j12) + j11;
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            j14 = j12 + j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    public static b a(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            bVarMaybeBuildNewInstance = g0.f65861a >= 17 ? d.maybeBuildNewInstance(applicationContext) : null;
            if (bVarMaybeBuildNewInstance == null) {
                return c.maybeBuildNewInstance(applicationContext);
            }
        }
        return bVarMaybeBuildNewInstance;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final WindowManager f66211a;

        public c(WindowManager windowManager) {
            this.f66211a = windowManager;
        }

        public static b maybeBuildNewInstance(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // io.odeeo.internal.r0.k.b
        public void register(b.a aVar) {
            aVar.onDefaultDisplayChanged(this.f66211a.getDefaultDisplay());
        }

        @Override // io.odeeo.internal.r0.k.b
        public void unregister() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f66212a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f66213b;

        public d(DisplayManager displayManager) {
            this.f66212a = displayManager;
        }

        public static b maybeBuildNewInstance(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        public final Display a() {
            return this.f66212a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f66213b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.onDefaultDisplayChanged(a());
        }

        @Override // io.odeeo.internal.r0.k.b
        public void register(b.a aVar) {
            this.f66213b = aVar;
            this.f66212a.registerDisplayListener(this, g0.createHandlerForCurrentLooper());
            aVar.onDefaultDisplayChanged(a());
        }

        @Override // io.odeeo.internal.r0.k.b
        public void unregister() {
            this.f66212a.unregisterDisplayListener(this);
            this.f66213b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
