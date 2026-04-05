package io.odeeo.internal.p;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.u;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f65408a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65409b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65410c;

    /* renamed from: g, reason: collision with root package name */
    public long f65414g;

    /* renamed from: i, reason: collision with root package name */
    public String f65416i;

    /* renamed from: j, reason: collision with root package name */
    public io.odeeo.internal.g.x f65417j;

    /* renamed from: k, reason: collision with root package name */
    public b f65418k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65419l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f65421n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f65415h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final r f65411d = new r(7, 128);

    /* renamed from: e, reason: collision with root package name */
    public final r f65412e = new r(8, 128);

    /* renamed from: f, reason: collision with root package name */
    public final r f65413f = new r(6, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f65420m = C.TIME_UNSET;

    /* renamed from: o, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65422o = new io.odeeo.internal.q0.x();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.g.x f65423a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65424b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65425c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<u.c> f65426d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<u.b> f65427e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final io.odeeo.internal.q0.y f65428f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f65429g;

        /* renamed from: h, reason: collision with root package name */
        public int f65430h;

        /* renamed from: i, reason: collision with root package name */
        public int f65431i;

        /* renamed from: j, reason: collision with root package name */
        public long f65432j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f65433k;

        /* renamed from: l, reason: collision with root package name */
        public long f65434l;

        /* renamed from: m, reason: collision with root package name */
        public a f65435m;

        /* renamed from: n, reason: collision with root package name */
        public a f65436n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f65437o;

        /* renamed from: p, reason: collision with root package name */
        public long f65438p;

        /* renamed from: q, reason: collision with root package name */
        public long f65439q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f65440r;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f65441a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f65442b;

            /* renamed from: c, reason: collision with root package name */
            public u.c f65443c;

            /* renamed from: d, reason: collision with root package name */
            public int f65444d;

            /* renamed from: e, reason: collision with root package name */
            public int f65445e;

            /* renamed from: f, reason: collision with root package name */
            public int f65446f;

            /* renamed from: g, reason: collision with root package name */
            public int f65447g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f65448h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f65449i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f65450j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f65451k;

            /* renamed from: l, reason: collision with root package name */
            public int f65452l;

            /* renamed from: m, reason: collision with root package name */
            public int f65453m;

            /* renamed from: n, reason: collision with root package name */
            public int f65454n;

            /* renamed from: o, reason: collision with root package name */
            public int f65455o;

            /* renamed from: p, reason: collision with root package name */
            public int f65456p;

            public a() {
            }

            public void clear() {
                this.f65442b = false;
                this.f65441a = false;
            }

            public boolean isISlice() {
                if (!this.f65442b) {
                    return false;
                }
                int i10 = this.f65445e;
                return i10 == 7 || i10 == 2;
            }

            public void setAll(u.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f65443c = cVar;
                this.f65444d = i10;
                this.f65445e = i11;
                this.f65446f = i12;
                this.f65447g = i13;
                this.f65448h = z10;
                this.f65449i = z11;
                this.f65450j = z12;
                this.f65451k = z13;
                this.f65452l = i14;
                this.f65453m = i15;
                this.f65454n = i16;
                this.f65455o = i17;
                this.f65456p = i18;
                this.f65441a = true;
                this.f65442b = true;
            }

            public void setSliceType(int i10) {
                this.f65445e = i10;
                this.f65442b = true;
            }

            public final boolean a(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f65441a) {
                    return false;
                }
                if (!aVar.f65441a) {
                    return true;
                }
                u.c cVar = (u.c) io.odeeo.internal.q0.a.checkStateNotNull(this.f65443c);
                u.c cVar2 = (u.c) io.odeeo.internal.q0.a.checkStateNotNull(aVar.f65443c);
                return (this.f65446f == aVar.f65446f && this.f65447g == aVar.f65447g && this.f65448h == aVar.f65448h && (!this.f65449i || !aVar.f65449i || this.f65450j == aVar.f65450j) && (((i10 = this.f65444d) == (i11 = aVar.f65444d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f65953k) != 0 || cVar2.f65953k != 0 || (this.f65453m == aVar.f65453m && this.f65454n == aVar.f65454n)) && ((i12 != 1 || cVar2.f65953k != 1 || (this.f65455o == aVar.f65455o && this.f65456p == aVar.f65456p)) && (z10 = this.f65451k) == aVar.f65451k && (!z10 || this.f65452l == aVar.f65452l))))) ? false : true;
            }
        }

        public b(io.odeeo.internal.g.x xVar, boolean z10, boolean z11) {
            this.f65423a = xVar;
            this.f65424b = z10;
            this.f65425c = z11;
            this.f65435m = new a();
            this.f65436n = new a();
            byte[] bArr = new byte[128];
            this.f65429g = bArr;
            this.f65428f = new io.odeeo.internal.q0.y(bArr, 0, 0);
            reset();
        }

        public final void a(int i10) {
            long j10 = this.f65439q;
            if (j10 == C.TIME_UNSET) {
                return;
            }
            boolean z10 = this.f65440r;
            this.f65423a.sampleMetadata(j10, z10 ? 1 : 0, (int) (this.f65432j - this.f65438p), i10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void appendToNalUnit(byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.p.m.b.appendToNalUnit(byte[], int, int):void");
        }

        public boolean endNalUnit(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f65431i == 9 || (this.f65425c && this.f65436n.a(this.f65435m))) {
                if (z10 && this.f65437o) {
                    a(i10 + ((int) (j10 - this.f65432j)));
                }
                this.f65438p = this.f65432j;
                this.f65439q = this.f65434l;
                this.f65440r = false;
                this.f65437o = true;
            }
            if (this.f65424b) {
                z11 = this.f65436n.isISlice();
            }
            boolean z13 = this.f65440r;
            int i11 = this.f65431i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f65440r = z14;
            return z14;
        }

        public boolean needsSpsPps() {
            return this.f65425c;
        }

        public void putPps(u.b bVar) {
            this.f65427e.append(bVar.f65940a, bVar);
        }

        public void putSps(u.c cVar) {
            this.f65426d.append(cVar.f65946d, cVar);
        }

        public void reset() {
            this.f65433k = false;
            this.f65437o = false;
            this.f65436n.clear();
        }

        public void startNalUnit(long j10, int i10, long j11) {
            this.f65431i = i10;
            this.f65434l = j11;
            this.f65432j = j10;
            if (!this.f65424b || i10 != 1) {
                if (!this.f65425c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f65435m;
            this.f65435m = this.f65436n;
            this.f65436n = aVar;
            aVar.clear();
            this.f65430h = 0;
            this.f65433k = true;
        }
    }

    public m(z zVar, boolean z10, boolean z11) {
        this.f65408a = zVar;
        this.f65409b = z10;
        this.f65410c = z11;
    }

    @RequiresNonNull({"sampleReader"})
    public final void a(long j10, int i10, long j11) {
        if (!this.f65419l || this.f65418k.needsSpsPps()) {
            this.f65411d.startNalUnit(i10);
            this.f65412e.startNalUnit(i10);
        }
        this.f65413f.startNalUnit(i10);
        this.f65418k.startNalUnit(j10, i10, j11);
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) {
        a();
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        byte[] data = xVar.getData();
        this.f65414g += xVar.bytesLeft();
        this.f65417j.sampleData(xVar, xVar.bytesLeft());
        while (true) {
            int iFindNalUnit = io.odeeo.internal.q0.u.findNalUnit(data, position, iLimit, this.f65415h);
            if (iFindNalUnit == iLimit) {
                a(data, position, iLimit);
                return;
            }
            int nalUnitType = io.odeeo.internal.q0.u.getNalUnitType(data, iFindNalUnit);
            int i10 = iFindNalUnit - position;
            if (i10 > 0) {
                a(data, position, iFindNalUnit);
            }
            int i11 = iLimit - iFindNalUnit;
            long j10 = this.f65414g - i11;
            a(j10, i11, i10 < 0 ? -i10 : 0, this.f65420m);
            a(j10, nalUnitType, this.f65420m);
            position = iFindNalUnit + 3;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65416i = dVar.getFormatId();
        io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 2);
        this.f65417j = xVarTrack;
        this.f65418k = new b(xVarTrack, this.f65409b, this.f65410c);
        this.f65408a.createTracks(jVar, dVar);
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65420m = j10;
        }
        this.f65421n |= (i10 & 2) != 0;
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65414g = 0L;
        this.f65421n = false;
        this.f65420m = C.TIME_UNSET;
        io.odeeo.internal.q0.u.clearPrefixFlags(this.f65415h);
        this.f65411d.reset();
        this.f65412e.reset();
        this.f65413f.reset();
        b bVar = this.f65418k;
        if (bVar != null) {
            bVar.reset();
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f65419l || this.f65418k.needsSpsPps()) {
            this.f65411d.appendToNalUnit(bArr, i10, i11);
            this.f65412e.appendToNalUnit(bArr, i10, i11);
        }
        this.f65413f.appendToNalUnit(bArr, i10, i11);
        this.f65418k.appendToNalUnit(bArr, i10, i11);
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void a(long j10, int i10, int i11, long j11) {
        if (!this.f65419l || this.f65418k.needsSpsPps()) {
            this.f65411d.endNalUnit(i11);
            this.f65412e.endNalUnit(i11);
            if (!this.f65419l) {
                if (this.f65411d.isCompleted() && this.f65412e.isCompleted()) {
                    ArrayList arrayList = new ArrayList();
                    r rVar = this.f65411d;
                    arrayList.add(Arrays.copyOf(rVar.f65526d, rVar.f65527e));
                    r rVar2 = this.f65412e;
                    arrayList.add(Arrays.copyOf(rVar2.f65526d, rVar2.f65527e));
                    r rVar3 = this.f65411d;
                    u.c spsNalUnit = io.odeeo.internal.q0.u.parseSpsNalUnit(rVar3.f65526d, 3, rVar3.f65527e);
                    r rVar4 = this.f65412e;
                    u.b ppsNalUnit = io.odeeo.internal.q0.u.parsePpsNalUnit(rVar4.f65526d, 3, rVar4.f65527e);
                    this.f65417j.format(new t.b().setId(this.f65416i).setSampleMimeType("video/avc").setCodecs(io.odeeo.internal.q0.e.buildAvcCodecString(spsNalUnit.f65943a, spsNalUnit.f65944b, spsNalUnit.f65945c)).setWidth(spsNalUnit.f65947e).setHeight(spsNalUnit.f65948f).setPixelWidthHeightRatio(spsNalUnit.f65949g).setInitializationData(arrayList).build());
                    this.f65419l = true;
                    this.f65418k.putSps(spsNalUnit);
                    this.f65418k.putPps(ppsNalUnit);
                    this.f65411d.reset();
                    this.f65412e.reset();
                }
            } else if (this.f65411d.isCompleted()) {
                r rVar5 = this.f65411d;
                this.f65418k.putSps(io.odeeo.internal.q0.u.parseSpsNalUnit(rVar5.f65526d, 3, rVar5.f65527e));
                this.f65411d.reset();
            } else if (this.f65412e.isCompleted()) {
                r rVar6 = this.f65412e;
                this.f65418k.putPps(io.odeeo.internal.q0.u.parsePpsNalUnit(rVar6.f65526d, 3, rVar6.f65527e));
                this.f65412e.reset();
            }
        }
        if (this.f65413f.endNalUnit(i11)) {
            r rVar7 = this.f65413f;
            this.f65422o.reset(this.f65413f.f65526d, io.odeeo.internal.q0.u.unescapeStream(rVar7.f65526d, rVar7.f65527e));
            this.f65422o.setPosition(4);
            this.f65408a.consume(j11, this.f65422o);
        }
        if (this.f65418k.endNalUnit(j10, i10, this.f65419l, this.f65421n)) {
            this.f65421n = false;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }

    @EnsuresNonNull({"output", "sampleReader"})
    public final void a() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65417j);
        g0.castNonNull(this.f65418k);
    }
}
