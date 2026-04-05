package ew;

import dw.i;
import dw.m;
import dw.o;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import pw.b1;
import pw.d1;
import pw.j;
import pw.k;
import pw.v;
import pw.z0;
import sv.k0;
import xv.f0;
import xv.g0;
import xv.l0;
import xv.n0;
import xv.o0;
import xv.u0;
import xv.v0;
import yv.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements dw.g {

    /* renamed from: h, reason: collision with root package name */
    public static final f0 f55156h;

    /* renamed from: a, reason: collision with root package name */
    public final l0 f55157a;

    /* renamed from: b, reason: collision with root package name */
    public final dw.f f55158b;

    /* renamed from: c, reason: collision with root package name */
    public final k f55159c;

    /* renamed from: d, reason: collision with root package name */
    public final j f55160d;

    /* renamed from: e, reason: collision with root package name */
    public int f55161e;

    /* renamed from: f, reason: collision with root package name */
    public final ew.a f55162f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f55163g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class a implements b1 {

        /* renamed from: b, reason: collision with root package name */
        public final g0 f55164b;

        /* renamed from: c, reason: collision with root package name */
        public final v f55165c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f55166e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f55167f;

        public a(b bVar, g0 url) {
            e0.checkNotNullParameter(url, "url");
            this.f55167f = bVar;
            this.f55164b = url;
            this.f55165c = new v(bVar.f55159c.timeout());
        }

        @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        public final g0 getUrl() {
            return this.f55164b;
        }

        @Override // pw.b1
        public long read(pw.g sink, long j10) throws IOException {
            b bVar = this.f55167f;
            e0.checkNotNullParameter(sink, "sink");
            try {
                return bVar.f55159c.read(sink, j10);
            } catch (IOException e10) {
                bVar.getCarrier().noNewExchanges();
                responseBodyComplete(b.f55156h);
                throw e10;
            }
        }

        public final void responseBodyComplete(f0 trailers) {
            l0 l0Var;
            xv.v vVarCookieJar;
            e0.checkNotNullParameter(trailers, "trailers");
            b bVar = this.f55167f;
            if (bVar.f55161e == 6) {
                return;
            }
            if (bVar.f55161e != 5) {
                throw new IllegalStateException("state: " + bVar.f55161e);
            }
            b.access$detachTimeout(bVar, this.f55165c);
            bVar.f55163g = trailers;
            bVar.f55161e = 6;
            if (trailers.size() <= 0 || (l0Var = bVar.f55157a) == null || (vVarCookieJar = l0Var.cookieJar()) == null) {
                return;
            }
            i.receiveHeaders(vVarCookieJar, this.f55164b, trailers);
        }

        @Override // pw.b1
        public d1 timeout() {
            return this.f55165c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ew.b$b, reason: collision with other inner class name */
    public final class C0560b implements z0 {

        /* renamed from: b, reason: collision with root package name */
        public final v f55168b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f55169c;

        public C0560b() {
            this.f55168b = new v(b.this.f55160d.timeout());
        }

        @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f55169c) {
                return;
            }
            this.f55169c = true;
            b.this.f55160d.writeUtf8("0\r\n\r\n");
            b.access$detachTimeout(b.this, this.f55168b);
            b.this.f55161e = 3;
        }

        @Override // pw.z0, java.io.Flushable
        public synchronized void flush() {
            if (this.f55169c) {
                return;
            }
            b.this.f55160d.flush();
        }

        @Override // pw.z0
        public d1 timeout() {
            return this.f55168b;
        }

        @Override // pw.z0
        public void write(pw.g source, long j10) throws IOException {
            e0.checkNotNullParameter(source, "source");
            if (this.f55169c) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            b bVar = b.this;
            bVar.f55160d.writeHexadecimalUnsignedLong(j10);
            bVar.f55160d.writeUtf8("\r\n");
            bVar.f55160d.write(source, j10);
            bVar.f55160d.writeUtf8("\r\n");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c extends a {

        /* renamed from: g, reason: collision with root package name */
        public long f55171g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f55172h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ b f55173i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, g0 url) {
            super(bVar, url);
            e0.checkNotNullParameter(url, "url");
            this.f55173i = bVar;
            this.f55171g = -1L;
            this.f55172h = true;
        }

        @Override // ew.b.a, pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f55166e) {
                return;
            }
            if (this.f55172h && !yv.i.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.f55173i.getCarrier().noNewExchanges();
                responseBodyComplete(b.f55156h);
            }
            this.f55166e = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        
            if (r11.f55172h == false) goto L30;
         */
        @Override // ew.b.a, pw.b1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(pw.g r12, long r13) throws java.io.IOException {
            /*
                r11 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.e0.checkNotNullParameter(r12, r0)
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Ld3
                boolean r2 = r11.f55166e
                if (r2 != 0) goto Lcb
                boolean r2 = r11.f55172h
                r3 = -1
                if (r2 != 0) goto L16
                goto L7a
            L16:
                long r5 = r11.f55171g
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                ew.b r7 = r11.f55173i
                if (r2 == 0) goto L22
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 != 0) goto L7b
            L22:
                java.lang.String r2 = "expected chunk size and optional extensions but was \""
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 == 0) goto L2f
                pw.k r5 = ew.b.access$getSource$p(r7)
                r5.readUtf8LineStrict()
            L2f:
                pw.k r5 = ew.b.access$getSource$p(r7)     // Catch: java.lang.NumberFormatException -> L61
                long r5 = r5.readHexadecimalUnsignedLong()     // Catch: java.lang.NumberFormatException -> L61
                r11.f55171g = r5     // Catch: java.lang.NumberFormatException -> L61
                pw.k r5 = ew.b.access$getSource$p(r7)     // Catch: java.lang.NumberFormatException -> L61
                java.lang.String r5 = r5.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L61
                java.lang.CharSequence r5 = sv.n0.trim(r5)     // Catch: java.lang.NumberFormatException -> L61
                java.lang.String r5 = r5.toString()     // Catch: java.lang.NumberFormatException -> L61
                long r8 = r11.f55171g     // Catch: java.lang.NumberFormatException -> L61
                int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r6 < 0) goto La5
                int r6 = r5.length()     // Catch: java.lang.NumberFormatException -> L61
                r8 = 0
                if (r6 <= 0) goto L63
                java.lang.String r6 = ";"
                r9 = 2
                r10 = 0
                boolean r6 = sv.k0.startsWith$default(r5, r6, r8, r9, r10)     // Catch: java.lang.NumberFormatException -> L61
                if (r6 == 0) goto La5
                goto L63
            L61:
                r12 = move-exception
                goto Lc1
            L63:
                long r5 = r11.f55171g
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 != 0) goto L76
                r11.f55172h = r8
                ew.a r0 = ew.b.access$getHeadersReader$p(r7)
                xv.f0 r0 = r0.readHeaders()
                r11.responseBodyComplete(r0)
            L76:
                boolean r0 = r11.f55172h
                if (r0 != 0) goto L7b
            L7a:
                return r3
            L7b:
                long r0 = r11.f55171g
                long r13 = java.lang.Math.min(r13, r0)
                long r12 = super.read(r12, r13)
                int r14 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
                if (r14 == 0) goto L8f
                long r0 = r11.f55171g
                long r0 = r0 - r12
                r11.f55171g = r0
                return r12
            L8f:
                dw.f r12 = r7.getCarrier()
                r12.noNewExchanges()
                java.net.ProtocolException r12 = new java.net.ProtocolException
                java.lang.String r13 = "unexpected end of stream"
                r12.<init>(r13)
                xv.f0 r13 = ew.b.access$getTRAILERS_RESPONSE_BODY_TRUNCATED$cp()
                r11.responseBodyComplete(r13)
                throw r12
            La5:
                java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L61
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L61
                r13.<init>(r2)     // Catch: java.lang.NumberFormatException -> L61
                long r0 = r11.f55171g     // Catch: java.lang.NumberFormatException -> L61
                r13.append(r0)     // Catch: java.lang.NumberFormatException -> L61
                r13.append(r5)     // Catch: java.lang.NumberFormatException -> L61
                r14 = 34
                r13.append(r14)     // Catch: java.lang.NumberFormatException -> L61
                java.lang.String r13 = r13.toString()     // Catch: java.lang.NumberFormatException -> L61
                r12.<init>(r13)     // Catch: java.lang.NumberFormatException -> L61
                throw r12     // Catch: java.lang.NumberFormatException -> L61
            Lc1:
                java.net.ProtocolException r13 = new java.net.ProtocolException
                java.lang.String r12 = r12.getMessage()
                r13.<init>(r12)
                throw r13
            Lcb:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "closed"
                r12.<init>(r13)
                throw r12
            Ld3:
                java.lang.String r12 = "byteCount < 0: "
                java.lang.String r12 = p0.o2.m(r13, r12)
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ew.b.c.read(pw.g, long):long");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {
        public d(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class e extends a {

        /* renamed from: g, reason: collision with root package name */
        public long f55174g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b f55175h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, g0 url, long j10) {
            super(bVar, url);
            e0.checkNotNullParameter(url, "url");
            this.f55175h = bVar;
            this.f55174g = j10;
            if (j10 == 0) {
                responseBodyComplete(f0.f93622e);
            }
        }

        @Override // ew.b.a, pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f55166e) {
                return;
            }
            if (this.f55174g != 0 && !yv.i.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.f55175h.getCarrier().noNewExchanges();
                responseBodyComplete(b.f55156h);
            }
            this.f55166e = true;
        }

        @Override // ew.b.a, pw.b1
        public long read(pw.g sink, long j10) throws IOException {
            e0.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
            }
            if (this.f55166e) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f55174g;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                this.f55175h.getCarrier().noNewExchanges();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete(b.f55156h);
                throw protocolException;
            }
            long j13 = this.f55174g - j12;
            this.f55174g = j13;
            if (j13 == 0) {
                responseBodyComplete(f0.f93622e);
            }
            return j12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class f implements z0 {

        /* renamed from: b, reason: collision with root package name */
        public final v f55176b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f55177c;

        public f() {
            this.f55176b = new v(b.this.f55160d.timeout());
        }

        @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f55177c) {
                return;
            }
            this.f55177c = true;
            v vVar = this.f55176b;
            b bVar = b.this;
            b.access$detachTimeout(bVar, vVar);
            bVar.f55161e = 3;
        }

        @Override // pw.z0, java.io.Flushable
        public void flush() throws IOException {
            if (this.f55177c) {
                return;
            }
            b.this.f55160d.flush();
        }

        @Override // pw.z0
        public d1 timeout() {
            return this.f55176b;
        }

        @Override // pw.z0
        public void write(pw.g source, long j10) throws IOException {
            e0.checkNotNullParameter(source, "source");
            if (this.f55177c) {
                throw new IllegalStateException("closed");
            }
            h.checkOffsetAndCount(source.size(), 0L, j10);
            b.this.f55160d.write(source, j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class g extends a {

        /* renamed from: g, reason: collision with root package name */
        public boolean f55179g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, g0 url) {
            super(bVar, url);
            e0.checkNotNullParameter(url, "url");
        }

        @Override // ew.b.a, pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f55166e) {
                return;
            }
            if (!this.f55179g) {
                responseBodyComplete(b.f55156h);
            }
            this.f55166e = true;
        }

        @Override // ew.b.a, pw.b1
        public long read(pw.g sink, long j10) throws IOException {
            e0.checkNotNullParameter(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
            }
            if (this.f55166e) {
                throw new IllegalStateException("closed");
            }
            if (this.f55179g) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f55179g = true;
            responseBodyComplete(f0.f93622e);
            return -1L;
        }
    }

    static {
        new d(null);
        f55156h = f0.f93621c.of("OkHttp-Response-Body", "Truncated");
    }

    public b(l0 l0Var, dw.f carrier, k source, j sink) {
        e0.checkNotNullParameter(carrier, "carrier");
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(sink, "sink");
        this.f55157a = l0Var;
        this.f55158b = carrier;
        this.f55159c = source;
        this.f55160d = sink;
        this.f55162f = new ew.a(source);
    }

    public static final void access$detachTimeout(b bVar, v vVar) {
        bVar.getClass();
        d1 d1VarDelegate = vVar.delegate();
        vVar.setDelegate((d1) d1.f81884f);
        d1VarDelegate.clearDeadline();
        d1VarDelegate.clearTimeout();
    }

    public final e a(g0 g0Var, long j10) {
        if (this.f55161e == 4) {
            this.f55161e = 5;
            return new e(this, g0Var, j10);
        }
        throw new IllegalStateException(("state: " + this.f55161e).toString());
    }

    @Override // dw.g
    public void cancel() {
        getCarrier().cancel();
    }

    @Override // dw.g
    public z0 createRequestBody(o0 request, long j10) throws ProtocolException {
        e0.checkNotNullParameter(request, "request");
        u0 u0VarBody = request.body();
        if (u0VarBody != null && u0VarBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (k0.equals("chunked", request.header("Transfer-Encoding"), true)) {
            if (this.f55161e == 1) {
                this.f55161e = 2;
                return new C0560b();
            }
            throw new IllegalStateException(("state: " + this.f55161e).toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f55161e == 1) {
            this.f55161e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f55161e).toString());
    }

    @Override // dw.g
    public void finishRequest() throws IOException {
        this.f55160d.flush();
    }

    @Override // dw.g
    public void flushRequest() throws IOException {
        this.f55160d.flush();
    }

    @Override // dw.g
    public dw.f getCarrier() {
        return this.f55158b;
    }

    @Override // dw.g
    public boolean isResponseComplete() {
        return this.f55161e == 6;
    }

    @Override // dw.g
    public b1 openResponseBodySource(v0 response) {
        e0.checkNotNullParameter(response, "response");
        if (!i.promisesBody(response)) {
            return a(response.request().url(), 0L);
        }
        if (k0.equals("chunked", v0.header$default(response, "Transfer-Encoding", null, 2, null), true)) {
            g0 g0VarUrl = response.request().url();
            if (this.f55161e == 4) {
                this.f55161e = 5;
                return new c(this, g0VarUrl);
            }
            throw new IllegalStateException(("state: " + this.f55161e).toString());
        }
        long jHeadersContentLength = yv.i.headersContentLength(response);
        if (jHeadersContentLength != -1) {
            return a(response.request().url(), jHeadersContentLength);
        }
        g0 g0VarUrl2 = response.request().url();
        if (this.f55161e == 4) {
            this.f55161e = 5;
            getCarrier().noNewExchanges();
            return new g(this, g0VarUrl2);
        }
        throw new IllegalStateException(("state: " + this.f55161e).toString());
    }

    @Override // dw.g
    public f0 peekTrailers() throws IOException {
        f0 f0Var = this.f55163g;
        if (f0Var == f55156h) {
            throw new IOException("Trailers cannot be read because the response body was truncated");
        }
        int i10 = this.f55161e;
        if (i10 == 5 || i10 == 6) {
            return f0Var;
        }
        throw new IllegalStateException(("Trailers cannot be read because the state is " + this.f55161e).toString());
    }

    @Override // dw.g
    public v0.a readResponseHeaders(boolean z10) throws IOException {
        ew.a aVar = this.f55162f;
        int i10 = this.f55161e;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f55161e).toString());
        }
        try {
            o oVar = o.f52930d.parse(aVar.readLine());
            v0.a aVar2 = new v0.a();
            n0 n0Var = oVar.f52931a;
            int i11 = oVar.f52932b;
            v0.a aVarHeaders = aVar2.protocol(n0Var).code(i11).message(oVar.f52933c).headers(aVar.readHeaders());
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f55161e = 3;
                return aVarHeaders;
            }
            if (102 > i11 || i11 >= 200) {
                this.f55161e = 4;
                return aVarHeaders;
            }
            this.f55161e = 3;
            return aVarHeaders;
        } catch (EOFException e10) {
            throw new IOException(a.b.k("unexpected end of stream on ", getCarrier().getRoute().address().url().redact()), e10);
        }
    }

    @Override // dw.g
    public long reportedContentLength(v0 response) {
        e0.checkNotNullParameter(response, "response");
        if (!i.promisesBody(response)) {
            return 0L;
        }
        if (k0.equals("chunked", v0.header$default(response, "Transfer-Encoding", null, 2, null), true)) {
            return -1L;
        }
        return yv.i.headersContentLength(response);
    }

    public final void skipConnectBody(v0 response) throws IOException {
        e0.checkNotNullParameter(response, "response");
        long jHeadersContentLength = yv.i.headersContentLength(response);
        if (jHeadersContentLength == -1) {
            return;
        }
        e eVarA = a(response.request().url(), jHeadersContentLength);
        yv.i.skipAll(eVarA, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        eVarA.close();
    }

    public final void writeRequest(f0 headers, String requestLine) throws IOException {
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(requestLine, "requestLine");
        if (this.f55161e != 0) {
            throw new IllegalStateException(("state: " + this.f55161e).toString());
        }
        j jVar = this.f55160d;
        jVar.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            jVar.writeUtf8(headers.name(i10)).writeUtf8(": ").writeUtf8(headers.value(i10)).writeUtf8("\r\n");
        }
        jVar.writeUtf8("\r\n");
        this.f55161e = 1;
    }

    @Override // dw.g
    public void writeRequestHeaders(o0 request) throws IOException {
        e0.checkNotNullParameter(request, "request");
        Proxy.Type type = getCarrier().getRoute().proxy().type();
        e0.checkNotNullExpressionValue(type, "type(...)");
        writeRequest(request.headers(), m.f52928a.get(request, type));
    }
}
