package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class n6 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final m6 f91074b;

    /* renamed from: c, reason: collision with root package name */
    public final e4 f91075c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f91076e;

    public n6(m6 m6Var) {
        this(m6Var, null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f91076e ? super.fillInStackTrace() : this;
    }

    public final m6 getStatus() {
        return this.f91074b;
    }

    public final e4 getTrailers() {
        return this.f91075c;
    }

    public n6(m6 m6Var, e4 e4Var) {
        super(m6.a(m6Var), m6Var.getCause());
        this.f91074b = m6Var;
        this.f91075c = e4Var;
        this.f91076e = true;
        fillInStackTrace();
    }
}
