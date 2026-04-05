package nj;

import com.google.firebase.inappmessaging.internal.RateLimitProto$RateLimit;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements st.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76889c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f76890e;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f76888b = i10;
        this.f76889c = obj;
        this.f76890e = obj2;
    }

    @Override // st.a
    public final void run() {
        switch (this.f76888b) {
            case 0:
                ((h) this.f76889c).f76921d = (FetchEligibleCampaignsResponse) this.f76890e;
                break;
            case 1:
                q qVar = (q) this.f76889c;
                bj.a1 a1Var = (bj.a1) this.f76890e;
                n0 n0Var = qVar.f76995f;
                rj.o oVar = qVar.f76997h;
                n0Var.getClass();
                if (!oVar.getCampaignMetadata().getIsTestMessage()) {
                    ((tj.e) n0Var.f76981c).getId().addOnSuccessListener(n0Var.f76985g, new ao.q0(n0Var, 14, oVar, a1Var));
                }
                n0Var.f76984f.displayErrorEncountered(oVar, a1Var);
                break;
            case 2:
                q qVar2 = (q) this.f76889c;
                bj.z0 z0Var = (bj.z0) this.f76890e;
                n0 n0Var2 = qVar2.f76995f;
                rj.o oVar2 = qVar2.f76997h;
                n0Var2.getClass();
                if (!oVar2.getCampaignMetadata().getIsTestMessage()) {
                    ((tj.e) n0Var2.f76981c).getId().addOnSuccessListener(n0Var2.f76985g, new ao.q0(n0Var2, 15, oVar2, z0Var));
                    n0Var2.c(oVar2, "fiam_dismiss", false);
                }
                n0Var2.f76984f.messageDismissed(oVar2);
                break;
            case 3:
                q qVar3 = (q) this.f76889c;
                rj.b bVar = (rj.b) this.f76890e;
                n0 n0Var3 = qVar3.f76995f;
                rj.o oVar3 = qVar3.f76997h;
                n0Var3.getClass();
                if (!oVar3.getCampaignMetadata().getIsTestMessage()) {
                    ((tj.e) n0Var3.f76981c).getId().addOnSuccessListener(n0Var3.f76985g, new k0(n0Var3, oVar3, 1));
                    n0Var3.c(oVar3, "fiam_action", true);
                }
                n0Var3.f76984f.messageClicked(oVar3, bVar);
                break;
            default:
                ((e1) this.f76889c).f76887c = mt.s.just((RateLimitProto$RateLimit) this.f76890e);
                break;
        }
    }
}
