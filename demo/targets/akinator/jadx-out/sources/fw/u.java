package fw;

import b0.e2;
import com.amazon.device.ads.DTBMetricReport;
import com.applovin.shadow.okhttp3.internal.http2.Header;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import pw.b1;
import pw.d1;
import pw.z0;
import xv.f0;
import xv.l0;
import xv.n0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u implements dw.g {

    /* renamed from: g, reason: collision with root package name */
    public static final a f56237g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final List f56238h = yv.i.immutableListOf(DTBMetricReport.CONNECTION, "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: i, reason: collision with root package name */
    public static final List f56239i = yv.i.immutableListOf(DTBMetricReport.CONNECTION, "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final dw.f f56240a;

    /* renamed from: b, reason: collision with root package name */
    public final dw.k f56241b;

    /* renamed from: c, reason: collision with root package name */
    public final q f56242c;

    /* renamed from: d, reason: collision with root package name */
    public volatile x f56243d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f56244e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f56245f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<f> http2HeadersList(o0 request) {
            kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
            f0 f0VarHeaders = request.headers();
            ArrayList arrayList = new ArrayList(f0VarHeaders.size() + 4);
            arrayList.add(new f(f.f56139f, request.method()));
            arrayList.add(new f(f.f56140g, dw.m.f52928a.requestPath(request.url())));
            String strHeader = request.header("Host");
            if (strHeader != null) {
                arrayList.add(new f(f.f56142i, strHeader));
            }
            arrayList.add(new f(f.f56141h, request.url().scheme()));
            int size = f0VarHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = f0VarHeaders.name(i10);
                Locale locale = Locale.US;
                String strP = e2.p(locale, "US", strName, locale, "toLowerCase(...)");
                if (!u.f56238h.contains(strP) || (kotlin.jvm.internal.e0.areEqual(strP, "te") && kotlin.jvm.internal.e0.areEqual(f0VarHeaders.value(i10), "trailers"))) {
                    arrayList.add(new f(strP, f0VarHeaders.value(i10)));
                }
            }
            return arrayList;
        }

        public final v0.a readHttp2HeadersList(f0 headerBlock, n0 protocol) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(headerBlock, "headerBlock");
            kotlin.jvm.internal.e0.checkNotNullParameter(protocol, "protocol");
            f0.a aVar = new f0.a();
            int size = headerBlock.size();
            dw.o oVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strName = headerBlock.name(i10);
                String strValue = headerBlock.value(i10);
                if (kotlin.jvm.internal.e0.areEqual(strName, Header.RESPONSE_STATUS_UTF8)) {
                    oVar = dw.o.f52930d.parse("HTTP/1.1 " + strValue);
                } else if (!u.f56239i.contains(strName)) {
                    aVar.addLenient$okhttp(strName, strValue);
                }
            }
            if (oVar != null) {
                return new v0.a().protocol(protocol).code(oVar.f52932b).message(oVar.f52933c).headers(aVar.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public u(l0 client, dw.f carrier, dw.k chain, q http2Connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.e0.checkNotNullParameter(carrier, "carrier");
        kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
        kotlin.jvm.internal.e0.checkNotNullParameter(http2Connection, "http2Connection");
        this.f56240a = carrier;
        this.f56241b = chain;
        this.f56242c = http2Connection;
        List<n0> listProtocols = client.protocols();
        n0 n0Var = n0.f93763i;
        this.f56244e = listProtocols.contains(n0Var) ? n0Var : n0.f93762h;
    }

    @Override // dw.g
    public void cancel() {
        this.f56245f = true;
        x xVar = this.f56243d;
        if (xVar != null) {
            xVar.closeLater(c.f56128j);
        }
    }

    @Override // dw.g
    public z0 createRequestBody(o0 request, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        x xVar = this.f56243d;
        kotlin.jvm.internal.e0.checkNotNull(xVar);
        return xVar.getSink();
    }

    @Override // dw.g
    public void finishRequest() throws IOException {
        x xVar = this.f56243d;
        kotlin.jvm.internal.e0.checkNotNull(xVar);
        xVar.getSink().close();
    }

    @Override // dw.g
    public void flushRequest() throws IOException {
        this.f56242c.flush();
    }

    @Override // dw.g
    public dw.f getCarrier() {
        return this.f56240a;
    }

    @Override // dw.g
    public boolean isResponseComplete() {
        x xVar = this.f56243d;
        return xVar != null && xVar.isSourceComplete();
    }

    @Override // dw.g
    public b1 openResponseBodySource(v0 response) {
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        x xVar = this.f56243d;
        kotlin.jvm.internal.e0.checkNotNull(xVar);
        return xVar.getSource();
    }

    @Override // dw.g
    public f0 peekTrailers() {
        x xVar = this.f56243d;
        kotlin.jvm.internal.e0.checkNotNull(xVar);
        return xVar.peekTrailers();
    }

    @Override // dw.g
    public v0.a readResponseHeaders(boolean z10) throws IOException {
        x xVar = this.f56243d;
        if (xVar == null) {
            throw new IOException("stream wasn't created");
        }
        v0.a http2HeadersList = f56237g.readHttp2HeadersList(xVar.takeHeaders(z10), this.f56244e);
        if (z10 && http2HeadersList.getCode$okhttp() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // dw.g
    public long reportedContentLength(v0 response) {
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        if (dw.i.promisesBody(response)) {
            return yv.i.headersContentLength(response);
        }
        return 0L;
    }

    @Override // dw.g
    public void writeRequestHeaders(o0 request) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        if (this.f56243d != null) {
            return;
        }
        this.f56243d = this.f56242c.newStream(f56237g.http2HeadersList(request), request.body() != null);
        if (this.f56245f) {
            x xVar = this.f56243d;
            kotlin.jvm.internal.e0.checkNotNull(xVar);
            xVar.closeLater(c.f56128j);
            throw new IOException("Canceled");
        }
        x xVar2 = this.f56243d;
        kotlin.jvm.internal.e0.checkNotNull(xVar2);
        d1 timeout = xVar2.readTimeout();
        long readTimeoutMillis$okhttp = this.f56241b.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        x xVar3 = this.f56243d;
        kotlin.jvm.internal.e0.checkNotNull(xVar3);
        xVar3.writeTimeout().timeout(this.f56241b.getWriteTimeoutMillis$okhttp(), timeUnit);
    }
}
