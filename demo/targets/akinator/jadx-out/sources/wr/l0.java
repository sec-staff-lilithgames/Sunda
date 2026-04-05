package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f91022a;

    public l0(n0 n0Var) {
        this.f91022a = n0Var;
    }

    @Override // wr.o0
    public void cancelled(u0 u0Var) {
        this.f91022a.cancel(u0Var.cancellationCause());
    }
}
