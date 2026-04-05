package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements j {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f84702r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f84703a;

    /* renamed from: b, reason: collision with root package name */
    public e1 f84704b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f84705c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84706d;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84707e;

    /* renamed from: f, reason: collision with root package name */
    public final w f84708f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f84709g;

    /* renamed from: h, reason: collision with root package name */
    public final a f84710h;

    /* renamed from: i, reason: collision with root package name */
    public long f84711i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f84712j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84713k;

    /* renamed from: l, reason: collision with root package name */
    public long f84714l;

    /* renamed from: m, reason: collision with root package name */
    public long f84715m;

    /* renamed from: n, reason: collision with root package name */
    public long f84716n;

    /* renamed from: o, reason: collision with root package name */
    public long f84717o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f84718p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f84719q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f84720e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f84721a;

        /* renamed from: b, reason: collision with root package name */
        public int f84722b;

        /* renamed from: c, reason: collision with root package name */
        public int f84723c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f84724d;

        public a(int i10) {
            this.f84724d = new byte[i10];
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f84721a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f84724d;
                int length = bArr2.length;
                int i13 = this.f84722b + i12;
                if (length < i13) {
                    this.f84724d = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f84724d, this.f84722b, i12);
                this.f84722b += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            if (this.f84721a) {
                int i12 = this.f84722b - i11;
                this.f84722b = i12;
                if (this.f84723c != 0 || i10 != 181) {
                    this.f84721a = false;
                    return true;
                }
                this.f84723c = i12;
            } else if (i10 == 179) {
                this.f84721a = true;
            }
            onData(f84720e, 0, 3);
            return false;
        }

        public void reset() {
            this.f84721a = false;
            this.f84722b = 0;
            this.f84723c = 0;
        }
    }

    public k(String str) {
        this(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    @Override // rp.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(io.bidmachine.media3.common.util.m0 r29) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.k.consume(io.bidmachine.media3.common.util.m0):void");
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84703a = m0Var.getFormatId();
        this.f84704b = c0Var.track(m0Var.getTrackId(), 2);
        p0 p0Var = this.f84705c;
        if (p0Var != null) {
            p0Var.createTracks(c0Var, m0Var);
        }
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84704b);
        if (z10) {
            boolean z11 = this.f84718p;
            this.f84704b.sampleMetadata(this.f84717o, z11 ? 1 : 0, (int) (this.f84711i - this.f84716n), 0, null);
        }
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84715m = j10;
    }

    @Override // rp.j
    public void seek() {
        jn.u.clearPrefixFlags(this.f84709g);
        this.f84710h.reset();
        w wVar = this.f84708f;
        if (wVar != null) {
            wVar.reset();
        }
        this.f84711i = 0L;
        this.f84712j = false;
        this.f84715m = C.TIME_UNSET;
        this.f84717o = C.TIME_UNSET;
    }

    public k(p0 p0Var, String str) {
        this.f84705c = p0Var;
        this.f84706d = str;
        this.f84709g = new boolean[4];
        this.f84710h = new a(128);
        if (p0Var != null) {
            this.f84708f = new w(178, 128);
            this.f84707e = new io.bidmachine.media3.common.util.m0();
        } else {
            this.f84708f = null;
            this.f84707e = null;
        }
        this.f84715m = C.TIME_UNSET;
        this.f84717o = C.TIME_UNSET;
    }
}
