package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;
import io.odeeo.internal.q0.g0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f65457a;

    /* renamed from: b, reason: collision with root package name */
    public String f65458b;

    /* renamed from: c, reason: collision with root package name */
    public io.odeeo.internal.g.x f65459c;

    /* renamed from: d, reason: collision with root package name */
    public a f65460d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65461e;

    /* renamed from: l, reason: collision with root package name */
    public long f65468l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f65462f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final r f65463g = new r(32, 128);

    /* renamed from: h, reason: collision with root package name */
    public final r f65464h = new r(33, 128);

    /* renamed from: i, reason: collision with root package name */
    public final r f65465i = new r(34, 128);

    /* renamed from: j, reason: collision with root package name */
    public final r f65466j = new r(39, 128);

    /* renamed from: k, reason: collision with root package name */
    public final r f65467k = new r(40, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f65469m = C.TIME_UNSET;

    /* renamed from: n, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65470n = new io.odeeo.internal.q0.x();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.g.x f65471a;

        /* renamed from: b, reason: collision with root package name */
        public long f65472b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f65473c;

        /* renamed from: d, reason: collision with root package name */
        public int f65474d;

        /* renamed from: e, reason: collision with root package name */
        public long f65475e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f65476f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f65477g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f65478h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f65479i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f65480j;

        /* renamed from: k, reason: collision with root package name */
        public long f65481k;

        /* renamed from: l, reason: collision with root package name */
        public long f65482l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f65483m;

        public a(io.odeeo.internal.g.x xVar) {
            this.f65471a = xVar;
        }

        public static boolean a(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        public static boolean b(int i10) {
            return i10 < 32 || i10 == 40;
        }

        public final void c(int i10) {
            long j10 = this.f65482l;
            if (j10 == C.TIME_UNSET) {
                return;
            }
            boolean z10 = this.f65483m;
            this.f65471a.sampleMetadata(j10, z10 ? 1 : 0, (int) (this.f65472b - this.f65481k), i10, null);
        }

        public void endNalUnit(long j10, int i10, boolean z10) {
            if (this.f65480j && this.f65477g) {
                this.f65483m = this.f65473c;
                this.f65480j = false;
            } else if (this.f65478h || this.f65477g) {
                if (z10 && this.f65479i) {
                    c(i10 + ((int) (j10 - this.f65472b)));
                }
                this.f65481k = this.f65472b;
                this.f65482l = this.f65475e;
                this.f65483m = this.f65473c;
                this.f65479i = true;
            }
        }

        public void readNalUnitData(byte[] bArr, int i10, int i11) {
            if (this.f65476f) {
                int i12 = this.f65474d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f65474d = (i11 - i10) + i12;
                } else {
                    this.f65477g = (bArr[i13] & 128) != 0;
                    this.f65476f = false;
                }
            }
        }

        public void reset() {
            this.f65476f = false;
            this.f65477g = false;
            this.f65478h = false;
            this.f65479i = false;
            this.f65480j = false;
        }

        public void startNalUnit(long j10, int i10, int i11, long j11, boolean z10) {
            this.f65477g = false;
            this.f65478h = false;
            this.f65475e = j11;
            this.f65474d = 0;
            this.f65472b = j10;
            if (!b(i11)) {
                if (this.f65479i && !this.f65480j) {
                    if (z10) {
                        c(i10);
                    }
                    this.f65479i = false;
                }
                if (a(i11)) {
                    this.f65478h = !this.f65480j;
                    this.f65480j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f65473c = z11;
            this.f65476f = z11 || i11 <= 9;
        }
    }

    public n(z zVar) {
        this.f65457a = zVar;
    }

    @RequiresNonNull({"sampleReader"})
    public final void a(byte[] bArr, int i10, int i11) {
        this.f65460d.readNalUnitData(bArr, i10, i11);
        if (!this.f65461e) {
            this.f65463g.appendToNalUnit(bArr, i10, i11);
            this.f65464h.appendToNalUnit(bArr, i10, i11);
            this.f65465i.appendToNalUnit(bArr, i10, i11);
        }
        this.f65466j.appendToNalUnit(bArr, i10, i11);
        this.f65467k.appendToNalUnit(bArr, i10, i11);
    }

    @RequiresNonNull({"sampleReader"})
    public final void b(long j10, int i10, int i11, long j11) {
        this.f65460d.startNalUnit(j10, i10, i11, j11, this.f65461e);
        if (!this.f65461e) {
            this.f65463g.startNalUnit(i11);
            this.f65464h.startNalUnit(i11);
            this.f65465i.startNalUnit(i11);
        }
        this.f65466j.startNalUnit(i11);
        this.f65467k.startNalUnit(i11);
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        a();
        while (xVar.bytesLeft() > 0) {
            int position = xVar.getPosition();
            int iLimit = xVar.limit();
            byte[] data = xVar.getData();
            this.f65468l += xVar.bytesLeft();
            this.f65459c.sampleData(xVar, xVar.bytesLeft());
            while (position < iLimit) {
                int iFindNalUnit = io.odeeo.internal.q0.u.findNalUnit(data, position, iLimit, this.f65462f);
                if (iFindNalUnit == iLimit) {
                    a(data, position, iLimit);
                    return;
                }
                int h265NalUnitType = io.odeeo.internal.q0.u.getH265NalUnitType(data, iFindNalUnit);
                int i10 = iFindNalUnit - position;
                if (i10 > 0) {
                    a(data, position, iFindNalUnit);
                }
                int i11 = iLimit - iFindNalUnit;
                long j10 = this.f65468l - i11;
                a(j10, i11, i10 < 0 ? -i10 : 0, this.f65469m);
                b(j10, i11, h265NalUnitType, this.f65469m);
                position = iFindNalUnit + 3;
            }
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65458b = dVar.getFormatId();
        io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 2);
        this.f65459c = xVarTrack;
        this.f65460d = new a(xVarTrack);
        this.f65457a.createTracks(jVar, dVar);
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65469m = j10;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65468l = 0L;
        this.f65469m = C.TIME_UNSET;
        io.odeeo.internal.q0.u.clearPrefixFlags(this.f65462f);
        this.f65463g.reset();
        this.f65464h.reset();
        this.f65465i.reset();
        this.f65466j.reset();
        this.f65467k.reset();
        a aVar = this.f65460d;
        if (aVar != null) {
            aVar.reset();
        }
    }

    public static void b(io.odeeo.internal.q0.y yVar) {
        int unsignedExpGolombCodedInt = yVar.readUnsignedExpGolombCodedInt();
        boolean bit = false;
        int i10 = 0;
        for (int i11 = 0; i11 < unsignedExpGolombCodedInt; i11++) {
            if (i11 != 0) {
                bit = yVar.readBit();
            }
            if (bit) {
                yVar.skipBit();
                yVar.readUnsignedExpGolombCodedInt();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (yVar.readBit()) {
                        yVar.skipBit();
                    }
                }
            } else {
                int unsignedExpGolombCodedInt2 = yVar.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = yVar.readUnsignedExpGolombCodedInt();
                int i13 = unsignedExpGolombCodedInt2 + unsignedExpGolombCodedInt3;
                for (int i14 = 0; i14 < unsignedExpGolombCodedInt2; i14++) {
                    yVar.readUnsignedExpGolombCodedInt();
                    yVar.skipBit();
                }
                for (int i15 = 0; i15 < unsignedExpGolombCodedInt3; i15++) {
                    yVar.readUnsignedExpGolombCodedInt();
                    yVar.skipBit();
                }
                i10 = i13;
            }
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void a(long j10, int i10, int i11, long j11) {
        this.f65460d.endNalUnit(j10, i10, this.f65461e);
        if (!this.f65461e) {
            this.f65463g.endNalUnit(i11);
            this.f65464h.endNalUnit(i11);
            this.f65465i.endNalUnit(i11);
            if (this.f65463g.isCompleted() && this.f65464h.isCompleted() && this.f65465i.isCompleted()) {
                this.f65459c.format(a(this.f65458b, this.f65463g, this.f65464h, this.f65465i));
                this.f65461e = true;
            }
        }
        if (this.f65466j.endNalUnit(i11)) {
            r rVar = this.f65466j;
            this.f65470n.reset(this.f65466j.f65526d, io.odeeo.internal.q0.u.unescapeStream(rVar.f65526d, rVar.f65527e));
            this.f65470n.skipBytes(5);
            this.f65457a.consume(j11, this.f65470n);
        }
        if (this.f65467k.endNalUnit(i11)) {
            r rVar2 = this.f65467k;
            this.f65470n.reset(this.f65467k.f65526d, io.odeeo.internal.q0.u.unescapeStream(rVar2.f65526d, rVar2.f65527e));
            this.f65470n.skipBytes(5);
            this.f65457a.consume(j11, this.f65470n);
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }

    public static io.odeeo.internal.b.t a(String str, r rVar, r rVar2, r rVar3) {
        byte[] bArr;
        int i10;
        int i11 = rVar.f65527e;
        byte[] bArr2 = new byte[rVar2.f65527e + i11 + rVar3.f65527e];
        System.arraycopy(rVar.f65526d, 0, bArr2, 0, i11);
        System.arraycopy(rVar2.f65526d, 0, bArr2, rVar.f65527e, rVar2.f65527e);
        System.arraycopy(rVar3.f65526d, 0, bArr2, rVar.f65527e + rVar2.f65527e, rVar3.f65527e);
        io.odeeo.internal.q0.y yVar = new io.odeeo.internal.q0.y(rVar2.f65526d, 0, rVar2.f65527e);
        yVar.skipBits(44);
        int bits = yVar.readBits(3);
        yVar.skipBit();
        int bits2 = yVar.readBits(2);
        boolean bit = yVar.readBit();
        int bits3 = yVar.readBits(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (yVar.readBit()) {
                i12 |= 1 << i13;
            }
        }
        int i14 = i12;
        int[] iArr = new int[6];
        for (int i15 = 0; i15 < 6; i15++) {
            iArr[i15] = yVar.readBits(8);
        }
        int bits4 = yVar.readBits(8);
        int i16 = 0;
        for (int i17 = 0; i17 < bits; i17++) {
            if (yVar.readBit()) {
                i16 += 89;
            }
            if (yVar.readBit()) {
                i16 += 8;
            }
        }
        yVar.skipBits(i16);
        if (bits > 0) {
            yVar.skipBits((8 - bits) * 2);
        }
        yVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt = yVar.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt == 3) {
            yVar.skipBit();
        }
        int unsignedExpGolombCodedInt2 = yVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt3 = yVar.readUnsignedExpGolombCodedInt();
        if (yVar.readBit()) {
            int unsignedExpGolombCodedInt4 = yVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt5 = yVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = yVar.readUnsignedExpGolombCodedInt();
            bArr = bArr2;
            int unsignedExpGolombCodedInt7 = yVar.readUnsignedExpGolombCodedInt();
            int i18 = (unsignedExpGolombCodedInt == 1 || unsignedExpGolombCodedInt == 2) ? 2 : 1;
            i10 = bits2;
            int i19 = unsignedExpGolombCodedInt == 1 ? 2 : 1;
            unsignedExpGolombCodedInt2 = e3.g.B(unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, i18, unsignedExpGolombCodedInt2);
            unsignedExpGolombCodedInt3 = e3.g.B(unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt7, i19, unsignedExpGolombCodedInt3);
        } else {
            bArr = bArr2;
            i10 = bits2;
        }
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt8 = yVar.readUnsignedExpGolombCodedInt();
        for (int i20 = yVar.readBit() ? 0 : bits; i20 <= bits; i20++) {
            yVar.readUnsignedExpGolombCodedInt();
            yVar.readUnsignedExpGolombCodedInt();
            yVar.readUnsignedExpGolombCodedInt();
        }
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        yVar.readUnsignedExpGolombCodedInt();
        if (yVar.readBit() && yVar.readBit()) {
            a(yVar);
        }
        yVar.skipBits(2);
        if (yVar.readBit()) {
            yVar.skipBits(8);
            yVar.readUnsignedExpGolombCodedInt();
            yVar.readUnsignedExpGolombCodedInt();
            yVar.skipBit();
        }
        b(yVar);
        if (yVar.readBit()) {
            for (int i21 = 0; i21 < yVar.readUnsignedExpGolombCodedInt(); i21++) {
                yVar.skipBits(unsignedExpGolombCodedInt8 + 5);
            }
        }
        yVar.skipBits(2);
        float f10 = 1.0f;
        if (yVar.readBit()) {
            if (yVar.readBit()) {
                int bits5 = yVar.readBits(8);
                if (bits5 == 255) {
                    int bits6 = yVar.readBits(16);
                    int bits7 = yVar.readBits(16);
                    if (bits6 != 0 && bits7 != 0) {
                        f10 = bits6 / bits7;
                    }
                } else {
                    float[] fArr = io.odeeo.internal.q0.u.f65927b;
                    if (bits5 < fArr.length) {
                        f10 = fArr[bits5];
                    } else {
                        e3.g.z(bits5, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                    }
                }
            }
            if (yVar.readBit()) {
                yVar.skipBit();
            }
            if (yVar.readBit()) {
                yVar.skipBits(4);
                if (yVar.readBit()) {
                    yVar.skipBits(24);
                }
            }
            if (yVar.readBit()) {
                yVar.readUnsignedExpGolombCodedInt();
                yVar.readUnsignedExpGolombCodedInt();
            }
            yVar.skipBit();
            if (yVar.readBit()) {
                unsignedExpGolombCodedInt3 *= 2;
            }
        }
        return new t.b().setId(str).setSampleMimeType("video/hevc").setCodecs(io.odeeo.internal.q0.e.buildHevcCodecString(i10, bit, bits3, i14, iArr, bits4)).setWidth(unsignedExpGolombCodedInt2).setHeight(unsignedExpGolombCodedInt3).setPixelWidthHeightRatio(f10).setInitializationData(Collections.singletonList(bArr)).build();
    }

    public static void a(io.odeeo.internal.q0.y yVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!yVar.readBit()) {
                    yVar.readUnsignedExpGolombCodedInt();
                } else {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        yVar.readSignedExpGolombCodedInt();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        yVar.readSignedExpGolombCodedInt();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    public final void a() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65459c);
        g0.castNonNull(this.f65460d);
    }
}
