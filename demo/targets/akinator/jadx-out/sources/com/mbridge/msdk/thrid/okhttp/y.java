package com.mbridge.msdk.thrid.okhttp;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.mbridge.msdk.thrid.okhttp.p;
import j1.o2;
import java.io.Closeable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class y implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final w f43777a;

    /* renamed from: b, reason: collision with root package name */
    final u f43778b;

    /* renamed from: c, reason: collision with root package name */
    final int f43779c;

    /* renamed from: d, reason: collision with root package name */
    final String f43780d;

    /* renamed from: e, reason: collision with root package name */
    final o f43781e;

    /* renamed from: f, reason: collision with root package name */
    final p f43782f;

    /* renamed from: g, reason: collision with root package name */
    final z f43783g;

    /* renamed from: h, reason: collision with root package name */
    final y f43784h;

    /* renamed from: i, reason: collision with root package name */
    final y f43785i;

    /* renamed from: j, reason: collision with root package name */
    final y f43786j;

    /* renamed from: k, reason: collision with root package name */
    final long f43787k;

    /* renamed from: l, reason: collision with root package name */
    final long f43788l;

    /* renamed from: m, reason: collision with root package name */
    private volatile c f43789m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        w f43790a;

        /* renamed from: b, reason: collision with root package name */
        u f43791b;

        /* renamed from: c, reason: collision with root package name */
        int f43792c;

        /* renamed from: d, reason: collision with root package name */
        String f43793d;

        /* renamed from: e, reason: collision with root package name */
        o f43794e;

        /* renamed from: f, reason: collision with root package name */
        p.a f43795f;

        /* renamed from: g, reason: collision with root package name */
        z f43796g;

        /* renamed from: h, reason: collision with root package name */
        y f43797h;

        /* renamed from: i, reason: collision with root package name */
        y f43798i;

        /* renamed from: j, reason: collision with root package name */
        y f43799j;

        /* renamed from: k, reason: collision with root package name */
        long f43800k;

        /* renamed from: l, reason: collision with root package name */
        long f43801l;

        public a() {
            this.f43792c = -1;
            this.f43795f = new p.a();
        }

        public a a(w wVar) {
            this.f43790a = wVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f43795f.c(str, str2);
            return this;
        }

        public a c(y yVar) {
            if (yVar != null) {
                a("networkResponse", yVar);
            }
            this.f43797h = yVar;
            return this;
        }

        public a d(y yVar) {
            if (yVar != null) {
                b(yVar);
            }
            this.f43799j = yVar;
            return this;
        }

        private void b(y yVar) {
            if (yVar.f43783g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(u uVar) {
            this.f43791b = uVar;
            return this;
        }

        public a a(int i10) {
            this.f43792c = i10;
            return this;
        }

        public a(y yVar) {
            this.f43792c = -1;
            this.f43790a = yVar.f43777a;
            this.f43791b = yVar.f43778b;
            this.f43792c = yVar.f43779c;
            this.f43793d = yVar.f43780d;
            this.f43794e = yVar.f43781e;
            this.f43795f = yVar.f43782f.a();
            this.f43796g = yVar.f43783g;
            this.f43797h = yVar.f43784h;
            this.f43798i = yVar.f43785i;
            this.f43799j = yVar.f43786j;
            this.f43800k = yVar.f43787k;
            this.f43801l = yVar.f43788l;
        }

        public a a(String str) {
            this.f43793d = str;
            return this;
        }

        public a b(long j10) {
            this.f43800k = j10;
            return this;
        }

        public a a(o oVar) {
            this.f43794e = oVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f43795f.a(str, str2);
            return this;
        }

        public a a(p pVar) {
            this.f43795f = pVar.a();
            return this;
        }

        public a a(z zVar) {
            this.f43796g = zVar;
            return this;
        }

        public a a(y yVar) {
            if (yVar != null) {
                a("cacheResponse", yVar);
            }
            this.f43798i = yVar;
            return this;
        }

        private void a(String str, y yVar) {
            if (yVar.f43783g == null) {
                if (yVar.f43784h == null) {
                    if (yVar.f43785i == null) {
                        if (yVar.f43786j != null) {
                            throw new IllegalArgumentException(o2.l(str, ".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(o2.l(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(o2.l(str, duhsDlGWdBkekB.QUECSDbKukt));
            }
            throw new IllegalArgumentException(o2.l(str, ".body != null"));
        }

        public a a(long j10) {
            this.f43801l = j10;
            return this;
        }

        public y a() {
            if (this.f43790a != null) {
                if (this.f43791b != null) {
                    if (this.f43792c >= 0) {
                        if (this.f43793d != null) {
                            return new y(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f43792c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public y(a aVar) {
        this.f43777a = aVar.f43790a;
        this.f43778b = aVar.f43791b;
        this.f43779c = aVar.f43792c;
        this.f43780d = aVar.f43793d;
        this.f43781e = aVar.f43794e;
        this.f43782f = aVar.f43795f.a();
        this.f43783g = aVar.f43796g;
        this.f43784h = aVar.f43797h;
        this.f43785i = aVar.f43798i;
        this.f43786j = aVar.f43799j;
        this.f43787k = aVar.f43800k;
        this.f43788l = aVar.f43801l;
    }

    public String a(String str, String str2) {
        String strB = this.f43782f.b(str);
        return strB != null ? strB : str2;
    }

    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        z zVar = this.f43783g;
        if (zVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public z d() {
        return this.f43783g;
    }

    public c h() {
        c cVar = this.f43789m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f43782f);
        this.f43789m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f43779c;
    }

    public o l() {
        return this.f43781e;
    }

    public p m() {
        return this.f43782f;
    }

    public boolean n() {
        int i10 = this.f43779c;
        return i10 >= 200 && i10 < 300;
    }

    public a o() {
        return new a(this);
    }

    public y p() {
        return this.f43786j;
    }

    public long q() {
        return this.f43788l;
    }

    public w r() {
        return this.f43777a;
    }

    public long s() {
        return this.f43787k;
    }

    public String toString() {
        return "Response{protocol=" + this.f43778b + ", code=" + this.f43779c + ", message=" + this.f43780d + ", url=" + this.f43777a.g() + AbstractJsonLexerKt.END_OBJ;
    }
}
