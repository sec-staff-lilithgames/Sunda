package nj;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class k0 implements OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f76957c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rj.o f76958e;

    public /* synthetic */ k0(n0 n0Var, rj.o oVar, int i10) {
        this.f76956b = i10;
        this.f76957c = n0Var;
        this.f76958e = oVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        String str = (String) obj;
        switch (this.f76956b) {
            case 0:
                n0 n0Var = this.f76957c;
                m0 m0Var = n0Var.f76979a;
                b3 b3Var = (b3) m0Var;
                b3Var.logEvent(((CampaignAnalytics) n0Var.a(this.f76958e, str).setEventType(bj.j0.IMPRESSION_EVENT_TYPE).build()).toByteArray());
                break;
            default:
                n0 n0Var2 = this.f76957c;
                m0 m0Var2 = n0Var2.f76979a;
                b3 b3Var2 = (b3) m0Var2;
                b3Var2.logEvent(((CampaignAnalytics) n0Var2.a(this.f76958e, str).setEventType(bj.j0.CLICK_EVENT_TYPE).build()).toByteArray());
                break;
        }
    }
}
