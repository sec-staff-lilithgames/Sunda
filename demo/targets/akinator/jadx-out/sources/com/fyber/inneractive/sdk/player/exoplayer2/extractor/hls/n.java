package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.w;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.LinkedList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements x, w, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f24786a;

    /* renamed from: b, reason: collision with root package name */
    public final i f24787b;

    /* renamed from: c, reason: collision with root package name */
    public final f f24788c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f24789d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o f24790e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24791f;

    /* renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f24793h;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24799n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24800o;

    /* renamed from: p, reason: collision with root package name */
    public int f24801p;

    /* renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f24802q;

    /* renamed from: r, reason: collision with root package name */
    public int f24803r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24804s;

    /* renamed from: t, reason: collision with root package name */
    public z f24805t;

    /* renamed from: u, reason: collision with root package name */
    public int f24806u;

    /* renamed from: v, reason: collision with root package name */
    public boolean[] f24807v;

    /* renamed from: w, reason: collision with root package name */
    public long f24808w;

    /* renamed from: x, reason: collision with root package name */
    public long f24809x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24810y;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f24792g = new b0("Loader:HlsSampleStreamWrapper");

    /* renamed from: i, reason: collision with root package name */
    public final d f24794i = new d();

    /* renamed from: j, reason: collision with root package name */
    public final SparseArray f24795j = new SparseArray();

    /* renamed from: k, reason: collision with root package name */
    public final LinkedList f24796k = new LinkedList();

    /* renamed from: l, reason: collision with root package name */
    public final m f24797l = new m(this);

    /* renamed from: m, reason: collision with root package name */
    public final Handler f24798m = new Handler();

    public n(int i10, i iVar, f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2) {
        this.f24786a = i10;
        this.f24787b = iVar;
        this.f24788c = fVar;
        this.f24789d = bVar;
        this.f24790e = oVar;
        this.f24791f = i11;
        this.f24793h = fVar2;
        this.f24808w = j10;
        this.f24809x = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(q qVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0144  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r40) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n.b(long):boolean");
    }

    public final void c(long j10) {
        this.f24808w = j10;
        this.f24809x = j10;
        this.f24810y = false;
        this.f24796k.clear();
        if (this.f24792g.a()) {
            this.f24792g.f25852b.a(false);
            return;
        }
        int size = this.f24795j.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f24795j.valueAt(i10)).a(this.f24807v[i10]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f24798m.post(this.f24797l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j10 = this.f24809x;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        if (this.f24810y) {
            return Long.MIN_VALUE;
        }
        return ((h) this.f24796k.getLast()).f25745g;
    }

    public final void h() {
        if (this.f24804s || this.f24800o || !this.f24799n) {
            return;
        }
        int size = this.f24795j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f24795j.valueAt(i10)).e() == null) {
                return;
            }
        }
        int size2 = this.f24795j.size();
        int i11 = 0;
        char c10 = 0;
        int i12 = -1;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            String str = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f24795j.valueAt(i11)).e().f25701f;
            char c11 = "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 3 : "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 2 : "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 1 : (char) 0;
            if (c11 > c10) {
                i12 = i11;
                c10 = c11;
            } else if (c11 == c10 && i12 != -1) {
                i12 = -1;
            }
            i11++;
        }
        y yVar = this.f24788c.f24734f;
        int i13 = yVar.f25821a;
        this.f24806u = -1;
        this.f24807v = new boolean[size2];
        y[] yVarArr = new y[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f24795j.valueAt(i14)).e();
            if (i14 == i12) {
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i13];
                for (int i15 = 0; i15 < i13; i15++) {
                    oVarArr[i15] = a(yVar.f25822b[i15], oVarE);
                }
                yVarArr[i14] = new y(oVarArr);
                this.f24806u = i14;
            } else {
                yVarArr[i14] = new y(a((c10 == 3 && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(oVarE.f25701f))) ? this.f24790e : null, oVarE));
            }
        }
        this.f24805t = new z(yVarArr);
        this.f24800o = true;
        i iVar = this.f24787b;
        int i16 = iVar.f24772k - 1;
        iVar.f24772k = i16;
        if (i16 > 0) {
            return;
        }
        int i17 = 0;
        for (n nVar : iVar.f24775n) {
            i17 += nVar.f24805t.f25825a;
        }
        y[] yVarArr2 = new y[i17];
        int i18 = 0;
        for (n nVar2 : iVar.f24775n) {
            int i19 = nVar2.f24805t.f25825a;
            int i20 = 0;
            while (i20 < i19) {
                yVarArr2[i18] = nVar2.f24805t.f25826b[i20];
                i20++;
                i18++;
            }
        }
        iVar.f24774m = new z(yVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f24771j).f25604f.obtainMessage(8, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f24793h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f25739a;
        int i10 = aVar.f25740b;
        int i11 = this.f24786a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f25741c;
        int i12 = aVar.f25742d;
        Object obj = aVar.f25743e;
        long j12 = aVar.f25744f;
        long j13 = aVar.f25745g;
        long jC = aVar.c();
        if (fVar.f25757b != null) {
            fVar.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC));
        }
        if (z10) {
            return;
        }
        int size = this.f24795j.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f24795j.valueAt(i13)).a(this.f24807v[i13]);
        }
        i iVar = this.f24787b;
        iVar.getClass();
        if (iVar.f24774m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f24771j;
        lVar.getClass();
        lVar.f25604f.obtainMessage(9, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        f fVar = this.f24788c;
        fVar.getClass();
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            fVar.f24737i = cVar.f24720i;
            fVar.a(cVar.f25739a.f25944a, cVar.f24723l, cVar.f24724m);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.f24793h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f25739a;
        int i10 = aVar.f25740b;
        int i11 = this.f24786a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f25741c;
        int i12 = aVar.f25742d;
        Object obj = aVar.f25743e;
        long j12 = aVar.f25744f;
        long j13 = aVar.f25745g;
        long jC = aVar.c();
        if (fVar2.f25757b != null) {
            fVar2.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar2, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC));
        }
        if (!this.f24800o) {
            b(this.f24808w);
            return;
        }
        i iVar = this.f24787b;
        iVar.getClass();
        if (iVar.f24774m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f24771j;
        lVar.getClass();
        lVar.f25604f.obtainMessage(9, iVar).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z r23, long r24, long r26, java.io.IOException r28) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z, long, long, java.io.IOException):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i10, int i11) {
        if (this.f24795j.indexOfKey(i10) >= 0) {
            return (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f24795j.get(i10);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f24789d);
        gVar.f24714n = this;
        gVar.f24703c.f24675r = this.f24803r;
        this.f24795j.put(i10, gVar);
        return gVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        String strA;
        if (oVar == null) {
            return oVar2;
        }
        int iC = com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(oVar2.f25701f);
        if (iC == 1) {
            strA = a(oVar.f25698c, 1);
        } else {
            strA = iC == 2 ? a(oVar.f25698c, 2) : null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f25696a, oVar2.f25700e, oVar2.f25701f, strA, oVar.f25697b, oVar2.f25702g, oVar.f25705j, oVar.f25706k, oVar2.f25707l, oVar2.f25708m, oVar2.f25709n, oVar2.f25711p, oVar2.f25710o, oVar2.f25712q, oVar2.f25713r, oVar2.f25714s, oVar2.f25715t, oVar2.f25716u, oVar2.f25717v, oVar.f25719x, oVar.f25720y, oVar2.f25721z, oVar2.f25718w, oVar2.f25703h, oVar2.f25704i, oVar2.f25699d);
    }

    public static String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (i10 == com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f24799n = true;
        this.f24798m.post(this.f24797l);
    }
}
