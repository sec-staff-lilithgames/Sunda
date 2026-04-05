package hi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f58906c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f58907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f58908f;

    public /* synthetic */ x(z zVar, long j10, String str, int i10) {
        this.f58905b = i10;
        this.f58906c = zVar;
        this.f58907e = j10;
        this.f58908f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58905b) {
            case 0:
                u uVar = this.f58906c.f58920h;
                e0 e0Var = uVar.f58894n;
                if (e0Var == null || !e0Var.f58808e.get()) {
                    uVar.f58889i.writeToLog(this.f58907e, this.f58908f);
                    break;
                }
                break;
            default:
                z zVar = this.f58906c;
                zVar.f58928p.f59615b.submit(new x(zVar, this.f58907e, this.f58908f, 0));
                break;
        }
    }
}
