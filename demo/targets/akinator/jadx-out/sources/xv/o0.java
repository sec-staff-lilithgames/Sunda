package xv;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3271ic;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uu.p1;
import xv.f0;
import xv.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f93789a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93790b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f93791c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f93792d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f93793e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f93794f;

    /* renamed from: g, reason: collision with root package name */
    public h f93795g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public g0 f93796a;

        /* renamed from: b, reason: collision with root package name */
        public String f93797b;

        /* renamed from: c, reason: collision with root package name */
        public f0.a f93798c;

        /* renamed from: d, reason: collision with root package name */
        public u0 f93799d;

        /* renamed from: e, reason: collision with root package name */
        public g0 f93800e;

        /* renamed from: f, reason: collision with root package name */
        public Map f93801f;

        public a() {
            this.f93801f = p1.emptyMap();
            this.f93797b = C3271ic.f36943a;
            this.f93798c = new f0.a();
        }

        public static /* synthetic */ a delete$default(a aVar, u0 u0Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                u0Var = u0.EMPTY;
            }
            return aVar.delete(u0Var);
        }

        public a addHeader(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f93798c.add(name, value);
            return this;
        }

        public o0 build() {
            return new o0(this);
        }

        public a cacheControl(h cacheControl) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final a cacheUrlOverride(g0 g0Var) {
            this.f93800e = g0Var;
            return this;
        }

        public final a delete() {
            return delete$default(this, null, 1, null);
        }

        public a get() {
            return method(C3271ic.f36943a, null);
        }

        public final u0 getBody$okhttp() {
            return this.f93799d;
        }

        public final g0 getCacheUrlOverride$okhttp() {
            return this.f93800e;
        }

        public final f0.a getHeaders$okhttp() {
            return this.f93798c;
        }

        public final String getMethod$okhttp() {
            return this.f93797b;
        }

        public final Map<KClass<?>, Object> getTags$okhttp() {
            return this.f93801f;
        }

        public final g0 getUrl$okhttp() {
            return this.f93796a;
        }

        public final a gzip() {
            u0 u0Var = this.f93799d;
            if (u0Var == null) {
                throw new IllegalStateException("cannot gzip a request that has no body");
            }
            String str = this.f93798c.get("Content-Encoding");
            if (str != null) {
                throw new IllegalStateException(a.b.k("Content-Encoding already set: ", str).toString());
            }
            this.f93798c.add("Content-Encoding", "gzip");
            this.f93799d = new dw.h(u0Var);
            return this;
        }

        public a head() {
            return method("HEAD", null);
        }

        public a header(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f93798c.set(name, value);
            return this;
        }

        public a headers(f0 headers) {
            kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
            this.f93798c = headers.newBuilder();
            return this;
        }

        public a method(String method, u0 u0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (u0Var == null) {
                if (dw.j.requiresRequestBody(method)) {
                    throw new IllegalArgumentException(a.b.l("method ", method, " must have a request body.").toString());
                }
            } else if (!dw.j.permitsRequestBody(method)) {
                throw new IllegalArgumentException(a.b.l("method ", method, " must not have a request body.").toString());
            }
            this.f93797b = method;
            this.f93799d = u0Var;
            return this;
        }

        public a patch(u0 body) {
            kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
            return method("PATCH", body);
        }

        public a post(u0 body) {
            kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
            return method(C3271ic.f36944b, body);
        }

        public a put(u0 body) {
            kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
            return method("PUT", body);
        }

        public final /* synthetic */ <T> a reifiedTag(T t10) {
            kotlin.jvm.internal.e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return tag((KClass<KClass<T>>) kotlin.jvm.internal.c1.getOrCreateKotlinClass(Object.class), (KClass<T>) t10);
        }

        public a removeHeader(String name) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            this.f93798c.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(u0 u0Var) {
            this.f93799d = u0Var;
        }

        public final void setCacheUrlOverride$okhttp(g0 g0Var) {
            this.f93800e = g0Var;
        }

        public final void setHeaders$okhttp(f0.a aVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
            this.f93798c = aVar;
        }

        public final void setMethod$okhttp(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f93797b = str;
        }

        public final void setTags$okhttp(Map<KClass<?>, ? extends Object> map) {
            kotlin.jvm.internal.e0.checkNotNullParameter(map, "<set-?>");
            this.f93801f = map;
        }

        public final void setUrl$okhttp(g0 g0Var) {
            this.f93796a = g0Var;
        }

        public final <T> a tag(KClass<T> type, T t10) {
            Map mapAsMutableMap;
            kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
            if (t10 == null) {
                if (!this.f93801f.isEmpty()) {
                    Map map = this.f93801f;
                    kotlin.jvm.internal.e0.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                    h1.asMutableMap(map).remove(type);
                }
                return this;
            }
            if (this.f93801f.isEmpty()) {
                mapAsMutableMap = new LinkedHashMap();
                this.f93801f = mapAsMutableMap;
            } else {
                Map map2 = this.f93801f;
                kotlin.jvm.internal.e0.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                mapAsMutableMap = h1.asMutableMap(map2);
            }
            mapAsMutableMap.put(type, KClasses.cast(type, t10));
            return this;
        }

        public a url(g0 url) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            this.f93796a = url;
            return this;
        }

        public a delete(u0 u0Var) {
            return method("DELETE", u0Var);
        }

        public a url(String url) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            g0.b bVar = g0.f93628j;
            if (sv.k0.startsWith(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder("http:");
                String strSubstring = url.substring(3);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (sv.k0.startsWith(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder("https:");
                String strSubstring2 = url.substring(4);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return url(bVar.get(url));
        }

        public a(o0 request) {
            kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
            this.f93801f = p1.emptyMap();
            this.f93796a = request.url();
            this.f93797b = request.method();
            this.f93799d = request.body();
            this.f93801f = request.getTags$okhttp().isEmpty() ? p1.emptyMap() : p1.toMutableMap(request.getTags$okhttp());
            this.f93798c = request.headers().newBuilder();
            this.f93800e = request.cacheUrlOverride();
        }

        public a url(URL url) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            g0.b bVar = g0.f93628j;
            String string = url.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return url(bVar.get(string));
        }

        public a tag(Object obj) {
            return tag((KClass<KClass>) kotlin.jvm.internal.c1.getOrCreateKotlinClass(Object.class), (KClass) obj);
        }

        public <T> a tag(Class<? super T> type, T t10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
            return tag((KClass<KClass<T>>) jv.a.getKotlinClass(type), (KClass<T>) t10);
        }
    }

    public o0(a builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        g0 url$okhttp = builder.getUrl$okhttp();
        if (url$okhttp == null) {
            throw new IllegalStateException("url == null");
        }
        this.f93789a = url$okhttp;
        this.f93790b = builder.getMethod$okhttp();
        this.f93791c = builder.getHeaders$okhttp().build();
        this.f93792d = builder.getBody$okhttp();
        this.f93793e = builder.getCacheUrlOverride$okhttp();
        this.f93794f = p1.toMap(builder.getTags$okhttp());
    }

    @tu.f
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final u0 m7979deprecated_body() {
        return this.f93792d;
    }

    @tu.f
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final h m7980deprecated_cacheControl() {
        return cacheControl();
    }

    @tu.f
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final f0 m7981deprecated_headers() {
        return this.f93791c;
    }

    @tu.f
    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m7982deprecated_method() {
        return this.f93790b;
    }

    @tu.f
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final g0 m7983deprecated_url() {
        return this.f93789a;
    }

    public final u0 body() {
        return this.f93792d;
    }

    public final h cacheControl() {
        h hVar = this.f93795g;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = h.f93646n.parse(this.f93791c);
        this.f93795g = hVar2;
        return hVar2;
    }

    public final g0 cacheUrlOverride() {
        return this.f93793e;
    }

    public final Map<KClass<?>, Object> getTags$okhttp() {
        return this.f93794f;
    }

    public final String header(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return this.f93791c.get(name);
    }

    public final f0 headers() {
        return this.f93791c;
    }

    public final boolean isHttps() {
        return this.f93789a.isHttps();
    }

    public final String method() {
        return this.f93790b;
    }

    public final a newBuilder() {
        return new a(this);
    }

    public final /* synthetic */ <T> T reifiedTag() {
        kotlin.jvm.internal.e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) tag(kotlin.jvm.internal.c1.getOrCreateKotlinClass(Object.class));
    }

    public final <T> T tag(KClass<T> type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        return (T) jv.a.getJavaClass((KClass) type).cast(this.f93794f.get(type));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.f93790b);
        sb2.append(", url=");
        sb2.append(this.f93789a);
        f0 f0Var = this.f93791c;
        if (f0Var.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : f0Var) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    uu.p0.throwIndexOverflow();
                }
                tu.v vVar = (tu.v) obj;
                String str = (String) vVar.component1();
                String str2 = (String) vVar.component2();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(AbstractJsonLexerKt.COLON);
                if (yv.h.isSensitiveHeader(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        Map map = this.f93794f;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public final g0 url() {
        return this.f93789a;
    }

    public final List<String> headers(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return this.f93791c.values(name);
    }

    public final <T> T tag(Class<? extends T> type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        return (T) tag(jv.a.getKotlinClass(type));
    }

    public final Object tag() {
        return tag(kotlin.jvm.internal.c1.getOrCreateKotlinClass(Object.class));
    }

    public /* synthetic */ o0(g0 g0Var, f0 f0Var, String str, u0 u0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(g0Var, (i10 & 2) != 0 ? f0.f93621c.of(new String[0]) : f0Var, (i10 & 4) != 0 ? "\u0000" : str, (i10 & 8) != 0 ? null : u0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0(g0 url, f0 headers, String method, u0 u0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.e0.checkNotNullParameter(method, "method");
        a aVarHeaders = new a().url(url).headers(headers);
        if (kotlin.jvm.internal.e0.areEqual(method, "\u0000")) {
            if (u0Var != null) {
                method = C3271ic.f36944b;
            } else {
                method = C3271ic.f36943a;
            }
        }
        this(aVarHeaders.method(method, u0Var));
    }
}
