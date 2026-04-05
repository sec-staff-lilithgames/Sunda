package cw;

import b0.e2;
import i2.hQ.aTNDubNmpwAqdU;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import ow.d;
import pw.b1;
import pw.z0;
import xv.o0;
import xv.u0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final q f51157a;

    /* renamed from: b, reason: collision with root package name */
    public final xv.b0 f51158b;

    /* renamed from: c, reason: collision with root package name */
    public final j f51159c;

    /* renamed from: d, reason: collision with root package name */
    public final dw.g f51160d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51161e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51162f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends pw.t {

        /* renamed from: c, reason: collision with root package name */
        public final long f51163c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f51164e;

        /* renamed from: f, reason: collision with root package name */
        public long f51165f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f51166g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ i f51167h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, z0 delegate, long j10) {
            super(delegate);
            kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
            this.f51167h = iVar;
            this.f51163c = j10;
        }

        public final IOException a(IOException iOException) {
            if (this.f51164e) {
                return iOException;
            }
            this.f51164e = true;
            return i.bodyComplete$default(this.f51167h, this.f51165f, false, true, iOException, 2, null);
        }

        @Override // pw.t, pw.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51166g) {
                return;
            }
            this.f51166g = true;
            long j10 = this.f51163c;
            if (j10 != -1 && this.f51165f != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // pw.t, pw.z0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // pw.t, pw.z0
        public void write(pw.g source, long j10) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            if (this.f51166g) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f51163c;
            if (j11 != -1 && this.f51165f + j10 > j11) {
                StringBuilder sbR = e2.r(j11, "expected ", " bytes but received ");
                sbR.append(this.f51165f + j10);
                throw new ProtocolException(sbR.toString());
            }
            try {
                super.write(source, j10);
                this.f51165f += j10;
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends pw.u {

        /* renamed from: b, reason: collision with root package name */
        public final long f51168b;

        /* renamed from: c, reason: collision with root package name */
        public long f51169c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f51170e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f51171f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f51172g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ i f51173h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, b1 delegate, long j10) {
            super(delegate);
            kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
            this.f51173h = iVar;
            this.f51168b = j10;
            this.f51170e = true;
            if (j10 == 0) {
                complete(null);
            }
        }

        @Override // pw.u, pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f51172g) {
                return;
            }
            this.f51172g = true;
            try {
                super.close();
            } catch (IOException e10) {
                throw complete(e10);
            }
        }

        public final <E extends IOException> E complete(E e10) {
            if (this.f51171f) {
                return e10;
            }
            this.f51171f = true;
            if (e10 == null && this.f51170e) {
                this.f51170e = false;
                i iVar = this.f51173h;
                iVar.getEventListener$okhttp().responseBodyStart(iVar.getCall$okhttp());
            }
            return (E) i.bodyComplete$default(this.f51173h, this.f51169c, true, false, e10, 4, null);
        }

        @Override // pw.u, pw.b1
        public long read(pw.g sink, long j10) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            if (this.f51172g) {
                throw new IllegalStateException("closed");
            }
            try {
                long j11 = delegate().read(sink, j10);
                boolean z10 = this.f51170e;
                i iVar = this.f51173h;
                if (z10) {
                    this.f51170e = false;
                    iVar.getEventListener$okhttp().responseBodyStart(iVar.getCall$okhttp());
                }
                if (j11 == -1) {
                    complete(null);
                    return -1L;
                }
                long j12 = this.f51169c + j11;
                long j13 = this.f51168b;
                if (j13 == -1 || j12 <= j13) {
                    this.f51169c = j12;
                    if (iVar.f51160d.isResponseComplete()) {
                        complete(null);
                    }
                    return j11;
                }
                throw new ProtocolException("expected " + j13 + " bytes but received " + j12);
            } catch (IOException e10) {
                throw complete(e10);
            }
        }
    }

    public i(q call, xv.b0 eventListener, j finder, dw.g codec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventListener, "eventListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(finder, "finder");
        kotlin.jvm.internal.e0.checkNotNullParameter(codec, "codec");
        this.f51157a = call;
        this.f51158b = eventListener;
        this.f51159c = finder;
        this.f51160d = codec;
    }

    public static /* synthetic */ IOException bodyComplete$default(i iVar, long j10, boolean z10, boolean z11, IOException iOException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = -1;
        }
        return iVar.bodyComplete(j10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, iOException);
    }

    public final void a(IOException iOException) {
        this.f51162f = true;
        this.f51160d.getCarrier().trackFailure(this.f51157a, iOException);
    }

    public final <E extends IOException> E bodyComplete(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            a(e10);
        }
        xv.b0 b0Var = this.f51158b;
        q qVar = this.f51157a;
        if (z11) {
            if (e10 != null) {
                b0Var.requestFailed(qVar, e10);
            } else {
                b0Var.requestBodyEnd(qVar, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                b0Var.responseFailed(qVar, e10);
            } else {
                b0Var.responseBodyEnd(qVar, j10);
            }
        }
        return (E) qVar.messageDone$okhttp(this, z11, z10, e10);
    }

    public final void cancel() {
        this.f51160d.cancel();
    }

    public final z0 createRequestBody(o0 request, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        this.f51161e = z10;
        u0 u0VarBody = request.body();
        kotlin.jvm.internal.e0.checkNotNull(u0VarBody);
        long jContentLength = u0VarBody.contentLength();
        this.f51158b.requestBodyStart(this.f51157a);
        return new a(this, this.f51160d.createRequestBody(request, jContentLength), jContentLength);
    }

    public final void detachWithViolence() {
        this.f51160d.cancel();
        this.f51157a.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.f51160d.finishRequest();
        } catch (IOException e10) {
            this.f51158b.requestFailed(this.f51157a, e10);
            a(e10);
            throw e10;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.f51160d.flushRequest();
        } catch (IOException e10) {
            this.f51158b.requestFailed(this.f51157a, e10);
            a(e10);
            throw e10;
        }
    }

    public final q getCall$okhttp() {
        return this.f51157a;
    }

    public final u getConnection$okhttp() {
        dw.f carrier = this.f51160d.getCarrier();
        u uVar = carrier instanceof u ? (u) carrier : null;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final xv.b0 getEventListener$okhttp() {
        return this.f51158b;
    }

    public final j getFinder$okhttp() {
        return this.f51159c;
    }

    public final boolean getHasFailure$okhttp() {
        return this.f51162f;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !kotlin.jvm.internal.e0.areEqual(this.f51159c.getRoutePlanner().getAddress().url().host(), this.f51160d.getCarrier().getRoute().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.f51161e;
    }

    public final void noNewExchangesOnConnection() {
        this.f51160d.getCarrier().noNewExchanges();
    }

    public final void noRequestBody() {
        q.messageDone$okhttp$default(this.f51157a, this, true, false, null, 4, null);
    }

    public final w0 openResponseBody(v0 response) throws IOException {
        dw.g gVar = this.f51160d;
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        try {
            String strHeader$default = v0.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = gVar.reportedContentLength(response);
            return new dw.l(strHeader$default, jReportedContentLength, pw.h0.buffer(new b(this, gVar.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e10) {
            this.f51158b.responseFailed(this.f51157a, e10);
            a(e10);
            throw e10;
        }
    }

    public final xv.f0 peekTrailers() throws IOException {
        return this.f51160d.peekTrailers();
    }

    public final v0.a readResponseHeaders(boolean z10) throws IOException {
        try {
            v0.a responseHeaders = this.f51160d.readResponseHeaders(z10);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.initExchange$okhttp(this);
            return responseHeaders;
        } catch (IOException e10) {
            this.f51158b.responseFailed(this.f51157a, e10);
            a(e10);
            throw e10;
        }
    }

    public final void responseHeadersEnd(v0 response) {
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        this.f51158b.responseHeadersEnd(this.f51157a, response);
    }

    public final void responseHeadersStart() {
        this.f51158b.responseHeadersStart(this.f51157a);
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete$default(this, 0L, true, true, null, 1, null);
    }

    public final void writeRequestHeaders(o0 request) throws IOException {
        q qVar = this.f51157a;
        xv.b0 b0Var = this.f51158b;
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        try {
            b0Var.requestHeadersStart(qVar);
            this.f51160d.writeRequestHeaders(request);
            b0Var.requestHeadersEnd(qVar, request);
        } catch (IOException e10) {
            b0Var.requestFailed(qVar, e10);
            a(e10);
            throw e10;
        }
    }

    public final d.AbstractC0758d newWebSocketStreams() throws SocketException {
        this.f51157a.timeoutEarlyExit();
        dw.f carrier = this.f51160d.getCarrier();
        kotlin.jvm.internal.e0.checkNotNull(carrier, aTNDubNmpwAqdU.PDHYUOJuAgl);
        return ((u) carrier).newWebSocketStreams$okhttp(this);
    }
}
