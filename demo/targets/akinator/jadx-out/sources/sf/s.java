package sf;

import android.content.Context;
import android.view.Surface;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final d f85708a = new d();

    /* renamed from: b, reason: collision with root package name */
    public final o f85709b;

    /* renamed from: c, reason: collision with root package name */
    public final r f85710c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f85711d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f85712e;

    /* renamed from: f, reason: collision with root package name */
    public float f85713f;

    /* renamed from: g, reason: collision with root package name */
    public float f85714g;

    /* renamed from: h, reason: collision with root package name */
    public float f85715h;

    /* renamed from: i, reason: collision with root package name */
    public float f85716i;

    /* renamed from: j, reason: collision with root package name */
    public int f85717j;

    /* renamed from: k, reason: collision with root package name */
    public long f85718k;

    /* renamed from: l, reason: collision with root package name */
    public long f85719l;

    /* renamed from: m, reason: collision with root package name */
    public long f85720m;

    /* renamed from: n, reason: collision with root package name */
    public long f85721n;

    /* renamed from: o, reason: collision with root package name */
    public long f85722o;

    /* renamed from: p, reason: collision with root package name */
    public long f85723p;

    /* renamed from: q, reason: collision with root package name */
    public long f85724q;

    public s(Context context) {
        o oVarMaybeBuildNewInstance;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            oVarMaybeBuildNewInstance = n1.f28506a >= 17 ? q.maybeBuildNewInstance(applicationContext) : null;
            if (oVarMaybeBuildNewInstance == null) {
                oVarMaybeBuildNewInstance = p.maybeBuildNewInstance(applicationContext);
            }
        } else {
            oVarMaybeBuildNewInstance = null;
        }
        this.f85709b = oVarMaybeBuildNewInstance;
        this.f85710c = oVarMaybeBuildNewInstance != null ? r.getInstance() : null;
        this.f85718k = C.TIME_UNSET;
        this.f85719l = C.TIME_UNSET;
        this.f85713f = -1.0f;
        this.f85716i = 1.0f;
        this.f85717j = 0;
    }

    public final void a() {
        Surface surface;
        if (n1.f28506a < 30 || (surface = this.f85712e) == null || this.f85717j == Integer.MIN_VALUE || this.f85715h == 0.0f) {
            return;
        }
        this.f85715h = 0.0f;
        m.setSurfaceFrameRate(surface, 0.0f);
    }

    public long adjustReleaseTime(long j10) {
        long j11;
        if (this.f85723p != -1 && this.f85708a.isSynced()) {
            long frameDurationNs = this.f85724q + ((long) (((this.f85720m - this.f85723p) * this.f85708a.getFrameDurationNs()) / this.f85716i));
            if (Math.abs(j10 - frameDurationNs) <= 20000000) {
                j10 = frameDurationNs;
            } else {
                this.f85720m = 0L;
                this.f85723p = -1L;
                this.f85721n = -1L;
            }
        }
        this.f85721n = this.f85720m;
        this.f85722o = j10;
        r rVar = this.f85710c;
        if (rVar != null && this.f85718k != C.TIME_UNSET) {
            long j12 = rVar.f85704b;
            if (j12 != C.TIME_UNSET) {
                long j13 = this.f85718k;
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
                return j14 - this.f85719l;
            }
        }
        return j10;
    }

    public final void b() {
        if (n1.f28506a < 30 || this.f85712e == null) {
            return;
        }
        d dVar = this.f85708a;
        float frameRate = dVar.isSynced() ? dVar.getFrameRate() : this.f85713f;
        float f10 = this.f85714g;
        if (frameRate == f10) {
            return;
        }
        if (frameRate != -1.0f && f10 != -1.0f) {
            if (Math.abs(frameRate - this.f85714g) < ((!dVar.isSynced() || dVar.getMatchingFrameDurationSumNs() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (frameRate == -1.0f && dVar.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.f85714g = frameRate;
        c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r4) {
        /*
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.n1.f28506a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f85712e
            if (r0 == 0) goto L30
            int r1 = r3.f85717j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f85711d
            if (r1 == 0) goto L21
            float r1 = r3.f85714g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f85716i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f85715h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f85715h = r1
            sf.m.setSurfaceFrameRate(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.s.c(boolean):void");
    }

    public void onFormatChanged(float f10) {
        this.f85713f = f10;
        this.f85708a.reset();
        b();
    }

    public void onNextFrame(long j10) {
        long j11 = this.f85721n;
        if (j11 != -1) {
            this.f85723p = j11;
            this.f85724q = this.f85722o;
        }
        this.f85720m++;
        this.f85708a.onNextFrame(j10 * 1000);
        b();
    }

    public void onPlaybackSpeed(float f10) {
        this.f85716i = f10;
        this.f85720m = 0L;
        this.f85723p = -1L;
        this.f85721n = -1L;
        c(false);
    }

    public void onPositionReset() {
        this.f85720m = 0L;
        this.f85723p = -1L;
        this.f85721n = -1L;
    }

    public void onStarted() {
        this.f85711d = true;
        this.f85720m = 0L;
        this.f85723p = -1L;
        this.f85721n = -1L;
        o oVar = this.f85709b;
        if (oVar != null) {
            ((r) com.google.android.exoplayer2.util.a.checkNotNull(this.f85710c)).addObserver();
            oVar.register(new b3(this, 14));
        }
        c(false);
    }

    public void onStopped() {
        this.f85711d = false;
        o oVar = this.f85709b;
        if (oVar != null) {
            oVar.unregister();
            ((r) com.google.android.exoplayer2.util.a.checkNotNull(this.f85710c)).removeObserver();
        }
        a();
    }

    public void onSurfaceChanged(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f85712e == surface) {
            return;
        }
        a();
        this.f85712e = surface;
        c(true);
    }

    public void setChangeFrameRateStrategy(int i10) {
        if (this.f85717j == i10) {
            return;
        }
        this.f85717j = i10;
        c(true);
    }
}
