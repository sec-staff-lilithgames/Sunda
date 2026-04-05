package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements s, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.upstream.x, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public boolean A;
    public long C;
    public int E;
    public boolean F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f25780a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f25781b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25782c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f25783d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f25784e;

    /* renamed from: f, reason: collision with root package name */
    public final t f25785f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f25786g;

    /* renamed from: j, reason: collision with root package name */
    public final n f25789j;

    /* renamed from: p, reason: collision with root package name */
    public r f25795p;

    /* renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.q f25796q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25797r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25798s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f25799t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25800u;

    /* renamed from: v, reason: collision with root package name */
    public int f25801v;

    /* renamed from: w, reason: collision with root package name */
    public z f25802w;

    /* renamed from: x, reason: collision with root package name */
    public long f25803x;

    /* renamed from: y, reason: collision with root package name */
    public boolean[] f25804y;

    /* renamed from: z, reason: collision with root package name */
    public boolean[] f25805z;

    /* renamed from: h, reason: collision with root package name */
    public final String f25787h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 f25788i = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0("Loader:ExtractorMediaPeriod");

    /* renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f25790k = new com.fyber.inneractive.sdk.player.exoplayer2.util.e();

    /* renamed from: l, reason: collision with root package name */
    public final i f25791l = new i(this);

    /* renamed from: m, reason: collision with root package name */
    public final j f25792m = new j(this);

    /* renamed from: n, reason: collision with root package name */
    public final Handler f25793n = new Handler();
    public long D = C.TIME_UNSET;

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f25794o = new SparseArray();
    public long B = -1;

    public p(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, int i10, Handler handler, b0 b0Var, t tVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f25780a = uri;
        this.f25781b = hVar;
        this.f25782c = i10;
        this.f25783d = handler;
        this.f25784e = b0Var;
        this.f25785f = tVar;
        this.f25786g = bVar;
        this.f25789j = new n(iVarArr, this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, boolean z10) {
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f25773i;
        }
        if (z10 || this.f25801v <= 0) {
            return;
        }
        int size = this.f25794o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i10)).a(this.f25804y[i10]);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f25795p;
        lVar.getClass();
        lVar.f25604f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        boolean z10 = false;
        if (this.F || (this.f25798s && this.f25801v == 0)) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f25790k;
        synchronized (eVar) {
            if (!eVar.f26015a) {
                eVar.f26015a = true;
                eVar.notifyAll();
                z10 = true;
            }
        }
        if (this.f25788i.a()) {
            return z10;
        }
        i();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        long jMax;
        if (this.F) {
            return Long.MIN_VALUE;
        }
        long j10 = this.D;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        int i10 = 0;
        if (this.A) {
            int size = this.f25794o.size();
            jMax = Long.MAX_VALUE;
            while (i10 < size) {
                if (this.f25805z[i10]) {
                    jMax = Math.min(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i10)).d());
                }
                i10++;
            }
        } else {
            int size2 = this.f25794o.size();
            jMax = Long.MIN_VALUE;
            while (i10 < size2) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i10)).d());
                i10++;
            }
        }
        return jMax == Long.MIN_VALUE ? this.C : jMax;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        this.f25788i.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f25793n.post(this.f25791l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        if (this.f25801v == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        if (!this.f25800u) {
            return C.TIME_UNSET;
        }
        this.f25800u = false;
        return this.C;
    }

    public final int h() {
        int size = this.f25794o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i11)).f24703c;
            i10 += eVar.f24667j + eVar.f24666i;
        }
        return i10;
    }

    public final void i() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = new m(this, this.f25780a, this.f25781b, this.f25789j, this.f25790k);
        if (this.f25798s) {
            long j10 = this.D;
            if (j10 == C.TIME_UNSET) {
                throw new IllegalStateException();
            }
            long j11 = this.f25803x;
            if (j11 != C.TIME_UNSET && j10 >= j11) {
                this.F = true;
                this.D = C.TIME_UNSET;
                return;
            }
            long jA = this.f25796q.a(j10);
            long j12 = this.D;
            mVar.f25769e.f25218a = jA;
            mVar.f25772h = j12;
            mVar.f25771g = true;
            this.D = C.TIME_UNSET;
        }
        this.E = h();
        int i10 = this.f25782c;
        if (i10 == -1) {
            i10 = (this.f25798s && this.B == -1 && ((qVar = this.f25796q) == null || qVar.c() == C.TIME_UNSET)) ? 6 : 3;
        }
        int i11 = i10;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = this.f25788i;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.y(b0Var, looperMyLooper, mVar, this, i11, SystemClock.elapsedRealtime());
        if (b0Var.f25852b != null) {
            throw new IllegalStateException();
        }
        b0Var.f25852b = yVar;
        yVar.f26003e = null;
        b0Var.f25851a.execute(yVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11) {
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f25773i;
        }
        this.F = true;
        if (this.f25803x == C.TIME_UNSET) {
            int size = this.f25794o.size();
            long jMax = Long.MIN_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i10)).d());
            }
            long j12 = jMax == Long.MIN_VALUE ? 0L : 10000 + jMax;
            this.f25803x = j12;
            this.f25785f.a(new x(j12, j12, 0L, 0L, this.f25796q.a(), false), null);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f25795p;
        lVar.getClass();
        lVar.f25604f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f25797r = true;
        this.f25793n.post(this.f25791l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, IOException iOException) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = (m) zVar;
        if (this.B == -1) {
            this.B = mVar.f25773i;
        }
        Handler handler = this.f25783d;
        if (handler != null && this.f25784e != null) {
            handler.post(new l(this, iOException));
        }
        if ((iOException instanceof a0) || (iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v)) {
            return 3;
        }
        if ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.u) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException))) {
            return 3;
        }
        int i10 = h() > this.E ? 1 : 0;
        if (this.B == -1 && ((qVar = this.f25796q) == null || qVar.c() == C.TIME_UNSET)) {
            this.C = 0L;
            this.f25800u = this.f25798s;
            int size = this.f25794o.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i11)).a(!this.f25798s || this.f25804y[i11]);
            }
            mVar.f25769e.f25218a = 0L;
            mVar.f25772h = 0L;
            mVar.f25771g = true;
        }
        this.E = h();
        return i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        this.f25795p = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f25790k;
        synchronized (eVar) {
            if (!eVar.f26015a) {
                eVar.f26015a = true;
                eVar.notifyAll();
            }
        }
        i();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f25802w;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar;
        if (this.f25798s) {
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                v vVar = vVarArr[i10];
                if (vVar != null && (bVarArr[i10] == null || !zArr[i10])) {
                    int i11 = ((o) vVar).f25778a;
                    boolean[] zArr3 = this.f25804y;
                    if (zArr3[i11]) {
                        this.f25801v--;
                        zArr3[i11] = false;
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i11)).b();
                        vVarArr[i10] = null;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            boolean z10 = false;
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                if (vVarArr[i12] == null && (bVar = bVarArr[i12]) != null) {
                    int[] iArr = bVar.f25835c;
                    if (iArr.length == 1) {
                        if (iArr[0] == 0) {
                            z zVar = this.f25802w;
                            y yVar = bVar.f25833a;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= zVar.f25825a) {
                                    i13 = -1;
                                    break;
                                }
                                if (zVar.f25826b[i13] == yVar) {
                                    break;
                                }
                                i13++;
                            }
                            boolean[] zArr4 = this.f25804y;
                            if (!zArr4[i13]) {
                                this.f25801v++;
                                zArr4[i13] = true;
                                vVarArr[i12] = new o(this, i13);
                                zArr2[i12] = true;
                                z10 = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            if (!this.f25799t) {
                int size = this.f25794o.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (!this.f25804y[i14]) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i14)).b();
                    }
                }
            }
            if (this.f25801v == 0) {
                this.f25800u = false;
                if (this.f25788i.a()) {
                    this.f25788i.f25852b.a(false);
                }
            } else if (!this.f25799t ? j10 != 0 : z10) {
                j10 = a(j10);
                for (int i15 = 0; i15 < vVarArr.length; i15++) {
                    if (vVarArr[i15] != null) {
                        zArr2[i15] = true;
                    }
                }
            }
            this.f25799t = true;
            return j10;
        }
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j10) {
        if (!this.f25796q.a()) {
            j10 = 0;
        }
        this.C = j10;
        int size = this.f25794o.size();
        boolean zA = !(this.D != C.TIME_UNSET);
        for (int i10 = 0; zA && i10 < size; i10++) {
            if (this.f25804y[i10]) {
                zA = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i10)).a(false, j10);
            }
        }
        if (!zA) {
            this.D = j10;
            this.F = false;
            if (this.f25788i.a()) {
                this.f25788i.f25852b.a(false);
            } else {
                for (int i11 = 0; i11 < size; i11++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.valueAt(i11)).a(this.f25804y[i11]);
                }
            }
        }
        this.f25800u = false;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i10, int i11) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25794o.get(i10);
        if (gVar != null) {
            return gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f25786g);
        gVar2.f24714n = this;
        this.f25794o.put(i10, gVar2);
        return gVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar) {
        this.f25796q = qVar;
        this.f25793n.post(this.f25791l);
    }
}
