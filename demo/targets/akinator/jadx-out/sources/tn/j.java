package tn;

import android.net.Uri;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.m0;
import io.bidmachine.media3.common.util.u0;
import io.bidmachine.media3.common.util.x0;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ln.m;
import nh.b5;
import on.f0;
import tn.g;
import vn.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends co.p {
    public static final AtomicInteger N = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public final f0 C;
    public final long D;
    public k E;
    public r F;
    public int G;
    public boolean H;
    public volatile boolean I;
    public boolean J;
    public b5 K;
    public boolean L;
    public boolean M;

    /* renamed from: k, reason: collision with root package name */
    public final int f87218k;

    /* renamed from: l, reason: collision with root package name */
    public final int f87219l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f87220m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f87221n;

    /* renamed from: o, reason: collision with root package name */
    public final int f87222o;

    /* renamed from: p, reason: collision with root package name */
    public final ln.i f87223p;

    /* renamed from: q, reason: collision with root package name */
    public final ln.m f87224q;

    /* renamed from: r, reason: collision with root package name */
    public final k f87225r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f87226s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f87227t;

    /* renamed from: u, reason: collision with root package name */
    public final u0 f87228u;

    /* renamed from: v, reason: collision with root package name */
    public final i f87229v;

    /* renamed from: w, reason: collision with root package name */
    public final List f87230w;

    /* renamed from: x, reason: collision with root package name */
    public final DrmInitData f87231x;

    /* renamed from: y, reason: collision with root package name */
    public final yo.h f87232y;

    /* renamed from: z, reason: collision with root package name */
    public final m0 f87233z;

    public j(i iVar, ln.i iVar2, ln.m mVar, io.bidmachine.media3.common.b bVar, boolean z10, ln.i iVar3, ln.m mVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, u0 u0Var, long j13, DrmInitData drmInitData, k kVar, yo.h hVar, m0 m0Var, boolean z15, f0 f0Var) {
        super(iVar2, mVar, bVar, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f87222o = i11;
        this.M = z12;
        this.f87219l = i12;
        this.f87224q = mVar2;
        this.f87223p = iVar3;
        this.H = mVar2 != null;
        this.B = z11;
        this.f87220m = uri;
        this.f87226s = z14;
        this.f87228u = u0Var;
        this.D = j13;
        this.f87227t = z13;
        this.f87229v = iVar;
        this.f87230w = list;
        this.f87231x = drmInitData;
        this.f87225r = kVar;
        this.f87232y = hVar;
        this.f87233z = m0Var;
        this.f87221n = z15;
        this.C = f0Var;
        this.K = b5.of();
        this.f87218k = N.getAndIncrement();
    }

    public static byte[] b(String str) {
        if (mh.c.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static j createInstance(i iVar, ln.i iVar2, io.bidmachine.media3.common.b bVar, long j10, vn.f fVar, g.e eVar, Uri uri, List<io.bidmachine.media3.common.b> list, int i10, Object obj, boolean z10, v vVar, long j11, j jVar, byte[] bArr, byte[] bArr2, boolean z11, f0 f0Var, go.j jVar2) {
        ln.i aVar;
        boolean z12;
        k kVar;
        ln.m mVarBuild;
        boolean z13;
        Uri uri2;
        yo.h hVar;
        m0 m0Var;
        ln.i aVar2 = iVar2;
        vn.g gVar = eVar.f87214a;
        m.a length = new m.a().setUri(x0.resolveToUri(fVar.f89448a, gVar.f89417b)).setPosition(gVar.f89425k).setLength(gVar.f89426l);
        boolean z14 = eVar.f87217d;
        ln.m mVarBuild2 = length.setFlags(z14 ? 8 : 0).build();
        if (jVar2 != null) {
            jVar2.createCmcdData();
            throw null;
        }
        boolean z15 = bArr != null;
        byte[] bArrB = z15 ? b((String) io.bidmachine.media3.common.util.a.checkNotNull(gVar.f89424j)) : null;
        if (bArr != null) {
            io.bidmachine.media3.common.util.a.checkNotNull(bArrB);
            aVar = new a(aVar2, bArr, bArrB);
        } else {
            aVar = aVar2;
        }
        f.e eVar2 = gVar.f89418c;
        if (eVar2 != null) {
            boolean z16 = bArr2 != null;
            byte[] bArrB2 = z16 ? b((String) io.bidmachine.media3.common.util.a.checkNotNull(eVar2.f89424j)) : null;
            kVar = null;
            boolean z17 = z16;
            z12 = true;
            mVarBuild = new m.a().setUri(x0.resolveToUri(fVar.f89448a, eVar2.f89417b)).setPosition(eVar2.f89425k).setLength(eVar2.f89426l).build();
            if (jVar2 != null) {
                jVar2.setObjectType("i").createCmcdData();
                throw null;
            }
            if (bArr2 != null) {
                io.bidmachine.media3.common.util.a.checkNotNull(bArrB2);
                aVar2 = new a(aVar2, bArr2, bArrB2);
            }
            z13 = z17;
        } else {
            z12 = true;
            kVar = null;
            aVar2 = null;
            mVarBuild = null;
            z13 = false;
        }
        long j12 = j10 + gVar.f89421g;
        long j13 = j12 + gVar.f89419e;
        int i11 = fVar.f89373j + gVar.f89420f;
        if (jVar != null) {
            ln.m mVar = jVar.f87224q;
            boolean z18 = (mVarBuild == mVar || (mVarBuild != null && mVar != null && mVarBuild.f73467a.equals(mVar.f73467a) && mVarBuild.f73472f == mVar.f73472f)) ? z12 : false;
            uri2 = uri;
            boolean z19 = (uri2.equals(jVar.f87220m) && jVar.J) ? z12 : false;
            hVar = jVar.f87232y;
            m0Var = jVar.f87233z;
            if (z18 && z19 && !jVar.L && jVar.f87219l == i11) {
                kVar = jVar.E;
            }
        } else {
            uri2 = uri;
            hVar = new yo.h();
            m0Var = new m0(10);
        }
        return new j(iVar, aVar, mVarBuild2, bVar, z15, aVar2, mVarBuild, z13, uri2, list, i10, obj, j12, j13, eVar.f87215b, eVar.f87216c, !z14, i11, gVar.f89427m, z10, vVar.getAdjuster(i11), j11, gVar.f89422h, kVar, hVar, m0Var, z11, f0Var);
    }

    public static boolean shouldSpliceIn(j jVar, Uri uri, vn.f fVar, g.e eVar, long j10) {
        if (jVar == null) {
            return false;
        }
        if (uri.equals(jVar.f87220m) && jVar.J) {
            return false;
        }
        vn.g gVar = eVar.f87214a;
        return !(gVar instanceof f.c ? ((f.c) gVar).f89405n || (eVar.f87216c == 0 && fVar.f89450c) : fVar.f89450c) || j10 + gVar.f89421g < jVar.f12424h;
    }

    public final void a(ln.i iVar, ln.m mVar, boolean z10, boolean z11) {
        ln.m mVarSubrange;
        long position;
        if (z10) {
            z = this.G != 0;
            mVarSubrange = mVar;
        } else {
            mVarSubrange = mVar.subrange(this.G);
        }
        try {
            ko.s sVarC = c(iVar, mVarSubrange, z11);
            if (z) {
                sVarC.skipFully(this.G);
            }
            while (!this.I && this.E.read(sVarC)) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f12420d.f60656f & 16384) == 0) {
                            throw e10;
                        }
                        this.E.onTruncatedSegmentParsed();
                        position = sVarC.getPosition();
                    }
                } catch (Throwable th2) {
                    this.G = (int) (sVarC.getPosition() - mVar.f73472f);
                    throw th2;
                }
            }
            position = sVarC.getPosition();
            this.G = (int) (position - mVar.f73472f);
        } finally {
            ln.l.closeQuietly(iVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ko.s c(ln.i r13, ln.m r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.j.c(ln.i, ln.m, boolean):ko.s");
    }

    @Override // co.p, co.e, go.x
    public void cancelLoad() {
        this.I = true;
    }

    public int getFirstSampleIndex(int i10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f87221n);
        if (i10 >= this.K.size()) {
            return 0;
        }
        return ((Integer) this.K.get(i10)).intValue();
    }

    public void init(r rVar, b5 b5Var) {
        this.F = rVar;
        this.K = b5Var;
    }

    public void invalidateExtractor() {
        this.L = true;
    }

    @Override // co.p
    public boolean isLoadCompleted() {
        return this.J;
    }

    public boolean isPublished() {
        return this.M;
    }

    @Override // co.p, co.e, go.x
    public void load() throws IOException {
        k kVar;
        io.bidmachine.media3.common.util.a.checkNotNull(this.F);
        if (this.E == null && (kVar = this.f87225r) != null && kVar.isReusable()) {
            this.E = this.f87225r;
            this.H = false;
        }
        ln.m mVar = this.f87224q;
        ln.i iVar = this.f87223p;
        if (this.H) {
            io.bidmachine.media3.common.util.a.checkNotNull(iVar);
            io.bidmachine.media3.common.util.a.checkNotNull(mVar);
            a(iVar, mVar, this.B, false);
            this.G = 0;
            this.H = false;
        }
        if (this.I) {
            return;
        }
        if (!this.f87227t) {
            a(this.f12425i, this.f12418b, this.A, true);
        }
        this.J = !this.I;
    }

    public void publish() {
        this.M = true;
    }
}
