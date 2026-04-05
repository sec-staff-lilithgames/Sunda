package bf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f9236c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f9237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f9238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f9239g;

    public /* synthetic */ g0(i0 i0Var, j0 j0Var, t tVar, y yVar, int i10) {
        this.f9235b = i10;
        this.f9236c = i0Var;
        this.f9237e = j0Var;
        this.f9238f = tVar;
        this.f9239g = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9235b) {
            case 0:
                i0 i0Var = this.f9236c;
                this.f9237e.onLoadCompleted(i0Var.f9271a, i0Var.f9272b, this.f9238f, this.f9239g);
                break;
            case 1:
                i0 i0Var2 = this.f9236c;
                this.f9237e.onLoadCanceled(i0Var2.f9271a, i0Var2.f9272b, this.f9238f, this.f9239g);
                break;
            default:
                i0 i0Var3 = this.f9236c;
                this.f9237e.onLoadStarted(i0Var3.f9271a, i0Var3.f9272b, this.f9238f, this.f9239g);
                break;
        }
    }
}
