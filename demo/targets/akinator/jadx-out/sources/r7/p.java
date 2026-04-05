package r7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f83978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f83979c;

    public /* synthetic */ p(a0 a0Var, String str, int i10) {
        this.f83977a = i10;
        this.f83978b = a0Var;
        this.f83979c = str;
    }

    @Override // r7.z
    public final void run(h hVar) {
        int i10 = this.f83977a;
        String str = this.f83979c;
        a0 a0Var = this.f83978b;
        switch (i10) {
            case 0:
                boolean z10 = a0.X;
                a0Var.setMinAndMaxFrame(str);
                break;
            case 1:
                boolean z11 = a0.X;
                a0Var.setMaxFrame(str);
                break;
            default:
                boolean z12 = a0.X;
                a0Var.setMinFrame(str);
                break;
        }
    }
}
