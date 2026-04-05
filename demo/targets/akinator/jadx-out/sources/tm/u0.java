package tm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f87132a;

    public u0(w0 w0Var) {
        this.f87132a = w0Var;
    }

    @Override // tm.p0
    public void onViewableChanged(boolean z10) {
        w0 w0Var = this.f87132a;
        if (w0Var.f87142c) {
            w0Var.applyViewable(z10);
        }
        w0Var.f87140a.onViewableChanged(z10);
    }
}
