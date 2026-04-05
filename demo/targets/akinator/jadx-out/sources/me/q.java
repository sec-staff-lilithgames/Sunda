package me;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ee.c0;
import ee.f0;
import ee.g0;
import ee.h0;
import ee.i0;
import ee.l0;
import ee.m0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import me.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements ee.p, i0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f74433y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f74434a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f74435b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f74436c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f74437d;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f74438e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f74439f;

    /* renamed from: g, reason: collision with root package name */
    public final t f74440g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f74441h;

    /* renamed from: i, reason: collision with root package name */
    public int f74442i;

    /* renamed from: j, reason: collision with root package name */
    public int f74443j;

    /* renamed from: k, reason: collision with root package name */
    public long f74444k;

    /* renamed from: l, reason: collision with root package name */
    public int f74445l;

    /* renamed from: m, reason: collision with root package name */
    public v0 f74446m;

    /* renamed from: n, reason: collision with root package name */
    public int f74447n;

    /* renamed from: o, reason: collision with root package name */
    public int f74448o;

    /* renamed from: p, reason: collision with root package name */
    public int f74449p;

    /* renamed from: q, reason: collision with root package name */
    public int f74450q;

    /* renamed from: r, reason: collision with root package name */
    public ee.s f74451r;

    /* renamed from: s, reason: collision with root package name */
    public a[] f74452s;

    /* renamed from: t, reason: collision with root package name */
    public long[][] f74453t;

    /* renamed from: u, reason: collision with root package name */
    public int f74454u;

    /* renamed from: v, reason: collision with root package name */
    public long f74455v;

    /* renamed from: w, reason: collision with root package name */
    public int f74456w;

    /* renamed from: x, reason: collision with root package name */
    public MotionPhotoMetadata f74457x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final v f74458a;

        /* renamed from: b, reason: collision with root package name */
        public final y f74459b;

        /* renamed from: c, reason: collision with root package name */
        public final l0 f74460c;

        /* renamed from: d, reason: collision with root package name */
        public final m0 f74461d;

        /* renamed from: e, reason: collision with root package name */
        public int f74462e;

        public a(v vVar, y yVar, l0 l0Var) {
            this.f74458a = vVar;
            this.f74459b = yVar;
            this.f74460c = l0Var;
            this.f74461d = MimeTypes.AUDIO_TRUEHD.equals(vVar.f74479f.f28802n) ? new m0() : null;
        }
    }

    public q() {
        this(0);
    }

    public final void a(long j10) throws h2 {
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        Metadata metadata4;
        boolean z10;
        long j11;
        List<y> list;
        ArrayDeque arrayDeque;
        ArrayList arrayList;
        Metadata metadata5;
        long j12;
        int i10;
        Metadata metadata6;
        Metadata metadata7;
        Metadata metadata8;
        ArrayList arrayList2;
        int i11;
        while (true) {
            ArrayDeque arrayDeque2 = this.f74439f;
            if (arrayDeque2.isEmpty() || ((a.C0748a) arrayDeque2.peek()).f74343b != j10) {
                break;
            }
            a.C0748a c0748a = (a.C0748a) arrayDeque2.pop();
            if (c0748a.f74342a == 1836019574) {
                ArrayList arrayList3 = new ArrayList();
                boolean z11 = this.f74456w == 1;
                c0 c0Var = new c0();
                a.b leafAtomOfType = c0748a.getLeafAtomOfType(1969517665);
                if (leafAtomOfType != null) {
                    j udta = k.parseUdta(leafAtomOfType);
                    metadata = udta.f74377a;
                    metadata2 = udta.f74378b;
                    Metadata metadata9 = udta.f74379c;
                    if (metadata != null) {
                        c0Var.setFromMetadata(metadata);
                    }
                    metadata3 = metadata9;
                } else {
                    metadata = null;
                    metadata2 = null;
                    metadata3 = null;
                }
                a.C0748a containerAtomOfType = c0748a.getContainerAtomOfType(1835365473);
                Metadata mdtaFromMeta = containerAtomOfType != null ? k.parseMdtaFromMeta(containerAtomOfType) : null;
                Metadata metadata10 = k.parseMvhd(((a.b) com.google.android.exoplayer2.util.a.checkNotNull(c0748a.getLeafAtomOfType(1836476516))).f74346b).f74360a;
                if ((this.f74434a & 1) != 0) {
                    metadata4 = metadata10;
                    z10 = true;
                } else {
                    metadata4 = metadata10;
                    z10 = false;
                }
                Metadata metadata11 = metadata;
                Metadata metadata12 = metadata2;
                Metadata metadata13 = metadata4;
                Metadata metadata14 = mdtaFromMeta;
                List<y> traks = k.parseTraks(c0748a, c0Var, C.TIME_UNSET, null, z10, z11, new in.c(6));
                int size = traks.size();
                long jMax = C.TIME_UNSET;
                int i12 = 0;
                int size2 = -1;
                while (true) {
                    j11 = 0;
                    if (i12 >= size) {
                        break;
                    }
                    y yVar = traks.get(i12);
                    int i13 = yVar.f74508b;
                    int i14 = yVar.f74511e;
                    if (i13 == 0) {
                        arrayDeque = arrayDeque2;
                        metadata8 = metadata11;
                        list = traks;
                        i10 = size;
                        metadata7 = metadata14;
                        arrayList2 = arrayList3;
                        metadata6 = metadata13;
                    } else {
                        v vVar = yVar.f74507a;
                        list = traks;
                        long j13 = vVar.f74478e;
                        arrayDeque = arrayDeque2;
                        z0 z0Var = vVar.f74479f;
                        int i15 = vVar.f74475b;
                        if (j13 != C.TIME_UNSET) {
                            arrayList = arrayList3;
                            metadata5 = metadata11;
                            j12 = j13;
                        } else {
                            arrayList = arrayList3;
                            metadata5 = metadata11;
                            j12 = yVar.f74514h;
                        }
                        jMax = Math.max(jMax, j12);
                        ArrayList arrayList4 = arrayList;
                        i10 = size;
                        a aVar = new a(vVar, yVar, this.f74451r.track(i12, i15));
                        int i16 = MimeTypes.AUDIO_TRUEHD.equals(z0Var.f28802n) ? i14 * 16 : i14 + 30;
                        y0 y0VarBuildUpon = z0Var.buildUpon();
                        y0VarBuildUpon.setMaxInputSize(i16);
                        if (i15 == 2 && j12 > 0 && (i11 = yVar.f74508b) > 1) {
                            y0VarBuildUpon.setFrameRate(i11 / (j12 / 1000000.0f));
                        }
                        p.setFormatGaplessInfo(i15, c0Var, y0VarBuildUpon);
                        ArrayList arrayList5 = this.f74441h;
                        Metadata metadata15 = arrayList5.isEmpty() ? null : new Metadata(arrayList5);
                        metadata6 = metadata13;
                        metadata7 = metadata14;
                        metadata8 = metadata5;
                        p.setFormatMetadata(i15, metadata8, metadata7, y0VarBuildUpon, metadata12, metadata15, metadata3, metadata6);
                        aVar.f74460c.format(y0VarBuildUpon.build());
                        if (i15 == 2 && size2 == -1) {
                            size2 = arrayList4.size();
                        }
                        arrayList2 = arrayList4;
                        arrayList2.add(aVar);
                    }
                    i12++;
                    metadata13 = metadata6;
                    arrayList3 = arrayList2;
                    metadata14 = metadata7;
                    metadata11 = metadata8;
                    traks = list;
                    arrayDeque2 = arrayDeque;
                    size = i10;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                this.f74454u = size2;
                this.f74455v = jMax;
                a[] aVarArr = (a[]) arrayList3.toArray(new a[0]);
                this.f74452s = aVarArr;
                long[][] jArr = new long[aVarArr.length][];
                int[] iArr = new int[aVarArr.length];
                long[] jArr2 = new long[aVarArr.length];
                boolean[] zArr = new boolean[aVarArr.length];
                for (int i17 = 0; i17 < aVarArr.length; i17++) {
                    jArr[i17] = new long[aVarArr[i17].f74459b.f74508b];
                    jArr2[i17] = aVarArr[i17].f74459b.f74512f[0];
                }
                int i18 = 0;
                while (i18 < aVarArr.length) {
                    int i19 = -1;
                    long j14 = Long.MAX_VALUE;
                    for (int i20 = 0; i20 < aVarArr.length; i20++) {
                        if (!zArr[i20]) {
                            long j15 = jArr2[i20];
                            if (j15 <= j14) {
                                i19 = i20;
                                j14 = j15;
                            }
                        }
                    }
                    int i21 = iArr[i19];
                    long[] jArr3 = jArr[i19];
                    jArr3[i21] = j11;
                    y yVar2 = aVarArr[i19].f74459b;
                    j11 += yVar2.f74510d[i21];
                    int i22 = i21 + 1;
                    iArr[i19] = i22;
                    if (i22 < jArr3.length) {
                        jArr2[i19] = yVar2.f74512f[i22];
                    } else {
                        zArr[i19] = true;
                        i18++;
                    }
                }
                this.f74453t = jArr;
                this.f74451r.endTracks();
                this.f74451r.seekMap(this);
                arrayDeque3.clear();
                this.f74442i = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((a.C0748a) arrayDeque2.peek()).add(c0748a);
            }
        }
        if (this.f74442i != 2) {
            this.f74442i = 0;
            this.f74445l = 0;
        }
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f74455v;
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        return getSeekPoints(j10, -1);
    }

    @Override // ee.p
    public void init(ee.s sVar) {
        this.f74451r = sVar;
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return true;
    }

    @Override // ee.p
    public int read(ee.q qVar, f0 f0Var) throws IOException {
        long j10;
        char c10;
        boolean z10;
        a.C0748a c0748a;
        while (true) {
            int i10 = this.f74442i;
            ArrayDeque arrayDeque = this.f74439f;
            v0 v0Var = this.f74437d;
            char c11 = 2;
            if (i10 == 0) {
                int i11 = this.f74445l;
                v0 v0Var2 = this.f74438e;
                if (i11 == 0) {
                    if (!qVar.readFully(v0Var2.getData(), 0, 8, true)) {
                        if (this.f74456w != 2 || (this.f74434a & 2) == 0) {
                            return -1;
                        }
                        l0 l0VarTrack = this.f74451r.track(0, 4);
                        MotionPhotoMetadata motionPhotoMetadata = this.f74457x;
                        l0VarTrack.format(new y0().setMetadata(motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata)).build());
                        this.f74451r.endTracks();
                        this.f74451r.seekMap(new h0(C.TIME_UNSET));
                        return -1;
                    }
                    this.f74445l = 8;
                    v0Var2.setPosition(0);
                    this.f74444k = v0Var2.readUnsignedInt();
                    this.f74443j = v0Var2.readInt();
                }
                long j11 = this.f74444k;
                if (j11 == 1) {
                    qVar.readFully(v0Var2.getData(), 8, 8);
                    this.f74445l += 8;
                    this.f74444k = v0Var2.readUnsignedLongToLong();
                } else if (j11 == 0) {
                    long length = qVar.getLength();
                    if (length == -1 && (c0748a = (a.C0748a) arrayDeque.peek()) != null) {
                        length = c0748a.f74343b;
                    }
                    if (length != -1) {
                        this.f74444k = (length - qVar.getPosition()) + this.f74445l;
                    }
                }
                long j12 = this.f74444k;
                int i12 = this.f74445l;
                if (j12 < i12) {
                    throw h2.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                }
                int i13 = this.f74443j;
                if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473) {
                    long position = qVar.getPosition();
                    long j13 = this.f74444k;
                    long j14 = this.f74445l;
                    long j15 = (position + j13) - j14;
                    if (j13 != j14 && this.f74443j == 1835365473) {
                        v0Var.reset(8);
                        qVar.peekFully(v0Var.getData(), 0, 8);
                        k.maybeSkipRemainingMetaAtomHeaderBytes(v0Var);
                        qVar.skipFully(v0Var.getPosition());
                        qVar.resetPeekPosition();
                    }
                    arrayDeque.push(new a.C0748a(this.f74443j, j15));
                    if (this.f74444k == this.f74445l) {
                        a(j15);
                    } else {
                        this.f74442i = 0;
                        this.f74445l = 0;
                    }
                } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                    com.google.android.exoplayer2.util.a.checkState(i12 == 8);
                    com.google.android.exoplayer2.util.a.checkState(this.f74444k <= 2147483647L);
                    v0 v0Var3 = new v0((int) this.f74444k);
                    System.arraycopy(v0Var2.getData(), 0, v0Var3.getData(), 0, 8);
                    this.f74446m = v0Var3;
                    this.f74442i = 1;
                } else {
                    long position2 = qVar.getPosition();
                    long j16 = this.f74445l;
                    long j17 = position2 - j16;
                    if (this.f74443j == 1836086884) {
                        this.f74457x = new MotionPhotoMetadata(0L, j17, C.TIME_UNSET, j17 + j16, this.f74444k - j16);
                    }
                    this.f74446m = null;
                    this.f74442i = 1;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int i14 = this.f74440g.read(qVar, f0Var, this.f74441h);
                        if (i14 == 1 && f0Var.f54188a == 0) {
                            this.f74442i = 0;
                            this.f74445l = 0;
                        }
                        return i14;
                    }
                    long position3 = qVar.getPosition();
                    if (this.f74447n == -1) {
                        int i15 = -1;
                        int i16 = -1;
                        int i17 = 0;
                        j10 = 0;
                        boolean z11 = true;
                        boolean z12 = true;
                        long j18 = Long.MAX_VALUE;
                        long j19 = Long.MAX_VALUE;
                        long j20 = Long.MAX_VALUE;
                        while (true) {
                            a[] aVarArr = this.f74452s;
                            c10 = c11;
                            if (i17 >= aVarArr.length) {
                                break;
                            }
                            a aVar = aVarArr[i17];
                            int i18 = aVar.f74462e;
                            y yVar = aVar.f74459b;
                            if (i18 != yVar.f74508b) {
                                long j21 = yVar.f74509c[i18];
                                long j22 = ((long[][]) n1.castNonNull(this.f74453t))[i17][i18];
                                long j23 = j21 - position3;
                                boolean z13 = j23 < 0 || j23 >= 262144;
                                if ((!z13 && z12) || (z13 == z12 && j23 < j20)) {
                                    i16 = i17;
                                    z12 = z13;
                                    j19 = j22;
                                    j20 = j23;
                                }
                                if (j22 < j18) {
                                    i15 = i17;
                                    z11 = z13;
                                    j18 = j22;
                                }
                            }
                            i17++;
                            c11 = c10;
                        }
                        int i19 = (j18 == Long.MAX_VALUE || !z11 || j19 < j18 + 10485760) ? i16 : i15;
                        this.f74447n = i19;
                        if (i19 == -1) {
                            return -1;
                        }
                    } else {
                        j10 = 0;
                        c10 = 2;
                    }
                    a aVar2 = this.f74452s[this.f74447n];
                    l0 l0Var = aVar2.f74460c;
                    v vVar = aVar2.f74458a;
                    y yVar2 = aVar2.f74459b;
                    int i20 = aVar2.f74462e;
                    int i21 = 0;
                    long j24 = yVar2.f74509c[i20];
                    int i22 = yVar2.f74510d[i20];
                    m0 m0Var = aVar2.f74461d;
                    long j25 = (j24 - position3) + this.f74448o;
                    if (j25 < j10 || j25 >= 262144) {
                        f0Var.f54188a = j24;
                        return 1;
                    }
                    int i23 = vVar.f74480g;
                    int i24 = vVar.f74483j;
                    if (i23 == 1) {
                        j25 += 8;
                        i22 -= 8;
                    }
                    qVar.skipFully((int) j25);
                    if (i24 == 0) {
                        if ("audio/ac4".equals(vVar.f74479f.f28802n)) {
                            if (this.f74449p == 0) {
                                com.google.android.exoplayer2.audio.f.getAc4SampleHeader(i22, v0Var);
                                l0Var.sampleData(v0Var, 7);
                                this.f74449p += 7;
                            }
                            i22 += 7;
                        } else if (m0Var != null) {
                            m0Var.startSample(qVar);
                        }
                        while (true) {
                            int i25 = this.f74449p;
                            if (i25 >= i22) {
                                break;
                            }
                            int iSampleData = l0Var.sampleData((qf.k) qVar, i22 - i25, false);
                            this.f74448o += iSampleData;
                            this.f74449p += iSampleData;
                            this.f74450q -= iSampleData;
                        }
                    } else {
                        v0 v0Var4 = this.f74436c;
                        byte[] data = v0Var4.getData();
                        data[0] = 0;
                        data[1] = 0;
                        data[c10] = 0;
                        int i26 = 4 - i24;
                        while (this.f74449p < i22) {
                            int i27 = this.f74450q;
                            if (i27 == 0) {
                                qVar.readFully(data, i26, i24);
                                this.f74448o += i24;
                                int i28 = i21;
                                v0Var4.setPosition(i28);
                                int i29 = v0Var4.readInt();
                                if (i29 < 0) {
                                    throw h2.createForMalformedContainer("Invalid NAL length", null);
                                }
                                this.f74450q = i29;
                                v0 v0Var5 = this.f74435b;
                                v0Var5.setPosition(i28);
                                l0Var.sampleData(v0Var5, 4);
                                this.f74449p += 4;
                                i22 += i26;
                                i21 = i28;
                            } else {
                                int iSampleData2 = l0Var.sampleData((qf.k) qVar, i27, (boolean) i21);
                                this.f74448o += iSampleData2;
                                this.f74449p += iSampleData2;
                                this.f74450q -= iSampleData2;
                                i21 = 0;
                            }
                        }
                    }
                    int i30 = i22;
                    long j26 = yVar2.f74512f[i20];
                    int i31 = yVar2.f74513g[i20];
                    if (m0Var != null) {
                        m0Var.sampleMetadata(l0Var, j26, i31, i30, 0, null);
                        if (i20 + 1 == yVar2.f74508b) {
                            m0Var.outputPendingSampleMetadata(l0Var, null);
                        }
                    } else {
                        l0Var.sampleMetadata(j26, i31, i30, 0, null);
                    }
                    aVar2.f74462e++;
                    this.f74447n = -1;
                    this.f74448o = 0;
                    this.f74449p = 0;
                    this.f74450q = 0;
                    return 0;
                }
                long j27 = this.f74444k - this.f74445l;
                long position4 = qVar.getPosition() + j27;
                v0 v0Var6 = this.f74446m;
                if (v0Var6 != null) {
                    qVar.readFully(v0Var6.getData(), this.f74445l, (int) j27);
                    if (this.f74443j == 1718909296) {
                        v0Var6.setPosition(8);
                        int i32 = v0Var6.readInt();
                        int i33 = i32 != 1751476579 ? i32 != 1903435808 ? 0 : 1 : 2;
                        if (i33 == 0) {
                            v0Var6.skipBytes(4);
                            while (true) {
                                if (v0Var6.bytesLeft() <= 0) {
                                    i33 = 0;
                                    break;
                                }
                                int i34 = v0Var6.readInt();
                                i33 = i34 != 1751476579 ? i34 != 1903435808 ? 0 : 1 : 2;
                                if (i33 != 0) {
                                    break;
                                }
                            }
                        }
                        this.f74456w = i33;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a.C0748a) arrayDeque.peek()).add(new a.b(this.f74443j, v0Var6));
                    }
                } else if (j27 < 262144) {
                    qVar.skipFully((int) j27);
                } else {
                    f0Var.f54188a = qVar.getPosition() + j27;
                    z10 = true;
                    a(position4);
                    if (z10 && this.f74442i != 2) {
                        return 1;
                    }
                }
                z10 = false;
                a(position4);
                if (z10) {
                    continue;
                }
            }
        }
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        this.f74439f.clear();
        this.f74445l = 0;
        this.f74447n = -1;
        this.f74448o = 0;
        this.f74449p = 0;
        this.f74450q = 0;
        if (j10 == 0) {
            if (this.f74442i != 3) {
                this.f74442i = 0;
                this.f74445l = 0;
                return;
            } else {
                this.f74440g.reset();
                this.f74441h.clear();
                return;
            }
        }
        for (a aVar : this.f74452s) {
            y yVar = aVar.f74459b;
            int indexOfEarlierOrEqualSynchronizationSample = yVar.getIndexOfEarlierOrEqualSynchronizationSample(j11);
            if (indexOfEarlierOrEqualSynchronizationSample == -1) {
                indexOfEarlierOrEqualSynchronizationSample = yVar.getIndexOfLaterOrEqualSynchronizationSample(j11);
            }
            aVar.f74462e = indexOfEarlierOrEqualSynchronizationSample;
            m0 m0Var = aVar.f74461d;
            if (m0Var != null) {
                m0Var.reset();
            }
        }
    }

    @Override // ee.p
    public boolean sniff(ee.q qVar) throws IOException {
        return u.sniffUnfragmented(qVar, (this.f74434a & 2) != 0);
    }

    public q(int i10) {
        this.f74434a = i10;
        this.f74442i = (i10 & 4) != 0 ? 3 : 0;
        this.f74440g = new t();
        this.f74441h = new ArrayList();
        this.f74438e = new v0(16);
        this.f74439f = new ArrayDeque();
        this.f74435b = new v0(p0.f28540a);
        this.f74436c = new v0(4);
        this.f74437d = new v0();
        this.f74447n = -1;
        this.f74451r = ee.s.K8;
        this.f74452s = new a[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ee.g0 getSeekPoints(long r20, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            me.q$a[] r4 = r0.f74452s
            int r5 = r4.length
            if (r5 != 0) goto L13
            ee.g0 r1 = new ee.g0
            ee.j0 r2 = ee.j0.f54210c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f74454u
        L1a:
            r9 = -1
            if (r6 == r5) goto L60
            r4 = r4[r6]
            me.y r4 = r4.f74459b
            int r6 = r4.getIndexOfEarlierOrEqualSynchronizationSample(r1)
            if (r6 != r5) goto L2c
            int r6 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
        L2c:
            long[] r11 = r4.f74509c
            long[] r12 = r4.f74512f
            if (r6 != r5) goto L3a
            ee.g0 r1 = new ee.g0
            ee.j0 r2 = ee.j0.f54210c
            r1.<init>(r2)
            return r1
        L3a:
            r13 = r12[r6]
            r15 = r11[r6]
            int r17 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r17 >= 0) goto L5a
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = r4.f74508b
            int r7 = r7 + (-1)
            if (r6 >= r7) goto L6b
            int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
            if (r1 == r5) goto L6b
            if (r1 == r6) goto L6b
            r6 = r12[r1]
            r9 = r11[r1]
            goto L6d
        L5a:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L6b
        L60:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = r1
        L6b:
            r6 = r17
        L6d:
            if (r3 != r5) goto Lb9
            r1 = 0
            r2 = r15
        L71:
            me.q$a[] r4 = r0.f74452s
            int r8 = r4.length
            if (r1 >= r8) goto Lba
            int r8 = r0.f74454u
            if (r1 == r8) goto Lb4
            r4 = r4[r1]
            me.y r4 = r4.f74459b
            int r8 = r4.getIndexOfEarlierOrEqualSynchronizationSample(r13)
            long[] r11 = r4.f74509c
            if (r8 != r5) goto L8a
            int r8 = r4.getIndexOfLaterOrEqualSynchronizationSample(r13)
        L8a:
            if (r8 != r5) goto L8f
            r20 = r6
            goto L97
        L8f:
            r20 = r6
            r5 = r11[r8]
            long r2 = java.lang.Math.min(r5, r2)
        L97:
            int r5 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            r6 = r20
            if (r5 == 0) goto Lb2
            int r5 = r4.getIndexOfEarlierOrEqualSynchronizationSample(r6)
            r12 = -1
            if (r5 != r12) goto La8
            int r5 = r4.getIndexOfLaterOrEqualSynchronizationSample(r6)
        La8:
            if (r5 != r12) goto Lab
            goto Lb5
        Lab:
            r4 = r11[r5]
            long r9 = java.lang.Math.min(r4, r9)
            goto Lb5
        Lb2:
            r12 = -1
            goto Lb5
        Lb4:
            r12 = r5
        Lb5:
            int r1 = r1 + 1
            r5 = r12
            goto L71
        Lb9:
            r2 = r15
        Lba:
            ee.j0 r1 = new ee.j0
            r1.<init>(r13, r2)
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 != 0) goto Lc9
            ee.g0 r2 = new ee.g0
            r2.<init>(r1)
            return r2
        Lc9:
            ee.j0 r2 = new ee.j0
            r2.<init>(r6, r9)
            ee.g0 r3 = new ee.g0
            r3.<init>(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.q.getSeekPoints(long, int):ee.g0");
    }

    @Override // ee.p
    public void release() {
    }
}
