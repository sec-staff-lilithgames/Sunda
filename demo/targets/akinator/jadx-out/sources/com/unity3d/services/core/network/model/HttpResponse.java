package com.unity3d.services.core.network.model;

import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import e3.g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map<String, List<String>> headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, null, null, 0L, 126, null);
        e0.checkNotNullParameter(body, "body");
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 8) != 0) {
            str = httpResponse.urlString;
        }
        if ((i11 & 16) != 0) {
            str2 = httpResponse.protocol;
        }
        if ((i11 & 32) != 0) {
            str3 = httpResponse.client;
        }
        if ((i11 & 64) != 0) {
            j10 = httpResponse.contentSize;
        }
        long j11 = j10;
        String str4 = str2;
        String str5 = str3;
        return httpResponse.copy(obj, i10, map, str, str4, str5, j11);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client, long j10) {
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(urlString, "urlString");
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(client, "client");
        return new HttpResponse(body, i10, headers, urlString, protocol, client, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return e0.areEqual(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && e0.areEqual(this.headers, httpResponse.headers) && e0.areEqual(this.urlString, httpResponse.urlString) && e0.areEqual(this.protocol, httpResponse.protocol) && e0.areEqual(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return Long.hashCode(this.contentSize) + o2.e(o2.e(o2.e(o2.f(this.headers, g.d(this.statusCode, this.body.hashCode() * 31, 31), 31), 31, this.urlString), 31, this.protocol), 31, this.client);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponse(body=");
        sb2.append(this.body);
        sb2.append(", statusCode=");
        sb2.append(this.statusCode);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", urlString=");
        sb2.append(this.urlString);
        sb2.append(", protocol=");
        sb2.append(this.protocol);
        sb2.append(", client=");
        sb2.append(this.client);
        sb2.append(", contentSize=");
        return g.n(sb2, this.contentSize, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10) {
        this(body, i10, null, null, null, null, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
        e0.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers) {
        this(body, i10, headers, null, null, null, 0L, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, null);
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString) {
        this(body, i10, headers, urlString, null, null, 0L, 112, null);
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString, String protocol) {
        this(body, i10, headers, urlString, protocol, null, 0L, 96, null);
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(urlString, "urlString");
        e0.checkNotNullParameter(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client) {
        this(body, i10, headers, urlString, protocol, client, 0L, 64, null);
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(urlString, "urlString");
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(client, "client");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client, long j10) {
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(urlString, "urlString");
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(client, "client");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j10;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, u uVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? p1.emptyMap() : map, (i11 & 8) != 0 ? "" : str, (i11 & 16) == 0 ? str2 : "", (i11 & 32) != 0 ? "unknown" : str3, (i11 & 64) != 0 ? -1L : j10);
    }
}
