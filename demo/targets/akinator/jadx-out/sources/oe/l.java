package oe;

import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f79134l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final l0 f79135a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f79136b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f79137c;

    /* renamed from: d, reason: collision with root package name */
    public final a f79138d;

    /* renamed from: e, reason: collision with root package name */
    public final s f79139e;

    /* renamed from: f, reason: collision with root package name */
    public b f79140f;

    /* renamed from: g, reason: collision with root package name */
    public long f79141g;

    /* renamed from: h, reason: collision with root package name */
    public String f79142h;

    /* renamed from: i, reason: collision with root package name */
    public ee.l0 f79143i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f79144j;

    /* renamed from: k, reason: collision with root package name */
    public long f79145k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f79146f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f79147a;

        /* renamed from: b, reason: collision with root package name */
        public int f79148b;

        /* renamed from: c, reason: collision with root package name */
        public int f79149c;

        /* renamed from: d, reason: collision with root package name */
        public int f79150d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f79151e;

        public a(int i10) {
            this.f79151e = new byte[i10];
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f79147a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f79151e;
                int length = bArr2.length;
                int i13 = this.f79149c + i12;
                if (length < i13) {
                    this.f79151e = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f79151e, this.f79149c, i12);
                this.f79149c += i12;
            }
        }

        public boolean onStartCode(int i10, int i11) {
            int i12 = this.f79148b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f79149c -= i11;
                                this.f79147a = false;
                                return true;
                            }
                        } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            com.google.android.exoplayer2.util.f0.w("H263Reader", "Unexpected start code value");
                            reset();
                        } else {
                            this.f79150d = this.f79149c;
                            this.f79148b = 4;
                        }
                    } else if (i10 > 31) {
                        com.google.android.exoplayer2.util.f0.w("H263Reader", "Unexpected start code value");
                        reset();
                    } else {
                        this.f79148b = 3;
                    }
                } else if (i10 != 181) {
                    com.google.android.exoplayer2.util.f0.w("H263Reader", "Unexpected start code value");
                    reset();
                } else {
                    this.f79148b = 2;
                }
            } else if (i10 == 176) {
                this.f79148b = 1;
                this.f79147a = true;
            }
            onData(f79146f, 0, 3);
            return false;
        }

        public void reset() {
            this.f79147a = false;
            this.f79149c = 0;
            this.f79148b = 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ee.l0 f79152a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f79153b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f79154c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f79155d;

        /* renamed from: e, reason: collision with root package name */
        public int f79156e;

        /* renamed from: f, reason: collision with root package name */
        public int f79157f;

        /* renamed from: g, reason: collision with root package name */
        public long f79158g;

        /* renamed from: h, reason: collision with root package name */
        public long f79159h;

        public b(ee.l0 l0Var) {
            this.f79152a = l0Var;
        }

        public void onData(byte[] bArr, int i10, int i11) {
            if (this.f79154c) {
                int i12 = this.f79157f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f79157f = (i11 - i10) + i12;
                } else {
                    this.f79155d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f79154c = false;
                }
            }
        }

        public void onDataEnd(long j10, int i10, boolean z10) {
            if (this.f79156e == 182 && z10 && this.f79153b) {
                long j11 = this.f79159h;
                if (j11 != C.TIME_UNSET) {
                    this.f79152a.sampleMetadata(j11, this.f79155d ? 1 : 0, (int) (j10 - this.f79158g), i10, null);
                }
            }
            if (this.f79156e != 179) {
                this.f79158g = j10;
            }
        }

        public void onStartCode(int i10, long j10) {
            this.f79156e = i10;
            this.f79155d = false;
            this.f79153b = i10 == 182 || i10 == 179;
            this.f79154c = i10 == 182;
            this.f79157f = 0;
            this.f79159h = j10;
        }

        public void reset() {
            this.f79153b = false;
            this.f79154c = false;
            this.f79155d = false;
            this.f79156e = -1;
        }
    }

    public l() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    @Override // oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(com.google.android.exoplayer2.util.v0 r20) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.l.consume(com.google.android.exoplayer2.util.v0):void");
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79142h = i0Var.getFormatId();
        ee.l0 l0VarTrack = sVar.track(i0Var.getTrackId(), 2);
        this.f79143i = l0VarTrack;
        this.f79140f = new b(l0VarTrack);
        l0 l0Var = this.f79135a;
        if (l0Var != null) {
            l0Var.createTracks(sVar, i0Var);
        }
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f79145k = j10;
        }
    }

    @Override // oe.j
    public void seek() {
        p0.clearPrefixFlags(this.f79137c);
        this.f79138d.reset();
        b bVar = this.f79140f;
        if (bVar != null) {
            bVar.reset();
        }
        s sVar = this.f79139e;
        if (sVar != null) {
            sVar.reset();
        }
        this.f79141g = 0L;
        this.f79145k = C.TIME_UNSET;
    }

    public l(l0 l0Var) {
        this.f79135a = l0Var;
        this.f79137c = new boolean[4];
        this.f79138d = new a(128);
        this.f79145k = C.TIME_UNSET;
        if (l0Var != null) {
            this.f79139e = new s(178, 128);
            this.f79136b = new v0();
        } else {
            this.f79139e = null;
            this.f79136b = null;
        }
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
