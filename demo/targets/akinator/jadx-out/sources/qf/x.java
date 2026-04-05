package qf;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import nh.b5;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x implements g, c1 {

    /* renamed from: p, reason: collision with root package name */
    public static final b5 f83029p = b5.of(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* renamed from: q, reason: collision with root package name */
    public static final b5 f83030q = b5.of(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* renamed from: r, reason: collision with root package name */
    public static final b5 f83031r = b5.of(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* renamed from: s, reason: collision with root package name */
    public static final b5 f83032s = b5.of(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* renamed from: t, reason: collision with root package name */
    public static final b5 f83033t = b5.of(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* renamed from: u, reason: collision with root package name */
    public static final b5 f83034u = b5.of(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* renamed from: v, reason: collision with root package name */
    public static x f83035v;

    /* renamed from: a, reason: collision with root package name */
    public final m5 f83036a;

    /* renamed from: b, reason: collision with root package name */
    public final e f83037b = new e();

    /* renamed from: c, reason: collision with root package name */
    public final z0 f83038c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.d f83039d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f83040e;

    /* renamed from: f, reason: collision with root package name */
    public int f83041f;

    /* renamed from: g, reason: collision with root package name */
    public long f83042g;

    /* renamed from: h, reason: collision with root package name */
    public long f83043h;

    /* renamed from: i, reason: collision with root package name */
    public int f83044i;

    /* renamed from: j, reason: collision with root package name */
    public long f83045j;

    /* renamed from: k, reason: collision with root package name */
    public long f83046k;

    /* renamed from: l, reason: collision with root package name */
    public long f83047l;

    /* renamed from: m, reason: collision with root package name */
    public long f83048m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83049n;

    /* renamed from: o, reason: collision with root package name */
    public int f83050o;

    public x(Context context, HashMap map, int i10, com.google.android.exoplayer2.util.d dVar, boolean z10) {
        this.f83036a = m5.copyOf((Map) map);
        this.f83038c = new z0(i10);
        this.f83039d = dVar;
        this.f83040e = z10;
        if (context == null) {
            this.f83044i = 0;
            this.f83047l = a(0);
            return;
        }
        com.google.android.exoplayer2.util.t0 t0Var = com.google.android.exoplayer2.util.t0.getInstance(context);
        int networkType = t0Var.getNetworkType();
        this.f83044i = networkType;
        this.f83047l = a(networkType);
        t0Var.register(new v(this));
    }

    public static synchronized x getSingletonInstance(Context context) {
        try {
            if (f83035v == null) {
                f83035v = new w(context).build();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f83035v;
    }

    public final long a(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        m5 m5Var = this.f83036a;
        Long l9 = (Long) m5Var.get(numValueOf);
        if (l9 == null) {
            l9 = (Long) m5Var.get(0);
        }
        if (l9 == null) {
            l9 = 1000000L;
        }
        return l9.longValue();
    }

    @Override // qf.g
    public void addEventListener(Handler handler, f fVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(handler);
        com.google.android.exoplayer2.util.a.checkNotNull(fVar);
        this.f83037b.addListener(handler, fVar);
    }

    public final synchronized void b(int i10) {
        int i11 = this.f83044i;
        if (i11 == 0 || this.f83040e) {
            if (this.f83049n) {
                i10 = this.f83050o;
            }
            if (i11 == i10) {
                return;
            }
            this.f83044i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f83047l = a(i10);
                long jElapsedRealtime = ((com.google.android.exoplayer2.util.d1) this.f83039d).elapsedRealtime();
                int i12 = this.f83041f > 0 ? (int) (jElapsedRealtime - this.f83042g) : 0;
                long j10 = this.f83043h;
                long j11 = this.f83047l;
                if (i12 != 0 || j10 != 0 || j11 != this.f83048m) {
                    this.f83048m = j11;
                    this.f83037b.bandwidthSample(i12, j10, j11);
                }
                this.f83042g = jElapsedRealtime;
                this.f83043h = 0L;
                this.f83046k = 0L;
                this.f83045j = 0L;
                this.f83038c.reset();
            }
        }
    }

    @Override // qf.g
    public synchronized long getBitrateEstimate() {
        return this.f83047l;
    }

    @Override // qf.g
    public /* bridge */ /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return super.getTimeToFirstByteEstimateUs();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // qf.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onBytesTransferred(qf.p r1, qf.t r2, boolean r3, int r4) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r3 == 0) goto Lf
            r1 = 8
            boolean r1 = r2.isFlagSet(r1)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            r1 = 1
            goto L10
        Ld:
            r1 = move-exception
            goto L1c
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L14
            monitor-exit(r0)
            return
        L14:
            long r1 = r0.f83043h     // Catch: java.lang.Throwable -> Ld
            long r3 = (long) r4     // Catch: java.lang.Throwable -> Ld
            long r1 = r1 + r3
            r0.f83043h = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.x.onBytesTransferred(qf.p, qf.t, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    @Override // qf.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferEnd(qf.p r12, qf.t r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            r12 = 0
            r0 = 1
            if (r14 == 0) goto L13
            r14 = 8
            boolean r13 = r13.isFlagSet(r14)     // Catch: java.lang.Throwable -> Lf
            if (r13 != 0) goto L13
            r13 = r0
            goto L14
        Lf:
            r0 = move-exception
            r12 = r0
            goto L8e
        L13:
            r13 = r12
        L14:
            if (r13 != 0) goto L18
            monitor-exit(r11)
            return
        L18:
            int r13 = r11.f83041f     // Catch: java.lang.Throwable -> Lf
            if (r13 <= 0) goto L1d
            r12 = r0
        L1d:
            com.google.android.exoplayer2.util.a.checkState(r12)     // Catch: java.lang.Throwable -> Lf
            com.google.android.exoplayer2.util.d r12 = r11.f83039d     // Catch: java.lang.Throwable -> Lf
            com.google.android.exoplayer2.util.d1 r12 = (com.google.android.exoplayer2.util.d1) r12     // Catch: java.lang.Throwable -> Lf
            long r12 = r12.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.f83042g     // Catch: java.lang.Throwable -> Lf
            long r1 = r12 - r1
            int r4 = (int) r1     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.f83045j     // Catch: java.lang.Throwable -> Lf
            long r5 = (long) r4     // Catch: java.lang.Throwable -> Lf
            long r1 = r1 + r5
            r11.f83045j = r1     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.f83046k     // Catch: java.lang.Throwable -> Lf
            long r5 = r11.f83043h     // Catch: java.lang.Throwable -> Lf
            long r1 = r1 + r5
            r11.f83046k = r1     // Catch: java.lang.Throwable -> Lf
            if (r4 <= 0) goto L87
            float r14 = (float) r5     // Catch: java.lang.Throwable -> Lf
            r1 = 1174011904(0x45fa0000, float:8000.0)
            float r14 = r14 * r1
            float r1 = (float) r4     // Catch: java.lang.Throwable -> Lf
            float r14 = r14 / r1
            qf.z0 r1 = r11.f83038c     // Catch: java.lang.Throwable -> Lf
            double r2 = (double) r5     // Catch: java.lang.Throwable -> Lf
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> Lf
            int r2 = (int) r2     // Catch: java.lang.Throwable -> Lf
            r1.addSample(r2, r14)     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.f83045j     // Catch: java.lang.Throwable -> Lf
            r5 = 2000(0x7d0, double:9.88E-321)
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 >= 0) goto L5e
            long r1 = r11.f83046k     // Catch: java.lang.Throwable -> Lf
            r5 = 524288(0x80000, double:2.590327E-318)
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 < 0) goto L69
        L5e:
            qf.z0 r14 = r11.f83038c     // Catch: java.lang.Throwable -> Lf
            r1 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14.getPercentile(r1)     // Catch: java.lang.Throwable -> Lf
            long r1 = (long) r14     // Catch: java.lang.Throwable -> Lf
            r11.f83047l = r1     // Catch: java.lang.Throwable -> Lf
        L69:
            long r5 = r11.f83043h     // Catch: java.lang.Throwable -> Lf
            long r7 = r11.f83047l     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r4 != 0) goto L7c
            int r14 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r14 != 0) goto L7c
            long r9 = r11.f83048m     // Catch: java.lang.Throwable -> Lf
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L7c
            goto L83
        L7c:
            r11.f83048m = r7     // Catch: java.lang.Throwable -> Lf
            qf.e r3 = r11.f83037b     // Catch: java.lang.Throwable -> Lf
            r3.bandwidthSample(r4, r5, r7)     // Catch: java.lang.Throwable -> Lf
        L83:
            r11.f83042g = r12     // Catch: java.lang.Throwable -> Lf
            r11.f83043h = r1     // Catch: java.lang.Throwable -> Lf
        L87:
            int r12 = r11.f83041f     // Catch: java.lang.Throwable -> Lf
            int r12 = r12 - r0
            r11.f83041f = r12     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r11)
            return
        L8e:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lf
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.x.onTransferEnd(qf.p, qf.t, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // qf.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferStart(qf.p r1, qf.t r2, boolean r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            r1 = 1
            if (r3 == 0) goto L10
            r3 = 8
            boolean r2 = r2.isFlagSet(r3)     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L10
            r2 = r1
            goto L11
        Le:
            r1 = move-exception
            goto L2a
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            monitor-exit(r0)
            return
        L15:
            int r2 = r0.f83041f     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L23
            com.google.android.exoplayer2.util.d r2 = r0.f83039d     // Catch: java.lang.Throwable -> Le
            com.google.android.exoplayer2.util.d1 r2 = (com.google.android.exoplayer2.util.d1) r2     // Catch: java.lang.Throwable -> Le
            long r2 = r2.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            r0.f83042g = r2     // Catch: java.lang.Throwable -> Le
        L23:
            int r2 = r0.f83041f     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r1
            r0.f83041f = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.x.onTransferStart(qf.p, qf.t, boolean):void");
    }

    @Override // qf.g
    public void removeEventListener(f fVar) {
        this.f83037b.removeListener(fVar);
    }

    public synchronized void setNetworkTypeOverride(int i10) {
        this.f83050o = i10;
        this.f83049n = true;
        b(i10);
    }

    @Override // qf.g
    public c1 getTransferListener() {
        return this;
    }

    @Override // qf.c1
    public void onTransferInitializing(p pVar, t tVar, boolean z10) {
    }
}
