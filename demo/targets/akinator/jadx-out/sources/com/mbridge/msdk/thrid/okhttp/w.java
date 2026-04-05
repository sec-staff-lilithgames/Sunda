package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.C3271ic;
import com.mbridge.msdk.thrid.okhttp.p;
import j1.o2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    final q f43763a;

    /* renamed from: b, reason: collision with root package name */
    final String f43764b;

    /* renamed from: c, reason: collision with root package name */
    final p f43765c;

    /* renamed from: d, reason: collision with root package name */
    final x f43766d;

    /* renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f43767e;

    /* renamed from: f, reason: collision with root package name */
    private volatile c f43768f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        q f43769a;

        /* renamed from: b, reason: collision with root package name */
        String f43770b;

        /* renamed from: c, reason: collision with root package name */
        p.a f43771c;

        /* renamed from: d, reason: collision with root package name */
        x f43772d;

        /* renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f43773e;

        public a() {
            this.f43773e = Collections.EMPTY_MAP;
            this.f43770b = C3271ic.f36943a;
            this.f43771c = new p.a();
        }

        public a a(q qVar) {
            if (qVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f43769a = qVar;
            return this;
        }

        public a b(String str) {
            String str2;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str.substring(4);
            } else {
                str2 = str;
            }
            return a(q.b(str2));
        }

        public a c() {
            return a(C3271ic.f36943a, (x) null);
        }

        public a d() {
            return a("HEAD", (x) null);
        }

        public a c(x xVar) {
            return a(C3271ic.f36944b, xVar);
        }

        public a d(x xVar) {
            return a("PUT", xVar);
        }

        public a a(String str, String str2) {
            this.f43771c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f43771c.b(str);
            return this;
        }

        public a(w wVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f43773e = map;
            this.f43769a = wVar.f43763a;
            this.f43770b = wVar.f43764b;
            this.f43772d = wVar.f43766d;
            this.f43773e = wVar.f43767e.isEmpty() ? map : new LinkedHashMap<>(wVar.f43767e);
            this.f43771c = wVar.f43765c.a();
        }

        public a a(p pVar) {
            this.f43771c = pVar.a();
            return this;
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a b(String str, String str2) {
            this.f43771c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f43290d);
        }

        public a a(x xVar) {
            return a("DELETE", xVar);
        }

        public a b(x xVar) {
            return a("PATCH", xVar);
        }

        public a a(String str, x xVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (xVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException(a.b.l("method ", str, " must not have a request body."));
                    }
                    if (xVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException(a.b.l("method ", str, " must have a request body."));
                    }
                    this.f43770b = str;
                    this.f43772d = xVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public w a() {
            if (this.f43769a != null) {
                return new w(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public w(a aVar) {
        this.f43763a = aVar.f43769a;
        this.f43764b = aVar.f43770b;
        this.f43765c = aVar.f43771c.a();
        this.f43766d = aVar.f43772d;
        this.f43767e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f43773e);
    }

    public String a(String str) {
        return this.f43765c.b(str);
    }

    public c b() {
        c cVar = this.f43768f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f43765c);
        this.f43768f = cVarA;
        return cVarA;
    }

    public p c() {
        return this.f43765c;
    }

    public boolean d() {
        return this.f43763a.h();
    }

    public String e() {
        return this.f43764b;
    }

    public a f() {
        return new a(this);
    }

    public q g() {
        return this.f43763a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f43764b);
        sb2.append(", url=");
        sb2.append(this.f43763a);
        sb2.append(", tags=");
        return o2.q(sb2, this.f43767e, AbstractJsonLexerKt.END_OBJ);
    }

    public x a() {
        return this.f43766d;
    }
}
