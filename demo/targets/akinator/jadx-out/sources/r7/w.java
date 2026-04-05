package r7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f84008b;

    public /* synthetic */ w(a0 a0Var, int i10) {
        this.f84007a = i10;
        this.f84008b = a0Var;
    }

    @Override // r7.z
    public final void run(h hVar) {
        int i10 = this.f84007a;
        a0 a0Var = this.f84008b;
        switch (i10) {
            case 0:
                boolean z10 = a0.X;
                a0Var.resumeAnimation();
                break;
            default:
                boolean z11 = a0.X;
                a0Var.playAnimation();
                break;
        }
    }
}
