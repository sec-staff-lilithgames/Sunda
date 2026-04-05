package com.mbridge.msdk.thrid.okhttp.internal.http1;

import b0.e2;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.mbridge.msdk.thrid.okhttp.internal.http.h;
import com.mbridge.msdk.thrid.okhttp.internal.http.k;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.i;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* renamed from: a, reason: collision with root package name */
    final t f43401a;

    /* renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f43402b;

    /* renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.e f43403c;

    /* renamed from: d, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.d f43404d;

    /* renamed from: e, reason: collision with root package name */
    int f43405e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f43406f = 262144;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class b implements s {

        /* renamed from: a, reason: collision with root package name */
        protected final i f43407a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f43408b;

        /* renamed from: c, reason: collision with root package name */
        protected long f43409c;

        private b() {
            this.f43407a = new i(a.this.f43403c.b());
            this.f43409c = 0L;
        }

        public final void a(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f43405e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                throw new IllegalStateException("state: " + a.this.f43405e);
            }
            aVar.a(this.f43407a);
            a aVar2 = a.this;
            aVar2.f43405e = 6;
            com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = aVar2.f43402b;
            if (gVar != null) {
                gVar.a(!z10, aVar2, this.f43409c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public com.mbridge.msdk.thrid.okio.t b() {
            return this.f43407a;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = a.this.f43403c.b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f43409c += jB;
                return jB;
            } catch (IOException e10) {
                a(false, e10);
                throw e10;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c implements r {

        /* renamed from: a, reason: collision with root package name */
        private final i f43411a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f43412b;

        public c() {
            this.f43411a = new i(a.this.f43404d.b());
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f43412b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            a.this.f43404d.a(j10);
            a.this.f43404d.a("\r\n");
            a.this.f43404d.a(cVar, j10);
            a.this.f43404d.a("\r\n");
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public com.mbridge.msdk.thrid.okio.t b() {
            return this.f43411a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f43412b) {
                return;
            }
            this.f43412b = true;
            a.this.f43404d.a("0\r\n\r\n");
            a.this.a(this.f43411a);
            a.this.f43405e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f43412b) {
                return;
            }
            a.this.f43404d.flush();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends b {

        /* renamed from: e, reason: collision with root package name */
        private final q f43414e;

        /* renamed from: f, reason: collision with root package name */
        private long f43415f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f43416g;

        public d(q qVar) {
            super();
            this.f43415f = -1L;
            this.f43416g = true;
            this.f43414e = qVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
            }
            if (this.f43408b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f43416g) {
                return -1L;
            }
            long j11 = this.f43415f;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f43416g) {
                    return -1L;
                }
            }
            long jB = super.b(cVar, Math.min(j10, this.f43415f));
            if (jB != -1) {
                this.f43415f -= jB;
                return jB;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43408b) {
                return;
            }
            if (this.f43416g && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f43408b = true;
        }

        private void d() throws IOException {
            if (this.f43415f != -1) {
                a.this.f43403c.c();
            }
            try {
                this.f43415f = a.this.f43403c.i();
                String strTrim = a.this.f43403c.c().trim();
                if (this.f43415f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(duhsDlGWdBkekB.xHRvHDelRQQynG))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f43415f + strTrim + "\"");
                }
                if (this.f43415f == 0) {
                    this.f43416g = false;
                    com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a.this.f43401a.i(), this.f43414e, a.this.f());
                    a(true, null);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class e implements r {

        /* renamed from: a, reason: collision with root package name */
        private final i f43418a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f43419b;

        /* renamed from: c, reason: collision with root package name */
        private long f43420c;

        public e(long j10) {
            this.f43418a = new i(a.this.f43404d.b());
            this.f43420c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f43419b) {
                throw new IllegalStateException("closed");
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.size(), 0L, j10);
            if (j10 <= this.f43420c) {
                a.this.f43404d.a(cVar, j10);
                this.f43420c -= j10;
            } else {
                StringBuilder sb2 = new StringBuilder("expected ");
                sb2.append(this.f43420c);
                throw new ProtocolException(e2.i(j10, " bytes but received ", sb2));
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public com.mbridge.msdk.thrid.okio.t b() {
            return this.f43418a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43419b) {
                return;
            }
            this.f43419b = true;
            if (this.f43420c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.f43418a);
            a.this.f43405e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f43419b) {
                return;
            }
            a.this.f43404d.flush();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends b {

        /* renamed from: e, reason: collision with root package name */
        private long f43422e;

        public f(long j10) throws IOException {
            super();
            this.f43422e = j10;
            if (j10 == 0) {
                a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
            }
            if (this.f43408b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f43422e;
            if (j11 == 0) {
                return -1L;
            }
            long jB = super.b(cVar, Math.min(j11, j10));
            if (jB == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j12 = this.f43422e - jB;
            this.f43422e = j12;
            if (j12 == 0) {
                a(true, null);
            }
            return jB;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43408b) {
                return;
            }
            if (this.f43422e != 0 && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f43408b = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g extends b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f43424e;

        public g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
            }
            if (this.f43408b) {
                throw new IllegalStateException("closed");
            }
            if (this.f43424e) {
                return -1L;
            }
            long jB = super.b(cVar, j10);
            if (jB != -1) {
                return jB;
            }
            this.f43424e = true;
            a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43408b) {
                return;
            }
            if (!this.f43424e) {
                a(false, null);
            }
            this.f43408b = true;
        }
    }

    public a(t tVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
        this.f43401a = tVar;
        this.f43402b = gVar;
        this.f43403c = eVar;
        this.f43404d = dVar;
    }

    private String e() throws IOException {
        String strD = this.f43403c.d(this.f43406f);
        this.f43406f -= strD.length();
        return strD;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(w wVar, long j10) {
        if ("chunked".equalsIgnoreCase(wVar.a("Transfer-Encoding"))) {
            return c();
        }
        if (j10 != -1) {
            return a(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f43404d.flush();
    }

    public r c() {
        if (this.f43405e == 1) {
            this.f43405e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f43405e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVarC = this.f43402b.c();
        if (cVarC != null) {
            cVarC.d();
        }
    }

    public s d() throws IOException {
        if (this.f43405e != 4) {
            throw new IllegalStateException("state: " + this.f43405e);
        }
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f43402b;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f43405e = 5;
        gVar.e();
        return new g();
    }

    public p f() throws IOException {
        p.a aVar = new p.a();
        while (true) {
            String strE = e();
            if (strE.length() == 0) {
                return aVar.a();
            }
            com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(aVar, strE);
        }
    }

    public s b(long j10) throws IOException {
        if (this.f43405e == 4) {
            this.f43405e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f43405e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(w wVar) throws IOException {
        a(wVar.c(), com.mbridge.msdk.thrid.okhttp.internal.http.i.a(wVar, this.f43402b.c().c().b().type()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public z a(y yVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f43402b;
        gVar.f43360f.responseBodyStart(gVar.f43359e);
        String strB = yVar.b("Content-Type");
        if (!com.mbridge.msdk.thrid.okhttp.internal.http.e.b(yVar)) {
            return new h(strB, 0L, l.a(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(yVar.b("Transfer-Encoding"))) {
            return new h(strB, -1L, l.a(a(yVar.r().g())));
        }
        long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(yVar);
        if (jA != -1) {
            return new h(strB, jA, l.a(b(jA)));
        }
        return new h(strB, -1L, l.a(d()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f43404d.flush();
    }

    public void a(p pVar, String str) throws IOException {
        if (this.f43405e == 0) {
            this.f43404d.a(str).a("\r\n");
            int iB = pVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                this.f43404d.a(pVar.a(i10)).a(": ").a(pVar.b(i10)).a("\r\n");
            }
            this.f43404d.a("\r\n");
            this.f43405e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f43405e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public y.a a(boolean z10) throws NumberFormatException, IOException {
        int i10 = this.f43405e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f43405e);
        }
        try {
            k kVarA = k.a(e());
            y.a aVarA = new y.a().a(kVarA.f43398a).a(kVarA.f43399b).a(kVarA.f43400c).a(f());
            if (z10 && kVarA.f43399b == 100) {
                return null;
            }
            if (kVarA.f43399b == 100) {
                this.f43405e = 3;
                return aVarA;
            }
            this.f43405e = 4;
            return aVarA;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f43402b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    public r a(long j10) {
        if (this.f43405e == 1) {
            this.f43405e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f43405e);
    }

    public s a(q qVar) throws IOException {
        if (this.f43405e == 4) {
            this.f43405e = 5;
            return new d(qVar);
        }
        throw new IllegalStateException("state: " + this.f43405e);
    }

    public void a(i iVar) {
        com.mbridge.msdk.thrid.okio.t tVarG = iVar.g();
        iVar.a(com.mbridge.msdk.thrid.okio.t.f43861d);
        tVarG.a();
        tVarG.b();
    }
}
