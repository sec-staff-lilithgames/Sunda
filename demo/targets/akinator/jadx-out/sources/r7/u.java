package r7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f84003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f84004c;

    public /* synthetic */ u(a0 a0Var, float f10, int i10) {
        this.f84002a = i10;
        this.f84003b = a0Var;
        this.f84004c = f10;
    }

    @Override // r7.z
    public final void run(h hVar) {
        int i10 = this.f84002a;
        float f10 = this.f84004c;
        a0 a0Var = this.f84003b;
        switch (i10) {
            case 0:
                boolean z10 = a0.X;
                a0Var.setMaxProgress(f10);
                break;
            case 1:
                boolean z11 = a0.X;
                a0Var.setMinProgress(f10);
                break;
            default:
                boolean z12 = a0.X;
                a0Var.setProgress(f10);
                break;
        }
    }
}
