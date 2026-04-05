package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class o6 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final m6 f91080b;

    /* renamed from: c, reason: collision with root package name */
    public final e4 f91081c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f91082e;

    public o6(m6 m6Var) {
        this(m6Var, null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f91082e ? super.fillInStackTrace() : this;
    }

    public final m6 getStatus() {
        return this.f91080b;
    }

    public final e4 getTrailers() {
        return this.f91081c;
    }

    public o6(m6 m6Var, e4 e4Var) {
        this(e4Var, true, m6Var);
    }

    public o6(e4 e4Var, boolean z10, m6 m6Var) {
        super(m6.a(m6Var), m6Var.getCause());
        this.f91080b = m6Var;
        this.f91081c = e4Var;
        this.f91082e = z10;
        fillInStackTrace();
    }
}
