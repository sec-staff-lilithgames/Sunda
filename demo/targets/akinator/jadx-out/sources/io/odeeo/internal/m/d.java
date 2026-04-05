package io.odeeo.internal.m;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.r;
import io.odeeo.internal.g.h;
import io.odeeo.internal.g.i;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.l;
import io.odeeo.internal.g.s;
import io.odeeo.internal.g.u;
import io.odeeo.internal.m.e;
import io.odeeo.internal.q0.x;
import io.odeeo.internal.s.a;
import io.odeeo.internal.x.g;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import sn.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements h {

    /* renamed from: u, reason: collision with root package name */
    public static final l f64601u = new bt.a(6);

    /* renamed from: v, reason: collision with root package name */
    public static final g.a f64602v = new t(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f64603a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64604b;

    /* renamed from: c, reason: collision with root package name */
    public final x f64605c;

    /* renamed from: d, reason: collision with root package name */
    public final r.a f64606d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.g.r f64607e;

    /* renamed from: f, reason: collision with root package name */
    public final s f64608f;

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.g.x f64609g;

    /* renamed from: h, reason: collision with root package name */
    public j f64610h;

    /* renamed from: i, reason: collision with root package name */
    public io.odeeo.internal.g.x f64611i;

    /* renamed from: j, reason: collision with root package name */
    public io.odeeo.internal.g.x f64612j;

    /* renamed from: k, reason: collision with root package name */
    public int f64613k;

    /* renamed from: l, reason: collision with root package name */
    public io.odeeo.internal.s.a f64614l;

    /* renamed from: m, reason: collision with root package name */
    public long f64615m;

    /* renamed from: n, reason: collision with root package name */
    public long f64616n;

    /* renamed from: o, reason: collision with root package name */
    public long f64617o;

    /* renamed from: p, reason: collision with root package name */
    public int f64618p;

    /* renamed from: q, reason: collision with root package name */
    public e f64619q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f64620r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f64621s;

    /* renamed from: t, reason: collision with root package name */
    public long f64622t;

    public d() {
        this(0);
    }

    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    public static /* synthetic */ h[] b() {
        return new h[]{new d()};
    }

    public final boolean c(i iVar) throws IOException {
        e eVar = this.f64619q;
        if (eVar != null) {
            long dataEndPosition = eVar.getDataEndPosition();
            if (dataEndPosition != -1 && iVar.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !iVar.peekFully(this.f64605c.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    public final int d(i iVar) throws IOException {
        if (this.f64613k == 0) {
            try {
                b(iVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f64619q == null) {
            e eVarA = a(iVar);
            this.f64619q = eVarA;
            this.f64610h.seekMap(eVarA);
            this.f64612j.format(new t.b().setSampleMimeType(this.f64606d.f63482b).setMaxInputSize(4096).setChannelCount(this.f64606d.f63485e).setSampleRate(this.f64606d.f63484d).setEncoderDelay(this.f64607e.f64164a).setEncoderPadding(this.f64607e.f64165b).setMetadata((this.f64603a & 8) != 0 ? null : this.f64614l).build());
            this.f64617o = iVar.getPosition();
        } else if (this.f64617o != 0) {
            long position = iVar.getPosition();
            long j10 = this.f64617o;
            if (position < j10) {
                iVar.skipFully((int) (j10 - position));
            }
        }
        return e(iVar);
    }

    public void disableSeeking() {
        this.f64620r = true;
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    public final int e(i iVar) throws IOException {
        if (this.f64618p == 0) {
            iVar.resetPeekPosition();
            if (c(iVar)) {
                return -1;
            }
            this.f64605c.setPosition(0);
            int i10 = this.f64605c.readInt();
            if (!a(i10, this.f64613k) || r.getFrameSize(i10) == -1) {
                iVar.skipFully(1);
                this.f64613k = 0;
                return 0;
            }
            this.f64606d.setForHeaderData(i10);
            if (this.f64615m == C.TIME_UNSET) {
                this.f64615m = this.f64619q.getTimeUs(iVar.getPosition());
                if (this.f64604b != C.TIME_UNSET) {
                    this.f64615m = (this.f64604b - this.f64619q.getTimeUs(0L)) + this.f64615m;
                }
            }
            this.f64618p = this.f64606d.f63483c;
            e eVar = this.f64619q;
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                bVar.maybeAddSeekPoint(a(this.f64616n + r0.f63487g), iVar.getPosition() + this.f64606d.f63483c);
                if (this.f64621s && bVar.isTimeUsInIndex(this.f64622t)) {
                    this.f64621s = false;
                    this.f64612j = this.f64611i;
                }
            }
        }
        int iSampleData = this.f64612j.sampleData((io.odeeo.internal.p0.g) iVar, this.f64618p, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i11 = this.f64618p - iSampleData;
        this.f64618p = i11;
        if (i11 > 0) {
            return 0;
        }
        this.f64612j.sampleMetadata(a(this.f64616n), 1, this.f64606d.f63483c, 0, null);
        this.f64616n += this.f64606d.f63487g;
        this.f64618p = 0;
        return 0;
    }

    @Override // io.odeeo.internal.g.h
    public void init(j jVar) {
        this.f64610h = jVar;
        io.odeeo.internal.g.x xVarTrack = jVar.track(0, 1);
        this.f64611i = xVarTrack;
        this.f64612j = xVarTrack;
        this.f64610h.endTracks();
    }

    @Override // io.odeeo.internal.g.h
    public int read(i iVar, u uVar) throws IOException {
        a();
        int iD = d(iVar);
        if (iD == -1 && (this.f64619q instanceof b)) {
            long jA = a(this.f64616n);
            if (this.f64619q.getDurationUs() != jA) {
                ((b) this.f64619q).a(jA);
                this.f64610h.seekMap(this.f64619q);
            }
        }
        return iD;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        this.f64613k = 0;
        this.f64615m = C.TIME_UNSET;
        this.f64616n = 0L;
        this.f64618p = 0;
        this.f64622t = j11;
        e eVar = this.f64619q;
        if (!(eVar instanceof b) || ((b) eVar).isTimeUsInIndex(j11)) {
            return;
        }
        this.f64621s = true;
        this.f64612j = this.f64609g;
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(i iVar) throws IOException {
        return b(iVar, true);
    }

    public d(int i10) {
        this(i10, C.TIME_UNSET);
    }

    public static boolean a(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public final boolean b(i iVar, boolean z10) throws IOException {
        int peekPosition;
        int i10;
        int frameSize;
        int i11 = z10 ? 32768 : 131072;
        iVar.resetPeekPosition();
        if (iVar.getPosition() == 0) {
            io.odeeo.internal.s.a aVarPeekId3Data = this.f64608f.peekId3Data(iVar, (this.f64603a & 8) == 0 ? null : f64602v);
            this.f64614l = aVarPeekId3Data;
            if (aVarPeekId3Data != null) {
                this.f64607e.setFromMetadata(aVarPeekId3Data);
            }
            peekPosition = (int) iVar.getPeekPosition();
            if (!z10) {
                iVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!c(iVar)) {
                this.f64605c.setPosition(0);
                int i14 = this.f64605c.readInt();
                if ((i10 == 0 || a(i14, i10)) && (frameSize = r.getFrameSize(i14)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f64606d.setForHeaderData(i14);
                        i10 = i14;
                    }
                    iVar.advancePeekPosition(frameSize - 4);
                } else {
                    int i15 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        throw g0.createForMalformedContainer("Searched too many bytes.", null);
                    }
                    if (z10) {
                        iVar.resetPeekPosition();
                        iVar.advancePeekPosition(peekPosition + i15);
                    } else {
                        iVar.skipFully(1);
                    }
                    i12 = 0;
                    i13 = i15;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            iVar.skipFully(peekPosition + i13);
        } else {
            iVar.resetPeekPosition();
        }
        this.f64613k = i10;
        return true;
    }

    public d(int i10, long j10) {
        this.f64603a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f64604b = j10;
        this.f64605c = new x(10);
        this.f64606d = new r.a();
        this.f64607e = new io.odeeo.internal.g.r();
        this.f64615m = C.TIME_UNSET;
        this.f64608f = new s();
        io.odeeo.internal.g.g gVar = new io.odeeo.internal.g.g();
        this.f64609g = gVar;
        this.f64612j = gVar;
    }

    public final long a(long j10) {
        return ((j10 * 1000000) / this.f64606d.f63484d) + this.f64615m;
    }

    public final e a(i iVar) throws IOException {
        long jA;
        long dataEndPosition;
        e eVarB = b(iVar);
        c cVarA = a(this.f64614l, iVar.getPosition());
        if (this.f64620r) {
            return new e.a();
        }
        if ((this.f64603a & 4) != 0) {
            if (cVarA != null) {
                jA = cVarA.getDurationUs();
                dataEndPosition = cVarA.getDataEndPosition();
            } else if (eVarB != null) {
                jA = eVarB.getDurationUs();
                dataEndPosition = eVarB.getDataEndPosition();
            } else {
                jA = a(this.f64614l);
                dataEndPosition = -1;
            }
            eVarB = new b(jA, iVar.getPosition(), dataEndPosition);
        } else if (cVarA != null) {
            eVarB = cVarA;
        } else if (eVarB == null) {
            eVarB = null;
        }
        if (eVarB == null || !(eVarB.isSeekable() || (this.f64603a & 1) == 0)) {
            return a(iVar, (this.f64603a & 2) != 0);
        }
        return eVarB;
    }

    public final e a(i iVar, boolean z10) throws IOException {
        iVar.peekFully(this.f64605c.getData(), 0, 4);
        this.f64605c.setPosition(0);
        this.f64606d.setForHeaderData(this.f64605c.readInt());
        return new a(iVar.getLength(), iVar.getPosition(), this.f64606d, z10);
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    public final void a() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f64611i);
        io.odeeo.internal.q0.g0.castNonNull(this.f64610h);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.odeeo.internal.m.e b(io.odeeo.internal.g.i r11) throws java.io.IOException {
        /*
            r10 = this;
            io.odeeo.internal.q0.x r5 = new io.odeeo.internal.q0.x
            io.odeeo.internal.d.r$a r0 = r10.f64606d
            int r0 = r0.f63483c
            r5.<init>(r0)
            byte[] r0 = r5.getData()
            io.odeeo.internal.d.r$a r1 = r10.f64606d
            int r1 = r1.f63483c
            r6 = 0
            r11.peekFully(r0, r6, r1)
            io.odeeo.internal.d.r$a r0 = r10.f64606d
            int r1 = r0.f63481a
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L25
            int r0 = r0.f63485e
            if (r0 == r2) goto L29
            r0 = 36
        L23:
            r7 = r0
            goto L2f
        L25:
            int r0 = r0.f63485e
            if (r0 == r2) goto L2c
        L29:
            r0 = 21
            goto L23
        L2c:
            r0 = 13
            goto L23
        L2f:
            int r8 = a(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L5e
            if (r8 != r9) goto L3e
            goto L5e
        L3e:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L59
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            io.odeeo.internal.d.r$a r4 = r10.f64606d
            io.odeeo.internal.m.f r0 = io.odeeo.internal.m.f.create(r0, r2, r4, r5)
            io.odeeo.internal.d.r$a r1 = r10.f64606d
            int r1 = r1.f63483c
            r11.skipFully(r1)
            return r0
        L59:
            r11.resetPeekPosition()
            r11 = 0
            return r11
        L5e:
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            io.odeeo.internal.d.r$a r4 = r10.f64606d
            io.odeeo.internal.m.g r0 = io.odeeo.internal.m.g.create(r0, r2, r4, r5)
            if (r0 == 0) goto L98
            io.odeeo.internal.g.r r1 = r10.f64607e
            boolean r1 = r1.hasGaplessInfo()
            if (r1 != 0) goto L98
            r11.resetPeekPosition()
            int r7 = r7 + 141
            r11.advancePeekPosition(r7)
            io.odeeo.internal.q0.x r1 = r10.f64605c
            byte[] r1 = r1.getData()
            r2 = 3
            r11.peekFully(r1, r6, r2)
            io.odeeo.internal.q0.x r1 = r10.f64605c
            r1.setPosition(r6)
            io.odeeo.internal.g.r r1 = r10.f64607e
            io.odeeo.internal.q0.x r2 = r10.f64605c
            int r2 = r2.readUnsignedInt24()
            r1.setFromXingHeaderValue(r2)
        L98:
            io.odeeo.internal.d.r$a r1 = r10.f64606d
            int r1 = r1.f63483c
            r11.skipFully(r1)
            if (r0 == 0) goto Lae
            boolean r1 = r0.isSeekable()
            if (r1 != 0) goto Lae
            if (r8 != r9) goto Lae
            io.odeeo.internal.m.e r11 = r10.a(r11, r6)
            return r11
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.m.d.b(io.odeeo.internal.g.i):io.odeeo.internal.m.e");
    }

    public static int a(x xVar, int i10) {
        if (xVar.limit() >= i10 + 4) {
            xVar.setPosition(i10);
            int i11 = xVar.readInt();
            if (i11 == 1483304551 || i11 == 1231971951) {
                return i11;
            }
        }
        if (xVar.limit() < 40) {
            return 0;
        }
        xVar.setPosition(36);
        return xVar.readInt() == 1447187017 ? 1447187017 : 0;
    }

    public static c a(io.odeeo.internal.s.a aVar, long j10) {
        if (aVar == null) {
            return null;
        }
        int length = aVar.length();
        for (int i10 = 0; i10 < length; i10++) {
            a.b bVar = aVar.get(i10);
            if (bVar instanceof io.odeeo.internal.x.j) {
                return c.create(j10, (io.odeeo.internal.x.j) bVar, a(aVar));
            }
        }
        return null;
    }

    public static long a(io.odeeo.internal.s.a aVar) {
        if (aVar == null) {
            return C.TIME_UNSET;
        }
        int length = aVar.length();
        for (int i10 = 0; i10 < length; i10++) {
            a.b bVar = aVar.get(i10);
            if (bVar instanceof io.odeeo.internal.x.l) {
                io.odeeo.internal.x.l lVar = (io.odeeo.internal.x.l) bVar;
                if (lVar.f67511a.equals("TLEN")) {
                    return io.odeeo.internal.q0.g0.msToUs(Long.parseLong(lVar.f67523c));
                }
            }
        }
        return C.TIME_UNSET;
    }
}
