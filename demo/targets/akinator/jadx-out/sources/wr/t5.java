package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final k4 f91136a;

    /* renamed from: b, reason: collision with root package name */
    public final m5 f91137b;

    public t5(k4 k4Var, m5 m5Var) {
        this.f91136a = k4Var;
        this.f91137b = m5Var;
    }

    public static <ReqT, RespT> t5 create(k4 k4Var, m5 m5Var) {
        return new t5(k4Var, m5Var);
    }

    public k4 getMethodDescriptor() {
        return this.f91136a;
    }

    public m5 getServerCallHandler() {
        return this.f91137b;
    }

    public t5 withServerCallHandler(m5 m5Var) {
        return new t5(this.f91136a, m5Var);
    }
}
