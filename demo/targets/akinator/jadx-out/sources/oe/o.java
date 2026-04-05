package oe;

import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements j {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f79211a;

    /* renamed from: b, reason: collision with root package name */
    public String f79212b;

    /* renamed from: c, reason: collision with root package name */
    public ee.l0 f79213c;

    /* renamed from: d, reason: collision with root package name */
    public a f79214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79215e;

    /* renamed from: l, reason: collision with root package name */
    public long f79222l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f79216f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final s f79217g = new s(32, 128);

    /* renamed from: h, reason: collision with root package name */
    public final s f79218h = new s(33, 128);

    /* renamed from: i, reason: collision with root package name */
    public final s f79219i = new s(34, 128);

    /* renamed from: j, reason: collision with root package name */
    public final s f79220j = new s(39, 128);

    /* renamed from: k, reason: collision with root package name */
    public final s f79221k = new s(40, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f79223m = C.TIME_UNSET;

    /* renamed from: n, reason: collision with root package name */
    public final v0 f79224n = new v0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ee.l0 f79225a;

        /* renamed from: b, reason: collision with root package name */
        public long f79226b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f79227c;

        /* renamed from: d, reason: collision with root package name */
        public int f79228d;

        /* renamed from: e, reason: collision with root package name */
        public long f79229e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f79230f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f79231g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f79232h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f79233i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f79234j;

        /* renamed from: k, reason: collision with root package name */
        public long f79235k;

        /* renamed from: l, reason: collision with root package name */
        public long f79236l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f79237m;

        public a(ee.l0 l0Var) {
            this.f79225a = l0Var;
        }

        public void endNalUnit(long j10, int i10, boolean z10) {
            if (this.f79234j && this.f79231g) {
                this.f79237m = this.f79227c;
                this.f79234j = false;
                return;
            }
            if (this.f79232h || this.f79231g) {
                if (z10 && this.f79233i) {
                    long j11 = this.f79226b;
                    int i11 = i10 + ((int) (j10 - j11));
                    long j12 = this.f79236l;
                    if (j12 != C.TIME_UNSET) {
                        boolean z11 = this.f79237m;
                        this.f79225a.sampleMetadata(j12, z11 ? 1 : 0, (int) (j11 - this.f79235k), i11, null);
                    }
                }
                this.f79235k = this.f79226b;
                this.f79236l = this.f79229e;
                this.f79237m = this.f79227c;
                this.f79233i = true;
            }
        }

        public void readNalUnitData(byte[] bArr, int i10, int i11) {
            if (this.f79230f) {
                int i12 = this.f79228d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f79228d = (i11 - i10) + i12;
                } else {
                    this.f79231g = (bArr[i13] & 128) != 0;
                    this.f79230f = false;
                }
            }
        }

        public void reset() {
            this.f79230f = false;
            this.f79231g = false;
            this.f79232h = false;
            this.f79233i = false;
            this.f79234j = false;
        }

        public void startNalUnit(long j10, int i10, int i11, long j11, boolean z10) {
            this.f79231g = false;
            this.f79232h = false;
            this.f79229e = j11;
            this.f79228d = 0;
            this.f79226b = j10;
            if (i11 >= 32 && i11 != 40) {
                if (this.f79233i && !this.f79234j) {
                    if (z10) {
                        long j12 = this.f79236l;
                        if (j12 != C.TIME_UNSET) {
                            this.f79225a.sampleMetadata(j12, this.f79237m ? 1 : 0, (int) (j10 - this.f79235k), i10, null);
                        }
                    }
                    this.f79233i = false;
                }
                if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                    this.f79232h = !this.f79234j;
                    this.f79234j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f79227c = z11;
            this.f79230f = z11 || i11 <= 9;
        }
    }

    public o(b0 b0Var) {
        this.f79211a = b0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        this.f79214d.readNalUnitData(bArr, i10, i11);
        if (!this.f79215e) {
            this.f79217g.appendToNalUnit(bArr, i10, i11);
            this.f79218h.appendToNalUnit(bArr, i10, i11);
            this.f79219i.appendToNalUnit(bArr, i10, i11);
        }
        this.f79220j.appendToNalUnit(bArr, i10, i11);
        this.f79221k.appendToNalUnit(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0119  */
    @Override // oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(com.google.android.exoplayer2.util.v0 r29) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.o.consume(com.google.android.exoplayer2.util.v0):void");
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79212b = i0Var.getFormatId();
        ee.l0 l0VarTrack = sVar.track(i0Var.getTrackId(), 2);
        this.f79213c = l0VarTrack;
        this.f79214d = new a(l0VarTrack);
        this.f79211a.createTracks(sVar, i0Var);
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f79223m = j10;
        }
    }

    @Override // oe.j
    public void seek() {
        this.f79222l = 0L;
        this.f79223m = C.TIME_UNSET;
        p0.clearPrefixFlags(this.f79216f);
        this.f79217g.reset();
        this.f79218h.reset();
        this.f79219i.reset();
        this.f79220j.reset();
        this.f79221k.reset();
        a aVar = this.f79214d;
        if (aVar != null) {
            aVar.reset();
        }
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
