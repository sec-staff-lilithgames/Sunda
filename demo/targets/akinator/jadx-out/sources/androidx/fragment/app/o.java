package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f6422a;

    /* renamed from: b, reason: collision with root package name */
    public final t3.g f6423b;

    public o(a3 a3Var, t3.g gVar) {
        this.f6422a = a3Var;
        this.f6423b = gVar;
    }

    public final void a() {
        this.f6422a.completeSpecialEffect(this.f6423b);
    }

    public final boolean b() {
        a3 a3Var = this.f6422a;
        z2 z2VarC = z2.c(a3Var.getFragment().mView);
        z2 finalState = a3Var.getFinalState();
        if (z2VarC == finalState) {
            return true;
        }
        z2 z2Var = z2.f6508c;
        return (z2VarC == z2Var || finalState == z2Var) ? false : true;
    }
}
