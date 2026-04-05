package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements j {

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f84730m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final p0 f84731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84732b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84733c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f84734d;

    /* renamed from: e, reason: collision with root package name */
    public final a f84735e;

    /* renamed from: f, reason: collision with root package name */
    public final w f84736f;

    /* renamed from: g, reason: collision with root package name */
    public b f84737g;

    /* renamed from: h, reason: collision with root package name */
    public long f84738h;

    /* renamed from: i, reason: collision with root package name */
    public String f84739i;

    /* renamed from: j, reason: collision with root package name */
    public e1 f84740j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84741k;

    /* renamed from: l, reason: collision with root package name */
    public long f84742l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f84743f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f84744a;

        /* renamed from: b, reason: collision with root package name */
        public int f84745b;

        /* renamed from: c, reason: collision with root package name */
        public int f84746c;

        /* renamed from: d, reason: collision with root package name */
        public int f84747d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f84748e;

        public a(int i10) {
            this.f84748e = new byte[i10];
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f84744a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f84748e;
                int length = bArr2.length;
                int i13 = this.f84746c + i12;
                if (length < i13) {
                    this.f84748e = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f84748e, this.f84746c, i12);
                this.f84746c += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            int i12 = this.f84745b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f84746c -= i11;
                                this.f84744a = false;
                                return true;
                            }
                        } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            io.bidmachine.media3.common.util.b0.w("H263Reader", "Unexpected start code value");
                            reset();
                        } else {
                            this.f84747d = this.f84746c;
                            this.f84745b = 4;
                        }
                    } else if (i10 > 31) {
                        io.bidmachine.media3.common.util.b0.w("H263Reader", "Unexpected start code value");
                        reset();
                    } else {
                        this.f84745b = 3;
                    }
                } else if (i10 != 181) {
                    io.bidmachine.media3.common.util.b0.w("H263Reader", "Unexpected start code value");
                    reset();
                } else {
                    this.f84745b = 2;
                }
            } else if (i10 == 176) {
                this.f84745b = 1;
                this.f84744a = true;
            }
            onData(f84743f, 0, 3);
            return false;
        }

        public void reset() {
            this.f84744a = false;
            this.f84746c = 0;
            this.f84745b = 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final e1 f84749a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f84750b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f84751c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f84752d;

        /* renamed from: e, reason: collision with root package name */
        public int f84753e;

        /* renamed from: f, reason: collision with root package name */
        public int f84754f;

        /* renamed from: g, reason: collision with root package name */
        public long f84755g;

        /* renamed from: h, reason: collision with root package name */
        public long f84756h;

        public b(e1 e1Var) {
            this.f84749a = e1Var;
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f84751c) {
                int i12 = this.f84754f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f84754f = (i11 - i10) + i12;
                } else {
                    this.f84752d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f84751c = false;
                }
            }
        }

        public void onDataEnd(long j10, int i10, boolean z10) {
            io.bidmachine.media3.common.util.a.checkState(this.f84756h != C.TIME_UNSET);
            if (this.f84753e == 182 && z10 && this.f84750b) {
                this.f84749a.sampleMetadata(this.f84756h, this.f84752d ? 1 : 0, (int) (j10 - this.f84755g), i10, null);
            }
            if (this.f84753e != 179) {
                this.f84755g = j10;
            }
        }

        public void onStartCode(int i10, long j10) {
            this.f84753e = i10;
            this.f84752d = false;
            this.f84750b = i10 == 182 || i10 == 179;
            this.f84751c = i10 == 182;
            this.f84754f = 0;
            this.f84756h = j10;
        }

        public void reset() {
            this.f84750b = false;
            this.f84751c = false;
            this.f84752d = false;
            this.f84753e = -1;
        }
    }

    public l(String str) {
        this(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018e  */
    @Override // rp.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(io.bidmachine.media3.common.util.m0 r20) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.l.consume(io.bidmachine.media3.common.util.m0):void");
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84739i = m0Var.getFormatId();
        e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 2);
        this.f84740j = e1VarTrack;
        this.f84737g = new b(e1VarTrack);
        p0 p0Var = this.f84731a;
        if (p0Var != null) {
            p0Var.createTracks(c0Var, m0Var);
        }
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84737g);
        if (z10) {
            this.f84737g.onDataEnd(this.f84738h, 0, this.f84741k);
            this.f84737g.reset();
        }
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84742l = j10;
    }

    @Override // rp.j
    public void seek() {
        jn.u.clearPrefixFlags(this.f84734d);
        this.f84735e.reset();
        b bVar = this.f84737g;
        if (bVar != null) {
            bVar.reset();
        }
        w wVar = this.f84736f;
        if (wVar != null) {
            wVar.reset();
        }
        this.f84738h = 0L;
        this.f84742l = C.TIME_UNSET;
    }

    public l(p0 p0Var, String str) {
        this.f84731a = p0Var;
        this.f84732b = str;
        this.f84734d = new boolean[4];
        this.f84735e = new a(128);
        this.f84742l = C.TIME_UNSET;
        if (p0Var != null) {
            this.f84736f = new w(178, 128);
            this.f84733c = new io.bidmachine.media3.common.util.m0();
        } else {
            this.f84736f = null;
            this.f84733c = null;
        }
    }
}
