package rf;

import android.net.Uri;
import com.google.android.exoplayer2.util.x0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import qf.b1;
import qf.c0;
import qf.c1;
import qf.m;
import qf.n;
import qf.o;
import qf.p;
import qf.t;
import qf.v0;
import qf.w0;
import rf.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final p f84320a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f84321b;

    /* renamed from: c, reason: collision with root package name */
    public final p f84322c;

    /* renamed from: d, reason: collision with root package name */
    public final f f84323d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84324e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f84325f;

    /* renamed from: g, reason: collision with root package name */
    public t f84326g;

    /* renamed from: h, reason: collision with root package name */
    public t f84327h;

    /* renamed from: i, reason: collision with root package name */
    public p f84328i;

    /* renamed from: j, reason: collision with root package name */
    public long f84329j;

    /* renamed from: k, reason: collision with root package name */
    public long f84330k;

    /* renamed from: l, reason: collision with root package name */
    public long f84331l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements o {

        /* renamed from: b, reason: collision with root package name */
        public m f84333b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f84335d;

        /* renamed from: e, reason: collision with root package name */
        public o f84336e;

        /* renamed from: f, reason: collision with root package name */
        public x0 f84337f;

        /* renamed from: g, reason: collision with root package name */
        public int f84338g;

        /* renamed from: h, reason: collision with root package name */
        public int f84339h;

        /* renamed from: a, reason: collision with root package name */
        public o f84332a = new c0.a();

        /* renamed from: c, reason: collision with root package name */
        public f f84334c = f.U8;

        public final e a(p pVar, int i10, int i11) {
            n nVarCreateDataSink = null;
            if (com.google.android.exoplayer2.util.a.checkNotNull(null) != null) {
                throw new ClassCastException();
            }
            if (!this.f84335d && pVar != null) {
                m mVar = this.f84333b;
                nVarCreateDataSink = mVar != null ? mVar.createDataSink() : new c.b().setCache(null).createDataSink();
            }
            return new e(pVar, this.f84332a.createDataSource(), nVarCreateDataSink, this.f84334c, i10, this.f84337f, i11);
        }

        public e createDataSourceForDownloading() {
            o oVar = this.f84336e;
            return a(oVar != null ? oVar.createDataSource() : null, this.f84339h | 1, -1000);
        }

        public e createDataSourceForRemovingDownload() {
            return a(null, this.f84339h | 1, -1000);
        }

        public b getCache() {
            return null;
        }

        public f getCacheKeyFactory() {
            return this.f84334c;
        }

        public x0 getUpstreamPriorityTaskManager() {
            return this.f84337f;
        }

        public a setCacheKeyFactory(f fVar) {
            this.f84334c = fVar;
            return this;
        }

        public a setCacheReadDataSourceFactory(o oVar) {
            this.f84332a = oVar;
            return this;
        }

        public a setCacheWriteDataSinkFactory(m mVar) {
            this.f84333b = mVar;
            this.f84335d = mVar == null;
            return this;
        }

        public a setFlags(int i10) {
            this.f84339h = i10;
            return this;
        }

        public a setUpstreamDataSourceFactory(o oVar) {
            this.f84336e = oVar;
            return this;
        }

        public a setUpstreamPriority(int i10) {
            this.f84338g = i10;
            return this;
        }

        public a setUpstreamPriorityTaskManager(x0 x0Var) {
            this.f84337f = x0Var;
            return this;
        }

        @Override // qf.o
        public e createDataSource() {
            o oVar = this.f84336e;
            return a(oVar != null ? oVar.createDataSource() : null, this.f84339h, this.f84338g);
        }

        public a setCache(b bVar) {
            return this;
        }

        public a setEventListener(d dVar) {
            return this;
        }
    }

    public e(b bVar, p pVar) {
        this(bVar, pVar, 0);
    }

    public final void a(t tVar, boolean z10) {
        if (!this.f84324e) {
            throw null;
        }
        throw null;
    }

    @Override // qf.p
    public void addTransferListener(c1 c1Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(c1Var);
        this.f84320a.addTransferListener(c1Var);
        this.f84322c.addTransferListener(c1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qf.p
    public void close() throws IOException {
        this.f84326g = null;
        this.f84325f = null;
        this.f84330k = 0L;
        p pVar = this.f84328i;
        if (pVar == null) {
            return;
        }
        try {
            pVar.close();
        } finally {
            this.f84327h = null;
            this.f84328i = null;
        }
    }

    public b getCache() {
        return null;
    }

    public f getCacheKeyFactory() {
        return this.f84323d;
    }

    @Override // qf.p
    public Map<String, List<String>> getResponseHeaders() {
        return !(this.f84328i == this.f84320a) ? this.f84322c.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // qf.p
    public Uri getUri() {
        return this.f84325f;
    }

    @Override // qf.p
    public long open(t tVar) throws IOException {
        t tVarBuild = tVar.buildUpon().setKey(((pe.a) this.f84323d).buildCacheKey(tVar)).build();
        this.f84326g = tVarBuild;
        Uri uri = tVarBuild.f82992a;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    @Override // qf.p, qf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r12, int r13, int r14) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            long r1 = r11.f84331l
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = -1
            if (r1 != 0) goto Le
            return r2
        Le:
            qf.t r1 = r11.f84326g
            java.lang.Object r1 = com.google.android.exoplayer2.util.a.checkNotNull(r1)
            qf.t r1 = (qf.t) r1
            qf.t r5 = r11.f84327h
            java.lang.Object r5 = com.google.android.exoplayer2.util.a.checkNotNull(r5)
            qf.t r5 = (qf.t) r5
            long r6 = r11.f84330k
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r7 = 1
            r8 = 0
            if (r6 >= 0) goto La3
            qf.p r6 = r11.f84328i
            java.lang.Object r6 = com.google.android.exoplayer2.util.a.checkNotNull(r6)
            qf.p r6 = (qf.p) r6
            int r12 = r6.read(r12, r13, r14)
            r13 = -1
            if (r12 == r2) goto L4d
            long r0 = r11.f84330k
            long r2 = (long) r12
            long r0 = r0 + r2
            r11.f84330k = r0
            long r0 = r11.f84329j
            long r0 = r0 + r2
            r11.f84329j = r0
            long r0 = r11.f84331l
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 == 0) goto L8e
            long r0 = r0 - r2
            r11.f84331l = r0
            return r12
        L4d:
            qf.p r2 = r11.f84328i
            qf.p r6 = r11.f84320a
            if (r2 != r6) goto L55
            r6 = r7
            goto L56
        L55:
            r6 = r0
        L56:
            if (r6 != 0) goto L83
            long r5 = r5.f82998g
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 == 0) goto L64
            long r9 = r11.f84329j
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L83
        L64:
            java.lang.String r13 = r1.f82999h
            java.lang.Object r13 = com.google.android.exoplayer2.util.n1.castNonNull(r13)
            java.lang.String r13 = (java.lang.String) r13
            r11.f84331l = r3
            qf.p r13 = r11.f84328i
            qf.b1 r14 = r11.f84321b
            if (r13 != r14) goto L75
            r0 = r7
        L75:
            if (r0 != 0) goto L78
            goto L8e
        L78:
            rf.i r12 = new rf.i
            r12.<init>()
            long r13 = r11.f84330k
            rf.i.setContentLength(r12, r13)
            throw r8
        L83:
            long r5 = r11.f84331l
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 > 0) goto L8f
            int r13 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r13 != 0) goto L8e
            goto L8f
        L8e:
            return r12
        L8f:
            if (r2 != 0) goto L92
            goto L99
        L92:
            r2.close()     // Catch: java.lang.Throwable -> L9d
            r11.f84327h = r8
            r11.f84328i = r8
        L99:
            r11.a(r1, r0)
            throw r8
        L9d:
            r12 = move-exception
            r11.f84327h = r8
            r11.f84328i = r8
            throw r12
        La3:
            r11.a(r1, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.e.read(byte[], int, int):int");
    }

    public e(b bVar, p pVar, int i10) {
        this(bVar, pVar, new c0(), new c(bVar, 5242880L), i10, null);
    }

    public e(b bVar, p pVar, p pVar2, n nVar, int i10, d dVar) {
        this(bVar, pVar, pVar2, nVar, i10, dVar, (f) null);
    }

    public e(b bVar, p pVar, p pVar2, n nVar, int i10, d dVar, f fVar) {
        this(pVar, pVar2, nVar, fVar, i10, (x0) null, 0);
    }

    public e(p pVar, p pVar2, n nVar, f fVar, int i10, x0 x0Var, int i11) {
        this.f84320a = pVar2;
        this.f84323d = fVar == null ? f.U8 : fVar;
        this.f84324e = (i10 & 1) != 0;
        if (pVar != null) {
            pVar = x0Var != null ? new w0(pVar, x0Var, i11) : pVar;
            this.f84322c = pVar;
            this.f84321b = nVar != null ? new b1(pVar, nVar) : null;
        } else {
            this.f84322c = v0.f83020a;
            this.f84321b = null;
        }
    }
}
