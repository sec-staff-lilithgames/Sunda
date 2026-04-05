package nj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class o implements st.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f76987c;

    public /* synthetic */ o(q qVar, int i10) {
        this.f76986b = i10;
        this.f76987c = qVar;
    }

    @Override // st.a
    public final void run() {
        boolean zB;
        switch (this.f76986b) {
            case 0:
                q qVar = this.f76987c;
                n0 n0Var = qVar.f76995f;
                rj.o oVar = qVar.f76997h;
                n0Var.getClass();
                if (!oVar.getCampaignMetadata().getIsTestMessage()) {
                    ((tj.e) n0Var.f76981c).getId().addOnSuccessListener(n0Var.f76985g, new k0(n0Var, oVar, 0));
                    int i10 = l0.f76966a[oVar.getMessageType().ordinal()];
                    boolean z10 = false;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            zB = n0.b(((rj.q) oVar).getAction());
                        } else if (i10 == 3) {
                            zB = n0.b(((rj.f) oVar).getAction());
                        } else if (i10 != 4) {
                            j0.loge("Unable to determine if impression should be counted as conversion.");
                        } else {
                            zB = n0.b(((rj.n) oVar).getAction());
                        }
                        z10 = !zB;
                    } else {
                        rj.k kVar = (rj.k) oVar;
                        boolean zB2 = n0.b(kVar.getPrimaryAction());
                        boolean zB3 = n0.b(kVar.getSecondaryAction());
                        if (!zB2 && !zB3) {
                            z10 = true;
                        }
                    }
                    n0Var.c(oVar, "fiam_impression", z10);
                }
                n0Var.f76984f.impressionDetected(oVar);
                break;
            default:
                this.f76987c.f76999j = true;
                break;
        }
    }
}
