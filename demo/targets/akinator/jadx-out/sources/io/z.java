package io;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final f f68250a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final a f68251b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f68252c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f68253d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f68254e;

    /* renamed from: f, reason: collision with root package name */
    public float f68255f;

    /* renamed from: g, reason: collision with root package name */
    public float f68256g;

    /* renamed from: h, reason: collision with root package name */
    public float f68257h;

    /* renamed from: i, reason: collision with root package name */
    public float f68258i;

    /* renamed from: j, reason: collision with root package name */
    public int f68259j;

    /* renamed from: k, reason: collision with root package name */
    public long f68260k;

    /* renamed from: l, reason: collision with root package name */
    public long f68261l;

    /* renamed from: m, reason: collision with root package name */
    public long f68262m;

    /* renamed from: n, reason: collision with root package name */
    public long f68263n;

    /* renamed from: o, reason: collision with root package name */
    public long f68264o;

    /* renamed from: p, reason: collision with root package name */
    public long f68265p;

    /* renamed from: q, reason: collision with root package name */
    public long f68266q;

    public z(Context context) {
        DisplayManager displayManager;
        a aVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new a(displayManager);
        this.f68251b = aVar;
        this.f68252c = aVar != null ? a0.getInstance() : null;
        this.f68260k = C.TIME_UNSET;
        this.f68261l = C.TIME_UNSET;
        this.f68255f = -1.0f;
        this.f68258i = 1.0f;
        this.f68259j = 0;
    }

    public static void a(z zVar, Display display) {
        zVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zVar.f68260k = refreshRate;
            zVar.f68261l = (refreshRate * 80) / 100;
        } else {
            io.bidmachine.media3.common.util.b0.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zVar.f68260k = C.TIME_UNSET;
            zVar.f68261l = C.TIME_UNSET;
        }
    }

    public long adjustReleaseTime(long j10) {
        long j11;
        if (this.f68265p != -1 && this.f68250a.isSynced()) {
            long frameDurationNs = this.f68266q + ((long) (((this.f68262m - this.f68265p) * this.f68250a.getFrameDurationNs()) / this.f68258i));
            if (Math.abs(j10 - frameDurationNs) <= 20000000) {
                j10 = frameDurationNs;
            } else {
                this.f68262m = 0L;
                this.f68265p = -1L;
                this.f68263n = -1L;
            }
        }
        this.f68263n = this.f68262m;
        this.f68264o = j10;
        a0 a0Var = this.f68252c;
        if (a0Var != null && this.f68260k != C.TIME_UNSET) {
            long j12 = a0Var.f59820b;
            if (j12 != C.TIME_UNSET) {
                long j13 = this.f68260k;
                long j14 = (((j10 - j12) / j13) * j13) + j12;
                if (j10 <= j14) {
                    j11 = j14 - j13;
                } else {
                    j11 = j14;
                    j14 = j13 + j14;
                }
                if (j14 - j10 >= j10 - j11) {
                    j14 = j11;
                }
                return j14 - this.f68261l;
            }
        }
        return j10;
    }

    public final void b() {
        Surface surface;
        if (a1.f60679a < 30 || (surface = this.f68254e) == null || this.f68259j == Integer.MIN_VALUE || this.f68257h == 0.0f) {
            return;
        }
        this.f68257h = 0.0f;
        y.setSurfaceFrameRate(surface, 0.0f);
    }

    public final void c() {
        if (a1.f60679a < 30 || this.f68254e == null) {
            return;
        }
        f fVar = this.f68250a;
        float frameRate = fVar.isSynced() ? fVar.getFrameRate() : this.f68255f;
        float f10 = this.f68256g;
        if (frameRate == f10) {
            return;
        }
        if (frameRate != -1.0f && f10 != -1.0f) {
            if (Math.abs(frameRate - this.f68256g) < ((!fVar.isSynced() || fVar.getMatchingFrameDurationSumNs() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (frameRate == -1.0f && fVar.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.f68256g = frameRate;
        d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            int r0 = io.bidmachine.media3.common.util.a1.f60679a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f68254e
            if (r0 == 0) goto L30
            int r1 = r3.f68259j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f68253d
            if (r1 == 0) goto L21
            float r1 = r3.f68256g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f68258i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f68257h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f68257h = r1
            io.y.setSurfaceFrameRate(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.z.d(boolean):void");
    }

    public void onFormatChanged(float f10) {
        this.f68255f = f10;
        this.f68250a.reset();
        c();
    }

    public void onNextFrame(long j10) {
        long j11 = this.f68263n;
        if (j11 != -1) {
            this.f68265p = j11;
            this.f68266q = this.f68264o;
        }
        this.f68262m++;
        this.f68250a.onNextFrame(j10 * 1000);
        c();
    }

    public void onPlaybackSpeed(float f10) {
        this.f68258i = f10;
        this.f68262m = 0L;
        this.f68265p = -1L;
        this.f68263n = -1L;
        d(false);
    }

    public void onPositionReset() {
        this.f68262m = 0L;
        this.f68265p = -1L;
        this.f68263n = -1L;
    }

    public void onStarted() {
        this.f68253d = true;
        this.f68262m = 0L;
        this.f68265p = -1L;
        this.f68263n = -1L;
        a aVar = this.f68251b;
        if (aVar != null) {
            ((a0) io.bidmachine.media3.common.util.a.checkNotNull(this.f68252c)).addObserver();
            aVar.register();
        }
        d(false);
    }

    public void onStopped() {
        this.f68253d = false;
        a aVar = this.f68251b;
        if (aVar != null) {
            aVar.unregister();
            ((a0) io.bidmachine.media3.common.util.a.checkNotNull(this.f68252c)).removeObserver();
        }
        b();
    }

    public void onSurfaceChanged(Surface surface) {
        if (this.f68254e == surface) {
            return;
        }
        b();
        this.f68254e = surface;
        d(true);
    }

    public void setChangeFrameRateStrategy(int i10) {
        if (this.f68259j == i10) {
            return;
        }
        this.f68259j = i10;
        d(true);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f68267a;

        public a(DisplayManager displayManager) {
            this.f68267a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                z.a(z.this, this.f68267a.getDisplay(0));
            }
        }

        public void register() {
            Handler handlerCreateHandlerForCurrentLooper = a1.createHandlerForCurrentLooper();
            DisplayManager displayManager = this.f68267a;
            displayManager.registerDisplayListener(this, handlerCreateHandlerForCurrentLooper);
            z.a(z.this, displayManager.getDisplay(0));
        }

        public void unregister() {
            this.f68267a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
