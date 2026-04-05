package yq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f94823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f94824c;

    public /* synthetic */ k(o oVar, int i10) {
        this.f94823b = i10;
        this.f94824c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f94823b) {
            case 0:
                n nVar = this.f94824c.f94830f;
                if (nVar != null) {
                    ((pq.f) nVar).a();
                    break;
                }
                break;
            case 1:
                n nVar2 = this.f94824c.f94830f;
                if (nVar2 != null) {
                    ((pq.f) nVar2).onLoaded();
                    break;
                }
                break;
            default:
                this.f94824c.removeAllViews();
                break;
        }
    }
}
