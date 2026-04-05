package co;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.w;
import gn.x0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import ko.a0;
import ko.c0;
import ko.d1;
import ko.e1;
import ko.v;
import ko.v0;
import ko.y0;
import ko.z;
import on.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements c0, h {

    /* renamed from: l, reason: collision with root package name */
    public static final v0 f12397l;

    /* renamed from: b, reason: collision with root package name */
    public final z f12398b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12399c;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f12400e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f12401f = new SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public boolean f12402g;

    /* renamed from: h, reason: collision with root package name */
    public g f12403h;

    /* renamed from: i, reason: collision with root package name */
    public long f12404i;

    /* renamed from: j, reason: collision with root package name */
    public y0 f12405j;

    /* renamed from: k, reason: collision with root package name */
    public io.bidmachine.media3.common.b[] f12406k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements e1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f12407a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12408b;

        /* renamed from: c, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f12409c;

        /* renamed from: d, reason: collision with root package name */
        public final v f12410d = new v();

        /* renamed from: e, reason: collision with root package name */
        public io.bidmachine.media3.common.b f12411e;

        /* renamed from: f, reason: collision with root package name */
        public e1 f12412f;

        /* renamed from: g, reason: collision with root package name */
        public long f12413g;

        public a(int i10, int i11, io.bidmachine.media3.common.b bVar) {
            this.f12407a = i10;
            this.f12408b = i11;
            this.f12409c = bVar;
        }

        public void bind(g gVar, long j10) {
            if (gVar == null) {
                this.f12412f = this.f12410d;
                return;
            }
            this.f12413g = j10;
            e1 e1VarTrack = gVar.track(this.f12407a, this.f12408b);
            this.f12412f = e1VarTrack;
            io.bidmachine.media3.common.b bVar = this.f12411e;
            if (bVar != null) {
                e1VarTrack.format(bVar);
            }
        }

        @Override // ko.e1
        public /* bridge */ /* synthetic */ void durationUs(long j10) {
            super.durationUs(j10);
        }

        @Override // ko.e1
        public void format(io.bidmachine.media3.common.b bVar) {
            io.bidmachine.media3.common.b bVar2 = this.f12409c;
            if (bVar2 != null) {
                bVar = bVar.withManifestFormatInfo(bVar2);
            }
            this.f12411e = bVar;
            ((e1) a1.castNonNull(this.f12412f)).format(this.f12411e);
        }

        @Override // ko.e1
        public /* bridge */ /* synthetic */ int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
            return super.sampleData(oVar, i10, z10);
        }

        @Override // ko.e1
        public void sampleMetadata(long j10, int i10, int i11, int i12, d1 d1Var) {
            long j11 = this.f12413g;
            if (j11 != C.TIME_UNSET && j10 >= j11) {
                this.f12412f = this.f12410d;
            }
            ((e1) a1.castNonNull(this.f12412f)).sampleMetadata(j10, i10, i11, i12, d1Var);
        }

        @Override // ko.e1
        public /* bridge */ /* synthetic */ void sampleData(m0 m0Var, int i10) {
            super.sampleData(m0Var, i10);
        }

        @Override // ko.e1
        public int sampleData(gn.o oVar, int i10, boolean z10, int i11) throws IOException {
            return ((e1) a1.castNonNull(this.f12412f)).sampleData(oVar, i10, z10);
        }

        @Override // ko.e1
        public void sampleData(m0 m0Var, int i10, int i11) {
            ((e1) a1.castNonNull(this.f12412f)).sampleData(m0Var, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public hp.q f12414a = new hp.e();

        /* renamed from: b, reason: collision with root package name */
        public boolean f12415b;

        /* renamed from: c, reason: collision with root package name */
        public int f12416c;

        @Override // co.f
        public h createProgressiveMediaExtractor(int i10, io.bidmachine.media3.common.b bVar, boolean z10, List<io.bidmachine.media3.common.b> list, e1 e1Var, f0 f0Var) {
            z sVar;
            String str = bVar.f60664n;
            if (!x0.isText(str)) {
                if (x0.isMatroska(str)) {
                    sVar = new cp.h(this.f12414a, this.f12415b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    sVar = new so.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    sVar = new gp.a();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.f12415b) {
                        i11 |= 32;
                    }
                    sVar = new ep.s(this.f12414a, i11 | ep.s.codecsToParseWithinGopSampleDependenciesAsFlags(this.f12416c), null, null, list, e1Var);
                }
            } else {
                if (!this.f12415b) {
                    return null;
                }
                sVar = new hp.m(this.f12414a.create(bVar), bVar);
            }
            return new d(sVar, i10, bVar);
        }

        @Override // co.f
        public io.bidmachine.media3.common.b getOutputTextFormat(io.bidmachine.media3.common.b bVar) {
            String str;
            if (!this.f12415b || !this.f12414a.supportsFormat(bVar)) {
                return bVar;
            }
            w wVarBuildUpon = bVar.buildUpon();
            String str2 = bVar.f60661k;
            w cueReplacementBehavior = wVarBuildUpon.setSampleMimeType("application/x-media3-cues").setCueReplacementBehavior(this.f12414a.getCueReplacementBehavior(bVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bVar.f60665o);
            if (str2 != null) {
                str = " " + str2;
            } else {
                str = "";
            }
            sb2.append(str);
            return cueReplacementBehavior.setCodecs(sb2.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
        }

        @Override // co.f
        public b experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.f12415b = z10;
            return this;
        }

        @Override // co.f
        public b experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
            this.f12416c = i10;
            return this;
        }

        @Override // co.f
        public b setSubtitleParserFactory(hp.q qVar) {
            this.f12414a = (hp.q) io.bidmachine.media3.common.util.a.checkNotNull(qVar);
            return this;
        }
    }

    static {
        new b();
        f12397l = new v0();
    }

    public d(z zVar, int i10, io.bidmachine.media3.common.b bVar) {
        this.f12398b = zVar;
        this.f12399c = i10;
        this.f12400e = bVar;
    }

    @Override // ko.c0
    public void endTracks() {
        SparseArray sparseArray = this.f12401f;
        io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            bVarArr[i10] = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkStateNotNull(((a) sparseArray.valueAt(i10)).f12411e);
        }
        this.f12406k = bVarArr;
    }

    @Override // co.h
    public ko.q getChunkIndex() {
        y0 y0Var = this.f12405j;
        if (y0Var instanceof ko.q) {
            return (ko.q) y0Var;
        }
        return null;
    }

    @Override // co.h
    public io.bidmachine.media3.common.b[] getSampleFormats() {
        return this.f12406k;
    }

    @Override // co.h
    public void init(g gVar, long j10, long j11) {
        this.f12403h = gVar;
        this.f12404i = j11;
        boolean z10 = this.f12402g;
        z zVar = this.f12398b;
        if (!z10) {
            zVar.init(this);
            if (j10 != C.TIME_UNSET) {
                zVar.seek(0L, j10);
            }
            this.f12402g = true;
            return;
        }
        if (j10 == C.TIME_UNSET) {
            j10 = 0;
        }
        zVar.seek(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f12401f;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((a) sparseArray.valueAt(i10)).bind(gVar, j11);
            i10++;
        }
    }

    @Override // co.h
    public boolean read(a0 a0Var) throws IOException {
        int i10 = this.f12398b.read(a0Var, f12397l);
        io.bidmachine.media3.common.util.a.checkState(i10 != 1);
        return i10 == 0;
    }

    @Override // co.h
    public void release() {
        this.f12398b.release();
    }

    @Override // ko.c0
    public void seekMap(y0 y0Var) {
        this.f12405j = y0Var;
    }

    @Override // ko.c0
    public e1 track(int i10, int i11) {
        SparseArray sparseArray = this.f12401f;
        a aVar = (a) sparseArray.get(i10);
        if (aVar == null) {
            io.bidmachine.media3.common.util.a.checkState(this.f12406k == null);
            aVar = new a(i10, i11, i11 == this.f12399c ? this.f12400e : null);
            aVar.bind(this.f12403h, this.f12404i);
            sparseArray.put(i10, aVar);
        }
        return aVar;
    }
}
