package rp;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Arrays;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f84778a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84779b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84780c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84781d;

    /* renamed from: h, reason: collision with root package name */
    public long f84785h;

    /* renamed from: j, reason: collision with root package name */
    public String f84787j;

    /* renamed from: k, reason: collision with root package name */
    public e1 f84788k;

    /* renamed from: l, reason: collision with root package name */
    public a f84789l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f84790m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f84792o;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f84786i = new boolean[3];

    /* renamed from: e, reason: collision with root package name */
    public final w f84782e = new w(7, 128);

    /* renamed from: f, reason: collision with root package name */
    public final w f84783f = new w(8, 128);

    /* renamed from: g, reason: collision with root package name */
    public final w f84784g = new w(6, 128);

    /* renamed from: n, reason: collision with root package name */
    public long f84791n = C.TIME_UNSET;

    /* renamed from: p, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84793p = new io.bidmachine.media3.common.util.m0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final e1 f84794a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f84795b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f84796c;

        /* renamed from: f, reason: collision with root package name */
        public final jn.a0 f84799f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f84800g;

        /* renamed from: h, reason: collision with root package name */
        public int f84801h;

        /* renamed from: i, reason: collision with root package name */
        public int f84802i;

        /* renamed from: j, reason: collision with root package name */
        public long f84803j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f84804k;

        /* renamed from: l, reason: collision with root package name */
        public long f84805l;

        /* renamed from: o, reason: collision with root package name */
        public boolean f84808o;

        /* renamed from: p, reason: collision with root package name */
        public long f84809p;

        /* renamed from: q, reason: collision with root package name */
        public long f84810q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f84811r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f84812s;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f84797d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f84798e = new SparseArray();

        /* renamed from: m, reason: collision with root package name */
        public m f84806m = new m();

        /* renamed from: n, reason: collision with root package name */
        public m f84807n = new m();

        public a(e1 e1Var, boolean z10, boolean z11) {
            this.f84794a = e1Var;
            this.f84795b = z10;
            this.f84796c = z11;
            byte[] bArr = new byte[128];
            this.f84800g = bArr;
            this.f84799f = new jn.a0(bArr, 0, 0);
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
            if (this.f84804k) {
                int i14 = i11 - i10;
                byte[] bArr2 = this.f84800g;
                int length = bArr2.length;
                int i15 = this.f84801h + i14;
                if (length < i15) {
                    this.f84800g = Arrays.copyOf(bArr2, i15 * 2);
                }
                System.arraycopy(bArr, i10, this.f84800g, this.f84801h, i14);
                int i16 = this.f84801h + i14;
                this.f84801h = i16;
                byte[] bArr3 = this.f84800g;
                jn.a0 a0Var = this.f84799f;
                a0Var.reset(bArr3, 0, i16);
                if (a0Var.canReadBits(8)) {
                    a0Var.skipBit();
                    int bits = a0Var.readBits(2);
                    a0Var.skipBits(5);
                    if (a0Var.canReadExpGolombCodedNum()) {
                        a0Var.readUnsignedExpGolombCodedInt();
                        if (a0Var.canReadExpGolombCodedNum()) {
                            int unsignedExpGolombCodedInt2 = a0Var.readUnsignedExpGolombCodedInt();
                            if (!this.f84796c) {
                                this.f84804k = false;
                                this.f84807n.setSliceType(unsignedExpGolombCodedInt2);
                                return;
                            }
                            if (a0Var.canReadExpGolombCodedNum()) {
                                int unsignedExpGolombCodedInt3 = a0Var.readUnsignedExpGolombCodedInt();
                                SparseArray sparseArray = this.f84798e;
                                if (sparseArray.indexOfKey(unsignedExpGolombCodedInt3) < 0) {
                                    this.f84804k = false;
                                    return;
                                }
                                jn.s sVar = (jn.s) sparseArray.get(unsignedExpGolombCodedInt3);
                                int i17 = sVar.f69778b;
                                boolean z12 = sVar.f69779c;
                                jn.t tVar = (jn.t) this.f84797d.get(i17);
                                boolean z13 = tVar.f69789j;
                                int i18 = tVar.f69793n;
                                int i19 = tVar.f69791l;
                                if (z13) {
                                    if (!a0Var.canReadBits(2)) {
                                        return;
                                    } else {
                                        a0Var.skipBits(2);
                                    }
                                }
                                if (a0Var.canReadBits(i19)) {
                                    int bits2 = a0Var.readBits(i19);
                                    if (tVar.f69790k) {
                                        z10 = false;
                                        z11 = false;
                                        bit = false;
                                    } else {
                                        if (!a0Var.canReadBits(1)) {
                                            return;
                                        }
                                        boolean bit2 = a0Var.readBit();
                                        if (!bit2) {
                                            z11 = false;
                                            bit = false;
                                        } else {
                                            if (!a0Var.canReadBits(1)) {
                                                return;
                                            }
                                            z11 = true;
                                            bit = a0Var.readBit();
                                        }
                                        z10 = bit2;
                                    }
                                    boolean z14 = this.f84802i == 5;
                                    if (!z14) {
                                        unsignedExpGolombCodedInt = 0;
                                    } else if (!a0Var.canReadExpGolombCodedNum()) {
                                        return;
                                    } else {
                                        unsignedExpGolombCodedInt = a0Var.readUnsignedExpGolombCodedInt();
                                    }
                                    int i20 = tVar.f69792m;
                                    if (i20 == 0) {
                                        if (!a0Var.canReadBits(i18)) {
                                            return;
                                        }
                                        int bits3 = a0Var.readBits(i18);
                                        if (z12 && !z10) {
                                            if (a0Var.canReadExpGolombCodedNum()) {
                                                i12 = bits3;
                                                signedExpGolombCodedInt = a0Var.readSignedExpGolombCodedInt();
                                                i13 = 0;
                                                signedExpGolombCodedInt2 = i13;
                                                this.f84807n.setAll(tVar, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z10, z11, bit, z14, unsignedExpGolombCodedInt, i12, signedExpGolombCodedInt, i13, signedExpGolombCodedInt2);
                                                this.f84804k = false;
                                            }
                                            return;
                                        }
                                        i12 = bits3;
                                        signedExpGolombCodedInt = 0;
                                    } else {
                                        if (i20 == 1 && !tVar.f69794o) {
                                            if (a0Var.canReadExpGolombCodedNum()) {
                                                int signedExpGolombCodedInt3 = a0Var.readSignedExpGolombCodedInt();
                                                if (!z12 || z10) {
                                                    i13 = signedExpGolombCodedInt3;
                                                    i12 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                    signedExpGolombCodedInt2 = 0;
                                                } else {
                                                    if (!a0Var.canReadExpGolombCodedNum()) {
                                                        return;
                                                    }
                                                    i13 = signedExpGolombCodedInt3;
                                                    signedExpGolombCodedInt2 = a0Var.readSignedExpGolombCodedInt();
                                                    i12 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                }
                                                this.f84807n.setAll(tVar, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z10, z11, bit, z14, unsignedExpGolombCodedInt, i12, signedExpGolombCodedInt, i13, signedExpGolombCodedInt2);
                                                this.f84804k = false;
                                            }
                                            return;
                                        }
                                        i12 = 0;
                                        signedExpGolombCodedInt = 0;
                                    }
                                    i13 = signedExpGolombCodedInt;
                                    signedExpGolombCodedInt2 = i13;
                                    this.f84807n.setAll(tVar, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z10, z11, bit, z14, unsignedExpGolombCodedInt, i12, signedExpGolombCodedInt, i13, signedExpGolombCodedInt2);
                                    this.f84804k = false;
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
        public boolean endNalUnit(long r12, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rp.n.a.endNalUnit(long, int, boolean):boolean");
        }

        public boolean needsSpsPps() {
            return this.f84796c;
        }

        public void putPps(jn.s sVar) {
            this.f84798e.append(sVar.f69777a, sVar);
        }

        public void putSps(jn.t tVar) {
            this.f84797d.append(tVar.f69783d, tVar);
        }

        public void reset() {
            this.f84804k = false;
            this.f84808o = false;
            this.f84807n.clear();
        }

        public void startNalUnit(long j10, int i10, long j11, boolean z10) {
            this.f84802i = i10;
            this.f84805l = j11;
            this.f84803j = j10;
            this.f84812s = z10;
            if (!this.f84795b || i10 != 1) {
                if (!this.f84796c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            m mVar = this.f84806m;
            this.f84806m = this.f84807n;
            this.f84807n = mVar;
            mVar.clear();
            this.f84801h = 0;
            this.f84804k = true;
        }
    }

    public n(f0 f0Var, boolean z10, boolean z11, String str) {
        this.f84778a = f0Var;
        this.f84779b = z10;
        this.f84780c = z11;
        this.f84781d = str;
    }

    public final void a(long j10, int i10, int i11, long j11) {
        boolean z10 = this.f84790m;
        f0 f0Var = this.f84778a;
        if (!z10 || this.f84789l.needsSpsPps()) {
            w wVar = this.f84782e;
            wVar.endNalUnit(i11);
            w wVar2 = this.f84783f;
            wVar2.endNalUnit(i11);
            if (this.f84790m) {
                if (wVar.isCompleted()) {
                    jn.t spsNalUnit = jn.u.parseSpsNalUnit(wVar.f84920d, 3, wVar.f84921e);
                    f0Var.setReorderingQueueSize(spsNalUnit.f69798s);
                    this.f84789l.putSps(spsNalUnit);
                    wVar.reset();
                } else if (wVar2.isCompleted()) {
                    this.f84789l.putPps(jn.u.parsePpsNalUnit(wVar2.f84920d, 3, wVar2.f84921e));
                    wVar2.reset();
                }
            } else if (wVar.isCompleted() && wVar2.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(wVar.f84920d, wVar.f84921e));
                arrayList.add(Arrays.copyOf(wVar2.f84920d, wVar2.f84921e));
                jn.t spsNalUnit2 = jn.u.parseSpsNalUnit(wVar.f84920d, 3, wVar.f84921e);
                jn.s ppsNalUnit = jn.u.parsePpsNalUnit(wVar2.f84920d, 3, wVar2.f84921e);
                int i12 = spsNalUnit2.f69780a;
                int i13 = spsNalUnit2.f69798s;
                this.f84788k.format(new gn.w().setId(this.f84787j).setContainerMimeType(this.f84781d).setSampleMimeType("video/avc").setCodecs(io.bidmachine.media3.common.util.h.buildAvcCodecString(i12, spsNalUnit2.f69781b, spsNalUnit2.f69782c)).setWidth(spsNalUnit2.f69784e).setHeight(spsNalUnit2.f69785f).setColorInfo(new gn.m().setColorSpace(spsNalUnit2.f69795p).setColorRange(spsNalUnit2.f69796q).setColorTransfer(spsNalUnit2.f69797r).setLumaBitdepth(spsNalUnit2.f69787h + 8).setChromaBitdepth(spsNalUnit2.f69788i + 8).build()).setPixelWidthHeightRatio(spsNalUnit2.f69786g).setInitializationData(arrayList).setMaxNumReorderSamples(i13).build());
                this.f84790m = true;
                f0Var.setReorderingQueueSize(i13);
                this.f84789l.putSps(spsNalUnit2);
                this.f84789l.putPps(ppsNalUnit);
                wVar.reset();
                wVar2.reset();
            }
        }
        w wVar3 = this.f84784g;
        if (wVar3.endNalUnit(i11)) {
            int iUnescapeStream = jn.u.unescapeStream(wVar3.f84920d, wVar3.f84921e);
            byte[] bArr = wVar3.f84920d;
            io.bidmachine.media3.common.util.m0 m0Var = this.f84793p;
            m0Var.reset(bArr, iUnescapeStream);
            m0Var.setPosition(4);
            f0Var.consume(j11, m0Var);
        }
        if (this.f84789l.endNalUnit(j10, i10, this.f84790m)) {
            this.f84792o = false;
        }
    }

    public final void b(byte[] bArr, int i10, int i11) {
        if (!this.f84790m || this.f84789l.needsSpsPps()) {
            this.f84782e.appendToNalUnit(bArr, i10, i11);
            this.f84783f.appendToNalUnit(bArr, i10, i11);
        }
        this.f84784g.appendToNalUnit(bArr, i10, i11);
        this.f84789l.appendToNalUnit(bArr, i10, i11);
    }

    public final void c(long j10, int i10, long j11) {
        if (!this.f84790m || this.f84789l.needsSpsPps()) {
            this.f84782e.startNalUnit(i10);
            this.f84783f.startNalUnit(i10);
        }
        this.f84784g.startNalUnit(i10);
        this.f84789l.startNalUnit(j10, i10, j11, this.f84792o);
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) {
        int i10;
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84788k);
        a1.castNonNull(this.f84789l);
        int position = m0Var.getPosition();
        int iLimit = m0Var.limit();
        byte[] data = m0Var.getData();
        this.f84785h += m0Var.bytesLeft();
        this.f84788k.sampleData(m0Var, m0Var.bytesLeft());
        while (true) {
            int iFindNalUnit = jn.u.findNalUnit(data, position, iLimit, this.f84786i);
            if (iFindNalUnit == iLimit) {
                b(data, position, iLimit);
                return;
            }
            int nalUnitType = jn.u.getNalUnitType(data, iFindNalUnit);
            if (iFindNalUnit <= 0 || data[iFindNalUnit - 1] != 0) {
                i10 = 3;
            } else {
                iFindNalUnit--;
                i10 = 4;
            }
            int i11 = iFindNalUnit;
            int i12 = i10;
            int i13 = i11 - position;
            if (i13 > 0) {
                b(data, position, i11);
            }
            int i14 = iLimit - i11;
            long j10 = this.f84785h - i14;
            a(j10, i14, i13 < 0 ? -i13 : 0, this.f84791n);
            c(j10, nalUnitType, this.f84791n);
            position = i11 + i12;
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84787j = m0Var.getFormatId();
        e1 e1VarTrack = c0Var.track(m0Var.getTrackId(), 2);
        this.f84788k = e1VarTrack;
        this.f84789l = new a(e1VarTrack, this.f84779b, this.f84780c);
        this.f84778a.createTracks(c0Var, m0Var);
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84788k);
        a1.castNonNull(this.f84789l);
        if (z10) {
            this.f84778a.flush();
            a(this.f84785h, 0, 0, this.f84791n);
            c(this.f84785h, 9, this.f84791n);
            a(this.f84785h, 0, 0, this.f84791n);
        }
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84791n = j10;
        this.f84792o |= (i10 & 2) != 0;
    }

    @Override // rp.j
    public void seek() {
        this.f84785h = 0L;
        this.f84792o = false;
        this.f84791n = C.TIME_UNSET;
        jn.u.clearPrefixFlags(this.f84786i);
        this.f84782e.reset();
        this.f84783f.reset();
        this.f84784g.reset();
        this.f84778a.clear();
        a aVar = this.f84789l;
        if (aVar != null) {
            aVar.reset();
        }
    }
}
