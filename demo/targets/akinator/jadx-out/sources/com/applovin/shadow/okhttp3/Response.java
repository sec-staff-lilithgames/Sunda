package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.http.HttpHeaders;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.Source;
import j1.o2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String message, int i10, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j10, long j11, Exchange exchange) {
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @f
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m328deprecated_body() {
        return this.body;
    }

    @f
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m329deprecated_cacheControl() {
        return cacheControl();
    }

    @f
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m330deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @f
    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m331deprecated_code() {
        return this.code;
    }

    @f
    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m332deprecated_handshake() {
        return this.handshake;
    }

    @f
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m333deprecated_headers() {
        return this.headers;
    }

    @f
    /* renamed from: -deprecated_message, reason: not valid java name */
    public final String m334deprecated_message() {
        return this.message;
    }

    @f
    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m335deprecated_networkResponse() {
        return this.networkResponse;
    }

    @f
    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m336deprecated_priorResponse() {
        return this.priorResponse;
    }

    @f
    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m337deprecated_protocol() {
        return this.protocol;
    }

    @f
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m338deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @f
    /* renamed from: -deprecated_request, reason: not valid java name */
    public final Request m339deprecated_request() {
        return this.request;
    }

    @f
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m340deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return p0.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final int code() {
        return this.code;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String name) {
        e0.checkNotNullParameter(name, "name");
        return header$default(this, name, null, 2, null);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i10 = this.code;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case MRAID_ERROR_VALUE:
            case INVALID_IFA_STATUS_VALUE:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSuccessful() {
        int i10 = this.code;
        return 200 <= i10 && i10 < 300;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long j10) throws IOException {
        ResponseBody responseBody = this.body;
        e0.checkNotNull(responseBody);
        BufferedSource bufferedSourcePeek = responseBody.source().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(j10);
        buffer.write((Source) bufferedSourcePeek, Math.min(j10, bufferedSourcePeek.getBuffer().size()));
        return ResponseBody.Companion.create(buffer, this.body.contentType(), buffer.size());
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + AbstractJsonLexerKt.END_OBJ;
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    public final String header(String name, String str) {
        e0.checkNotNullParameter(name, "name");
        String str2 = this.headers.get(name);
        return str2 == null ? str : str2;
    }

    public final List<String> headers(String name) {
        e0.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null && response.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                if (response.body() != null) {
                    throw new IllegalArgumentException(o2.l(str, ".body != null").toString());
                }
                if (response.networkResponse() != null) {
                    throw new IllegalArgumentException(o2.l(str, ".networkResponse != null").toString());
                }
                if (response.cacheResponse() != null) {
                    throw new IllegalArgumentException(o2.l(str, ".cacheResponse != null").toString());
                }
                if (response.priorResponse() != null) {
                    throw new IllegalArgumentException(o2.l(str, ".priorResponse != null").toString());
                }
            }
        }

        public Builder addHeader(String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Response build() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        public Builder cacheResponse(Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        public Builder code(int i10) {
            this.code = i10;
            return this;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            e0.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(Exchange deferredTrailers) {
            e0.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        public Builder message(String message) {
            e0.checkNotNullParameter(message, "message");
            this.message = message;
            return this;
        }

        public Builder networkResponse(Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        public Builder priorResponse(Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            e0.checkNotNullParameter(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long j10) {
            this.receivedResponseAtMillis = j10;
            return this;
        }

        public Builder removeHeader(String name) {
            e0.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public Builder request(Request request) {
            e0.checkNotNullParameter(request, "request");
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long j10) {
            this.sentRequestAtMillis = j10;
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i10) {
            this.code = i10;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            e0.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j10) {
            this.receivedResponseAtMillis = j10;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j10) {
            this.sentRequestAtMillis = j10;
        }

        public Builder(Response response) {
            e0.checkNotNullParameter(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}
