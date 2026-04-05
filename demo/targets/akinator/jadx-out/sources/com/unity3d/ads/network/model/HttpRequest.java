package com.unity3d.ads.network.model;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.unity3d.ads.network.model.HttpBody;
import e3.g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i14 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i14 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i14 & 8) != 0) {
            httpBody = httpRequest.body;
        }
        if ((i14 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i14 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i14 & 64) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i14 & 128) != 0) {
            num = httpRequest.port;
        }
        if ((i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i10 = httpRequest.connectTimeout;
        }
        if ((i14 & 512) != 0) {
            i11 = httpRequest.readTimeout;
        }
        if ((i14 & 1024) != 0) {
            i12 = httpRequest.writeTimeout;
        }
        if ((i14 & 2048) != 0) {
            i13 = httpRequest.callTimeout;
        }
        int i15 = i12;
        int i16 = i13;
        int i17 = i10;
        int i18 = i11;
        String str4 = str3;
        Integer num2 = num;
        Map map3 = map;
        Map map4 = map2;
        return httpRequest.copy(str, str2, requestType, httpBody, map3, map4, str4, num2, i17, i18, i15, i16);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11, int i12, int i13) {
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return e0.areEqual(this.baseURL, httpRequest.baseURL) && e0.areEqual(this.path, httpRequest.path) && this.method == httpRequest.method && e0.areEqual(this.body, httpRequest.body) && e0.areEqual(this.headers, httpRequest.headers) && e0.areEqual(this.parameters, httpRequest.parameters) && e0.areEqual(this.scheme, httpRequest.scheme) && e0.areEqual(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int iE = o2.e(o2.f(this.parameters, o2.f(this.headers, (this.body.hashCode() + ((this.method.hashCode() + o2.e(this.baseURL.hashCode() * 31, 31, this.path)) * 31)) * 31, 31), 31), 31, this.scheme);
        Integer num = this.port;
        return Integer.hashCode(this.callTimeout) + g.d(this.writeTimeout, g.d(this.readTimeout, g.d(this.connectTimeout, (iE + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest(baseURL=");
        sb2.append(this.baseURL);
        sb2.append(", path=");
        sb2.append(this.path);
        sb2.append(", method=");
        sb2.append(this.method);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", scheme=");
        sb2.append(this.scheme);
        sb2.append(", port=");
        sb2.append(this.port);
        sb2.append(", connectTimeout=");
        sb2.append(this.connectTimeout);
        sb2.append(", readTimeout=");
        sb2.append(this.readTimeout);
        sb2.append(", writeTimeout=");
        sb2.append(this.writeTimeout);
        sb2.append(", callTimeout=");
        return g.m(sb2, this.callTimeout, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, Utf8.MASK_2BYTES, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, 0, 0, 0, 3584, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, 0, 0, 3072, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, i12, 0, 2048, null);
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11, int i12, int i13) {
        e0.checkNotNullParameter(baseURL, "baseURL");
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(parameters, "parameters");
        e0.checkNotNullParameter(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, u uVar) {
        this(str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? RequestType.GET : requestType, (i14 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody, (i14 & 16) != 0 ? p1.emptyMap() : map, (i14 & 32) != 0 ? p1.emptyMap() : map2, (i14 & 64) != 0 ? "https" : str3, (i14 & 128) != 0 ? null : num, (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 30000 : i10, (i14 & 512) != 0 ? 30000 : i11, (i14 & 1024) != 0 ? 30000 : i12, (i14 & 2048) != 0 ? 30000 : i13);
    }
}
