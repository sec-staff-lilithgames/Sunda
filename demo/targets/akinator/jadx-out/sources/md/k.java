package md;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public d0 f74304a;

    /* renamed from: b, reason: collision with root package name */
    public String f74305b;

    /* renamed from: c, reason: collision with root package name */
    public jd.f f74306c;

    /* renamed from: d, reason: collision with root package name */
    public jd.j f74307d;

    /* renamed from: e, reason: collision with root package name */
    public jd.e f74308e;

    @Override // md.b0
    public final k a(jd.e eVar) {
        if (eVar == null) {
            throw new NullPointerException("Null encoding");
        }
        this.f74308e = eVar;
        return this;
    }

    @Override // md.b0
    public final k b(jd.f fVar) {
        if (fVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f74306c = fVar;
        return this;
    }

    @Override // md.b0
    public c0 build() {
        String strL = this.f74304a == null ? " transportContext" : "";
        if (this.f74305b == null) {
            strL = strL.concat(" transportName");
        }
        if (this.f74306c == null) {
            strL = o2.l(strL, " event");
        }
        if (this.f74307d == null) {
            strL = o2.l(strL, " transformer");
        }
        if (this.f74308e == null) {
            strL = o2.l(strL, " encoding");
        }
        if (strL.isEmpty()) {
            return new l(this.f74304a, this.f74305b, this.f74306c, this.f74307d, this.f74308e);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    @Override // md.b0
    public final k c(jd.j jVar) {
        if (jVar == null) {
            throw new NullPointerException("Null transformer");
        }
        this.f74307d = jVar;
        return this;
    }

    @Override // md.b0
    public b0 setTransportContext(d0 d0Var) {
        if (d0Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f74304a = d0Var;
        return this;
    }

    @Override // md.b0
    public b0 setTransportName(String str) {
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        this.f74305b = str;
        return this;
    }
}
