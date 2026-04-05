package r7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f83982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83983c;

    public /* synthetic */ q(a0 a0Var, int i10, int i11) {
        this.f83981a = i11;
        this.f83982b = a0Var;
        this.f83983c = i10;
    }

    @Override // r7.z
    public final void run(h hVar) {
        int i10 = this.f83981a;
        int i11 = this.f83983c;
        a0 a0Var = this.f83982b;
        switch (i10) {
            case 0:
                boolean z10 = a0.X;
                a0Var.setFrame(i11);
                break;
            case 1:
                boolean z11 = a0.X;
                a0Var.setMaxFrame(i11);
                break;
            default:
                boolean z12 = a0.X;
                a0Var.setMinFrame(i11);
                break;
        }
    }
}
