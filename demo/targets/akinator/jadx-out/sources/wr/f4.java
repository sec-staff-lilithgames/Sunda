package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public g4 f90922a;

    /* renamed from: b, reason: collision with root package name */
    public g4 f90923b;

    /* renamed from: c, reason: collision with root package name */
    public h4 f90924c;

    /* renamed from: d, reason: collision with root package name */
    public String f90925d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90926e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90927f;

    /* renamed from: g, reason: collision with root package name */
    public Object f90928g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f90929h;

    public k4 build() {
        return new k4(this.f90924c, this.f90925d, this.f90922a, this.f90923b, this.f90928g, this.f90926e, this.f90927f, this.f90929h);
    }

    public f4 setFullMethodName(String str) {
        this.f90925d = str;
        return this;
    }

    public f4 setIdempotent(boolean z10) {
        this.f90926e = z10;
        if (!z10) {
            this.f90927f = false;
        }
        return this;
    }

    public f4 setRequestMarshaller(g4 g4Var) {
        this.f90922a = g4Var;
        return this;
    }

    public f4 setResponseMarshaller(g4 g4Var) {
        this.f90923b = g4Var;
        return this;
    }

    public f4 setSafe(boolean z10) {
        this.f90927f = z10;
        if (z10) {
            this.f90926e = true;
        }
        return this;
    }

    public f4 setSampledToLocalTracing(boolean z10) {
        this.f90929h = z10;
        return this;
    }

    public f4 setSchemaDescriptor(Object obj) {
        this.f90928g = obj;
        return this;
    }

    public f4 setType(h4 h4Var) {
        this.f90924c = h4Var;
        return this;
    }
}
