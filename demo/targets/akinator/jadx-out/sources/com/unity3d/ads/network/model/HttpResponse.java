package com.unity3d.ads.network.model;

import e3.g;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HttpResponse {
    private final Object body;
    private final Map<String, Object> headers;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, 14, null);
        e0.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, int i11, Object obj2) {
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
        return httpResponse.copy(obj, i10, map, str);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, Object> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final HttpResponse copy(Object body, int i10, Map<String, ? extends Object> headers, String urlString) {
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(urlString, "urlString");
        return new HttpResponse(body, i10, headers, urlString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return e0.areEqual(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && e0.areEqual(this.headers, httpResponse.headers) && e0.areEqual(this.urlString, httpResponse.urlString);
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return this.urlString.hashCode() + o2.f(this.headers, g.d(this.statusCode, this.body.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponse(body=");
        sb2.append(this.body);
        sb2.append(", statusCode=");
        sb2.append(this.statusCode);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", urlString=");
        return o2.q(sb2, this.urlString, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10) {
        this(body, i10, null, null, 12, null);
        e0.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends Object> headers) {
        this(body, i10, headers, null, 8, null);
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
    }

    public HttpResponse(Object body, int i10, Map<String, ? extends Object> headers, String urlString) {
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(urlString, "urlString");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, int i11, u uVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? p1.emptyMap() : map, (i11 & 8) != 0 ? "" : str);
    }
}
