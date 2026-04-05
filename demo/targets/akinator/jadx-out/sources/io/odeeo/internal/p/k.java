package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.p.d0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f65360q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f65361a;

    /* renamed from: b, reason: collision with root package name */
    public io.odeeo.internal.g.x f65362b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f65363c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65364d;

    /* renamed from: e, reason: collision with root package name */
    public final r f65365e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f65366f;

    /* renamed from: g, reason: collision with root package name */
    public final a f65367g;

    /* renamed from: h, reason: collision with root package name */
    public long f65368h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65369i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f65370j;

    /* renamed from: k, reason: collision with root package name */
    public long f65371k;

    /* renamed from: l, reason: collision with root package name */
    public long f65372l;

    /* renamed from: m, reason: collision with root package name */
    public long f65373m;

    /* renamed from: n, reason: collision with root package name */
    public long f65374n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f65375o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65376p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f65377e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f65378a;

        /* renamed from: b, reason: collision with root package name */
        public int f65379b;

        /* renamed from: c, reason: collision with root package name */
        public int f65380c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f65381d;

        public a(int i10) {
            this.f65381d = new byte[i10];
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f65378a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f65381d;
                int length = bArr2.length;
                int i13 = this.f65379b + i12;
                if (length < i13) {
                    this.f65381d = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f65381d, this.f65379b, i12);
                this.f65379b += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            if (this.f65378a) {
                int i12 = this.f65379b - i11;
                this.f65379b = i12;
                if (this.f65380c != 0 || i10 != 181) {
                    this.f65378a = false;
                    return true;
                }
                this.f65380c = i12;
            } else if (i10 == 179) {
                this.f65378a = true;
            }
            byte[] bArr = f65377e;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.f65378a = false;
            this.f65379b = 0;
            this.f65380c = 0;
        }
    }

    public k() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<io.odeeo.internal.b.t, java.lang.Long> a(io.odeeo.internal.p.k.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f65381d
            int r1 = r8.f65379b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            io.odeeo.internal.b.t$b r6 = new io.odeeo.internal.b.t$b
            r6.<init>()
            io.odeeo.internal.b.t$b r9 = r6.setId(r9)
            java.lang.String r6 = "video/mpeg2"
            io.odeeo.internal.b.t$b r9 = r9.setSampleMimeType(r6)
            io.odeeo.internal.b.t$b r9 = r9.setWidth(r2)
            io.odeeo.internal.b.t$b r9 = r9.setHeight(r4)
            io.odeeo.internal.b.t$b r9 = r9.setPixelWidthHeightRatio(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            io.odeeo.internal.b.t$b r9 = r9.setInitializationData(r1)
            io.odeeo.internal.b.t r9 = r9.build()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = io.odeeo.internal.p.k.f65360q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f65380c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.p.k.a(io.odeeo.internal.p.k$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    @Override // io.odeeo.internal.p.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(io.odeeo.internal.q0.x r20) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.p.k.consume(io.odeeo.internal.q0.x):void");
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65361a = dVar.getFormatId();
        this.f65362b = jVar.track(dVar.getTrackId(), 2);
        f0 f0Var = this.f65363c;
        if (f0Var != null) {
            f0Var.createTracks(jVar, dVar);
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        this.f65372l = j10;
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        io.odeeo.internal.q0.u.clearPrefixFlags(this.f65366f);
        this.f65367g.reset();
        r rVar = this.f65365e;
        if (rVar != null) {
            rVar.reset();
        }
        this.f65368h = 0L;
        this.f65369i = false;
        this.f65372l = C.TIME_UNSET;
        this.f65374n = C.TIME_UNSET;
    }

    public k(f0 f0Var) {
        this.f65363c = f0Var;
        this.f65366f = new boolean[4];
        this.f65367g = new a(128);
        if (f0Var != null) {
            this.f65365e = new r(178, 128);
            this.f65364d = new io.odeeo.internal.q0.x();
        } else {
            this.f65365e = null;
            this.f65364d = null;
        }
        this.f65372l = C.TIME_UNSET;
        this.f65374n = C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }
}
