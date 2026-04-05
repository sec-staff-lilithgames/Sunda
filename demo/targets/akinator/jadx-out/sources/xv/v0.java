package xv;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import xv.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final o0 f93863b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f93864c;

    /* renamed from: e, reason: collision with root package name */
    public final String f93865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f93866f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f93867g;

    /* renamed from: h, reason: collision with root package name */
    public final f0 f93868h;

    /* renamed from: i, reason: collision with root package name */
    public final w0 f93869i;

    /* renamed from: j, reason: collision with root package name */
    public final v0 f93870j;

    /* renamed from: k, reason: collision with root package name */
    public final v0 f93871k;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f93872l;

    /* renamed from: m, reason: collision with root package name */
    public final long f93873m;

    /* renamed from: n, reason: collision with root package name */
    public final long f93874n;

    /* renamed from: o, reason: collision with root package name */
    public final cw.i f93875o;

    /* renamed from: p, reason: collision with root package name */
    public final c1 f93876p;

    /* renamed from: q, reason: collision with root package name */
    public h f93877q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f93878r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f93879s;

    public v0(o0 request, n0 protocol, String message, int i10, e0 e0Var, f0 headers, w0 body, v0 v0Var, v0 v0Var2, v0 v0Var3, long j10, long j11, cw.i iVar, c1 trailersSource) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(protocol, "protocol");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.e0.checkNotNullParameter(trailersSource, "trailersSource");
        this.f93863b = request;
        this.f93864c = protocol;
        this.f93865e = message;
        this.f93866f = i10;
        this.f93867g = e0Var;
        this.f93868h = headers;
        this.f93869i = body;
        this.f93870j = v0Var;
        this.f93871k = v0Var2;
        this.f93872l = v0Var3;
        this.f93873m = j10;
        this.f93874n = j11;
        this.f93875o = iVar;
        this.f93876p = trailersSource;
        boolean z10 = true;
        this.f93878r = 200 <= i10 && i10 < 300;
        if (i10 != 307 && i10 != 308) {
            switch (i10) {
                case 300:
                case MRAID_ERROR_VALUE:
                case INVALID_IFA_STATUS_VALUE:
                case 303:
                    break;
                default:
                    z10 = false;
                    break;
            }
        }
        this.f93879s = z10;
    }

    public static /* synthetic */ String header$default(v0 v0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return v0Var.header(str, str2);
    }

    @tu.f
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final w0 m7996deprecated_body() {
        return this.f93869i;
    }

    @tu.f
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final h m7997deprecated_cacheControl() {
        return cacheControl();
    }

    @tu.f
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final v0 m7998deprecated_cacheResponse() {
        return this.f93871k;
    }

    @tu.f
    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m7999deprecated_code() {
        return this.f93866f;
    }

    @tu.f
    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final e0 m8000deprecated_handshake() {
        return this.f93867g;
    }

    @tu.f
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final f0 m8001deprecated_headers() {
        return this.f93868h;
    }

    @tu.f
    /* renamed from: -deprecated_message, reason: not valid java name */
    public final String m8002deprecated_message() {
        return this.f93865e;
    }

    @tu.f
    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final v0 m8003deprecated_networkResponse() {
        return this.f93870j;
    }

    @tu.f
    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final v0 m8004deprecated_priorResponse() {
        return this.f93872l;
    }

    @tu.f
    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final n0 m8005deprecated_protocol() {
        return this.f93864c;
    }

    @tu.f
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m8006deprecated_receivedResponseAtMillis() {
        return this.f93874n;
    }

    @tu.f
    /* renamed from: -deprecated_request, reason: not valid java name */
    public final o0 m8007deprecated_request() {
        return this.f93863b;
    }

    @tu.f
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m8008deprecated_sentRequestAtMillis() {
        return this.f93873m;
    }

    public final w0 body() {
        return this.f93869i;
    }

    public final h cacheControl() {
        h hVar = this.f93877q;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = h.f93646n.parse(this.f93868h);
        this.f93877q = hVar2;
        return hVar2;
    }

    public final v0 cacheResponse() {
        return this.f93871k;
    }

    public final List<m> challenges() {
        String str;
        int i10 = this.f93866f;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return uu.p0.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return dw.i.parseChallenges(this.f93868h, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f93869i.close();
    }

    public final int code() {
        return this.f93866f;
    }

    public final cw.i exchange() {
        return this.f93875o;
    }

    public final h getLazyCacheControl$okhttp() {
        return this.f93877q;
    }

    public final e0 handshake() {
        return this.f93867g;
    }

    public final String header(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return header$default(this, name, null, 2, null);
    }

    public final f0 headers() {
        return this.f93868h;
    }

    public final boolean isRedirect() {
        return this.f93879s;
    }

    public final boolean isSuccessful() {
        return this.f93878r;
    }

    public final String message() {
        return this.f93865e;
    }

    public final v0 networkResponse() {
        return this.f93870j;
    }

    public final a newBuilder() {
        return new a(this);
    }

    public final w0 peekBody(long j10) throws IOException {
        w0 w0Var = this.f93869i;
        pw.k kVarPeek = w0Var.source().peek();
        pw.g gVar = new pw.g();
        kVarPeek.request(j10);
        gVar.write((pw.b1) kVarPeek, Math.min(j10, kVarPeek.getBuffer().size()));
        return w0.Companion.create(gVar, w0Var.contentType(), gVar.size());
    }

    public final f0 peekTrailers() throws IOException {
        return this.f93876p.peek();
    }

    public final v0 priorResponse() {
        return this.f93872l;
    }

    public final n0 protocol() {
        return this.f93864c;
    }

    public final long receivedResponseAtMillis() {
        return this.f93874n;
    }

    public final o0 request() {
        return this.f93863b;
    }

    public final long sentRequestAtMillis() {
        return this.f93873m;
    }

    public final void setLazyCacheControl$okhttp(h hVar) {
        this.f93877q = hVar;
    }

    public String toString() {
        return "Response{protocol=" + this.f93864c + ", code=" + this.f93866f + ", message=" + this.f93865e + ", url=" + this.f93863b.url() + AbstractJsonLexerKt.END_OBJ;
    }

    public final f0 trailers() throws IOException {
        return this.f93876p.get();
    }

    public final String header(String name, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        String str2 = this.f93868h.get(name);
        return str2 == null ? str : str2;
    }

    public final List<String> headers(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return this.f93868h.values(name);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public o0 f93880a;

        /* renamed from: b, reason: collision with root package name */
        public n0 f93881b;

        /* renamed from: c, reason: collision with root package name */
        public int f93882c;

        /* renamed from: d, reason: collision with root package name */
        public String f93883d;

        /* renamed from: e, reason: collision with root package name */
        public e0 f93884e;

        /* renamed from: f, reason: collision with root package name */
        public f0.a f93885f;

        /* renamed from: g, reason: collision with root package name */
        public w0 f93886g;

        /* renamed from: h, reason: collision with root package name */
        public v0 f93887h;

        /* renamed from: i, reason: collision with root package name */
        public v0 f93888i;

        /* renamed from: j, reason: collision with root package name */
        public v0 f93889j;

        /* renamed from: k, reason: collision with root package name */
        public long f93890k;

        /* renamed from: l, reason: collision with root package name */
        public long f93891l;

        /* renamed from: m, reason: collision with root package name */
        public cw.i f93892m;

        /* renamed from: n, reason: collision with root package name */
        public c1 f93893n;

        public a() {
            this.f93882c = -1;
            this.f93886g = w0.EMPTY;
            this.f93893n = c1.f93578a;
            this.f93885f = new f0.a();
        }

        public static void a(String str, v0 v0Var) {
            if (v0Var != null) {
                if (v0Var.networkResponse() != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (v0Var.cacheResponse() != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (v0Var.priorResponse() != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public a addHeader(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f93885f.add(name, value);
            return this;
        }

        public a body(w0 body) {
            kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
            this.f93886g = body;
            return this;
        }

        public v0 build() {
            int i10 = this.f93882c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f93882c).toString());
            }
            o0 o0Var = this.f93880a;
            if (o0Var == null) {
                throw new IllegalStateException("request == null");
            }
            n0 n0Var = this.f93881b;
            if (n0Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f93883d;
            if (str != null) {
                return new v0(o0Var, n0Var, str, i10, this.f93884e, this.f93885f.build(), this.f93886g, this.f93887h, this.f93888i, this.f93889j, this.f93890k, this.f93891l, this.f93892m, this.f93893n);
            }
            throw new IllegalStateException("message == null");
        }

        public a cacheResponse(v0 v0Var) {
            a("cacheResponse", v0Var);
            this.f93888i = v0Var;
            return this;
        }

        public a code(int i10) {
            this.f93882c = i10;
            return this;
        }

        public final w0 getBody$okhttp() {
            return this.f93886g;
        }

        public final v0 getCacheResponse$okhttp() {
            return this.f93888i;
        }

        public final int getCode$okhttp() {
            return this.f93882c;
        }

        public final cw.i getExchange$okhttp() {
            return this.f93892m;
        }

        public final e0 getHandshake$okhttp() {
            return this.f93884e;
        }

        public final f0.a getHeaders$okhttp() {
            return this.f93885f;
        }

        public final String getMessage$okhttp() {
            return this.f93883d;
        }

        public final v0 getNetworkResponse$okhttp() {
            return this.f93887h;
        }

        public final v0 getPriorResponse$okhttp() {
            return this.f93889j;
        }

        public final n0 getProtocol$okhttp() {
            return this.f93881b;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.f93891l;
        }

        public final o0 getRequest$okhttp() {
            return this.f93880a;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.f93890k;
        }

        public final c1 getTrailersSource$okhttp() {
            return this.f93893n;
        }

        public a handshake(e0 e0Var) {
            this.f93884e = e0Var;
            return this;
        }

        public a header(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f93885f.set(name, value);
            return this;
        }

        public a headers(f0 headers) {
            kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
            this.f93885f = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(cw.i exchange) {
            kotlin.jvm.internal.e0.checkNotNullParameter(exchange, "exchange");
            this.f93892m = exchange;
        }

        public a message(String message) {
            kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
            this.f93883d = message;
            return this;
        }

        public a networkResponse(v0 v0Var) {
            a("networkResponse", v0Var);
            this.f93887h = v0Var;
            return this;
        }

        public a priorResponse(v0 v0Var) {
            this.f93889j = v0Var;
            return this;
        }

        public a protocol(n0 protocol) {
            kotlin.jvm.internal.e0.checkNotNullParameter(protocol, "protocol");
            this.f93881b = protocol;
            return this;
        }

        public a receivedResponseAtMillis(long j10) {
            this.f93891l = j10;
            return this;
        }

        public a removeHeader(String name) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            this.f93885f.removeAll(name);
            return this;
        }

        public a request(o0 request) {
            kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
            this.f93880a = request;
            return this;
        }

        public a sentRequestAtMillis(long j10) {
            this.f93890k = j10;
            return this;
        }

        public final void setBody$okhttp(w0 w0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w0Var, "<set-?>");
            this.f93886g = w0Var;
        }

        public final void setCacheResponse$okhttp(v0 v0Var) {
            this.f93888i = v0Var;
        }

        public final void setCode$okhttp(int i10) {
            this.f93882c = i10;
        }

        public final void setExchange$okhttp(cw.i iVar) {
            this.f93892m = iVar;
        }

        public final void setHandshake$okhttp(e0 e0Var) {
            this.f93884e = e0Var;
        }

        public final void setHeaders$okhttp(f0.a aVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
            this.f93885f = aVar;
        }

        public final void setMessage$okhttp(String str) {
            this.f93883d = str;
        }

        public final void setNetworkResponse$okhttp(v0 v0Var) {
            this.f93887h = v0Var;
        }

        public final void setPriorResponse$okhttp(v0 v0Var) {
            this.f93889j = v0Var;
        }

        public final void setProtocol$okhttp(n0 n0Var) {
            this.f93881b = n0Var;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j10) {
            this.f93891l = j10;
        }

        public final void setRequest$okhttp(o0 o0Var) {
            this.f93880a = o0Var;
        }

        public final void setSentRequestAtMillis$okhttp(long j10) {
            this.f93890k = j10;
        }

        public final void setTrailersSource$okhttp(c1 c1Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(c1Var, "<set-?>");
            this.f93893n = c1Var;
        }

        public a trailers(c1 trailersSource) {
            kotlin.jvm.internal.e0.checkNotNullParameter(trailersSource, "trailersSource");
            this.f93893n = trailersSource;
            return this;
        }

        public a(v0 response) {
            kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
            this.f93882c = -1;
            this.f93886g = w0.EMPTY;
            this.f93893n = c1.f93578a;
            this.f93880a = response.request();
            this.f93881b = response.protocol();
            this.f93882c = response.code();
            this.f93883d = response.message();
            this.f93884e = response.handshake();
            this.f93885f = response.headers().newBuilder();
            this.f93886g = response.body();
            this.f93887h = response.networkResponse();
            this.f93888i = response.cacheResponse();
            this.f93889j = response.priorResponse();
            this.f93890k = response.sentRequestAtMillis();
            this.f93891l = response.receivedResponseAtMillis();
            this.f93892m = response.exchange();
            this.f93893n = response.f93876p;
        }
    }
}
