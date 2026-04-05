package oe;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.o0;
import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.util.w0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f79178a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79179b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79180c;

    /* renamed from: g, reason: collision with root package name */
    public long f79184g;

    /* renamed from: i, reason: collision with root package name */
    public String f79186i;

    /* renamed from: j, reason: collision with root package name */
    public ee.l0 f79187j;

    /* renamed from: k, reason: collision with root package name */
    public a f79188k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f79189l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79191n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f79185h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final s f79181d = new s(7, 128);

    /* renamed from: e, reason: collision with root package name */
    public final s f79182e = new s(8, 128);

    /* renamed from: f, reason: collision with root package name */
    public final s f79183f = new s(6, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f79190m = C.TIME_UNSET;

    /* renamed from: o, reason: collision with root package name */
    public final v0 f79192o = new v0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ee.l0 f79193a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f79194b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f79195c;

        /* renamed from: f, reason: collision with root package name */
        public final w0 f79198f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f79199g;

        /* renamed from: h, reason: collision with root package name */
        public int f79200h;

        /* renamed from: i, reason: collision with root package name */
        public int f79201i;

        /* renamed from: j, reason: collision with root package name */
        public long f79202j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f79203k;

        /* renamed from: l, reason: collision with root package name */
        public long f79204l;

        /* renamed from: o, reason: collision with root package name */
        public boolean f79207o;

        /* renamed from: p, reason: collision with root package name */
        public long f79208p;

        /* renamed from: q, reason: collision with root package name */
        public long f79209q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f79210r;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f79196d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f79197e = new SparseArray();

        /* renamed from: m, reason: collision with root package name */
        public m f79205m = new m();

        /* renamed from: n, reason: collision with root package name */
        public m f79206n = new m();

        public a(ee.l0 l0Var, boolean z10, boolean z11) {
            this.f79193a = l0Var;
            this.f79194b = z10;
            this.f79195c = z11;
            byte[] bArr = new byte[128];
            this.f79199g = bArr;
            this.f79198f = new w0(bArr, 0, 0);
            reset();
        }

        public void appendToNalUnit(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean bit;
            int unsignedExpGolombCodedInt;
            int i12;
            int signedExpGolombCodedInt;
            int i13;
            int signedExpGolombCodedInt2;
            if (this.f79203k) {
                int i14 = i11 - i10;
                byte[] bArr2 = this.f79199g;
                int length = bArr2.length;
                int i15 = this.f79200h + i14;
                if (length < i15) {
                    this.f79199g = Arrays.copyOf(bArr2, i15 * 2);
                }
                System.arraycopy(bArr, i10, this.f79199g, this.f79200h, i14);
                int i16 = this.f79200h + i14;
                this.f79200h = i16;
                byte[] bArr3 = this.f79199g;
                w0 w0Var = this.f79198f;
                w0Var.reset(bArr3, 0, i16);
                if (w0Var.canReadBits(8)) {
                    w0Var.skipBit();
                    int bits = w0Var.readBits(2);
                    w0Var.skipBits(5);
                    if (w0Var.canReadExpGolombCodedNum()) {
                        w0Var.readUnsignedExpGolombCodedInt();
                        if (w0Var.canReadExpGolombCodedNum()) {
                            int unsignedExpGolombCodedInt2 = w0Var.readUnsignedExpGolombCodedInt();
                            if (!this.f79195c) {
                                this.f79203k = false;
                                this.f79206n.setSliceType(unsignedExpGolombCodedInt2);
                                return;
                            }
                            if (w0Var.canReadExpGolombCodedNum()) {
                                int unsignedExpGolombCodedInt3 = w0Var.readUnsignedExpGolombCodedInt();
                                SparseArray sparseArray = this.f79197e;
                                if (sparseArray.indexOfKey(unsignedExpGolombCodedInt3) < 0) {
                                    this.f79203k = false;
                                    return;
                                }
                                n0 n0Var = (n0) sparseArray.get(unsignedExpGolombCodedInt3);
                                int i17 = n0Var.f28504b;
                                boolean z12 = n0Var.f28505c;
                                o0 o0Var = (o0) this.f79196d.get(i17);
                                boolean z13 = o0Var.f28530h;
                                int i18 = o0Var.f28534l;
                                int i19 = o0Var.f28532j;
                                if (z13) {
                                    if (!w0Var.canReadBits(2)) {
                                        return;
                                    } else {
                                        w0Var.skipBits(2);
                                    }
                                }
                                if (w0Var.canReadBits(i19)) {
                                    int bits2 = w0Var.readBits(i19);
                                    if (o0Var.f28531i) {
                                        z10 = false;
                                        z11 = false;
                                        bit = false;
                                    } else {
                                        if (!w0Var.canReadBits(1)) {
                                            return;
                                        }
                                        boolean bit2 = w0Var.readBit();
                                        if (!bit2) {
                                            z11 = false;
                                            bit = false;
                                        } else {
                                            if (!w0Var.canReadBits(1)) {
                                                return;
                                            }
                                            z11 = true;
                                            bit = w0Var.readBit();
                                        }
                                        z10 = bit2;
                                    }
                                    boolean z14 = this.f79201i == 5;
                                    if (!z14) {
                                        unsignedExpGolombCodedInt = 0;
                                    } else if (!w0Var.canReadExpGolombCodedNum()) {
                                        return;
                                    } else {
                                        unsignedExpGolombCodedInt = w0Var.readUnsignedExpGolombCodedInt();
                                    }
                                    int i20 = o0Var.f28533k;
                                    if (i20 == 0) {
                                        if (!w0Var.canReadBits(i18)) {
                                            return;
                                        }
                                        int bits3 = w0Var.readBits(i18);
                                        if (z12 && !z10) {
                                            if (w0Var.canReadExpGolombCodedNum()) {
                                                i12 = bits3;
                                                signedExpGolombCodedInt = w0Var.readSignedExpGolombCodedInt();
                                                i13 = 0;
                                                signedExpGolombCodedInt2 = i13;
                                                this.f79206n.setAll(o0Var, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z10, z11, bit, z14, unsignedExpGolombCodedInt, i12, signedExpGolombCodedInt, i13, signedExpGolombCodedInt2);
                                                this.f79203k = false;
                                            }
                                            return;
                                        }
                                        i12 = bits3;
                                        signedExpGolombCodedInt = 0;
                                    } else {
                                        if (i20 == 1 && !o0Var.f28535m) {
                                            if (w0Var.canReadExpGolombCodedNum()) {
                                                int signedExpGolombCodedInt3 = w0Var.readSignedExpGolombCodedInt();
                                                if (!z12 || z10) {
                                                    i13 = signedExpGolombCodedInt3;
                                                    i12 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                    signedExpGolombCodedInt2 = 0;
                                                } else {
                                                    if (!w0Var.canReadExpGolombCodedNum()) {
                                                        return;
                                                    }
                                                    i13 = signedExpGolombCodedInt3;
                                                    signedExpGolombCodedInt2 = w0Var.readSignedExpGolombCodedInt();
                                                    i12 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                }
                                                this.f79206n.setAll(o0Var, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z10, z11, bit, z14, unsignedExpGolombCodedInt, i12, signedExpGolombCodedInt, i13, signedExpGolombCodedInt2);
                                                this.f79203k = false;
                                            }
                                            return;
                                        }
                                        i12 = 0;
                                        signedExpGolombCodedInt = 0;
                                    }
                                    i13 = signedExpGolombCodedInt;
                                    signedExpGolombCodedInt2 = i13;
                                    this.f79206n.setAll(o0Var, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z10, z11, bit, z14, unsignedExpGolombCodedInt, i12, signedExpGolombCodedInt, i13, signedExpGolombCodedInt2);
                                    this.f79203k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean endNalUnit(long r12, int r14, boolean r15, boolean r16) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.n.a.endNalUnit(long, int, boolean, boolean):boolean");
        }

        public boolean needsSpsPps() {
            return this.f79195c;
        }

        public void putPps(n0 n0Var) {
            this.f79197e.append(n0Var.f28503a, n0Var);
        }

        public void putSps(o0 o0Var) {
            this.f79196d.append(o0Var.f28526d, o0Var);
        }

        public void reset() {
            this.f79203k = false;
            this.f79207o = false;
            this.f79206n.clear();
        }

        public void startNalUnit(long j10, int i10, long j11) {
            this.f79201i = i10;
            this.f79204l = j11;
            this.f79202j = j10;
            if (!this.f79194b || i10 != 1) {
                if (!this.f79195c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            m mVar = this.f79205m;
            this.f79205m = this.f79206n;
            this.f79206n = mVar;
            mVar.clear();
            this.f79200h = 0;
            this.f79203k = true;
        }
    }

    public n(b0 b0Var, boolean z10, boolean z11) {
        this.f79178a = b0Var;
        this.f79179b = z10;
        this.f79180c = z11;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f79189l || this.f79188k.needsSpsPps()) {
            this.f79181d.appendToNalUnit(bArr, i10, i11);
            this.f79182e.appendToNalUnit(bArr, i10, i11);
        }
        this.f79183f.appendToNalUnit(bArr, i10, i11);
        this.f79188k.appendToNalUnit(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(com.google.android.exoplayer2.util.v0 r22) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.n.consume(com.google.android.exoplayer2.util.v0):void");
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79186i = i0Var.getFormatId();
        ee.l0 l0VarTrack = sVar.track(i0Var.getTrackId(), 2);
        this.f79187j = l0VarTrack;
        this.f79188k = new a(l0VarTrack, this.f79179b, this.f79180c);
        this.f79178a.createTracks(sVar, i0Var);
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f79190m = j10;
        }
        this.f79191n |= (i10 & 2) != 0;
    }

    @Override // oe.j
    public void seek() {
        this.f79184g = 0L;
        this.f79191n = false;
        this.f79190m = C.TIME_UNSET;
        p0.clearPrefixFlags(this.f79185h);
        this.f79181d.reset();
        this.f79182e.reset();
        this.f79183f.reset();
        a aVar = this.f79188k;
        if (aVar != null) {
            aVar.reset();
        }
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
