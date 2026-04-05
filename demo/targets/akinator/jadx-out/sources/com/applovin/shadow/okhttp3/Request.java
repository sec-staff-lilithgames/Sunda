package com.applovin.shadow.okhttp3;

import a.b;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.HttpMethod;
import com.ironsource.C3271ic;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.k0;
import tu.f;
import tu.v;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = C3271ic.f36943a;
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder cacheControl(CacheControl cacheControl) {
            e0.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method(C3271ic.f36943a, null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
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

        public Builder method(String method, RequestBody requestBody) {
            e0.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                if (HttpMethod.requiresRequestBody(method)) {
                    throw new IllegalArgumentException(b.l("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(b.l("method ", method, " must not have a request body.").toString());
            }
            this.method = method;
            this.body = requestBody;
            return this;
        }

        public Builder patch(RequestBody body) {
            e0.checkNotNullParameter(body, "body");
            return method("PATCH", body);
        }

        public Builder post(RequestBody body) {
            e0.checkNotNullParameter(body, "body");
            return method(C3271ic.f36944b, body);
        }

        public Builder put(RequestBody body) {
            e0.checkNotNullParameter(body, "body");
            return method("PUT", body);
        }

        public Builder removeHeader(String name) {
            e0.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            e0.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            e0.checkNotNullParameter(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl url) {
            e0.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public <T> Builder tag(Class<? super T> type, T t10) {
            e0.checkNotNullParameter(type, "type");
            if (t10 == null) {
                this.tags.remove(type);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.tags;
            T tCast = type.cast(t10);
            e0.checkNotNull(tCast);
            map.put(type, tCast);
            return this;
        }

        public Builder url(String url) {
            e0.checkNotNullParameter(url, "url");
            if (k0.startsWith(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder("http:");
                String strSubstring = url.substring(3);
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (k0.startsWith(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder("https:");
                String strSubstring2 = url.substring(4);
                e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return url(HttpUrl.Companion.get(url));
        }

        public Builder(Request request) {
            Map<Class<?>, Object> mutableMap;
            e0.checkNotNullParameter(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = p1.toMutableMap(request.getTags$okhttp());
            }
            this.tags = mutableMap;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            e0.checkNotNullParameter(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            e0.checkNotNullExpressionValue(string, "url.toString()");
            return url(companion.get(string));
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> tags) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    @f
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m323deprecated_body() {
        return this.body;
    }

    @f
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m324deprecated_cacheControl() {
        return cacheControl();
    }

    @f
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m325deprecated_headers() {
        return this.headers;
    }

    @f
    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m326deprecated_method() {
        return this.method;
    }

    @f
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m327deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
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

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String name) {
        e0.checkNotNullParameter(name, "name");
        return this.headers.get(name);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (v vVar : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    p0.throwIndexOverflow();
                }
                v vVar2 = vVar;
                String str = (String) vVar2.component1();
                String str2 = (String) vVar2.component2();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String name) {
        e0.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    public final <T> T tag(Class<? extends T> type) {
        e0.checkNotNullParameter(type, "type");
        return type.cast(this.tags.get(type));
    }
}
