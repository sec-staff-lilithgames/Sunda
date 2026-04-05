package com.applovin.shadow.okhttp3.internal.http2;

import b0.e2;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.HttpHeaders;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.http.RequestLine;
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private static final String CONNECTION = "connection";
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;
    public static final Companion Companion = new Companion(null);
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf("connection", QCmNMSGd.HmrkotuOix, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final String HOST = "host";
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf("connection", HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final List<Header> http2HeadersList(Request request) {
            e0.checkNotNullParameter(request, "request");
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String strHeader = request.header("Host");
            if (strHeader != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, strHeader));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = headers.name(i10);
                Locale locale = Locale.US;
                String strP = e2.p(locale, "US", strName, locale, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(strP) || (e0.areEqual(strP, Http2ExchangeCodec.TE) && e0.areEqual(headers.value(i10), "trailers"))) {
                    arrayList.add(new Header(strP, headers.value(i10)));
                }
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headerBlock, Protocol protocol) throws NumberFormatException, IOException {
            e0.checkNotNullParameter(headerBlock, "headerBlock");
            e0.checkNotNullParameter(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headerBlock.size();
            StatusLine statusLine = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strName = headerBlock.name(i10);
                String strValue = headerBlock.value(i10);
                if (e0.areEqual(strName, Header.RESPONSE_STATUS_UTF8)) {
                    statusLine = StatusLine.Companion.parse("HTTP/1.1 " + strValue);
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strName)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain chain, Http2Connection http2Connection) {
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(connection, "connection");
        e0.checkNotNullParameter(chain, "chain");
        e0.checkNotNullParameter(http2Connection, "http2Connection");
        this.connection = connection;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List<Protocol> listProtocols = client.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = listProtocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long j10) {
        e0.checkNotNullParameter(request, "request");
        Http2Stream http2Stream = this.stream;
        e0.checkNotNull(http2Stream);
        return http2Stream.getSink();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws IOException {
        Http2Stream http2Stream = this.stream;
        e0.checkNotNull(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.http2Connection.flush();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        e0.checkNotNullParameter(response, "response");
        Http2Stream http2Stream = this.stream;
        e0.checkNotNull(http2Stream);
        return http2Stream.getSource$okhttp();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z10) throws IOException, NumberFormatException {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder http2HeadersList = Companion.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (z10 && http2HeadersList.getCode$okhttp() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        e0.checkNotNullParameter(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        e0.checkNotNull(http2Stream);
        return http2Stream.trailers();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) throws IOException {
        e0.checkNotNullParameter(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(Companion.http2HeadersList(request), request.body() != null);
        if (this.canceled) {
            Http2Stream http2Stream = this.stream;
            e0.checkNotNull(http2Stream);
            http2Stream.closeLater(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.stream;
        e0.checkNotNull(http2Stream2);
        Timeout timeout = http2Stream2.readTimeout();
        long readTimeoutMillis$okhttp = this.chain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        Http2Stream http2Stream3 = this.stream;
        e0.checkNotNull(http2Stream3);
        http2Stream3.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), timeUnit);
    }
}
