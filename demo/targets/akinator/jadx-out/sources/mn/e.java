package mn;

import android.net.Uri;
import gn.l1;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ln.b0;
import ln.c0;
import ln.f0;
import ln.g0;
import ln.m;
import ln.s;
import mn.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements ln.i {

    /* renamed from: a, reason: collision with root package name */
    public final ln.i f74827a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f74828b;

    /* renamed from: c, reason: collision with root package name */
    public final ln.i f74829c;

    /* renamed from: d, reason: collision with root package name */
    public final f f74830d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74831e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f74832f;

    /* renamed from: g, reason: collision with root package name */
    public m f74833g;

    /* renamed from: h, reason: collision with root package name */
    public m f74834h;

    /* renamed from: i, reason: collision with root package name */
    public ln.i f74835i;

    /* renamed from: j, reason: collision with root package name */
    public long f74836j;

    /* renamed from: k, reason: collision with root package name */
    public long f74837k;

    /* renamed from: l, reason: collision with root package name */
    public long f74838l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements ln.h {

        /* renamed from: b, reason: collision with root package name */
        public ln.f f74840b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f74842d;

        /* renamed from: e, reason: collision with root package name */
        public ln.h f74843e;

        /* renamed from: f, reason: collision with root package name */
        public l1 f74844f;

        /* renamed from: g, reason: collision with root package name */
        public int f74845g;

        /* renamed from: h, reason: collision with root package name */
        public int f74846h;

        /* renamed from: a, reason: collision with root package name */
        public ln.h f74839a = new s.a();

        /* renamed from: c, reason: collision with root package name */
        public f f74841c = f.R8;

        public final e a(ln.i iVar, int i10, int i11) {
            ln.g gVarCreateDataSink = null;
            if (io.bidmachine.media3.common.util.a.checkNotNull(null) != null) {
                throw new ClassCastException();
            }
            if (!this.f74842d && iVar != null) {
                ln.f fVar = this.f74840b;
                gVarCreateDataSink = fVar != null ? fVar.createDataSink() : new c.b().setCache(null).createDataSink();
            }
            return new e(iVar, this.f74839a.createDataSource(), gVarCreateDataSink, this.f74841c, i10, this.f74844f, i11);
        }

        public e createDataSourceForDownloading() {
            ln.h hVar = this.f74843e;
            return a(hVar != null ? hVar.createDataSource() : null, this.f74846h | 1, -4000);
        }

        public e createDataSourceForRemovingDownload() {
            return a(null, this.f74846h | 1, -4000);
        }

        public b getCache() {
            return null;
        }

        public f getCacheKeyFactory() {
            return this.f74841c;
        }

        public l1 getUpstreamPriorityTaskManager() {
            return this.f74844f;
        }

        public a setCacheKeyFactory(f fVar) {
            this.f74841c = fVar;
            return this;
        }

        public a setCacheReadDataSourceFactory(ln.h hVar) {
            this.f74839a = hVar;
            return this;
        }

        public a setCacheWriteDataSinkFactory(ln.f fVar) {
            this.f74840b = fVar;
            this.f74842d = fVar == null;
            return this;
        }

        public a setFlags(int i10) {
            this.f74846h = i10;
            return this;
        }

        public a setUpstreamDataSourceFactory(ln.h hVar) {
            this.f74843e = hVar;
            return this;
        }

        public a setUpstreamPriority(int i10) {
            this.f74845g = i10;
            return this;
        }

        public a setUpstreamPriorityTaskManager(l1 l1Var) {
            this.f74844f = l1Var;
            return this;
        }

        @Override // ln.h
        public e createDataSource() {
            ln.h hVar = this.f74843e;
            return a(hVar != null ? hVar.createDataSource() : null, this.f74846h, this.f74845g);
        }

        public a setCache(b bVar) {
            return this;
        }

        public a setEventListener(d dVar) {
            return this;
        }
    }

    public e(b bVar, ln.i iVar) {
        this(bVar, iVar, 0);
    }

    public final void a(m mVar, boolean z10) {
        if (!this.f74831e) {
            throw null;
        }
        throw null;
    }

    @Override // ln.i
    public void addTransferListener(g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        this.f74827a.addTransferListener(g0Var);
        this.f74829c.addTransferListener(g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ln.i
    public void close() throws IOException {
        this.f74833g = null;
        this.f74832f = null;
        this.f74837k = 0L;
        ln.i iVar = this.f74835i;
        if (iVar == null) {
            return;
        }
        try {
            iVar.close();
        } finally {
            this.f74834h = null;
            this.f74835i = null;
        }
    }

    public b getCache() {
        return null;
    }

    public f getCacheKeyFactory() {
        return this.f74830d;
    }

    @Override // ln.i
    public Map<String, List<String>> getResponseHeaders() {
        return !(this.f74835i == this.f74827a) ? this.f74829c.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // ln.i
    public Uri getUri() {
        return this.f74832f;
    }

    @Override // ln.i
    public long open(m mVar) throws IOException {
        m mVarBuild = mVar.buildUpon().setKey(((li.a) this.f74830d).buildCacheKey(mVar)).build();
        this.f74833g = mVarBuild;
        Uri uri = mVarBuild.f73467a;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    @Override // ln.i, gn.o
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
            long r1 = r11.f74838l
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = -1
            if (r1 != 0) goto Le
            return r2
        Le:
            ln.m r1 = r11.f74833g
            java.lang.Object r1 = io.bidmachine.media3.common.util.a.checkNotNull(r1)
            ln.m r1 = (ln.m) r1
            ln.m r5 = r11.f74834h
            java.lang.Object r5 = io.bidmachine.media3.common.util.a.checkNotNull(r5)
            ln.m r5 = (ln.m) r5
            long r6 = r11.f74837k
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r7 = 1
            r8 = 0
            if (r6 >= 0) goto La3
            ln.i r6 = r11.f74835i
            java.lang.Object r6 = io.bidmachine.media3.common.util.a.checkNotNull(r6)
            ln.i r6 = (ln.i) r6
            int r12 = r6.read(r12, r13, r14)
            r13 = -1
            if (r12 == r2) goto L4d
            long r0 = r11.f74837k
            long r2 = (long) r12
            long r0 = r0 + r2
            r11.f74837k = r0
            long r0 = r11.f74836j
            long r0 = r0 + r2
            r11.f74836j = r0
            long r0 = r11.f74838l
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 == 0) goto L8e
            long r0 = r0 - r2
            r11.f74838l = r0
            return r12
        L4d:
            ln.i r2 = r11.f74835i
            ln.i r6 = r11.f74827a
            if (r2 != r6) goto L55
            r6 = r7
            goto L56
        L55:
            r6 = r0
        L56:
            if (r6 != 0) goto L83
            long r5 = r5.f73473g
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 == 0) goto L64
            long r9 = r11.f74836j
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L83
        L64:
            java.lang.String r13 = r1.f73474h
            java.lang.Object r13 = io.bidmachine.media3.common.util.a1.castNonNull(r13)
            java.lang.String r13 = (java.lang.String) r13
            r11.f74838l = r3
            ln.i r13 = r11.f74835i
            ln.f0 r14 = r11.f74828b
            if (r13 != r14) goto L75
            r0 = r7
        L75:
            if (r0 != 0) goto L78
            goto L8e
        L78:
            mn.i r12 = new mn.i
            r12.<init>()
            long r13 = r11.f74837k
            mn.i.setContentLength(r12, r13)
            throw r8
        L83:
            long r5 = r11.f74838l
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
            r11.f74834h = r8
            r11.f74835i = r8
        L99:
            r11.a(r1, r0)
            throw r8
        L9d:
            r12 = move-exception
            r11.f74834h = r8
            r11.f74835i = r8
            throw r12
        La3:
            r11.a(r1, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.e.read(byte[], int, int):int");
    }

    public e(b bVar, ln.i iVar, int i10) {
        this(bVar, iVar, new s(), new c(bVar, 5242880L), i10, null);
    }

    public e(b bVar, ln.i iVar, ln.i iVar2, ln.g gVar, int i10, d dVar) {
        this(bVar, iVar, iVar2, gVar, i10, dVar, (f) null);
    }

    public e(b bVar, ln.i iVar, ln.i iVar2, ln.g gVar, int i10, d dVar, f fVar) {
        this(iVar, iVar2, gVar, fVar, i10, (l1) null, -1000);
    }

    public e(ln.i iVar, ln.i iVar2, ln.g gVar, f fVar, int i10, l1 l1Var, int i11) {
        this.f74827a = iVar2;
        this.f74830d = fVar == null ? f.R8 : fVar;
        this.f74831e = (i10 & 1) != 0;
        if (iVar != null) {
            iVar = l1Var != null ? new c0(iVar, l1Var, i11) : iVar;
            this.f74829c = iVar;
            this.f74828b = gVar != null ? new f0(iVar, gVar) : null;
        } else {
            this.f74829c = b0.f73423a;
            this.f74828b = null;
        }
    }
}
