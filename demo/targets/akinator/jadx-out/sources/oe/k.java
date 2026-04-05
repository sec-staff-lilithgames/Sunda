package oe;

import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f79112q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f79113a;

    /* renamed from: b, reason: collision with root package name */
    public ee.l0 f79114b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f79115c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f79116d;

    /* renamed from: e, reason: collision with root package name */
    public final s f79117e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f79118f;

    /* renamed from: g, reason: collision with root package name */
    public final a f79119g;

    /* renamed from: h, reason: collision with root package name */
    public long f79120h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f79121i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f79122j;

    /* renamed from: k, reason: collision with root package name */
    public long f79123k;

    /* renamed from: l, reason: collision with root package name */
    public long f79124l;

    /* renamed from: m, reason: collision with root package name */
    public long f79125m;

    /* renamed from: n, reason: collision with root package name */
    public long f79126n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f79127o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f79128p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f79129e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f79130a;

        /* renamed from: b, reason: collision with root package name */
        public int f79131b;

        /* renamed from: c, reason: collision with root package name */
        public int f79132c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f79133d;

        public a(int i10) {
            this.f79133d = new byte[i10];
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f79130a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f79133d;
                int length = bArr2.length;
                int i13 = this.f79131b + i12;
                if (length < i13) {
                    this.f79133d = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f79133d, this.f79131b, i12);
                this.f79131b += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            if (this.f79130a) {
                int i12 = this.f79131b - i11;
                this.f79131b = i12;
                if (this.f79132c != 0 || i10 != 181) {
                    this.f79130a = false;
                    return true;
                }
                this.f79132c = i12;
            } else if (i10 == 179) {
                this.f79130a = true;
            }
            onData(f79129e, 0, 3);
            return false;
        }

        public void reset() {
            this.f79130a = false;
            this.f79131b = 0;
            this.f79132c = 0;
        }
    }

    public k() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
    @Override // oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(com.google.android.exoplayer2.util.v0 r29) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.k.consume(com.google.android.exoplayer2.util.v0):void");
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79113a = i0Var.getFormatId();
        this.f79114b = sVar.track(i0Var.getTrackId(), 2);
        l0 l0Var = this.f79115c;
        if (l0Var != null) {
            l0Var.createTracks(sVar, i0Var);
        }
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        this.f79124l = j10;
    }

    @Override // oe.j
    public void seek() {
        p0.clearPrefixFlags(this.f79118f);
        this.f79119g.reset();
        s sVar = this.f79117e;
        if (sVar != null) {
            sVar.reset();
        }
        this.f79120h = 0L;
        this.f79121i = false;
        this.f79124l = C.TIME_UNSET;
        this.f79126n = C.TIME_UNSET;
    }

    public k(l0 l0Var) {
        this.f79115c = l0Var;
        this.f79118f = new boolean[4];
        this.f79119g = new a(128);
        if (l0Var != null) {
            this.f79117e = new s(178, 128);
            this.f79116d = new v0();
        } else {
            this.f79117e = null;
            this.f79116d = null;
        }
        this.f79124l = C.TIME_UNSET;
        this.f79126n = C.TIME_UNSET;
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
