package io.odeeo.internal.n;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cv.BLca.YsiBvdpw;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.g.r;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.w;
import io.odeeo.internal.g.y;
import io.odeeo.internal.n.a;
import io.odeeo.internal.q0.x;
import io.odeeo.internal.s.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements io.odeeo.internal.g.h, v {

    /* renamed from: y, reason: collision with root package name */
    public static final io.odeeo.internal.g.l f64820y = new bt.a(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f64821a;

    /* renamed from: b, reason: collision with root package name */
    public final x f64822b;

    /* renamed from: c, reason: collision with root package name */
    public final x f64823c;

    /* renamed from: d, reason: collision with root package name */
    public final x f64824d;

    /* renamed from: e, reason: collision with root package name */
    public final x f64825e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque<a.C0622a> f64826f;

    /* renamed from: g, reason: collision with root package name */
    public final i f64827g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a.b> f64828h;

    /* renamed from: i, reason: collision with root package name */
    public int f64829i;

    /* renamed from: j, reason: collision with root package name */
    public int f64830j;

    /* renamed from: k, reason: collision with root package name */
    public long f64831k;

    /* renamed from: l, reason: collision with root package name */
    public int f64832l;

    /* renamed from: m, reason: collision with root package name */
    public x f64833m;

    /* renamed from: n, reason: collision with root package name */
    public int f64834n;

    /* renamed from: o, reason: collision with root package name */
    public int f64835o;

    /* renamed from: p, reason: collision with root package name */
    public int f64836p;

    /* renamed from: q, reason: collision with root package name */
    public int f64837q;

    /* renamed from: r, reason: collision with root package name */
    public io.odeeo.internal.g.j f64838r;

    /* renamed from: s, reason: collision with root package name */
    public a[] f64839s;

    /* renamed from: t, reason: collision with root package name */
    public long[][] f64840t;

    /* renamed from: u, reason: collision with root package name */
    public int f64841u;

    /* renamed from: v, reason: collision with root package name */
    public long f64842v;

    /* renamed from: w, reason: collision with root package name */
    public int f64843w;

    /* renamed from: x, reason: collision with root package name */
    public io.odeeo.internal.y.b f64844x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final k f64845a;

        /* renamed from: b, reason: collision with root package name */
        public final n f64846b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.g.x f64847c;

        /* renamed from: d, reason: collision with root package name */
        public final y f64848d;

        /* renamed from: e, reason: collision with root package name */
        public int f64849e;

        public a(k kVar, n nVar, io.odeeo.internal.g.x xVar) {
            this.f64845a = kVar;
            this.f64846b = nVar;
            this.f64847c = xVar;
            this.f64848d = MimeTypes.AUDIO_TRUEHD.equals(kVar.f64867f.f62971l) ? new y() : null;
        }
    }

    public g() {
        this(0);
    }

    public static int a(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static boolean b(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    public static boolean c(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    @Override // io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64842v;
    }

    @Override // io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        long j11;
        long jA;
        long j12;
        long j13;
        int indexOfLaterOrEqualSynchronizationSample;
        if (((a[]) io.odeeo.internal.q0.a.checkNotNull(this.f64839s)).length == 0) {
            return new v.a(w.f64176c);
        }
        int i10 = this.f64841u;
        if (i10 != -1) {
            n nVar = this.f64839s[i10].f64846b;
            int iA = a(nVar, j10);
            if (iA == -1) {
                return new v.a(w.f64176c);
            }
            long j14 = nVar.f64901f[iA];
            j11 = nVar.f64898c[iA];
            if (j14 >= j10 || iA >= nVar.f64897b - 1 || (indexOfLaterOrEqualSynchronizationSample = nVar.getIndexOfLaterOrEqualSynchronizationSample(j10)) == -1 || indexOfLaterOrEqualSynchronizationSample == iA) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = nVar.f64901f[indexOfLaterOrEqualSynchronizationSample];
                j13 = nVar.f64898c[indexOfLaterOrEqualSynchronizationSample];
            }
            jA = j13;
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            jA = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f64839s;
            if (i11 >= aVarArr.length) {
                break;
            }
            if (i11 != this.f64841u) {
                n nVar2 = aVarArr[i11].f64846b;
                long jA2 = a(nVar2, j10, j11);
                if (j12 != C.TIME_UNSET) {
                    jA = a(nVar2, j12, jA);
                }
                j11 = jA2;
            }
            i11++;
        }
        w wVar = new w(j10, j11);
        return j12 == C.TIME_UNSET ? new v.a(wVar) : new v.a(wVar, new w(j12, jA));
    }

    @Override // io.odeeo.internal.g.h
    public void init(io.odeeo.internal.g.j jVar) {
        this.f64838r = jVar;
    }

    @Override // io.odeeo.internal.g.v
    public boolean isSeekable() {
        return true;
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        while (true) {
            int i10 = this.f64829i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return b(iVar, uVar);
                    }
                    if (i10 == 3) {
                        return c(iVar, uVar);
                    }
                    throw new IllegalStateException();
                }
                if (a(iVar, uVar)) {
                    return 1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        this.f64826f.clear();
        this.f64832l = 0;
        this.f64834n = -1;
        this.f64835o = 0;
        this.f64836p = 0;
        this.f64837q = 0;
        if (j10 == 0) {
            if (this.f64829i != 3) {
                a();
                return;
            } else {
                this.f64827g.reset();
                this.f64828h.clear();
                return;
            }
        }
        a[] aVarArr = this.f64839s;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                a(aVar, j11);
                y yVar = aVar.f64848d;
                if (yVar != null) {
                    yVar.reset();
                }
            }
        }
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(io.odeeo.internal.g.i iVar) throws IOException {
        return j.sniffUnfragmented(iVar, (this.f64821a & 2) != 0);
    }

    public g(int i10) {
        this.f64821a = i10;
        this.f64829i = (i10 & 4) != 0 ? 3 : 0;
        this.f64827g = new i();
        this.f64828h = new ArrayList();
        this.f64825e = new x(16);
        this.f64826f = new ArrayDeque<>();
        this.f64822b = new x(io.odeeo.internal.q0.u.f65926a);
        this.f64823c = new x(4);
        this.f64824d = new x();
        this.f64834n = -1;
    }

    public static /* synthetic */ k a(k kVar) {
        return kVar;
    }

    public static /* synthetic */ io.odeeo.internal.g.h[] b() {
        return new io.odeeo.internal.g.h[]{new g()};
    }

    public final int c(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        int i10 = this.f64827g.read(iVar, uVar, this.f64828h);
        if (i10 == 1 && uVar.f64171a == 0) {
            a();
        }
        return i10;
    }

    public final void a() {
        this.f64829i = 0;
        this.f64832l = 0;
    }

    public final boolean b(io.odeeo.internal.g.i iVar) throws IOException {
        a.C0622a c0622aPeek;
        if (this.f64832l == 0) {
            if (!iVar.readFully(this.f64825e.getData(), 0, 8, true)) {
                c();
                return false;
            }
            this.f64832l = 8;
            this.f64825e.setPosition(0);
            this.f64831k = this.f64825e.readUnsignedInt();
            this.f64830j = this.f64825e.readInt();
        }
        long j10 = this.f64831k;
        if (j10 == 1) {
            iVar.readFully(this.f64825e.getData(), 8, 8);
            this.f64832l += 8;
            this.f64831k = this.f64825e.readUnsignedLongToLong();
        } else if (j10 == 0) {
            long length = iVar.getLength();
            if (length == -1 && (c0622aPeek = this.f64826f.peek()) != null) {
                length = c0622aPeek.f64740b;
            }
            if (length != -1) {
                this.f64831k = (length - iVar.getPosition()) + this.f64832l;
            }
        }
        if (this.f64831k >= this.f64832l) {
            if (b(this.f64830j)) {
                long position = iVar.getPosition();
                long j11 = this.f64831k;
                long j12 = this.f64832l;
                long j13 = (position + j11) - j12;
                if (j11 != j12 && this.f64830j == 1835365473) {
                    a(iVar);
                }
                this.f64826f.push(new a.C0622a(this.f64830j, j13));
                if (this.f64831k == this.f64832l) {
                    b(j13);
                } else {
                    a();
                }
            } else if (c(this.f64830j)) {
                io.odeeo.internal.q0.a.checkState(this.f64832l == 8);
                io.odeeo.internal.q0.a.checkState(this.f64831k <= 2147483647L);
                x xVar = new x((int) this.f64831k);
                System.arraycopy(this.f64825e.getData(), 0, xVar.getData(), 0, 8);
                this.f64833m = xVar;
                this.f64829i = 1;
            } else {
                c(iVar.getPosition() - this.f64832l);
                this.f64833m = null;
                this.f64829i = 1;
            }
            return true;
        }
        throw g0.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
    }

    public final boolean a(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        boolean z10;
        long j10 = this.f64831k - this.f64832l;
        long position = iVar.getPosition() + j10;
        x xVar = this.f64833m;
        if (xVar != null) {
            iVar.readFully(xVar.getData(), this.f64832l, (int) j10);
            if (this.f64830j == 1718909296) {
                this.f64843w = a(xVar);
            } else if (!this.f64826f.isEmpty()) {
                this.f64826f.peek().add(new a.b(this.f64830j, xVar));
            }
        } else if (j10 < 262144) {
            iVar.skipFully((int) j10);
        } else {
            uVar.f64171a = iVar.getPosition() + j10;
            z10 = true;
            b(position);
            return (z10 || this.f64829i == 2) ? false : true;
        }
        z10 = false;
        b(position);
        if (z10) {
        }
    }

    public final void c() {
        if (this.f64843w != 2 || (this.f64821a & 2) == 0) {
            return;
        }
        io.odeeo.internal.g.j jVar = (io.odeeo.internal.g.j) io.odeeo.internal.q0.a.checkNotNull(this.f64838r);
        jVar.track(0, 4).format(new t.b().setMetadata(this.f64844x == null ? null : new io.odeeo.internal.s.a(this.f64844x)).build());
        jVar.endTracks();
        jVar.seekMap(new v.b(C.TIME_UNSET));
    }

    public final void c(long j10) {
        if (this.f64830j == 1836086884) {
            long j11 = this.f64832l;
            this.f64844x = new io.odeeo.internal.y.b(0L, j10, C.TIME_UNSET, j10 + j11, this.f64831k - j11);
        }
    }

    public final void a(a.C0622a c0622a) throws g0 {
        io.odeeo.internal.s.a aVar;
        io.odeeo.internal.s.a aVar2;
        List<n> list;
        int i10;
        int i11;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        boolean z11 = true;
        boolean z12 = this.f64843w == 1;
        r rVar = new r();
        a.b leafAtomOfType = c0622a.getLeafAtomOfType(1969517665);
        if (leafAtomOfType != null) {
            Pair<io.odeeo.internal.s.a, io.odeeo.internal.s.a> udta = b.parseUdta(leafAtomOfType);
            io.odeeo.internal.s.a aVar3 = (io.odeeo.internal.s.a) udta.first;
            io.odeeo.internal.s.a aVar4 = (io.odeeo.internal.s.a) udta.second;
            if (aVar3 != null) {
                rVar.setFromMetadata(aVar3);
            }
            aVar = aVar4;
            aVar2 = aVar3;
        } else {
            aVar = null;
            aVar2 = null;
        }
        a.C0622a containerAtomOfType = c0622a.getContainerAtomOfType(1835365473);
        io.odeeo.internal.s.a mdtaFromMeta = containerAtomOfType != null ? b.parseMdtaFromMeta(containerAtomOfType) : null;
        List<n> traks = b.parseTraks(c0622a, rVar, C.TIME_UNSET, null, (this.f64821a & 1) != 0, z12, new ws.b());
        io.odeeo.internal.g.j jVar = (io.odeeo.internal.g.j) io.odeeo.internal.q0.a.checkNotNull(this.f64838r);
        int size = traks.size();
        long j10 = C.TIME_UNSET;
        int i12 = 0;
        int size2 = -1;
        while (i12 < size) {
            n nVar = traks.get(i12);
            if (nVar.f64897b == 0) {
                list = traks;
                i10 = size;
                z10 = z11;
            } else {
                k kVar = nVar.f64896a;
                int i13 = size2;
                long j11 = kVar.f64866e;
                if (j11 == C.TIME_UNSET) {
                    j11 = nVar.f64903h;
                }
                long jMax = Math.max(j10, j11);
                list = traks;
                i10 = size;
                a aVar5 = new a(kVar, nVar, jVar.track(i12, kVar.f64863b));
                if (MimeTypes.AUDIO_TRUEHD.equals(kVar.f64867f.f62971l)) {
                    i11 = nVar.f64900e * 16;
                } else {
                    i11 = nVar.f64900e + 30;
                }
                t.b bVarBuildUpon = kVar.f64867f.buildUpon();
                bVarBuildUpon.setMaxInputSize(i11);
                if (kVar.f64863b != 2 || j11 <= 0) {
                    z10 = true;
                } else {
                    int i14 = nVar.f64897b;
                    z10 = true;
                    if (i14 > 1) {
                        bVarBuildUpon.setFrameRate(i14 / (j11 / 1000000.0f));
                    }
                }
                f.setFormatGaplessInfo(kVar.f64863b, rVar, bVarBuildUpon);
                f.setFormatMetadata(kVar.f64863b, aVar2, mdtaFromMeta, bVarBuildUpon, aVar, this.f64828h.isEmpty() ? null : new io.odeeo.internal.s.a(this.f64828h));
                aVar5.f64847c.format(bVarBuildUpon.build());
                size2 = (kVar.f64863b == 2 && i13 == -1) ? arrayList.size() : i13;
                arrayList.add(aVar5);
                j10 = jMax;
            }
            i12++;
            z11 = z10;
            traks = list;
            size = i10;
        }
        this.f64841u = size2;
        this.f64842v = j10;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f64839s = aVarArr;
        this.f64840t = a(aVarArr);
        jVar.endTracks();
        jVar.seekMap(this);
    }

    public final void b(long j10) throws g0 {
        while (!this.f64826f.isEmpty() && this.f64826f.peek().f64740b == j10) {
            a.C0622a c0622aPop = this.f64826f.pop();
            if (c0622aPop.f64739a == 1836019574) {
                a(c0622aPop);
                this.f64826f.clear();
                this.f64829i = 2;
            } else if (!this.f64826f.isEmpty()) {
                this.f64826f.peek().add(c0622aPop);
            }
        }
        if (this.f64829i != 2) {
            a();
        }
    }

    public final int b(io.odeeo.internal.g.i iVar, u uVar) throws IOException {
        int i10;
        long position = iVar.getPosition();
        if (this.f64834n == -1) {
            int iA = a(position);
            this.f64834n = iA;
            if (iA == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) io.odeeo.internal.q0.g0.castNonNull(this.f64839s))[this.f64834n];
        io.odeeo.internal.g.x xVar = aVar.f64847c;
        int i11 = aVar.f64849e;
        n nVar = aVar.f64846b;
        long j10 = nVar.f64898c[i11];
        int i12 = nVar.f64899d[i11];
        y yVar = aVar.f64848d;
        long j11 = (j10 - position) + this.f64835o;
        if (j11 >= 0 && j11 < 262144) {
            if (aVar.f64845a.f64868g == 1) {
                j11 += 8;
                i12 -= 8;
            }
            iVar.skipFully((int) j11);
            k kVar = aVar.f64845a;
            if (kVar.f64871j != 0) {
                byte[] data = this.f64823c.getData();
                data[0] = 0;
                data[1] = 0;
                data[2] = 0;
                int i13 = aVar.f64845a.f64871j;
                int i14 = 4 - i13;
                while (this.f64836p < i12) {
                    int i15 = this.f64837q;
                    if (i15 == 0) {
                        iVar.readFully(data, i14, i13);
                        this.f64835o += i13;
                        this.f64823c.setPosition(0);
                        int i16 = this.f64823c.readInt();
                        if (i16 < 0) {
                            throw g0.createForMalformedContainer(YsiBvdpw.FZkPlcxbm, null);
                        }
                        this.f64837q = i16;
                        this.f64822b.setPosition(0);
                        xVar.sampleData(this.f64822b, 4);
                        this.f64836p += 4;
                        i12 += i14;
                    } else {
                        int iSampleData = xVar.sampleData((io.odeeo.internal.p0.g) iVar, i15, false);
                        this.f64835o += iSampleData;
                        this.f64836p += iSampleData;
                        this.f64837q -= iSampleData;
                    }
                }
            } else {
                if ("audio/ac4".equals(kVar.f64867f.f62971l)) {
                    if (this.f64836p == 0) {
                        io.odeeo.internal.d.c.getAc4SampleHeader(i12, this.f64824d);
                        xVar.sampleData(this.f64824d, 7);
                        this.f64836p += 7;
                    }
                    i12 += 7;
                } else if (yVar != null) {
                    yVar.startSample(iVar);
                }
                while (true) {
                    int i17 = this.f64836p;
                    if (i17 >= i12) {
                        break;
                    }
                    int iSampleData2 = xVar.sampleData((io.odeeo.internal.p0.g) iVar, i12 - i17, false);
                    this.f64835o += iSampleData2;
                    this.f64836p += iSampleData2;
                    this.f64837q -= iSampleData2;
                }
            }
            int i18 = i12;
            n nVar2 = aVar.f64846b;
            long j12 = nVar2.f64901f[i11];
            int i19 = nVar2.f64902g[i11];
            if (yVar != null) {
                i10 = 0;
                yVar.sampleMetadata(xVar, j12, i19, i18, 0, null);
                if (i11 + 1 == aVar.f64846b.f64897b) {
                    yVar.outputPendingSampleMetadata(xVar, null);
                }
            } else {
                i10 = 0;
                xVar.sampleMetadata(j12, i19, i18, 0, null);
            }
            aVar.f64849e++;
            this.f64834n = -1;
            this.f64835o = i10;
            this.f64836p = i10;
            this.f64837q = i10;
            return i10;
        }
        uVar.f64171a = j10;
        return 1;
    }

    public final int a(long j10) {
        int i10 = -1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < ((a[]) io.odeeo.internal.q0.g0.castNonNull(this.f64839s)).length; i12++) {
            a aVar = this.f64839s[i12];
            int i13 = aVar.f64849e;
            n nVar = aVar.f64846b;
            if (i13 != nVar.f64897b) {
                long j14 = nVar.f64898c[i13];
                long j15 = ((long[][]) io.odeeo.internal.q0.g0.castNonNull(this.f64840t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    z10 = z12;
                    j11 = j15;
                    i10 = i12;
                }
            }
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    public final void a(a aVar, long j10) {
        n nVar = aVar.f64846b;
        int indexOfEarlierOrEqualSynchronizationSample = nVar.getIndexOfEarlierOrEqualSynchronizationSample(j10);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = nVar.getIndexOfLaterOrEqualSynchronizationSample(j10);
        }
        aVar.f64849e = indexOfEarlierOrEqualSynchronizationSample;
    }

    public final void a(io.odeeo.internal.g.i iVar) throws IOException {
        this.f64824d.reset(8);
        iVar.peekFully(this.f64824d.getData(), 0, 8);
        b.maybeSkipRemainingMetaAtomHeaderBytes(this.f64824d);
        iVar.skipFully(this.f64824d.getPosition());
        iVar.resetPeekPosition();
    }

    public static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f64846b.f64897b];
            jArr2[i10] = aVarArr[i10].f64846b.f64901f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            n nVar = aVarArr[i12].f64846b;
            j10 += nVar.f64899d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = nVar.f64901f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static long a(n nVar, long j10, long j11) {
        int iA = a(nVar, j10);
        return iA == -1 ? j11 : Math.min(nVar.f64898c[iA], j11);
    }

    public static int a(n nVar, long j10) {
        int indexOfEarlierOrEqualSynchronizationSample = nVar.getIndexOfEarlierOrEqualSynchronizationSample(j10);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? nVar.getIndexOfLaterOrEqualSynchronizationSample(j10) : indexOfEarlierOrEqualSynchronizationSample;
    }

    public static int a(x xVar) {
        xVar.setPosition(8);
        int iA = a(xVar.readInt());
        if (iA != 0) {
            return iA;
        }
        xVar.skipBytes(4);
        while (xVar.bytesLeft() > 0) {
            int iA2 = a(xVar.readInt());
            if (iA2 != 0) {
                return iA2;
            }
        }
        return 0;
    }
}
